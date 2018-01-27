package com.internousdevwork.sagaone.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdevwork.sagaone.dao.MyPageAddressDAO;
//カード
import com.internousdevwork.sagaone.dao.MyPageCardDAO;
import com.internousdevwork.sagaone.dao.MyPageDAO;
import com.internousdevwork.sagaone.dto.CardUpdateDTO;
import com.internousdevwork.sagaone.dto.MyPageAddressDTO;
import com.internousdevwork.sagaone.dto.MyPageDTO;
import com.opensymphony.xwork2.ActionSupport;

public class MyPageAction extends ActionSupport implements SessionAware{

	public Map<String, Object> session;
	private MyPageDAO myPageDAO = new MyPageDAO();
	private MyPageDTO myPageDTO = new MyPageDTO();
	private MyPageAddressDTO myPageAddressDTO = new MyPageAddressDTO();
	private String myAddressFlg = "0";
	private String actionPage;

	//クレジットカード
	private MyPageCardDAO myPageCardDAO = new MyPageCardDAO();
	private CardUpdateDTO cardUpdateDTO = new CardUpdateDTO();

	public String execute(){
		String ret = ERROR;
		actionPage = "MyPageAction";
		session.put("actionPage", actionPage);

		if(session.get("loginFlg").toString().equals("false")){
			return ERROR;
		}

		if( session.get("loginUserId") != null){
			myPageDTO = myPageDAO.myPageInfo(session.get("loginUserId").toString());
			ret = SUCCESS;
		}

		//カード
		if(session.get("loginUserId") != null){
			cardUpdateDTO =myPageCardDAO.getCard(session.get("loginUserId").toString());
			int len = 0;
			if(cardUpdateDTO.getUserId() != null){
				len = cardUpdateDTO.getCardNumber().length();
			}
			if(len >= 4){
				cardUpdateDTO.setCardNumberLastFour(cardUpdateDTO.getCardNumber().substring(len - 4, len));
			}



			ret = SUCCESS;
		}


		myPageAddressDTO = new MyPageAddressDAO().getUserAddress(session.get("loginUserId").toString());

		myAddressFlg = "1";

		session.put("myPageDTO", myPageDTO);
		session.put("cardUpdateDTO",cardUpdateDTO);
		session.put("myPageAddress", myPageAddressDTO);
		session.put("myAddressFlg", myAddressFlg);


		return ret;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


}
