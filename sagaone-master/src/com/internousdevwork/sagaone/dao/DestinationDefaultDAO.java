package com.internousdevwork.sagaone.dao;

	import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdevwork.sagaone.dto.DestinationDTO;
import com.internousdevwork.sagaone.util.DBConnector;
import com.internousdevwork.sagaone.util.DateUtil;

	/**
	 * @author internousdev
	 *
	 */
public class DestinationDefaultDAO {

	DBConnector dbConnector = new DBConnector();
	Connection connection = dbConnector.getConnection();

	private DateUtil dateUtil = new DateUtil();

	public DestinationDTO defaultSelect(String selectFlg, String loginUserId) throws SQLException {

		DestinationDTO defaultDestinationDTO = new DestinationDTO();

		String sqlA = "update destination_info set status = 0 where status = 1";
		String sqlB = "update destination_info set status = 1 where id = ? and user_id = ?";
		String sqlC = "select * from destination_info where id = ? and user_id = ?";

		try {
			PreparedStatement preparedStatementA = connection.prepareStatement(sqlA);
			preparedStatementA.executeUpdate();

			PreparedStatement preparedStatementB = connection.prepareStatement(sqlB);
			preparedStatementB.setString(1, selectFlg);
			preparedStatementB.setString(2, loginUserId);
			preparedStatementB.executeUpdate();

			PreparedStatement preparedStatementC = connection.prepareStatement(sqlC);
			preparedStatementC.setString(1, selectFlg);
			preparedStatementC.setString(2, loginUserId);
			ResultSet resultSet = preparedStatementC.executeQuery();

			if (resultSet.next()) {
				defaultDestinationDTO.setDestinationId(resultSet.getString("id"));
				defaultDestinationDTO.setUserId(loginUserId);
				defaultDestinationDTO.setFamilyName(resultSet.getString("family_name"));
				defaultDestinationDTO.setFirstName(resultSet.getString("first_name"));
				defaultDestinationDTO.setFamilyNameKana(resultSet.getString("family_name_kana"));
				defaultDestinationDTO.setFirstNameKana(resultSet.getString("first_name_kana"));
				defaultDestinationDTO.setEmail(resultSet.getString("email"));
				defaultDestinationDTO.setTelNumber(resultSet.getString("tel_number"));
				defaultDestinationDTO.setUserAddress(resultSet.getString("user_address"));
				defaultDestinationDTO.setMyAddressFlg(Integer.toString(resultSet.getInt("status")));
				defaultDestinationDTO.setUpdateDate(dateUtil.getDate());
				}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			connection.close();
		}
		return defaultDestinationDTO;
	}
}

