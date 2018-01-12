package com.internousdevwork.sagaone.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.internousdevwork.sagaone.util.DBConnector;
import com.internousdevwork.sagaone.util.DateUtil;

public class ReviewChangeConpleteDAO {
	private DBConnector db = new DBConnector();
	private Connection con = db.getConnection();
	private DateUtil dateUtil = new DateUtil();
	private String sql = "update review_info set value=?,review=?,update_date=? where user_id=? and product_id=?";

	public void updatereview(String user_id, String product_id, String value, String review) {

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, value);
			ps.setString(2, review);
			ps.setString(3, dateUtil.getDate());
			ps.setString(4, user_id);
			ps.setString(5, product_id);
			ps.execute();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
