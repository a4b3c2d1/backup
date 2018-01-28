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
	private String product_id;
	private String category_id;

	@SuppressWarnings("unchecked")
	public String execute() {
		String loginUserId = session.get("loginUserId").toString();
		boolean loginMemory = session.get("loginMemory").equals(true);
		// String actionPage = session.get("actionPage").toString();
		loginDTO.setLoginId(session.get("loginUserId").toString());

		// 修正追加
		if (session.get("itemdetailDTOList") != null) {
			itemdetailDTOList = ((List<ItemDTO>) session.get("itemdetailDTOList"));
		}

		if (session.get("itemrelativeDTOList") != null) {
			itemrelativeDTOList = ((List<ItemDTO>) session.get("itemrelativeDTOList"));
		}
		if (session.get("reviewDTO2List") != null) {
			reviewDTO2List = ((List<ReviewDTO>) session.get("reviewDTO2List"));
		}

		if (session.get("reviewdetailDTO1List") != null) {
			reviewdetailDTO1List = ((List<ReviewDetailDTO>) session.get("reviewdetailDTO1List"));
		}
		if (session.get("pageItemList") != null) {
			pageItemList = ((List<SearchItemInfoDTO>) session.get("searchItemList"));
		}

		if (session.get("review_product_id") != null) {
			product_id = session.get("review_product_id").toString();
		}

		if (session.get("review_category_id") != null) {
			category_id = session.get("review_category_id").toString();
		}

		// ここまで
		session.clear();

		if (loginMemory) {
			session.put("checkedLoginUserId", loginUserId);
		}
		// session.put("actionPage", actionPage);


		//修正追加
		if (itemdetailDTOList != null) {
			session.put("itemdetailDTOList", itemdetailDTOList);
		}
		if (itemrelativeDTOList != null) {
			session.put("itemrelativeDTOList", itemrelativeDTOList);
		}
		if (reviewDTO2List != null) {
			session.put("reviewDTO2List", reviewDTO2List);
		}
		if (reviewdetailDTO1List != null) {
			session.put("reviewdetailDTO1List", reviewdetailDTO1List);
		}
		if (pageItemList != null) {
			session.put("searchItemList", pageItemList);
		}


		if (product_id != null) {
			session.put("review_product_id", product_id);
		}

		if (category_id != null) {
			session.put("review_category_id", category_id);
		}
		// ここまで
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
