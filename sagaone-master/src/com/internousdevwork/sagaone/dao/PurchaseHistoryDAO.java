/**
 *
 */
package com.internousdevwork.sagaone.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdevwork.sagaone.dto.PurchaseHistoryDTO;
import com.internousdevwork.sagaone.util.DBConnector;

/**
 * @author internousdev
 *
 */
public class PurchaseHistoryDAO {

	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();

	public ArrayList<PurchaseHistoryDTO> getPurchaseHistory(String user_id) throws SQLException {

		ArrayList<PurchaseHistoryDTO> purchaseHistoryDTOList = new ArrayList<PurchaseHistoryDTO>();
		String sql = "select phi.id, phi.user_id, phi.product_id, pi.category_id, pi.product_name, pi.product_name_kana, pi.image_file_path, pi.image_file_name, pi.price, pi.release_company, pi.release_date from purchase_history_info phi left join product_info pi on phi.product_id = pi.product_id where phi.user_id = ? order by phi.regist_date desc";

		// DBからテーブルpurchase_history_infoとproduct_infoを結合の上、user_idで検索。
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, user_id);

			ResultSet resultSet = preparedStatement.executeQuery();

			// DBから取得した情報をPurchaseHistoryDTOにsetして、Listに追加
			while (resultSet.next()) {
				PurchaseHistoryDTO purchaseHistoryDTO = new PurchaseHistoryDTO();

				purchaseHistoryDTO.setId(resultSet.getInt("id"));
				purchaseHistoryDTO.setUser_id(resultSet.getString("user_id"));
				purchaseHistoryDTO.setProduct_id(resultSet.getInt("product_id"));
				purchaseHistoryDTO.setCategory_id(resultSet.getInt("category_id"));
				purchaseHistoryDTO.setProduct_name(resultSet.getString("product_name"));
				purchaseHistoryDTO.setProduct_name_kana(resultSet.getString("product_name_kana"));
				purchaseHistoryDTO.setImage_file_path(resultSet.getString("image_file_path"));
				purchaseHistoryDTO.setImage_file_name(resultSet.getString("image_file_name"));
				purchaseHistoryDTO.setPrice(resultSet.getInt("price"));
				purchaseHistoryDTO.setRelease_company(resultSet.getString("release_company"));
				purchaseHistoryDTO.setRelease_date(resultSet.getString("release_date"));

				purchaseHistoryDTOList.add(purchaseHistoryDTO);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			connection.close();
		}
		return purchaseHistoryDTOList;
	}

	// 購入履歴全削除メソッド
	public int deletePurchaseHistory(String user_id) throws SQLException {

		String sql = "delete from purchase_history_info where user_id = ?";
		int result = 0;

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, user_id);

			result = preparedStatement.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			connection.close();
		}
		return result;
	}

	// 購入履歴個別削除メソッド
	public int deleteCheckedPurchaseHistory(List<String> checkboxList) throws SQLException {

		String sql = "delete from purchase_history_info where id = ?";
		int result = 0;

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			// チェックがついていた商品のListを取得、削除
			for (int i = 0; i < checkboxList.size(); i++) {
				String checkId = checkboxList.get(i);
				preparedStatement.setString(1, checkId);
				preparedStatement.addBatch();
			}

			// 何件削除したか取得。executeBatch()は配列で返すので配列の数を取得
			int[] res = preparedStatement.executeBatch();
			result = res.length;

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			connection.close();
		}
		return result;

	}
}
