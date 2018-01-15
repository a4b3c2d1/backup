/**
 *
 */
package com.internousdevwork.sagaone.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author internousdev
 *
 */
public class DestinationEditAction extends ActionSupport implements SessionAware {

	/**
	 * sessionからidを取得して、DB接続、宛先情報を検索してから情報を表示。
	 * jsp上で打ち込んだデータをupdate処理する。
	 */

	private String destinationId;

	public Map<String, Object> session;

	public String execute() {

		String result = ERROR;
		if (destinationId != null) {
			result = SUCCESS;
		}
		return result;

	}


	public String getDestinationId() {
		return destinationId;
	}
	public void setDestinationId(String destinationId) {
		this.destinationId = destinationId;
	}
	public Map<String, Object> getSession() {
		return session;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
