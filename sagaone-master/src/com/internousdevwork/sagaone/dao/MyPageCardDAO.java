package com.internousdevwork.sagaone.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdevwork.sagaone.dto.MyPageCardDTO;
import com.internousdevwork.sagaone.util.DBConnector;

//card_infoテーブル
public class MyPageCardDAO {
	private DBConnector db= new DBConnector();
	private Connection con= db.getConnection();

	
	public MyPageCardDTO getCard(String loginUserId){
		MyPageCardDTO myPageCardDTO= new MyPageCardDTO();
		String sql = "select * from card_info where user_id = ?";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, loginUserId);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()){
				myPageCardDTO.setCardNumber(rs.getString("card_number"));
				//myPageCardDTO.setUserId(rs.getString("userId"));
			}
		}catch (Exception e){
			e.getMessage();
		}
		
		try{
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return myPageCardDTO;
	}
}
