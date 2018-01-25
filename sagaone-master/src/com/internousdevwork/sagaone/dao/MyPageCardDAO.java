package com.internousdevwork.sagaone.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//試し
import com.internousdevwork.sagaone.dto.CardUpdateDTO;
import com.internousdevwork.sagaone.util.DBConnector;

//card_infoテーブル
public class MyPageCardDAO {
	private DBConnector db= new DBConnector();
	private Connection con= db.getConnection();

	
	public CardUpdateDTO getCard(String loginUserId){
		CardUpdateDTO dto = new CardUpdateDTO();
		String sql = "select * from card_info where user_id = ?";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, loginUserId);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()){
				dto.setCardNumber(rs.getString("card_number"));
				dto.setLimitYear(rs.getString("limit_year"));
				dto.setLimitMonth(rs.getString("limit_month"));
				dto.setSecurityNumber(rs.getString("security_number"));
				dto.setNominee(rs.getString("nominee"));
			}
		}catch (Exception e){
			e.getMessage();
		}
		
		try{
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return dto;
	}
}
