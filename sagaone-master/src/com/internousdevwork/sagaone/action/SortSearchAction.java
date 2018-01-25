package com.internousdevwork.sagaone.action;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdevwork.sagaone.dto.SearchItemInfoDTO;
import com.internousdevwork.sagaone.util.SearchComparator;
import com.opensymphony.xwork2.ActionSupport;

public class SortSearchAction extends ActionSupport implements SessionAware{

	public Map<String, Object> session;
	private int pageNum;
	private int nowPage;
	private List<SearchItemInfoDTO> pageItemList = new ArrayList<SearchItemInfoDTO>();
	private int page;
	private List<Integer> pageNumList = new ArrayList<Integer>();

	public String execute(){
		String ret = SUCCESS;

		List<SearchItemInfoDTO> searchResultList =(List<SearchItemInfoDTO>)session.get("searchResultList");

		Collections.sort(searchResultList, new SearchComparator());

		session.put("searchResultList", searchResultList);

		nowPage = 0;
		pageNum = 0;

		page = searchResultList.size() / 9 + 1;
		for(int i=0; i<page; i++){
			pageNumList.add(i + 1);
		}


		if(searchResultList.size() >= (pageNum+1) * 9) {
			for(int i=0; i<9; i++) {
				pageItemList.add(searchResultList.get(i + pageNum * 9));
			}
		}else if(searchResultList.size() < (pageNum+1) * 9 && searchResultList.size() > 9){
			for(int i=0; i<searchResultList.size()-9; i++) {
				pageItemList.add(searchResultList.get(i + pageNum * 9));
			}
		}else {
			for(int i=0; i<searchResultList.size(); i++) {
				pageItemList.add(searchResultList.get(i + pageNum * 9));
			}
		}

		session.put("searchItemList", pageItemList);



		return ret;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getNowPage() {
		return nowPage;
	}

	public void setNowPage(int nowPage) {
		this.nowPage = nowPage;
	}

	public List<SearchItemInfoDTO> getPageItemList() {
		return pageItemList;
	}

	public void setPageItemList(List<SearchItemInfoDTO> pageItemList) {
		this.pageItemList = pageItemList;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public List<Integer> getPageNumList() {
		return pageNumList;
	}

	public void setPageNumList(List<Integer> pageNumList) {
		this.pageNumList = pageNumList;
	}



}
