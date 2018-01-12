package com.internousdevwork.sagaone.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdevwork.sagaone.dto.PaymentCartInfoDTO;
import com.internousdevwork.sagaone.util.DBConnector;

//cart_infoテーブル
public class PaymentCartInfoDAO {
	private DBConnector db= new DBConnector();
	private Connection con= db.getConnection();
	private List<PaymentCartInfoDTO> cartInfoDTOList = new ArrayList<PaymentCartInfoDTO>();

	public List<PaymentCartInfoDTO> getCartInfo (String loginUserId) {
		String sql= "select * from cart_info where user_id= ?";

		try {
			PreparedStatement ps= con.prepareStatement(sql);
			ps.setString(1, loginUserId);

			ResultSet rs= ps.executeQuery();


			while (rs.next()) {
				PaymentCartInfoDTO paymentCartInfoDTO= new PaymentCartInfoDTO();
				paymentCartInfoDTO.setProductId(rs.getInt("product_id"));
				paymentCartInfoDTO.setProductCount(rs.getInt("product_count"));
				cartInfoDTOList.add(paymentCartInfoDTO);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return cartInfoDTOList;
	}

	public void deleteCartInfo(String loginUserId) throws SQLException {
		String sql = "delete from cart_info where user_id = ?" ;

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, loginUserId);

			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		}


	}
}
