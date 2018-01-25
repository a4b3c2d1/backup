package com.internousdevwork.sagaone.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdevwork.sagaone.dto.ReviewProductDTO;
import com.internousdevwork.sagaone.util.DBConnector;

public class ReviewProductDAO {

	private DBConnector db= new DBConnector();
	private Connection con= db.getConnection();
	private ReviewProductDTO reviewProductDTO = new ReviewProductDTO();

	public ReviewProductDTO getReviewProductInfo (int productId) {
		String sql= "select * from product_info where product_id= ?";

		try {
			PreparedStatement ps= con.prepareStatement(sql);
			ps.setInt(1, productId);

			ResultSet rs= ps.executeQuery();


			if (rs.next()) {
				reviewProductDTO.setId(rs.getInt("id"));
				reviewProductDTO.setProductId(rs.getInt("product_id"));
				reviewProductDTO.setProductName(rs.getString("product_name"));
				reviewProductDTO.setProductNameKana(rs.getString("product_name_kana"));
				reviewProductDTO.setProductDescription(rs.getString("product_description"));
				reviewProductDTO.setCategoryId(rs.getInt("category_id"));
				reviewProductDTO.setPrice(rs.getInt("price"));
				reviewProductDTO.setImageFilePath(rs.getString("image_file_path"));
				reviewProductDTO.setImageFileName(rs.getString("image_file_name"));
				reviewProductDTO.setReleaseDate(rs.getString("release_date"));
				reviewProductDTO.setReleaseCompany(rs.getString("release_company"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return reviewProductDTO;
	}
}
