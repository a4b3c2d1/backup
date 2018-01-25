package com.internousdevwork.sagaone.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdevwork.sagaone.util.DBConnector;

public class DeleteReviewHistoryDAO {

	DBConnector db = new DBConnector();
	Connection con = db.getConnection();

	public void deleteOne(String loginUserId, int productId) {
		String sql = "DELETE FROM review_info WHERE user_id = ? AND product_id = ?" ;

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, loginUserId);
			ps.setInt(2, productId);
			ps.execute();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		try {
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}

	public void deleteAll(String loginUserId) {
		String sql = "DELETE FROM review_info WHERE user_id = ?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, loginUserId);
			ps.execute();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		try {
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
}
