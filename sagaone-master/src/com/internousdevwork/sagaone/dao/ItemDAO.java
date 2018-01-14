package com.internousdevwork.sagaone.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.internousdevwork.sagaone.dto.ItemDTO;
import com.internousdevwork.sagaone.util.DBConnector;

public class ItemDAO {
	private DBConnector db = new DBConnector();
	private Connection con = db.getConnection();
	private List<ItemDTO> itemDTOList = new ArrayList<ItemDTO>();


	/**
	 * 商品情報取得
	 */

	public List<ItemDTO> getiteminfo() {
		String sql = "select * from product_info";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				ItemDTO itemdto = new ItemDTO();

				itemdto.setId(rs.getInt("id"));
				itemdto.setProduct_id(rs.getInt("product_id"));
				itemdto.setProduct_name(rs.getString("product_name"));
				itemdto.setProduct_name_kana(rs.getString("product_name_kana"));
				itemdto.setProduct_description(rs.getString("product_description"));
				itemdto.setCategory_id(rs.getInt("category_id"));
				itemdto.setPrice(rs.getInt("price"));
				itemdto.setImage_file_path(rs.getString("image_file_path"));
				itemdto.setImage_file_name(rs.getString("image_file_name"));
				itemdto.setRelease_date(rs.getString("release_date"));
				itemdto.setRelease_date(rs.getString("release_company"));
				itemdto.setStatus(rs.getInt("status"));
				itemdto.setRegist_date(rs.getString("regist_date"));
				itemdto.setUpdate_date(rs.getString("update_date"));

				itemDTOList.add(itemdto);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return itemDTOList;
	}

}