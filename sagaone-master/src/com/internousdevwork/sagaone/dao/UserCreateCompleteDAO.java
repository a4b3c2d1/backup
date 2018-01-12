package com.internousdevwork.sagaone.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdevwork.sagaone.util.DBConnector;
import com.internousdevwork.sagaone.util.DateUtil;

public class UserCreateCompleteDAO {

	private DBConnector db = new DBConnector();

	private Connection con = db.getConnection();

	private DateUtil dateUtil = new DateUtil();

	private String sql = "INSERT INTO user_info (user_id, password, family_name,first_name,family_name_kana,first_name_kana,sex,email,regist_date) VALUES(?, ? ,?, ?,?,?,?,?,?)";

	public void create(String id, String password, String familyName,String firstName, String familyNameKana, String firstNameKana,int sex,String email) throws SQLException {

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, password);
			ps.setString(3, familyName);
			ps.setString(4, firstName);
			ps.setString(5, familyNameKana);
			ps.setString(6, firstNameKana);
			ps.setInt(7, sex);
			ps.setString(8, email);
			ps.setString(9, dateUtil.getDate());

			ps.execute();

		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		}
	}
}


