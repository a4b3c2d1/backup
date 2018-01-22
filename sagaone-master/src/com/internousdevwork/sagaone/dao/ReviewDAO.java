package com.internousdevwork.sagaone.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.internousdevwork.sagaone.dto.ReviewDTO;
import com.internousdevwork.sagaone.dto.ReviewDetailDTO;
import com.internousdevwork.sagaone.util.DBConnector;

public class ReviewDAO {
	private DBConnector db = new DBConnector();
	private Connection con = db.getConnection();
	private List<ReviewDTO> reviewDTOList = new ArrayList<ReviewDTO>();
	private List<ReviewDTO> reviewDTO2List = new ArrayList<ReviewDTO>();
	private List<ReviewDetailDTO> reviewDTO3List = new ArrayList<ReviewDetailDTO>();

	public List<ReviewDTO> getreviewinfo1(String user_id, String product_id) {

		String sql1 = "select * from review_info where user_id=? and product_id=?";
		try {
			PreparedStatement ps = con.prepareStatement(sql1);
			ps.setString(1, user_id);
			ps.setString(2, product_id);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				ReviewDTO reviewdto = new ReviewDTO();
				reviewdto.setId(rs.getInt("id"));
				reviewdto.setUser_id(rs.getString("user_id"));
				reviewdto.setProduct_id(rs.getInt("product_id"));
				reviewdto.setValue(rs.getInt("value"));
				reviewdto.setReview(rs.getString("review"));
				reviewdto.setUpdate_date(StringUtils.left(rs.getString("update_date"), 16));
				reviewDTOList.add(reviewdto);
			}
		} catch (

		Exception e) {
			e.printStackTrace();
		}
		return reviewDTOList;
	}

	public List<ReviewDTO> getreviewinfo2(String product_id) {

		String sql2 = "select * from review_info where product_id=?";


		try

		{
			PreparedStatement ps = con.prepareStatement(sql2);
			ps.setString(1, product_id);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				ReviewDTO reviewdto = new ReviewDTO();
				reviewdto.setId(rs.getInt("id"));
				reviewdto.setUser_id(rs.getString("user_id"));
				reviewdto.setProduct_id(rs.getInt("product_id"));
				reviewdto.setValue(rs.getInt("value"));
				reviewdto.setReview(rs.getString("review"));
				reviewdto.setUpdate_date(StringUtils.left(rs.getString("update_date"), 16));

				reviewDTO2List.add(reviewdto);
			}
		} catch (

		Exception e) {
			e.printStackTrace();
		}
		return reviewDTO2List;
	}

	public List<ReviewDetailDTO> getreviewinfo3(String product_id) {

		String sql3 = "select review_value.value,countvalue.cnt from review_value left join (select value ,count(value) as cnt from review_info where product_id=? group by id) as countvalue on review_value.value=countvalue.value ;";
		try

		{
			PreparedStatement ps = con.prepareStatement(sql3);
			ps.setString(1, product_id);

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				ReviewDetailDTO reviewdetaildto = new ReviewDetailDTO();
				reviewdetaildto.setValue(rs.getInt("value"));
				reviewdetaildto.setCnt(rs.getInt("cnt"));

				reviewDTO3List.add(reviewdetaildto);
			}
		} catch (

		Exception e) {
			e.printStackTrace();
		}
		return reviewDTO3List;
	}

}
