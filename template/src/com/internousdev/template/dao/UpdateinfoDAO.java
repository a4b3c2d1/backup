package com.internousdev.template.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Map;

import com.internousdev.template.util.DBConnector;
import com.internousdev.template.util.DateUtil;

public class UpdateinfoDAO {

	private DBConnector dbConnector = new DBConnector();

	private Connection connection = dbConnector.getConnection();

	private DateUtil dateUtil = new DateUtil();

	public Map<String, Object> session;

	String sql = "update item_info_transaction set item_stock=?,update_date=? where id=?";

	public void stockupdate(int buyitemstock, int buy, int ID) {

		try {

			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setInt(1, buyitemstock - buy);
			preparedStatement.setString(2, dateUtil.getDate());
			preparedStatement.setInt(3, ID);

			preparedStatement.execute();
		} catch (Exception e) {
			e.printStackTrace();

		}
	}
}
