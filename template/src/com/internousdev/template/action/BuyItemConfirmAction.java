package com.internousdev.template.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template.dao.BuyItemCompleteDAO;
import com.internousdev.template.dao.UpdateinfoDAO;
import com.opensymphony.xwork2.ActionSupport;

public class BuyItemConfirmAction extends ActionSupport implements SessionAware {
	public Map<String, Object> session;

	private BuyItemCompleteDAO buyItemCompleteDAO = new BuyItemCompleteDAO();

	UpdateinfoDAO updateinfodao = new UpdateinfoDAO();

	/**
	 * 商品情報登録メソッド
	 *
	 * @author internous
	 */

	public String execute() throws SQLException {

		buyItemCompleteDAO.buyItemInfo(session.get("id").toString(), session.get("login_user_id").toString(),
				session.get("buyItem_price").toString(), session.get("stock").toString(),
				session.get("pay").toString());


		/** 購入個数 **/
		int buy = Integer.parseInt(session.get("stock").toString());
		/** 現在のストック **/
		int buyitemstock = Integer.parseInt(session.get("buyItem_stock").toString());

		/** 購入商品id **/
		int ID = Integer.parseInt(session.get("id").toString());

		String result;

		if (buyitemstock - buy >= 0) {
			updateinfodao.stockupdate(buyitemstock, buy, ID);

			result = SUCCESS;
		}

		else {
			result = ERROR;
		}
		return result;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
