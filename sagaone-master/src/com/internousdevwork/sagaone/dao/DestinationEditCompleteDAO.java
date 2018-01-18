/**
 *
 */
package com.internousdevwork.sagaone.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdevwork.sagaone.util.DBConnector;
import com.internousdevwork.sagaone.util.DateUtil;

/**
 * @author internousdev
 *
 */
public class DestinationEditCompleteDAO {

	DBConnector dbConnector = new DBConnector();
	Connection connection = dbConnector.getConnection();

	private DateUtil dateUtil = new DateUtil();


	public void destinationUpdate(String userId, String familyName, String firstName, String familyNameKana, String firstNameKana, String email, String telNumber, String userAddress, String destinationId) throws SQLException {

		String sql = "update destination_info set user_id = ?, family_name = ?, first_name = ?, family_name_kana = ?, first_name_kana = ?, email = ?, tel_number = ?, user_address = ?, update_date = ? where id = ?";

		// フォームで入力した情報をDBに格納
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setString(1, userId);
			preparedStatement.setString(2, familyName);
			preparedStatement.setString(3, firstName);
			preparedStatement.setString(4, familyNameKana);
			preparedStatement.setString(5, firstNameKana);
			preparedStatement.setString(6, email);
			preparedStatement.setString(7, telNumber);
			preparedStatement.setString(8, userAddress);
			preparedStatement.setString(9, dateUtil.getDate());
			preparedStatement.setString(10, destinationId);

			preparedStatement.execute();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			connection.close();
		}

	}
}
