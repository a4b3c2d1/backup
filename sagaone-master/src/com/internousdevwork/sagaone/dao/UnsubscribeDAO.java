package com.internousdevwork.sagaone.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.internousdevwork.sagaone.util.DBConnector;

public class UnsubscribeDAO {
	private DBConnector db = new DBConnector();
	private Connection con = db.getConnection();

	public void delete_user(String user_id){
		String sql = "DELETE FROM user_info WHERE user_id = ?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, user_id);

			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void delete_destination(String user_id){
		String sql = "DELETE FROM destination_info WHERE user_id = ?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, user_id);

			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void delete_cart(String user_id){
		String sql = "DELETE FROM cart_info WHERE user_id = ?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, user_id);

			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void delete_purchase(String user_id){
		String sql = "DELETE FROM purchase_history_info WHERE user_id = ?";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, user_id);

			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
