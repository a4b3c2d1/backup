package com.internousdevwork.sagaone.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdevwork.sagaone.dto.PaymentUserInfoDTO;
import com.internousdevwork.sagaone.util.DBConnector;

//user_infoテーブル
public class PaymentUserInfoDAO {
	private DBConnector db= new DBConnector();
	private Connection con= db.getConnection();
	private PaymentUserInfoDTO paymentUserInfoDTO= new PaymentUserInfoDTO();

	public PaymentUserInfoDTO getUserInfo (String loginUserId) {
		String sql= "select * from user_info where user_id = ?";

		try {
			PreparedStatement ps= con.prepareStatement(sql);
			ps.setString(1, loginUserId);

			ResultSet rs= ps.executeQuery();


			if (rs.next()) {
				paymentUserInfoDTO.setUserId(rs.getString("user_id"));
				paymentUserInfoDTO.setFamilyName(rs.getString("family_name"));
				paymentUserInfoDTO.setFirstName(rs.getString("first_name"));
				paymentUserInfoDTO.setFamilyNameKana(rs.getString("family_name_kana"));
				paymentUserInfoDTO.setFirstNameKana(rs.getString("first_name_kana"));
				paymentUserInfoDTO.setSex(rs.getInt("sex"));
				paymentUserInfoDTO.setEmail(rs.getString("email"));

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return paymentUserInfoDTO;
	}

}
