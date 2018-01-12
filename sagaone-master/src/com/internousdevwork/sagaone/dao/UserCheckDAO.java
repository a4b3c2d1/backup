package com.internousdevwork.sagaone.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdevwork.sagaone.util.DBConnector;

public class UserCheckDAO {

	DBConnector dbConnector = new DBConnector();

	Connection con = dbConnector.getConnection();


	String sql = "SELECT COUNT(*) FROM user_info where user_id = ?";

	public int checkCount(String userId) throws SQLException {

		int userCount=0;

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, userId);
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				userCount=rs.getInt("COUNT(*)");
			}

		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			con.close();

		}
		return userCount;
	}

}
