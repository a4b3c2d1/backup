/**
 *
 */
package com.internousdevwork.sagaone.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdevwork.sagaone.dto.DestinationDTO;
import com.internousdevwork.sagaone.util.DBConnector;
import com.internousdevwork.sagaone.util.DateUtil;

/**
 * @author internousdev
 *
 */
public class DestinationDAO {

	DBConnector dbConnector = new DBConnector();
	Connection connection = dbConnector.getConnection();

	private DateUtil dateUtil = new DateUtil();

	public ArrayList<DestinationDTO> DestinationInfo(String userId) throws SQLException {

		ArrayList<DestinationDTO> destinationDTOList = new ArrayList<DestinationDTO>();

		String sql = "select * from destinatin_info where user_id = ?";

		DestinationDTO destinationDTO = new DestinationDTO();

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, userId);
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				destinationDTO.setId(resultSet.getString("id"));
				destinationDTO.setUserId(userId);
				destinationDTO.setFamilyName(resultSet.getString("famlyName"));
				destinationDTO.setFirstName(resultSet.getString("firstName"));
				destinationDTO.setFamilyNameKana(resultSet.getString("familyNameKana"));
				destinationDTO.setFirstNameKana(resultSet.getString("firstNameKana"));
				destinationDTO.setEmail(resultSet.getString("email"));
				destinationDTO.setUserAddress(resultSet.getString("userAddress"));
				destinationDTO.setTelNumber(resultSet.getString("telNumber"));
				destinationDTO.setUpdateDate(dateUtil.getDate());
				destinationDTOList.add(destinationDTO);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			connection.close();
		}
		return destinationDTOList;
	}
}
