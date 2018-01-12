package com.internousdevwork.sagaone.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdevwork.sagaone.dto.PaymentProductInfoDTO;
import com.internousdevwork.sagaone.util.DBConnector;

//product_infoテーブル
public class PaymentProductInfoDAO {
	private DBConnector db= new DBConnector();
	private Connection con= db.getConnection();
	private PaymentProductInfoDTO paymentProductInfoDTO= new PaymentProductInfoDTO();

	public PaymentProductInfoDTO getProductInfo (int productId) {
		String sql= "select * from product_info where product_id= ?";

		try {
			PreparedStatement ps= con.prepareStatement(sql);
			ps.setInt(1, productId);

			ResultSet rs= ps.executeQuery();


			if (rs.next()) {
				paymentProductInfoDTO.setProductId(rs.getInt("product_id"));
				paymentProductInfoDTO.setProductName(rs.getString("product_name"));
				paymentProductInfoDTO.setProductNameKana(rs.getString("product_name_kana"));
				paymentProductInfoDTO.setProductDescription(rs.getString("product_description"));
				paymentProductInfoDTO.setCategoryId(rs.getInt("category_id"));
				paymentProductInfoDTO.setPrice(rs.getInt("price"));
				paymentProductInfoDTO.setImageFilePath(rs.getString("image_file_path"));
				paymentProductInfoDTO.setImageFileName(rs.getString("image_file_name"));
				paymentProductInfoDTO.setReleaseDate(rs.getString("release_date"));
				paymentProductInfoDTO.setReleaseCompany(rs.getString("release_company"));

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return paymentProductInfoDTO;
	}
}
