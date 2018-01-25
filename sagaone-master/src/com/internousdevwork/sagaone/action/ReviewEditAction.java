package com.internousdevwork.sagaone.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdevwork.sagaone.dao.ItemrelativeDAO;
import com.internousdevwork.sagaone.dao.ReviewDAO;
import com.internousdevwork.sagaone.dao.ReviewEditDAO;
import com.internousdevwork.sagaone.dao.SearchItemFromAllDAO;
import com.internousdevwork.sagaone.dto.ItemDTO;
import com.internousdevwork.sagaone.dto.ReviewDTO;
import com.internousdevwork.sagaone.dto.ReviewDetailDTO;
import com.internousdevwork.sagaone.dto.SearchItemInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ReviewEditAction extends ActionSupport implements SessionAware {

	private ReviewEditDAO reviewEditDAO = new ReviewEditDAO();

	private List<ReviewDTO> reviewDTO2List = new ArrayList<ReviewDTO>();

	private ReviewDAO reviewDAO = new ReviewDAO();

	public Map<String, Object> session;

	private String changeflg;

	private String deleteflg;

	private String backflg;

	public String result;
	private ItemrelativeDAO itemrelativeDAO = new ItemrelativeDAO();
	private List<ItemDTO> itemdetailDTOList = new ArrayList<ItemDTO>();

	private List<SearchItemInfoDTO> searchItemDTOList = new ArrayList<SearchItemInfoDTO>();
	private SearchItemFromAllDAO searchItemFromAllDAO = new SearchItemFromAllDAO();
	private List<ReviewDetailDTO> reviewdetailDTO1List = new ArrayList<ReviewDetailDTO>();

	public String execute() {

		if (changeflg != null) {
			// レビュー変更画面へ

			result = "change";
			session.put("changeflg", changeflg);
		} else if (deleteflg != null) {
			// レビュー削除
			reviewEditDAO.deletereview(session.get("review_user_id").toString(),
					session.get("review_product_id").toString());

			// レビュー再読み込み用
			reviewDTO2List = reviewDAO.getreviewinfo2(session.get("review_product_id").toString());
			session.put("reviewDTO2List", reviewDTO2List);
			session.put("deleteflg", deleteflg);
			result = "delete";
			// 商品詳細表示用リスト作成
			itemdetailDTOList = itemrelativeDAO.getdetailinfo(session.get("review_product_id").toString());
			session.put("itemdetailDTOList", itemdetailDTOList);

			// 全商品DTOに詰めます
			searchItemDTOList = searchItemFromAllDAO.getItemInfoFromAll();
			ReformCharaAction reformedItemList = new ReformCharaAction();
			searchItemDTOList = reformedItemList.reformDescription(searchItemDTOList);
			GetSearchWordsAction gswa = new GetSearchWordsAction();
			searchItemDTOList = gswa.getSearghWord(searchItemDTOList);
			session.put("allItem", searchItemDTOList);

			// レビュー詳細リスト
			reviewdetailDTO1List = reviewDAO.getreviewinfo3(session.get("review_product_id").toString());
			session.put("reviewdetailDTO1List", reviewdetailDTO1List);

		}
		return result;

	}

	public String getBackflg() {
		return backflg;
	}

	public void setBackflg(String backflg) {
		this.backflg = backflg;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getChangeflg() {
		return changeflg;
	}

	public void setChangeflg(String changeflg) {
		this.changeflg = changeflg;
	}

	public String getDeleteflg() {
		return deleteflg;
	}

	public void setDeleteflg(String deleteflg) {
		this.deleteflg = deleteflg;
	}
}