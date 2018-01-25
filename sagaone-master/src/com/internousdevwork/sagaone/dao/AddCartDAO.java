package com.internousdevwork.sagaone.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

import com.internousdevwork.sagaone.dto.CartDTO;
import com.internousdevwork.sagaone.util.DBConnector;
import com.internousdevwork.sagaone.util.DateUtil;

public class AddCartDAO{
	private DBConnector db = new DBConnector();
	private Connection con = db.getConnection();
	private DateUtil dateUtil = new DateUtil();
	private CartDTO cartDTO = new CartDTO();
	public Map<String,Object> session;

	public CartDTO getCartInfo(int product_id){

		String sql = "SELECT * FROM product_info WHERE product_id = ?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, product_id);

			ResultSet rs = ps.executeQuery();

			if(rs.next()){
				cartDTO.setId(rs.getString("id"));
				cartDTO.setPrice(rs.getInt("price"));
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return cartDTO;
	}

	public void addCartInfo(String id, String user_id, int product_id, String product_count, int price) throws SQLException{

		String sql = "INSERT INTO cart_info(user_id, product_id, product_count, price, regist_date) VALUES(?, ?, ?, ?, ?)";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, user_id);
			ps.setInt(2, product_id);
			ps.setString(3, product_count);
			ps.setInt(4, price);
			ps.setString(5, dateUtil.getDate());

			ps.execute();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	public CartDTO getAddCart(String user_id, int product_id){

		String sql = "SELECT * FROM cart_info WHERE user_id = ? AND product_id = ?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, user_id);
			ps.setInt(2, product_id);

			ResultSet rs = ps.executeQuery();

			if(rs.next()){
				cartDTO.setProductId(rs.getInt("product_id"));
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return cartDTO;
	}

	public void addUpdateCart(String count, int product_id)throws SQLException{

		String sql = "UPDATE cart_info set product_count = product_count + ? WHERE product_id = ?";

		try{
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, count);
		ps.setInt(2, product_id);

		ps.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	public void joinUpdateCart(String count, String user_id, int product_id)throws SQLException{

		String sql = "UPDATE cart_info set product_count = product_count + ? WHERE user_id = ? AND product_id = ?";

		try{
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, count);
		ps.setString(2, user_id);
		ps.setInt(3, product_id);

		ps.executeUpdate();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
