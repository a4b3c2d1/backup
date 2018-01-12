package com.internousdevwork.sagaone.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.internousdevwork.sagaone.dto.LoginDTO;
import com.internousdevwork.sagaone.util.DBConnector;

public class PasswordChangeDAO {
	DBConnector db= new DBConnector();
	Connection con= db.getConnection();
	private LoginDTO loginDTO= new LoginDTO();

	public LoginDTO getNewLoginUserInfo (String newLoginPassword, String userId){
	String sql= "update user_info set password= ? where user_id= ?" ;

	try {
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, newLoginPassword);
		ps.setString(2, userId);
		int ret = ps.executeUpdate();


	} catch (Exception e) {
		e.printStackTrace();
	}
	return loginDTO;
	}



	public LoginDTO getLoginDTO() {
		return loginDTO;
	}


}
