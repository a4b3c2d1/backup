package com.internousdevwork.sagaone.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.internousdevwork.sagaone.dto.PaymentUserAddressDTO;
import com.internousdevwork.sagaone.util.DBConnector;

//destination_infoテーブル
public class PaymentUserAddressDAO {
	private DBConnector db= new DBConnector();
	private Connection con= db.getConnection();
	private List<PaymentUserAddressDTO> addressDTOList = new ArrayList<PaymentUserAddressDTO>();

	public List<PaymentUserAddressDTO> getUserAddress (String loginUserId) {
		String sql= "select * from destination_info where user_id= ?";

		try {
			PreparedStatement ps= con.prepareStatement(sql);
			ps.setString(1, loginUserId);

			ResultSet rs= ps.executeQuery();


			while (rs.next()) {
				PaymentUserAddressDTO paymentUserAddressDTO= new PaymentUserAddressDTO();
				paymentUserAddressDTO.setTelNumber(rs.getString("tel_number"));
				paymentUserAddressDTO.setUserAddress(rs.getString("user_address"));
				addressDTOList.add(paymentUserAddressDTO);
		    }

		} catch (Exception e) {
			e.printStackTrace();
		}

		return addressDTOList;
	}

}