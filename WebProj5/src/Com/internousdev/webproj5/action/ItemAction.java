package Com.internousdev.webproj5.action;

import com.opensymphony.xwork2.ActionSupport;

public class ItemAction extends ActionSupport {

	private int index;

	public String execute() {
		System.out.println(index);
		return SUCCESS;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

}
