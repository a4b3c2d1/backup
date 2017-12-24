package com.internousdev.library.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.library.util.DBConnector;
import com.internousdev.library.util.DateUtil;

public class CreatemanagerConpleteDAO {
	private DBConnector dbConnector = new DBConnector();

	private Connection connection = dbConnector.getConnection();

	private DateUtil dateUtil = new DateUtil();

	private String sql = "INSERT INTO manager_login(login_id,login_pass,user_name,updated_time) VALUE(?,?,?,?)";

	public void createmanager(String NewUserId, String NewPassword, String NewUsername) throws SQLException {

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setString(1, NewUserId);
			preparedStatement.setString(2, NewPassword);
			preparedStatement.setString(3, NewUsername);
			preparedStatement.setString(4, dateUtil.getDate());

			preparedStatement.execute();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			connection.close();
		}
	}
}
