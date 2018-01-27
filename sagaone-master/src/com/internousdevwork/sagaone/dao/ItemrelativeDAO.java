package com.internousdevwork.sagaone.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.internousdevwork.sagaone.dto.ItemDTO;
import com.internousdevwork.sagaone.util.DBConnector;

public class ItemrelativeDAO {

	private List<ItemDTO> itemdetailDTOList = new ArrayList<ItemDTO>();
	private List<ItemDTO> itemrelativeDTOList = new ArrayList<ItemDTO>();
	private DBConnector db = new DBConnector();
	private Connection con = db.getConnection();
	NumberFormat nfNum = NumberFormat.getNumberInstance();

	public List<ItemDTO> getdetailinfo(String product_id) {

		String sql1 = "select a.*,round(avg(b.value),1) as avgvalue ,count(b.value) as countvalue from product_info a left join review_info b on a.product_id=b.product_id where a.product_id=?";

		try {
			PreparedStatement ps = con.prepareStatement(sql1);
			ps.setString(1, product_id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				ItemDTO itemdto = new ItemDTO();
				itemdto.setId(rs.getInt("id"));
				itemdto.setProductId(rs.getInt("product_id"));
				itemdto.setProductName(rs.getString("product_name"));
				itemdto.setProductNameKana(rs.getString("product_name_kana"));
				itemdto.setProductDescription(rs.getString("product_description"));
				itemdto.setCategoryId(rs.getInt("category_id"));
				itemdto.setPrice(nfNum.format(rs.getInt("price")));
				itemdto.setImageFilePath(rs.getString("image_file_path"));
				itemdto.setImageFileName(rs.getString("image_file_name"));
				itemdto.setReleaseDate(StringUtils.left(rs.getString("release_date"), 16));
				itemdto.setReleaseCompany(rs.getString("release_company"));
				itemdto.setStatus(rs.getInt("status"));
				itemdto.setRegistDate(rs.getString("regist_date"));
				itemdto.setUpdateDate(rs.getString("update_date"));
				itemdto.setAvgValue(rs.getFloat("avgvalue"));
				itemdto.setCountValue(rs.getInt("countvalue"));
				itemdetailDTOList.add(itemdto);
			}
		} catch (

		Exception e) {
			e.printStackTrace();
		}
		return itemdetailDTOList;
	}

	public List<ItemDTO> getrelativeinfo(String product_id, String category_id) {

		String sql2 = "select * from product_info where product_id!=? and category_id=?";

		try {
			PreparedStatement ps = con.prepareStatement(sql2);

			ps.setString(1, product_id);
			ps.setString(2, category_id);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				ItemDTO itemdto = new ItemDTO();
				itemdto.setId(rs.getInt("id"));
				itemdto.setProductId(rs.getInt("product_id"));
				itemdto.setProductName(rs.getString("product_name"));
				itemdto.setProductNameKana(rs.getString("product_name_kana"));
				itemdto.setProductDescription(rs.getString("product_description"));
				itemdto.setCategoryId(rs.getInt("category_id"));
				itemdto.setPrice(nfNum.format(rs.getInt("price")));
				itemdto.setImageFilePath(rs.getString("image_file_path"));
				itemdto.setImageFileName(rs.getString("image_file_name"));
				itemdto.setReleaseDate(StringUtils.left(rs.getString("release_date"), 16));
				itemdto.setReleaseCompany(rs.getString("release_company"));
				itemdto.setStatus(rs.getInt("status"));
				itemdto.setRegistDate(rs.getString("regist_date"));
				itemdto.setUpdateDate(rs.getString("update_date"));

				itemrelativeDTOList.add(itemdto);
			}
		} catch (

		Exception e) {
			e.printStackTrace();
		}

		return itemrelativeDTOList;

	}
}
