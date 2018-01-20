package com.internousdevwork.sagaone.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdevwork.sagaone.util.DBConnector;

public class DestinationDeleteDAO {
	DBConnector dbConnector = new DBConnector();
	Connection connection = dbConnector.getConnection();

	public void delete(String deleteFlg) throws SQLException {

		String sql = "delete from destination_info where id = ?";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, deleteFlg);
			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			connection.close();
		}
	}

}
