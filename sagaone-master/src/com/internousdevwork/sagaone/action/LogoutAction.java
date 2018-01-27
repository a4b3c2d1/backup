package com.internousdevwork.sagaone.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdevwork.sagaone.dto.ItemDTO;
import com.internousdevwork.sagaone.dto.LoginDTO;
import com.internousdevwork.sagaone.dto.ReviewDTO;
import com.internousdevwork.sagaone.dto.ReviewDetailDTO;
import com.internousdevwork.sagaone.dto.SearchItemInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class LogoutAction extends ActionSupport implements SessionAware {

	private LoginDTO loginDTO = new LoginDTO();
	public Map<String, Object> session;
	private List<ItemDTO> itemdetailDTOList = new ArrayList<ItemDTO>();
	private List<ItemDTO> itemrelativeDTOList = new ArrayList<ItemDTO>();
	private List<ReviewDTO> reviewDTO2List = new ArrayList<ReviewDTO>();
	private List<ReviewDetailDTO> reviewdetailDTO1List = new ArrayList<ReviewDetailDTO>();
	private List<SearchItemInfoDTO> pageItemList = new ArrayList<SearchItemInfoDTO>();

	@SuppressWarnings("unchecked")
	public String execute() {
		String loginUserId = session.get("loginUserId").toString();
		boolean loginMemory = session.get("loginMemory").equals(true);
		// String actionPage = session.get("actionPage").toString();
		loginDTO.setLoginId(session.get("loginUserId").toString());
		itemdetailDTOList = ((List<ItemDTO>) session.get("itemdetailDTOList"));
		itemrelativeDTOList = ((List<ItemDTO>) session.get("itemrelativeDTOList"));
		reviewDTO2List = ((List<ReviewDTO>) session.get("reviewDTO2List"));
		reviewdetailDTO1List = ((List<ReviewDetailDTO>) session.get("reviewdetailDTO1List"));
		pageItemList = ((List<SearchItemInfoDTO>) session.get("searchItemList"));

		session.clear();

		if (loginMemory) {
			session.put("checkedLoginUserId", loginUserId);
		}
		// session.put("actionPage", actionPage);

		session.put("itemdetailDTOList", itemdetailDTOList);

		session.put("itemrelativeDTOList", itemrelativeDTOList);

		session.put("reviewDTO2List", reviewDTO2List);

		session.put("reviewdetailDTO1List", reviewdetailDTO1List);

		session.put("searchItemList", pageItemList);

		String ret = SUCCESS;

		return ret;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
