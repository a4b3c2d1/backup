package com.internousdevwork.sagaone.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.internousdevwork.sagaone.dto.SearchItemInfoDTO;
import com.internousdevwork.sagaone.util.DBConnector;



public class SearchItemFromCatDAO {
	private List<SearchItemInfoDTO> searchItemInfoDTOList = new ArrayList<SearchItemInfoDTO>();
	DBConnector db = new DBConnector();
	Connection con = db.getConnection();

	public List<SearchItemInfoDTO> getItemInfoFromCat(int categoryId, String productDescription){
		String sql = "SELECT * FROM product_info WHERE category_id = ? AND product_description LIKE ? ";
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, categoryId);
			ps.setString(2, "%" + productDescription + "%");
			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				SearchItemInfoDTO dto = new SearchItemInfoDTO();
				dto.setId(rs.getString("id"));
				dto.setProductId(rs.getString("product_id"));
				dto.setProductName(rs.getString("product_name"));
				dto.setProductNameKana(rs.getString("product_name_kana"));
				dto.setProductDescription(rs.getString("product_description"));
				dto.setCategoryId(rs.getString("category_id"));
				dto.setPrice(rs.getInt("price"));
				dto.setImageFilePath(rs.getString("image_file_path"));
				dto.setImageFileName(rs.getString("image_file_name"));
				dto.setReleaseDate(StringUtils.left(rs.getString("release_date"),10));
				dto.setReleaseCompany(rs.getString("release_company"));
				dto.setStatus(rs.getInt("status"));
				searchItemInfoDTOList.add(dto);
			}

		}catch(SQLException e){
			e.printStackTrace();
		}
		try{
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}

		return searchItemInfoDTOList;
	}
}
