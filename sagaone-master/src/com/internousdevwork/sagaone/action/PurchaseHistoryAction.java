/**
 *
 */
package com.internousdevwork.sagaone.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdevwork.sagaone.dao.PurchaseHistoryDAO;
import com.internousdevwork.sagaone.dto.PurchaseHistoryDTO;
import com.opensymphony.xwork2.ActionSupport;
/**
 * @author internousdev
 *
 */
public class PurchaseHistoryAction extends ActionSupport implements SessionAware {

	/**
	 * sessionからloginUserIdを取得。(要sessionの値の確認、共有
	 * purchase_histry_infoをuser_idで検索(executeQuery())
	 * product_infoから商品名、ふりがな、商品画像、値段、発売会社名、発売年月日を取得。
	 * Listに格納した後、iteratorで表示。
	 */
	private String loginUserId;
	private String message;
	private String deleteFlg;
	private List<String> checkboxList = new ArrayList<String>();
	public Map<String, Object> session;
	public List<PurchaseHistoryDTO> purchaseHistoryList = new ArrayList<PurchaseHistoryDTO>();
	public PurchaseHistoryDTO purchaseHistoryDTO = new PurchaseHistoryDTO();
	public PurchaseHistoryDAO purchaseHistoryDAO = new PurchaseHistoryDAO();


	public String execute() throws SQLException {

		String result = ERROR;

		if (deleteFlg == null) {
//			実装時にsession取得に切り替え
//			String userId = session.get("loginUserId").toString();
			String userId = "taro";
			purchaseHistoryList = purchaseHistoryDAO.getPurchaseHistory(userId);

			Iterator<PurchaseHistoryDTO> iterator = purchaseHistoryList.iterator();
			if (!(iterator.hasNext())) {
				purchaseHistoryList = null;
			}
		} else if (deleteFlg.equals("0")) {
			delete();
		} else if (deleteFlg.equals("1")) {
			deleteChecked();
		}
		result = SUCCESS;
		return result;
	}

	// 全削除メソッド
	public void delete() throws SQLException {
		String userId = session.get("loginUserId").toString();
		int result = purchaseHistoryDAO.deletePurchaseHistory(userId);

		if (result > 0) {
			setMessage("商品購入履歴をすべて削除しました。");
		} else if (result == 0) {
			setMessage("商品購入履歴を削除できませんでした。");
		}
	}

	// 個別削除メソッド
	public void deleteChecked() throws SQLException {
		PurchaseHistoryDAO purchaseHistoryDeleteDAO = new PurchaseHistoryDAO();

		int result = purchaseHistoryDeleteDAO.deleteCheckedPurchaseHistory(checkboxList);

		String userId = session.get("loginUserId").toString();
		purchaseHistoryList = purchaseHistoryDAO.getPurchaseHistory(userId);
		Iterator<PurchaseHistoryDTO> iterator = purchaseHistoryList.iterator();
		if (!(iterator.hasNext())) {
			purchaseHistoryList = null;
		}

		if (result > 0) {
			setMessage(result + "件削除しました。");
		} else if (result == 0) {
			setMessage("商品購入履歴を削除できませんでした。");
		}
	}

	public String getLoginUserId() {
		return loginUserId;
	}
	public void setLoginUserId(String loginUserId) {
		this.loginUserId = loginUserId;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDeleteFlg() {
		return deleteFlg;
	}

	public void setDeleteFlg(String deleteFlg) {
		this.deleteFlg = deleteFlg;
	}

	public List<String> getCheckboxList() {
		return checkboxList;
	}

	public void setCheckboxList(List<String> checkboxList) {
		this.checkboxList = checkboxList;
	}
}
