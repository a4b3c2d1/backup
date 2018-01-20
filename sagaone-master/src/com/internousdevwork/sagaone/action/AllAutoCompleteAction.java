package com.internousdevwork.sagaone.action;

import java.util.ArrayList;
import java.util.List;

public class AllAutoCompleteAction {

	private List<String> array = new ArrayList<String>();

	public List<String> allAutoComplete(List<String> list){

		 for(int i=0; i<list.size(); i++) {
			 array.add(list.get(i) + ",");
			 for(int j=0; j<list.size(); j++) {
				 if(i != j) {
					 array.add(list.get(i) + "　" + list.get(j) + ",");
				 }
				 for(int k=0; k<list.size(); k++) {
					 if(i != j && i != k && j != k) {
						 array.add(list.get(i) + "　" + list.get(j) + "　" + list.get(k) + ",");
					 }
				 }
			 }
		 }

		 return array;
	 }
}
