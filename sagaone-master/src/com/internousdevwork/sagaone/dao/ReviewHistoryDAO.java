package com.internousdevwork.sagaone.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.internousdevwork.sagaone.dto.ReviewInfoDTO;
import com.internousdevwork.sagaone.util.DBConnector;

public class ReviewHistoryDAO {

	private DBConnector db= new DBConnector();
	private Connection con= db.getConnection();
	private List<ReviewInfoDTO> reviewInfoDTOList = new ArrayList<ReviewInfoDTO>();

	public List<ReviewInfoDTO> getReviewInfo (String loginUserId) {
		String sql= "select * from review_info where user_id= ?";

		try {
			PreparedStatement ps= con.prepareStatement(sql);
			ps.setString(1, loginUserId);

			ResultSet rs= ps.executeQuery();


			while (rs.next()) {
				ReviewInfoDTO reviewInfoDTO = new ReviewInfoDTO();
				reviewInfoDTO.setUserId(rs.getString("user_id"));
				reviewInfoDTO.setProductId(rs.getInt("product_id"));
				reviewInfoDTO.setValue(rs.getInt("value"));
				reviewInfoDTO.setReview(rs.getString("review"));
				reviewInfoDTOList.add(reviewInfoDTO);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return reviewInfoDTOList;
	}
}
