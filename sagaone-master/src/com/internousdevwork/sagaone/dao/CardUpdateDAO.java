package com.internousdevwork.sagaone.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdevwork.sagaone.dto.CardUpdateDTO;
import com.internousdevwork.sagaone.util.DBConnector;
import com.internousdevwork.sagaone.util.DateUtil;

public class CardUpdateDAO {

	DBConnector db= new DBConnector();
	Connection con= db.getConnection();
	private DateUtil dateUtil = new DateUtil();
	private CardUpdateDTO cardDTO= new CardUpdateDTO();
	
	private String sql= "UPDATE card_info set card_number= ?, limit_year = ?, limit_month=?, security_number=?, nominee=? , update_date=? where user_id= ?" ;
	//private String sql= "UPDATE card_info(user_id,card_number,limit_year,limit_month,security_number,nominee,update_date)VALUES(?,?,?,?,?,?,?)";
	
	public CardUpdateDTO getNewCardInfo (String userId,String cardNumber,String limitYear,String limitMonth,String securityNumber, String nominee)throws SQLException {
		
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setString(1, cardNumber);
			ps.setString(2, limitYear);
			ps.setString(3, limitMonth);
			ps.setString(4, securityNumber);
			ps.setString(5, nominee);
			ps.setString(6, dateUtil.getDate());
			ps.setString(7, userId);
			
				
			
			ps.execute();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return cardDTO;
		}
	
}
