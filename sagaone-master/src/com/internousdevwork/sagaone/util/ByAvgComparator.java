package com.internousdevwork.sagaone.util;

import java.util.Comparator;

import com.internousdevwork.sagaone.dto.SearchItemInfoDTO;

public class ByAvgComparator {

	public class SearchComparator implements Comparator<SearchItemInfoDTO>{

		public int compare(SearchItemInfoDTO a, SearchItemInfoDTO b){
			float no1 = a.getAvgvalue();
			float no2 = b.getAvgvalue();

			if(no1 < no2){
				return 1;

			}else if(no1 == no2){
				return 0;
			}else{
				return -1;
			}
		}
	}
}
