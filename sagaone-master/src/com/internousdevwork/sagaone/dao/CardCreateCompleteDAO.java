package com.internousdevwork.sagaone.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdevwork.sagaone.util.DBConnector;
import com.internousdevwork.sagaone.util.DateUtil;

public class CardCreateCompleteDAO {
	private DBConnector db = new DBConnector();

	private Connection con = db.getConnection();

	private DateUtil dateUtil = new DateUtil();

	private String sql = "INSERT INTO card_info (user_id,card_number, limit_year, limit_month,security_number,nominee,regist_date) VALUES(?,?,?,?,?,?,?)";

	public void card(String user_id,String card_number, String limit_year, String limit_month,String security_number, String nominee) throws SQLException {

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, user_id);
			ps.setString(2,card_number);
			ps.setString(3,limit_year);
			ps.setString(4,limit_month);
			ps.setString(5,security_number);
			ps.setString(6,nominee);
			ps.setString(7, dateUtil.getDate());

			ps.execute();

		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		}
	}
}
