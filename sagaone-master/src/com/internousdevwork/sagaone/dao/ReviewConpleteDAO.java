package com.internousdevwork.sagaone.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.internousdevwork.sagaone.util.DBConnector;
import com.internousdevwork.sagaone.util.DateUtil;

public class ReviewConpleteDAO {

	private DBConnector db = new DBConnector();
	private Connection con = db.getConnection();
	private DateUtil dateUtil = new DateUtil();
	private String sql = "insert into review_info (user_id,product_id,value,review,update_date) VALUE(?,?,?,?,?)";

	public void insertreview(String user_id, String product_id, String value, String review) {

		try {
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, user_id);
			ps.setString(2, product_id);
			ps.setString(3, value);
			ps.setString(4, review);
			ps.setString(5, dateUtil.getDate());

			ps.execute();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}