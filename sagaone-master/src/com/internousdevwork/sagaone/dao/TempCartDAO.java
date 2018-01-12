package com.internousdevwork.sagaone.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdevwork.sagaone.dto.CartDTO;
import com.internousdevwork.sagaone.util.DBConnector;

public class TempCartDAO {
	private DBConnector db = new DBConnector();
	private Connection con = db.getConnection();

	public ArrayList<CartDTO> getTempCartInfo(String temp_user_id) throws SQLException{
		ArrayList<CartDTO> cartList = new ArrayList<CartDTO>();
		con = db.getConnection();
		String sql = "SELECT cart_info.id, product_info.product_name, product_info.product_name_kana, product_info.image_file_path, product_info.price, cart_info.product_count, product_info.release_company, product_info.release_date, cart_info.regist_date FROM cart_info LEFT JOIN product_info ON cart_info.product_id = product_info.product_id WHERE cart_info.temp_user_id = ?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, temp_user_id);

			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				CartDTO cartdto = new CartDTO();
				cartdto.setId(rs.getString("id"));
				cartdto.setProductName(rs.getString("product_name"));
				cartdto.setProductNameKana(rs.getString("product_name_kana"));
				cartdto.setImageFilePath(rs.getString("image_file_path"));
				cartdto.setPrice(rs.getInt("price"));
				cartdto.setCount(rs.getString("product_count"));
				cartdto.setTotalCount(rs.getInt("price") * rs.getInt("product_count"));
				cartdto.setReleaseCompany(rs.getString("release_company"));
				cartdto.setReleaseDate(rs.getString("release_date"));
				cartdto.setRegistDate(rs.getString("regist_date"));
				cartList.add(cartdto);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			con.close();
		}
		return cartList;
	}
	public boolean cartItemDelete(String user_id, int id) throws SQLException {
		con = db.getConnection();

		String sql = "DELETE FROM cart_info WHERE temp_user_id = ? AND id = ?";

		PreparedStatement ps;

		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, user_id);
			ps.setInt(2, id);

			ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			con.close();
		}
		return true;

	}
}