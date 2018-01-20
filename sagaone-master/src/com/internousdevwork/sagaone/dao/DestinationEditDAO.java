/**
 *
 */
package com.internousdevwork.sagaone.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdevwork.sagaone.dto.DestinationDTO;
import com.internousdevwork.sagaone.util.DBConnector;
/**
 * @author internousdev
 *
 */
public class DestinationEditDAO {
	DBConnector dbConnector = new DBConnector();
	Connection connection = dbConnector.getConnection();

	public DestinationDTO destinationSelect(String destinationId) throws SQLException {

		String sql = "select * from destination_info where id = ?";

		DestinationDTO selectDestinationDTO = new DestinationDTO();

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setString(1, destinationId);
			ResultSet resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				selectDestinationDTO.setFamilyName(resultSet.getString("family_name"));
				selectDestinationDTO.setFirstName(resultSet.getString("first_name"));
				selectDestinationDTO.setFamilyNameKana(resultSet.getString("family_name_kana"));
				selectDestinationDTO.setFirstNameKana(resultSet.getString("first_name_kana"));
				selectDestinationDTO.setTelNumber(resultSet.getString("tel_number"));
				selectDestinationDTO.setUserAddress(resultSet.getString("user_address"));
				selectDestinationDTO.setEmail(resultSet.getString("email"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			connection.close();
		}
		return selectDestinationDTO;
	}
}
