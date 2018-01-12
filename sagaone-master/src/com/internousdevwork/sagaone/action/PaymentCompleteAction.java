package com.internousdevwork.sagaone.action;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdevwork.sagaone.dao.PaymentCartInfoDAO;
import com.internousdevwork.sagaone.dto.PaymentProductInfoDTO;
import com.internousdevwork.sagaone.util.DBConnector;
import com.internousdevwork.sagaone.util.DateUtil;
import com.opensymphony.xwork2.ActionSupport;

public class PaymentCompleteAction extends ActionSupport implements SessionAware{
	public Map<String, Object>session;
	private DateUtil dateUtil = new DateUtil();

	private DBConnector db = new DBConnector();
	private Connection con = db.getConnection();

	public String execute() throws SQLException {
		String ret = SUCCESS;


		String sql = "INSERT INTO purchase_history_info(user_id, product_id, product_count, price, regist_date) VALUES(?, ?, ?, ?, ?)";

		List<PaymentProductInfoDTO> productDTOList = (List<PaymentProductInfoDTO>)session.get("productDTOList");

		System.out.println(productDTOList.get(0).getProductId());
		System.out.println(productDTOList.get(1).getProductId());

		try{
			for(int i = 0; i<productDTOList.size(); i++){
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, session.get("loginUserId").toString());
				ps.setInt(2, productDTOList.get(i).getProductId());
				ps.setInt(3, productDTOList.get(i).getProductCount());
				ps.setInt(4, productDTOList.get(i).getPrice());
				ps.setString(5, dateUtil.getDate());
				ps.execute();
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		try{
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}

		delete();

		return ret;
	}


	/*カートテーブルの情報を削除
	  sql文は同一メソッド内に二つ記述可能だが
	  基本的には分ける*/

	public void delete() throws SQLException {
		PaymentCartInfoDAO paymentCartInfoDAO = new PaymentCartInfoDAO();

		String userId = session.get("loginUserId").toString();
		paymentCartInfoDAO.deleteCartInfo(userId);

	}

	public Map<String, Object> getSession() {
		return session;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


}
