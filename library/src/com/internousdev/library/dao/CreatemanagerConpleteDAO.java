package com.internousdev.library.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.library.util.DBConnector;
import com.internousdev.library.util.DateUtil;

public class CreatemanagerConpleteDAO {
	private DBConnector dbConnector = new DBConnector();

	private Connection con = dbConnector.getConnection();

	private DateUtil dateUtil = new DateUtil();

	private String sql = "INSERT INTO manager_login(login_id,login_pass,user_name,updated_time) VALUE(?,?,?,?)";

	public void createmanager(String NewUserId, String NewPassword, String NewUsername) throws SQLException {

		try {
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, NewUserId);
			ps.setString(2, NewPassword);
			ps.setString(3, NewUsername);
			ps.setString(4, dateUtil.getDate());

			ps.execute();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		}
	}
}
