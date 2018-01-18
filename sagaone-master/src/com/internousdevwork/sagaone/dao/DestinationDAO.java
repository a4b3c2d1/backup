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

	private ArrayList<DestinationDTO> destinationDTOList = new ArrayList<DestinationDTO>();

	private DateUtil dateUtil = new DateUtil();

	public DestinationDTO defaultDestinationInfo(String loginUserId) throws SQLException {

		DestinationDTO defaultDestinationDTO = new DestinationDTO();

		String sql = "select * from destination_info where user_id = ? and status = 1";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, loginUserId);
			ResultSet resultSet = preparedStatement.executeQuery();

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
		}
		return defaultDestinationDTO;

	}

	public ArrayList<DestinationDTO> destinationInfo(String loginUserId) throws SQLException {


		String sql = "select * from destination_info where user_id = ? and status = 0";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, loginUserId);
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				DestinationDTO destinationDTO = new DestinationDTO();
				destinationDTO.setDestinationId(resultSet.getString("id"));
				destinationDTO.setUserId(loginUserId);
				destinationDTO.setFamilyName(resultSet.getString("family_name"));
				destinationDTO.setFirstName(resultSet.getString("first_name"));
				destinationDTO.setFamilyNameKana(resultSet.getString("family_name_kana"));
				destinationDTO.setFirstNameKana(resultSet.getString("first_name_kana"));
				destinationDTO.setEmail(resultSet.getString("email"));
				destinationDTO.setTelNumber(resultSet.getString("tel_number"));
				destinationDTO.setUserAddress(resultSet.getString("user_address"));
				destinationDTO.setMyAddressFlg(Integer.toString(resultSet.getInt("status")));
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
