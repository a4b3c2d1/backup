package com.internousdevwork.sagaone.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdevwork.sagaone.dto.MyPageAddressDTO;
import com.internousdevwork.sagaone.util.DBConnector;

//destination_infoテーブル
public class MyPageAddressDAO {
	private DBConnector db= new DBConnector();
	private Connection con= db.getConnection();
	private MyPageAddressDTO myPageAddressDTO= new MyPageAddressDTO();

	public MyPageAddressDTO getUserAddress (String loginUserId) {
		String sql= "select * from destination_info where user_id= ? AND status=1";

		try {
			PreparedStatement ps= con.prepareStatement(sql);
			ps.setString(1, loginUserId);

			ResultSet rs= ps.executeQuery();


			if (rs.next()) {
				myPageAddressDTO.setTelNumber(rs.getString("tel_number"));
				myPageAddressDTO.setUserAddress(rs.getString("user_address"));
		    }

		} catch (Exception e) {
			e.printStackTrace();
		}

		return myPageAddressDTO;
	}

}