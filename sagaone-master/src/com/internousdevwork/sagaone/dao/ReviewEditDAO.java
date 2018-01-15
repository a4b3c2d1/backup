package com.internousdevwork.sagaone.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.internousdevwork.sagaone.util.DBConnector;

public class ReviewEditDAO {
	private DBConnector db = new DBConnector();
	private Connection con = db.getConnection();
	private String sql = "delete from review_info where user_id=? and product_id=?";

	public void deletereview(String user_id, String product_id) {
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, user_id);
			ps.setString(2, product_id);
			ps.execute();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
