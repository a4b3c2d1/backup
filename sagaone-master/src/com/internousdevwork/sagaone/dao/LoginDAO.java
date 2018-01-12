package com.internousdevwork.sagaone.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdevwork.sagaone.dto.LoginDTO;
import com.internousdevwork.sagaone.util.DBConnector;

public class LoginDAO {
	private DBConnector db= new DBConnector();
	private Connection con= db.getConnection();
	private LoginDTO loginDTO= new LoginDTO();

	public LoginDTO getLoginUserInfo (String loginUserId, String loginPassword) {
		String sql= "select * from user_info where user_id= ? and password= ?";

		try {
			PreparedStatement ps= con.prepareStatement(sql);
			ps.setString(1, loginUserId);
			ps.setString(2, loginPassword);

			ResultSet rs= ps.executeQuery();


			if (rs.next()) {
				loginDTO.setLoginId (rs.getString("user_id"));
				loginDTO.setLoginPassword (rs.getString("password"));

				if(!(rs.getString("user_id").equals(null))){
				loginDTO.setLoginFlg(true);
				}
			}


		} catch (Exception e) {
			e.printStackTrace();
		}

		return loginDTO;
	}


	public LoginDTO getLoginDTO() {
		return loginDTO;
	}

}
