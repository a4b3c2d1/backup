package com.internousdevwork.sagaone.action;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdevwork.sagaone.dao.AddCartDAO;
import com.internousdevwork.sagaone.dao.LoginDAO;
import com.internousdevwork.sagaone.dao.PaymentCartInfoDAO;
import com.internousdevwork.sagaone.dao.PaymentProductInfoDAO;
import com.internousdevwork.sagaone.dao.PaymentUserAddressDAO;
import com.internousdevwork.sagaone.dao.PaymentUserInfoDAO;
import com.internousdevwork.sagaone.dao.TempCartDAO;
import com.internousdevwork.sagaone.dto.CartDTO;
import com.internousdevwork.sagaone.dto.LoginDTO;
import com.internousdevwork.sagaone.dto.PaymentCartInfoDTO;
import com.internousdevwork.sagaone.dto.PaymentProductInfoDTO;
import com.internousdevwork.sagaone.dto.PaymentUserAddressDTO;
import com.internousdevwork.sagaone.dto.PaymentUserInfoDTO;
import com.internousdevwork.sagaone.util.DBConnector;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware {

	// 前衛
	private String loginUserId;
	private String loginPassword;
	private String paymentFlg;
	private String loginMemory= "";
	public Map<String, Object> session;
	private String errorMessage;
	private String errorId;
	private String errorId1;
	private String errorId2;
	private String errorPassword;
	private String errorPassword1;
	private String errorPassword2;

	private LoginDAO loginDAO= new LoginDAO();
	private LoginDTO loginDTO= new LoginDTO();
	private ArrayList<CartDTO> cartList = new ArrayList<CartDTO>();
	private AddCartDAO addCartDAO = new AddCartDAO();
	private TempCartDAO tempCartDAO = new TempCartDAO();

	private String paymentMessage;


	private PaymentUserInfoDTO paymentUserInfoDTO = new PaymentUserInfoDTO();
	private PaymentUserAddressDTO userAddressDTO = new PaymentUserAddressDTO();
	private List<PaymentUserAddressDTO> addressDTOList = new ArrayList<PaymentUserAddressDTO>();
	private PaymentCartInfoDTO paymentCartInfoDTO = new PaymentCartInfoDTO();
	private List<PaymentCartInfoDTO> cartInfoList = new ArrayList<PaymentCartInfoDTO>();
	private List<PaymentProductInfoDTO> productDTOList = new ArrayList<PaymentProductInfoDTO>();
	private PaymentUserInfoDAO userInfoDAO = new PaymentUserInfoDAO();
	private PaymentUserAddressDAO userAddressDAO = new PaymentUserAddressDAO();
	private PaymentCartInfoDAO paymentCartInfoDAO = new PaymentCartInfoDAO();
	private int sumPrice = 0;

	public String execute() throws SQLException {
		String ret=ERROR;
		int ErrorCount= 0;

		if(!(loginUserId.equals("")) && !(loginPassword.equals(""))){
			setErrorMessage("IDかパスワードが違うよー(○・▽・○)<br>");
			ErrorCount++;
		}

		// 未入力時
		if(loginUserId.equals("")) {
			setErrorId("ログインIDが入ってないよー(○・▽・○)<br>");
			ErrorCount++;
		}

		if (loginPassword.equals("")) {
			setErrorPassword("パスワードが入ってないよー(○・▽・○)<br>");
			ErrorCount++;
		}


		// その他エラー
		if(loginUserId.length()<1||loginUserId.length()>8 && !(loginUserId.equals(""))){
			setErrorId1("1文字以上8文字以内で入力してねー(○・▽・○)<br>");
			ErrorCount++;
		}

		if (!(loginUserId.matches("^[0-9a-zA-Z]+$")) && !(loginUserId.equals(""))) {
			setErrorId2("半角英数字で入力してねー(○・▽・○)<br>");
			ErrorCount++;
		}


		if(loginPassword.length()<3||loginPassword.length()>16 && !(loginPassword.equals(""))){
			setErrorPassword1("3文字以上16文字以内で入力してねー(○・▽・○)<br>");
			ErrorCount++;
		}

		if (!(loginPassword.matches("^[0-9a-zA-Z]+$")) && !(loginPassword.equals(""))) {
			setErrorPassword2("半角英数字で入力してねー(○・▽・○)<br>");
			ErrorCount++;
		}

		if(ErrorCount>0) {
			ret = ERROR;
		}



		// ログイン実行
		loginDTO= loginDAO.getLoginUserInfo(loginUserId, loginPassword);

		if (loginUserId.equals(loginDTO.getLoginId())) {
			if (loginPassword.equals(loginDTO.getLoginPassword())){


			session.put("loginUser", loginDTO);
			session.put("loginUserId", loginUserId);
			session.put("loginPassword", loginPassword);
			session.put("loginFlg", loginDTO.getLoginFlg());

			ret= SUCCESS;
			}
		}else{
			ret = ERROR;
		}


		if (loginMemory.equals("true")) {
			session.put("loginMemory", true);
		} else {
			session.put("loginMemory", false);
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


		if (session.get("paymentFlg") != null) {
			paymentUserInfoDTO = userInfoDAO.getUserInfo(session.get("loginUserId").toString());

			addressDTOList = userAddressDAO.getUserAddress(session.get("loginUserId").toString());

			cartInfoList = paymentCartInfoDAO.getCartInfo(session.get("loginUserId").toString());

			// if文でcartInfoListが空の場合のエラー処理をする。
			for(int i = 0; i<cartInfoList.size(); i++){

				PaymentProductInfoDAO paymentProductDAO = new PaymentProductInfoDAO();
				PaymentProductInfoDTO paymentProductInfoDTO = new PaymentProductInfoDTO();
				paymentProductInfoDTO = paymentProductDAO.getProductInfo(cartInfoList.get(i).getProductId());
				paymentProductInfoDTO.setProductCount(cartInfoList.get(i).getProductCount());
				paymentProductInfoDTO.setTotalPrice(paymentProductInfoDTO.getPrice() * paymentProductInfoDTO.getProductCount());
				productDTOList.add(paymentProductInfoDTO);

				sumPrice += productDTOList.get(i).getTotalPrice();
			}


			if (cartInfoList.isEmpty()) {
				paymentMessage = "カートに商品が入っていません";
				session.put("paymentMessage", paymentMessage);
			} else {
				//paymentPage.jsp
				session.put("paymentUserInfoDTO", paymentUserInfoDTO);
				session.put("addressDTOList", addressDTOList);
				session.put("cartInfoList", cartInfoList);
				session.put("productDTOList", productDTOList);
				session.put("sumPrice", sumPrice);
			}
			ret= "payment";
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

	public String getPaymentFlg() {
		return paymentFlg;
	}
	public void setPaymentFlg(String paymentFlg){
		this.paymentFlg= paymentFlg;
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


	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorId() {
		return errorId;
	}
	public void setErrorId(String errorId){
		this.errorId= errorId;
	}

	public String getErrorId1() {
		return errorId1;
	}
	public void setErrorId1(String errorId1){
		this.errorId1= errorId1;
	}

	public String getErrorId2() {
		return errorId2;
	}
	public void setErrorId2(String errorId2){
		this.errorId2= errorId2;
	}

	public String getErrorPassword() {
		return errorPassword;
	}
	public void setErrorPassword(String errorPassword){
		this.errorPassword= errorPassword;
	}
	public String getErrorPassword1() {
		return errorPassword1;
	}
	public void setErrorPassword1(String errorPassword1){
		this.errorPassword1= errorPassword1;
	}


	public String getErrorPassword2() {
		return errorPassword2;
	}
	public void setErrorPassword2(String errorPassword2){
		this.errorPassword2= errorPassword2;
	}



	public PaymentUserInfoDTO getPaymentUserInfoDTO() {
		return paymentUserInfoDTO;
	}



	public void setPaymentUserInfoDTO(PaymentUserInfoDTO paymentUserInfoDTO) {
		this.paymentUserInfoDTO = paymentUserInfoDTO;
	}



	public PaymentUserAddressDTO getUserAddressDTO() {
		return userAddressDTO;
	}



	public void setUserAddressDTO(PaymentUserAddressDTO userAddressDTO) {
		this.userAddressDTO = userAddressDTO;
	}



	public PaymentCartInfoDTO getPaymentCartInfoDTO() {
		return paymentCartInfoDTO;
	}



	public void setPaymentCartInfoDTO(PaymentCartInfoDTO paymentCartInfoDTO) {
		this.paymentCartInfoDTO = paymentCartInfoDTO;
	}



	public PaymentUserInfoDAO getUserInfoDAO() {
		return userInfoDAO;
	}



	public void setUserInfoDAO(PaymentUserInfoDAO userInfoDAO) {
		this.userInfoDAO = userInfoDAO;
	}



	public PaymentUserAddressDAO getUserAddressDAO() {
		return userAddressDAO;
	}



	public void setUserAddressDAO(PaymentUserAddressDAO userAddressDAO) {
		this.userAddressDAO = userAddressDAO;
	}


	public PaymentCartInfoDAO getPaymentCartInfoDAO() {
		return paymentCartInfoDAO;
	}



	public void setPaymentCartInfoDAO(PaymentCartInfoDAO paymentCartInfoDAO) {
		this.paymentCartInfoDAO = paymentCartInfoDAO;
	}



	public String getPaymentMessage() {
		return paymentMessage;
	}



	public void setPaymentMessage(String paymentMessage) {
		this.paymentMessage = paymentMessage;
	}
}