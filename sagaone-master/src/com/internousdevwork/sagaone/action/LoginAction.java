package com.internousdevwork.sagaone.action;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdevwork.sagaone.dao.AddCartDAO;
import com.internousdevwork.sagaone.dao.LoginDAO;
import com.internousdevwork.sagaone.dao.TempCartDAO;
import com.internousdevwork.sagaone.dto.CartDTO;
import com.internousdevwork.sagaone.dto.LoginDTO;
import com.internousdevwork.sagaone.util.DBConnector;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware {

	// 前衛
	private String loginUserId;
	private String loginPassword;
	private String loginMemory= "";
	public Map<String, Object> session;
	private String errorMessage;
	private String blankErrorMessageID;
	private String blankErrorMessagePassword;

	private LoginDAO loginDAO= new LoginDAO();
	private LoginDTO loginDTO= new LoginDTO();
	private ArrayList<CartDTO> cartList = new ArrayList<CartDTO>();
	private AddCartDAO addCartDAO = new AddCartDAO();
	private TempCartDAO tempCartDAO = new TempCartDAO();

	public String execute() throws SQLException {
		String ret=ERROR;;
		int ErrorCount= 0;

		// ログイン実行
		loginDTO= loginDAO.getLoginUserInfo(loginUserId, loginPassword);
		session.put("loginUser", loginDTO);
		session.put("loginUserId", loginUserId);
		session.put("loginPassword", loginPassword);
		session.put("loginFlg", loginDTO.getLoginFlg());

		if (((LoginDTO) session.get("loginUser")).getLoginFlg()) {
			ret= SUCCESS;

		} else if(!(loginUserId.equals("")) && !(loginPassword.equals(""))){
			setErrorMessage("IDかパスワードが違うよー(○・▽・○)<br>");
			ret= ERROR;
		}
		if (loginMemory.equals("true")) {
			session.put("loginMemory", true);
		} else {
			session.put("loginMemory", false);
		}

		// 未入力時
		if(loginUserId.equals("")) {
			setBlankErrorMessageID("ログインIDが入ってないよー(○・▽・○)<br>");
			ErrorCount++;
		}

		if (loginPassword.equals("")) {
			setBlankErrorMessagePassword("パスワードが入ってないよー(○・▽・○)<br>");
			ErrorCount++;
		}
		if(ErrorCount>0) {
			ret = ERROR;
		}

		String user_id = session.get("temp_user_id").toString();
		cartList = tempCartDAO.getTempCartInfo(user_id);

		if(!(cartList == null)){
			for(int i = 0; i < cartList.size(); i++){
				addCartDAO.addCartInfo(
						cartList.get(i).getId(),
						session.get("loginUserId").toString(),
						cartList.get(i).getProductId(),
						session.get("count").toString(),
						cartList.get(i).getPrice()
						);
			}

			DBConnector db = new DBConnector();
			Connection con = db.getConnection();
			String sql = "DELETE FROM cart_info WHERE temp_user_id = ?";

			PreparedStatement ps;

			try {
				ps = con.prepareStatement(sql);
				ps.setString(1, user_id);

				ps.executeUpdate();
			}catch (Exception e){
				e.printStackTrace();
			}



		}




		return ret;
	}




	// 後衛
	public String getLoginUserId() {
		return loginUserId;
	}
	public void setLoginUserId (String loginUserId) {
		this.loginUserId= loginUserId;
	}

	public String getLoginPassword() {
		return loginPassword;
	}
	public void setLoginPassword (String loginPassword) {
		this.loginPassword= loginPassword;
	}

	public String getLoginMemory() {
		return loginMemory;
	}
	public void setLoginMemory(String loginMemory) {
		this.loginMemory= loginMemory;
	}

	public void setSession (Map<String, Object> session) {
		this.session= session;
	}

	public String getBlankErrorMessageID() {
		return blankErrorMessageID;
	}
	public void setBlankErrorMessageID(String blankErrorMessageID) {
		this.blankErrorMessageID = blankErrorMessageID;
	}

	public String getBlankErrorMessagePassword() {
		return blankErrorMessagePassword;
	}
	public void setBlankErrorMessagePassword(String blankErrorMessagePassword) {
		this.blankErrorMessagePassword = blankErrorMessagePassword;
	}

	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}


}