package com.internousdevwork.sagaone.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

import com.internousdevwork.sagaone.dto.ItemDTO;
import com.internousdevwork.sagaone.util.DBConnector;

public class ItemrelativeDAO {

	private List<ItemDTO> itemdetailDTOList = new ArrayList<ItemDTO>();
	private List<ItemDTO> itemrelativeDTOList = new ArrayList<ItemDTO>();
	private DBConnector db = new DBConnector();
	private Connection con = db.getConnection();
	NumberFormat nfNum = NumberFormat.getNumberInstance();

	public List<ItemDTO> getdetailinfo(String id) {

		String sql1 = "select * from product_info where product_id=?";

		try {
			PreparedStatement ps = con.prepareStatement(sql1);
			ps.setString(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				ItemDTO itemdto = new ItemDTO();
				itemdto.setId(rs.getInt("id"));
				itemdto.setProduct_id(rs.getInt("product_id"));
				itemdto.setProduct_name(rs.getString("product_name"));
				itemdto.setProduct_name_kana(rs.getString("product_name_kana"));
				itemdto.setProduct_description(rs.getString("product_description"));
				itemdto.setCategory_id(rs.getInt("category_id"));
				itemdto.setPrice(nfNum.format(rs.getInt("price")));
				itemdto.setImage_file_path(rs.getString("image_file_path"));
				itemdto.setImage_file_name(rs.getString("image_file_name"));
				itemdto.setRelease_date(rs.getString("release_date"));
				itemdto.setRelease_company(rs.getString("release_company"));
				itemdto.setStatus(rs.getInt("status"));
				itemdto.setRegist_date(rs.getString("regist_date"));
				itemdto.setUpdate_date(rs.getString("update_date"));

				itemdetailDTOList.add(itemdto);
			}
		} catch (

		Exception e) {
			e.printStackTrace();
		}
		return itemdetailDTOList;
	}

	public List<ItemDTO> getrelativeinfo(String product_id, String category_id) {

		String sql2 = "select * from product_info where product_id!=? and category_id=?";

		try {
			PreparedStatement ps = con.prepareStatement(sql2);

			ps.setString(1, product_id);
			ps.setString(2, category_id);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				ItemDTO itemdto = new ItemDTO();
				itemdto.setId(rs.getInt("id"));
				itemdto.setProduct_id(rs.getInt("product_id"));
				itemdto.setProduct_name(rs.getString("product_name"));
				itemdto.setProduct_name_kana(rs.getString("product_name_kana"));
				itemdto.setProduct_description(rs.getString("product_description"));
				itemdto.setCategory_id(rs.getInt("category_id"));
				itemdto.setPrice(nfNum.format(rs.getInt("price")));
				itemdto.setImage_file_path(rs.getString("image_file_path"));
				itemdto.setImage_file_name(rs.getString("image_file_name"));
				itemdto.setRelease_date(rs.getString("release_date"));
				itemdto.setRelease_company(rs.getString("release_company"));
				itemdto.setStatus(rs.getInt("status"));
				itemdto.setRegist_date(rs.getString("regist_date"));
				itemdto.setUpdate_date(rs.getString("update_date"));

				itemrelativeDTOList.add(itemdto);
			}
		} catch (

		Exception e) {
			e.printStackTrace();
		}

		return itemrelativeDTOList;

	}
}
