package com.internousdevwork.sagaone.action;

/*詳細
 *
 * 前提:ここでの処理において、未ログインユーザー(temp_user_id)の処理は(loginFlg = "")で、
 * 	　　ログインユーザー(user_id)の処理は(loginFlg = "1")で行うこと。
 *
 *・execute():cart.jsp用の実行処理。カートに入れたデータの取得。
 *
 *・addCart():「カートに追加」の実行処理。product_idからproduct_infoを検索しアイテムの詳細を取得。
 *			　取得した情報とユーザーID、個数をcart_infoに保存。
 *
 *・delete():「選択した商品を削除」の実行処理。
 *
 */

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdevwork.sagaone.dao.AddCartDAO;
import com.internousdevwork.sagaone.dao.AddTempCartDAO;
import com.internousdevwork.sagaone.dao.CartDAO;
import com.internousdevwork.sagaone.dao.TempCartDAO;
import com.internousdevwork.sagaone.dto.CartDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author internousdev
 *
 */
public class CartAction extends ActionSupport implements SessionAware{
	private Map<String, Object> session;
	private ArrayList<CartDTO> cartList = new ArrayList<CartDTO>();
	private ArrayList<CartDTO> addCartList = new ArrayList<CartDTO>();
	private CartDAO cartDAO = new CartDAO();
	private TempCartDAO tempCartDAO = new TempCartDAO();
	private CartDTO cartDTO = new CartDTO();
	private String count;
	private String deleteFlg;
	private String addFlg;
	private String cartFlg;
	private String message;
	private String str_product_id;
	private Collection<String> checkboxList;
	private int allPrice = 0;
	private String cartJugde;

	public String result;


	public String execute() throws SQLException{

		boolean loginFlg = Boolean.parseBoolean(session.get("loginFlg").toString());

		if(cartFlg != null){
			if(loginFlg){
				String user_id = session.get("loginUserId").toString();
				cartJugde = "1";

				cartList = cartDAO.getCartInfo(user_id);
				for(int i = 0; i < cartList.size(); i++){
					allPrice += cartList.get(i).getTotalCount();
				}

				Iterator<CartDTO> itertor = cartList.iterator();
				if(!(itertor.hasNext())){
					cartList = null;
				}
			}else{
				String temp_user_id = session.get("temp_user_id").toString();

				cartList = tempCartDAO.getTempCartInfo(temp_user_id);

				Iterator<CartDTO> itertor = cartList.iterator();

				if(!(itertor.hasNext())){
					cartList = null;
				}
			}
			result = SUCCESS;
		}

		if(deleteFlg != null){
			delete();
			if(loginFlg){
				String user_id = session.get("loginUserId").toString();

				cartList = cartDAO.getCartInfo(user_id);

				Iterator<CartDTO> itertor = cartList.iterator();
				if(!(itertor.hasNext())){
					cartList = null;
				}
			}else{
				String temp_user_id = session.get("temp_user_id").toString();

				cartList = tempCartDAO.getTempCartInfo(temp_user_id);

				Iterator<CartDTO> itertor = cartList.iterator();

				if(!(itertor.hasNext())){
					cartList = null;
				}
			}
			result = SUCCESS;
		}
		if(addFlg != null){
			addCart();
			result = "update";
		}
		return result;
	}

	public void addCart() throws SQLException{

		AddTempCartDAO addTempCartDAO = new AddTempCartDAO();
		AddCartDAO addCartDAO = new AddCartDAO();
		int product_id = Integer.parseInt(str_product_id);
		boolean loginFlg = Boolean.parseBoolean(session.get("loginFlg").toString());

		if(loginFlg){
			cartDTO = addCartDAO.getCartInfo(product_id);

			addCartDAO.addCartInfo(
					cartDTO.getId(),
					session.get("loginUserId").toString(),
					product_id,
					count,
					cartDTO.getPrice()
					);
		}else{
			cartDTO = addTempCartDAO.getTempCartInfo(product_id);
			String temp_user_id = session.get("temp_user_id").toString();

			addTempCartDAO.addTempCartInfo(
					cartDTO.getId(),
					temp_user_id,
					product_id,
					count,
					cartDTO.getPrice()
					);
		}
	}

	public void delete() throws SQLException{

		boolean loginFlg = Boolean.parseBoolean(session.get("loginFlg").toString());

		if(loginFlg){
			String user_id = session.get("loginUserId").toString();
			cartList = cartDAO.getCartInfo(user_id);

			for(int i = 0; i < cartList.size(); i++){
				for(String check : checkboxList){
					long id = Long.parseLong(check);
					cartDAO.cartItemDelete(user_id, (int)id);
				}
			}
		}else{
			String user_id = session.get("temp_user_id").toString();
			cartList = tempCartDAO.getTempCartInfo(user_id);

			for(int i = 0; i < cartList.size(); i++){
				for(String check : checkboxList){
					int id = Integer.parseInt(check);
					tempCartDAO.cartItemDelete(user_id, id);
				}
			}
		}
	}

	public Map<String, Object> getSession(){
		return session;
	}

	public void setSession(Map<String, Object> session){
		this.session = session;
	}

	public String getDeleteFlg(){
		return deleteFlg;
	}

	public void setDeleteFlg(String deleteFlg){
		this.deleteFlg = deleteFlg;
	}

	public String getCartFlg(){
		return cartFlg;
	}

	public void setCartFlg(String cartFlg){
		this.cartFlg = cartFlg;
	}

	public String getAddFlg(){
		return addFlg;
	}

	public void setAddFlg(String addFlg){
		this.addFlg = addFlg;
	}

	public String getMessage(){
		return message;
	}

	public void setMessage(String message){
		this.message = message;
	}

	public ArrayList<CartDTO> getCartList(){
		return cartList;
	}

	public ArrayList<CartDTO> getAddCartList(){
		return addCartList;
	}

	public String getProduct_id(){
		return str_product_id;
	}

	public void setProduct_id(String product_id){
		this.str_product_id = product_id;
	}


	public Collection<String> getCheckboxList() {
		return checkboxList;
	}

	public void setCheckboxList(Collection<String> checkboxList) {
		this.checkboxList = checkboxList;
	}

	public String getCount() {
		return count;
	}

	public void setCount(String count) {
		this.count = count;
	}

	public int getAllPrice() {
		return allPrice;
	}

	public void setAllPrice(int allPrice) {
		this.allPrice = allPrice;
	}

	public String getCartJugde() {
		return cartJugde;
	}

	public void setCartJugde(String cartJugde) {
		this.cartJugde = cartJugde;
	}
}