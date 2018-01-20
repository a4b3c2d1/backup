package com.internousdevwork.sagaone.action;

import java.util.List;

import com.internousdevwork.sagaone.dto.SearchItemInfoDTO;

public class GetSearchWordsAction {


	public  List<SearchItemInfoDTO> getSearghWord(List<SearchItemInfoDTO> dtoList){

		for(int i=0; i<dtoList.size(); i++){
			String searchWords = dtoList.get(i).getProductName() + dtoList.get(i).getReleaseCompany() + dtoList.get(i).getProductDescription();
			dtoList.get(i).setSearchWords(searchWords);
		}

		return dtoList;
	}
}
