/**
 *
 */
package com.internousdevwork.sagaone.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * @author internousdev
 *
 */
public class DBConnector {

	private String driverName = "com.mysql.jdbc.Driver";
	private String url = "jdbc:mysql://localhost/sagaone";
	private String user = "root";
	private String password = "mysql";

	public Connection getConnection() {
		Connection connection = null;

		try {
			Class.forName(driverName);
			connection = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
}
