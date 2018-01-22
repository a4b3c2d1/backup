package com.internousdevwork.sagaone.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.internousdevwork.sagaone.dto.StartDTO;
import com.internousdevwork.sagaone.util.DBConnector;

public class StartDAO {

	private DBConnector db = new DBConnector();
	private Connection con = db.getConnection();
	private List<StartDTO> startDTOList = new ArrayList<StartDTO>();

	public List<StartDTO> getiteminfo() {
		String sql = "select * from product_info ";

		try {
			PreparedStatement ps = con.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				StartDTO startdto = new StartDTO();

				startdto.setId(rs.getInt("id"));
				startdto.setProduct_id(rs.getInt("product_id"));
				startdto.setProduct_name(rs.getString("product_name"));
				startdto.setProduct_name_kana(rs.getString("product_name_kana"));
				startdto.setProduct_description(rs.getString("product_description"));
				startdto.setCategory_id(rs.getInt("category_id"));
				startdto.setPrice(rs.getInt("price"));
				startdto.setImage_file_path(rs.getString("image_file_path"));
				startdto.setImage_file_name(rs.getString("image_file_name"));
				startdto.setRelease_date(rs.getString("release_date"));
				startdto.setRelease_company(rs.getString("release_company"));
				startdto.setStatus(rs.getInt("status"));
				startdto.setRegist_date(rs.getString("regist_date"));
				startdto.setUpdate_date(rs.getString("update_date"));

				startDTOList.add(startdto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return startDTOList;
	}
}
