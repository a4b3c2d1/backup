package com.internousdevwork.sagaone.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

import com.internousdevwork.sagaone.dto.ItemDTO;
import com.internousdevwork.sagaone.util.DBConnector;

public class ItemDAO {
	private DBConnector db = new DBConnector();
	private Connection con = db.getConnection();
	private List<ItemDTO> itemDTOList = new ArrayList<ItemDTO>();
	private List<ItemDTO> itemDTOList2 = new ArrayList<ItemDTO>();
	NumberFormat nfNum = NumberFormat.getNumberInstance();

	/**
	 * 商品情報取得
	 */

	public List<ItemDTO> getiteminfo1() {
		String sql = "select a.*,round(avg(b.value),1) as avgvalue ,count(b.value) as countvalue from product_info a left join review_info b on a.product_id=b.product_id group by a.product_id order by a.id asc;";

		try {
			PreparedStatement ps = con.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				ItemDTO itemdto = new ItemDTO();

				itemdto.setId(rs.getInt("id"));
				itemdto.setProduct_id(rs.getInt("product_id"));
				itemdto.setProduct_name(rs.getString("product_name"));
				itemdto.setProduct_name_kana(rs.getString("product_name_kana"));
				itemdto.setProduct_description(rs.getString("product_description"));
				itemdto.setCategory_id(rs.getInt("category_id"));
				itemdto.setPrice(nfNum.format(rs.getInt("price")));
				itemdto.setImage_file_path(rs.getString("image_file_path"));
				itemdto.setImage_file_name(rs.getString("image_file_name"));
				itemdto.setRelease_date(rs.getString("release_date"));
				itemdto.setRelease_company(rs.getString("release_company"));
				itemdto.setStatus(rs.getInt("status"));
				itemdto.setRegist_date(rs.getString("regist_date"));
				itemdto.setUpdate_date(rs.getString("update_date"));
				itemdto.setAvgvalue(rs.getFloat("avgvalue"));
				itemdto.setCountvalue(rs.getInt("countvalue"));

				itemDTOList2.add(itemdto);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return itemDTOList2;
	}

	public List<ItemDTO> getiteminfo2(int offset) {
		String sql = "select a.*,round(avg(b.value),1) as avgvalue ,count(b.value) as countvalue from product_info a left join review_info b on a.product_id=b.product_id group by a.product_id order by a.id asc limit 9 offset ?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, offset);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				ItemDTO itemdto = new ItemDTO();

				itemdto.setId(rs.getInt("id"));
				itemdto.setProduct_id(rs.getInt("product_id"));
				itemdto.setProduct_name(rs.getString("product_name"));
				itemdto.setProduct_name_kana(rs.getString("product_name_kana"));
				itemdto.setProduct_description(rs.getString("product_description"));
				itemdto.setCategory_id(rs.getInt("category_id"));
				itemdto.setPrice(nfNum.format(rs.getInt("price")));
				itemdto.setImage_file_path(rs.getString("image_file_path"));
				itemdto.setImage_file_name(rs.getString("image_file_name"));
				itemdto.setRelease_date(rs.getString("release_date"));
				itemdto.setRelease_company(rs.getString("release_company"));
				itemdto.setStatus(rs.getInt("status"));
				itemdto.setRegist_date(rs.getString("regist_date"));
				itemdto.setUpdate_date(rs.getString("update_date"));
				itemdto.setAvgvalue(rs.getFloat("avgvalue"));
				itemdto.setCountvalue(rs.getInt("countvalue"));
				itemDTOList.add(itemdto);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return itemDTOList;
	}

}
