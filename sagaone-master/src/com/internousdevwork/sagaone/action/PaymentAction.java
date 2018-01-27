package com.internousdevwork.sagaone.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdevwork.sagaone.dao.MyPageCardDAO;
import com.internousdevwork.sagaone.dao.PaymentCartInfoDAO;
import com.internousdevwork.sagaone.dao.PaymentProductInfoDAO;
import com.internousdevwork.sagaone.dao.PaymentUserAddressDAO;
import com.internousdevwork.sagaone.dao.PaymentUserInfoDAO;
import com.internousdevwork.sagaone.dto.CardUpdateDTO;
import com.internousdevwork.sagaone.dto.PaymentCartInfoDTO;
import com.internousdevwork.sagaone.dto.PaymentProductInfoDTO;
import com.internousdevwork.sagaone.dto.PaymentUserAddressDTO;
import com.internousdevwork.sagaone.dto.PaymentUserInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class PaymentAction extends ActionSupport implements SessionAware{

	private String paymentMessage;

	public Map<String,Object> session;
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

	//クレジットカード
	private MyPageCardDAO myPageCardDAO = new MyPageCardDAO();
	private CardUpdateDTO cardUpdateDTO = new CardUpdateDTO();

	//不具合修正用
	private String actionPage;

	public String execute(){

		//不具合修正用
		actionPage = "PaymentAction";
		session.put("actionPage", actionPage);

		if(session.get("loginFlg").toString().equals("false")){
			return ERROR;
		}

		String ret = SUCCESS;


		//クレジットカード
		cardUpdateDTO =myPageCardDAO.getCard(session.get("loginUserId").toString());

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
			//クレジットカード
			session.put("cardUpdateDTO",cardUpdateDTO);
		}
		return ret;
	}



	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
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



	public CardUpdateDTO getCardUpdateDTO() {
		return cardUpdateDTO;
	}



	public void setCardUpdateDTO(CardUpdateDTO cardUpdateDTO) {
		this.cardUpdateDTO = cardUpdateDTO;
	}



	public Map<String, Object> getSession() {
		return session;
	}



	public String getPaymentMessage() {
		return paymentMessage;
	}



	public void setPaymentMessage(String paymentMessage) {
		this.paymentMessage = paymentMessage;
	}



}
