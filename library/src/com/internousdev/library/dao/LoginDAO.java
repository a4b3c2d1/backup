package com.internousdev.library.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.library.dto.LoginDTO;
import com.internousdev.library.util.DBConnector;

public class LoginDAO {

	private DBConnector db = new DBConnector();
	private Connection con = db.getConnection();
	public List<LoginDTO> loginDTOList = new ArrayList<LoginDTO>();

	/**
	 * ログインユーザ情報取得
	 */

	public List<LoginDTO> getloginuserinfo(String LoginUserId, String LoginPassword) {
		String sql = "select * from manager_login where login_id=? and login_pass=?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, LoginUserId);
			ps.setString(2, LoginPassword);

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				LoginDTO loginDTO = new LoginDTO();
				loginDTO.setLogin_id(rs.getString("login_id"));
				loginDTO.setLogin_password(rs.getString("login_pass"));
				loginDTO.setUsername(rs.getString("user_name"));

				if (!(rs.getString("login_id").equals(null))) {
					loginDTO.setLoginFlg(true);
				}
				loginDTOList.add(loginDTO);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return loginDTOList;
	}

}
