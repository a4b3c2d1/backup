package com.internousdevwork.sagaone.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdevwork.sagaone.dto.CartDTO;

public class CartDTOTest {

	@Test
	public void testGetProductId() {
		int test = 123;
		CartDTO cart = new CartDTO();
		cart.setProductId(test);
		assertEquals(test, cart.getProductId());
	}

	@Test
	public void testGetProductId2() {
		int test = 2147483647;
		CartDTO cart = new CartDTO();
		cart.setProductId(test);
		assertEquals(test, cart.getProductId());
	}

	@Test
	public void testGetProductId3() {
		int test = -2147483647;
		CartDTO cart = new CartDTO();
		cart.setProductId(test);
		assertEquals(test, cart.getProductId());
	}

	@Test
	public void testGetProductId4() {
		int test = 0;
		CartDTO cart = new CartDTO();
		cart.setProductId(test);
		assertEquals(test, cart.getProductId());
	}

	@Test
	public void testGetProductId5() {
		CartDTO cart = new CartDTO();
		try{
			int test = Integer.parseInt("2147483647");
			cart.setProductId(test);
		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input String: \"2147483647\"");
		}
	}

	@Test
	public void testGetProductId6() {
		CartDTO cart = new CartDTO();
		try{
			int test = Integer.parseInt("-2147483647");
			cart.setProductId(test);
		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input String: \"-2147483647\"");
		}
	}

	private void assertThat(String message, String string){
		assertEquals(message,string);
	}

	@Test
	public void testSetProductId() {
		CartDTO cart = new CartDTO();
		int test = 123;
		cart.setProductId(test);
		int result = cart.getProductId();
		assertEquals(test, result);
	}

	@Test
	public void testSetProductId2() {
		CartDTO cart = new CartDTO();
		int test = 2147483647;
		cart.setProductId(test);
		int result = cart.getProductId();
		assertEquals(test, result);
	}

	@Test
	public void testSetProductId3() {
		CartDTO cart = new CartDTO();
		int test = -2147483647;
		cart.setProductId(test);
		int result = cart.getProductId();
		assertEquals(test, result);
	}

	@Test
	public void testSetProductId4() {
		CartDTO cart = new CartDTO();
		try{
			int test = Integer.parseInt("2147483647");
			cart.setProductId(test);
		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input String: \"2147483647\"");
		}
	}

	@Test
	public void testSetProductId5() {
		CartDTO cart = new CartDTO();
		try{
			int test = Integer.parseInt("-2147483647");
			cart.setProductId(test);
		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input String: \"-2147483647\"");
		}
	}

	@Test
	public void testGetProductName() {
		CartDTO cart = new CartDTO();
		String test = "abc123";
		cart.setProductName(test);
		assertEquals(test, cart.getProductName());
	}

	@Test
	public void testGetProductName2() {
		CartDTO cart = new CartDTO();
		String test = "あいう１２３";
		cart.setProductName(test);
		assertEquals(test, cart.getProductName());
	}

	@Test
	public void testGetProductName3() {
		CartDTO cart = new CartDTO();
		String test = "abc123あいう１２３漢字";
		cart.setProductName(test);
		assertEquals(test, cart.getProductName());
	}

	@Test
	public void testGetProductName4() {
		CartDTO cart = new CartDTO();
		String test = null;
		cart.setProductName(test);
		assertEquals(test, cart.getProductName());
	}

	@Test
	public void testGetProductName5() {
		CartDTO cart = new CartDTO();
		String test = "";
		cart.setProductName(test);
		assertEquals(test, cart.getProductName());
	}

	@Test
	public void testGetProductName6() {
		CartDTO cart = new CartDTO();
		String test = " ";
		cart.setProductName(test);
		assertEquals(test, cart.getProductName());
	}

	@Test
	public void testGetProductName7() {
		CartDTO cart = new CartDTO();
		String test = "  ";
		cart.setProductName(test);
		assertEquals(test, cart.getProductName());
	}

	@Test
	public void testSetProductName() {
		CartDTO cart = new CartDTO();
		String test = "abc123";
		cart.setProductName(test);
		String result = cart.getProductName();
		assertEquals(test, result);
	}

	@Test
	public void testSetProductName2() {
		CartDTO cart = new CartDTO();
		String test = "あいう１２３";
		cart.setProductName(test);
		String result = cart.getProductName();
		assertEquals(test, result);
	}

	@Test
	public void testSetProductName3() {
		CartDTO cart = new CartDTO();
		String test = "abc123あいう１２３漢字";
		cart.setProductName(test);
		String result = cart.getProductName();
		assertEquals(test, result);
	}

	@Test
	public void testSetProductName4() {
		CartDTO cart = new CartDTO();
		String test = null;
		cart.setProductName(test);
		String result = cart.getProductName();
		assertEquals(test, result);
	}

	@Test
	public void testSetProductName5() {
		CartDTO cart = new CartDTO();
		String test = "";
		cart.setProductName(test);
		String result = cart.getProductName();
		assertEquals(test, result);
	}

	@Test
	public void testSetProductName6() {
		CartDTO cart = new CartDTO();
		String test = " ";
		cart.setProductName(test);
		String result = cart.getProductName();
		assertEquals(test, result);
	}

	@Test
	public void testSetProductName7() {
		CartDTO cart = new CartDTO();
		String test = "  ";
		cart.setProductName(test);
		String result = cart.getProductName();
		assertEquals(test, result);
	}

	@Test
	public void testGetProductNameKana() {
		CartDTO cart = new CartDTO();
		String test = "abc123";
		cart.setProductNameKana(test);
		assertEquals(test, cart.getProductNameKana());
	}

	@Test
	public void testGetProductNameKana2() {
		CartDTO cart = new CartDTO();
		String test = "あいう１２３";
		cart.setProductNameKana(test);
		assertEquals(test, cart.getProductNameKana());
	}

	@Test
	public void testGetProductNameKana3() {
		CartDTO cart = new CartDTO();
		String test = "abc123あいう１２３漢字";
		cart.setProductNameKana(test);
		assertEquals(test, cart.getProductNameKana());
	}

	@Test
	public void testGetProductNameKana4() {
		CartDTO cart = new CartDTO();
		String test = null;
		cart.setProductNameKana(test);
		assertEquals(test, cart.getProductNameKana());
	}

	@Test
	public void testGetProductNameKana5() {
		CartDTO cart = new CartDTO();
		String test = "";
		cart.setProductNameKana(test);
		assertEquals(test, cart.getProductNameKana());
	}

	@Test
	public void testGetProductNameKana6() {
		CartDTO cart = new CartDTO();
		String test = " ";
		cart.setProductNameKana(test);
		assertEquals(test, cart.getProductNameKana());
	}

	@Test
	public void testGetProductNameKana7() {
		CartDTO cart = new CartDTO();
		String test = "  ";
		cart.setProductNameKana(test);
		assertEquals(test, cart.getProductNameKana());
	}

	@Test
	public void testSetProductNameKana() {
		CartDTO cart = new CartDTO();
		String test = "abc123";
		cart.setProductNameKana(test);
		String result = cart.getProductNameKana();
		assertEquals(test, result);
	}

	@Test
	public void testSetProductNameKana2() {
		CartDTO cart = new CartDTO();
		String test = "あいう１２３";
		cart.setProductNameKana(test);
		String result = cart.getProductNameKana();
		assertEquals(test, result);
	}

	@Test
	public void testSetProductNameKana3() {
		CartDTO cart = new CartDTO();
		String test = "abc123あいう１２３漢字";
		cart.setProductNameKana(test);
		String result = cart.getProductNameKana();
		assertEquals(test, result);
	}

	@Test
	public void testSetProductNameKana4() {
		CartDTO cart = new CartDTO();
		String test = null;
		cart.setProductNameKana(test);
		String result = cart.getProductNameKana();
		assertEquals(test, result);
	}

	@Test
	public void testSetProductNameKana5() {
		CartDTO cart = new CartDTO();
		String test = "";
		cart.setProductNameKana(test);
		String result = cart.getProductNameKana();
		assertEquals(test, result);
	}

	@Test
	public void testSetProductNameKana6() {
		CartDTO cart = new CartDTO();
		String test = " ";
		cart.setProductNameKana(test);
		String result = cart.getProductNameKana();
		assertEquals(test, result);
	}

	@Test
	public void testSetProductNameKana7() {
		CartDTO cart = new CartDTO();
		String test = "  ";
		cart.setProductNameKana(test);
		String result = cart.getProductNameKana();
		assertEquals(test, result);
	}

	@Test
	public void testGetImageFilePath() {
		CartDTO cart = new CartDTO();
		String test = "abc123";
		cart.setImageFilePath(test);
		assertEquals(test, cart.getImageFilePath());
	}

	@Test
	public void testGetImageFilePath2() {
		CartDTO cart = new CartDTO();
		String test = "あいう１２３";
		cart.setImageFilePath(test);
		assertEquals(test, cart.getImageFilePath());
	}

	@Test
	public void testGetImageFilePath3() {
		CartDTO cart = new CartDTO();
		String test = "abc123あいう１２３漢字";
		cart.setImageFilePath(test);
		assertEquals(test, cart.getImageFilePath());
	}

	@Test
	public void testGetImageFilePath4() {
		CartDTO cart = new CartDTO();
		String test = null;
		cart.setImageFilePath(test);
		assertEquals(test, cart.getImageFilePath());
	}

	@Test
	public void testGetImageFilePath5() {
		CartDTO cart = new CartDTO();
		String test = "";
		cart.setImageFilePath(test);
		assertEquals(test, cart.getImageFilePath());
	}

	@Test
	public void testGetImageFilePath6() {
		CartDTO cart = new CartDTO();
		String test = " ";
		cart.setImageFilePath(test);
		assertEquals(test, cart.getImageFilePath());
	}

	@Test
	public void testGetImageFilePath7() {
		CartDTO cart = new CartDTO();
		String test = "  ";
		cart.setImageFilePath(test);
		assertEquals(test, cart.getImageFilePath());
	}

	@Test
	public void testSetImageFilePath() {
		CartDTO cart = new CartDTO();
		String test = "abc123";
		cart.setImageFilePath(test);
		String result = cart.getImageFilePath();
		assertEquals(test, result);
	}

	@Test
	public void testSetImageFilePath2() {
		CartDTO cart = new CartDTO();
		String test = "あいう１２３";
		cart.setImageFilePath(test);
		String result = cart.getImageFilePath();
		assertEquals(test, result);
	}

	@Test
	public void testSetImageFilePath3() {
		CartDTO cart = new CartDTO();
		String test = "abc123あいう１２３漢字";
		cart.setImageFilePath(test);
		String result = cart.getImageFilePath();
		assertEquals(test, result);
	}

	@Test
	public void testSetImageFilePath4() {
		CartDTO cart = new CartDTO();
		String test = null;
		cart.setImageFilePath(test);
		String result = cart.getImageFilePath();
		assertEquals(test, result);
	}

	@Test
	public void testSetImageFilePath5() {
		CartDTO cart = new CartDTO();
		String test = "";
		cart.setImageFilePath(test);
		String result = cart.getImageFilePath();
		assertEquals(test, result);
	}

	@Test
	public void testSetImageFilePath6() {
		CartDTO cart = new CartDTO();
		String test = " ";
		cart.setImageFilePath(test);
		String result = cart.getImageFilePath();
		assertEquals(test, result);
	}

	@Test
	public void testSetImageFilePath7() {
		CartDTO cart = new CartDTO();
		String test = "  ";
		cart.setImageFilePath(test);
		String result = cart.getImageFilePath();
		assertEquals(test, result);
	}

	@Test
	public void testGetPrice() {
		int test = 123;
		CartDTO cart = new CartDTO();
		cart.setPrice(test);
		assertEquals(test, cart.getPrice());
	}

	@Test
	public void testGetPrice2() {
		int test = 2147483647;
		CartDTO cart = new CartDTO();
		cart.setPrice(test);
		assertEquals(test, cart.getPrice());
	}

	@Test
	public void testGetPrice3() {
		int test = -2147483647;
		CartDTO cart = new CartDTO();
		cart.setPrice(test);
		assertEquals(test, cart.getPrice());
	}

	@Test
	public void testGetPrice4() {
		int test = 0;
		CartDTO cart = new CartDTO();
		cart.setPrice(test);
		assertEquals(test, cart.getPrice());
	}

	@Test
	public void testGetPrice5() {
		CartDTO cart = new CartDTO();
		try{
			int test = Integer.parseInt("2147483647");
			cart.setPrice(test);
		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input String: \"2147483647\"");
		}
	}

	@Test
	public void testGetPrice6() {
		CartDTO cart = new CartDTO();
		try{
			int test = Integer.parseInt("-2147483647");
			cart.setPrice(test);
		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input String: \"-2147483647\"");
		}
	}

	@Test
	public void testSetPrice() {
		CartDTO cart = new CartDTO();
		int test = 123;
		cart.setPrice(test);
		int result = cart.getPrice();
		assertEquals(test, result);
	}

	@Test
	public void testSetPrice2() {
		CartDTO cart = new CartDTO();
		int test = 2147483647;
		cart.setPrice(test);
		int result = cart.getPrice();
		assertEquals(test, result);
	}

	@Test
	public void testSetPrice3() {
		CartDTO cart = new CartDTO();
		int test = -2147483647;
		cart.setPrice(test);
		int result = cart.getPrice();
		assertEquals(test, result);
	}

	@Test
	public void testSetPrice4() {
		CartDTO cart = new CartDTO();
		int test = 0;
		cart.setPrice(test);
		int result = cart.getPrice();
		assertEquals(test, result);
	}

	@Test
	public void testSetPrice5() {
		CartDTO cart = new CartDTO();
		try{
			int test = Integer.parseInt("2147483647");
			cart.setPrice(test);
		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input String: \"2147483647\"");
		}
	}

	@Test
	public void testSetPrice6() {
		CartDTO cart = new CartDTO();
		try{
			int test = Integer.parseInt("-2147483647");
			cart.setPrice(test);
		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input String: \"-2147483647\"");
		}
	}

	@Test
	public void testGetReleaseCompany() {
		CartDTO cart = new CartDTO();
		String test = "abc123";
		cart.setReleaseCompany(test);
		assertEquals(test, cart.getReleaseCompany());
	}

	@Test
	public void testGetReleaseCompany2() {
		CartDTO cart = new CartDTO();
		String test = "あいう１２３";
		cart.setReleaseCompany(test);
		assertEquals(test, cart.getReleaseCompany());
	}

	@Test
	public void testGetReleaseCompany3() {
		CartDTO cart = new CartDTO();
		String test = "abc123あいう１２３漢字";
		cart.setReleaseCompany(test);
		assertEquals(test, cart.getReleaseCompany());
	}

	@Test
	public void testGetReleaseCompany4() {
		CartDTO cart = new CartDTO();
		String test = null;
		cart.setReleaseCompany(test);
		assertEquals(test, cart.getReleaseCompany());
	}

	@Test
	public void testGetReleaseCompany5() {
		CartDTO cart = new CartDTO();
		String test = "";
		cart.setReleaseCompany(test);
		assertEquals(test, cart.getReleaseCompany());
	}

	@Test
	public void testGetReleaseCompany6() {
		CartDTO cart = new CartDTO();
		String test = " ";
		cart.setReleaseCompany(test);
		assertEquals(test, cart.getReleaseCompany());
	}

	@Test
	public void testGetReleaseCompany7() {
		CartDTO cart = new CartDTO();
		String test = "  ";
		cart.setReleaseCompany(test);
		assertEquals(test, cart.getReleaseCompany());
	}

	@Test
	public void testSetReleaseCompany() {
		CartDTO cart = new CartDTO();
		String test = "abc123";
		cart.setReleaseCompany(test);
		String result = cart.getReleaseCompany();
		assertEquals(test, result);
	}

	@Test
	public void testSetReleaseCompany2() {
		CartDTO cart = new CartDTO();
		String test = "あいう１２３";
		cart.setReleaseCompany(test);
		String result = cart.getReleaseCompany();
		assertEquals(test, result);
	}

	@Test
	public void testSetReleaseCompany3() {
		CartDTO cart = new CartDTO();
		String test = "abc123あいう１２３漢字";
		cart.setReleaseCompany(test);
		String result = cart.getReleaseCompany();
		assertEquals(test, result);
	}

	@Test
	public void testSetReleaseCompany4() {
		CartDTO cart = new CartDTO();
		String test = null;
		cart.setReleaseCompany(test);
		String result = cart.getReleaseCompany();
		assertEquals(test, result);
	}

	@Test
	public void testSetReleaseCompany5() {
		CartDTO cart = new CartDTO();
		String test = "";
		cart.setReleaseCompany(test);
		String result = cart.getReleaseCompany();
		assertEquals(test, result);
	}

	@Test
	public void testSetReleaseCompany6() {
		CartDTO cart = new CartDTO();
		String test = " ";
		cart.setReleaseCompany(test);
		String result = cart.getReleaseCompany();
		assertEquals(test, result);
	}

	@Test
	public void testSetReleaseCompany7() {
		CartDTO cart = new CartDTO();
		String test = "  ";
		cart.setReleaseCompany(test);
		String result = cart.getReleaseCompany();
		assertEquals(test, result);
	}

	@Test
	public void testGetReleaseDate() {
		CartDTO cart = new CartDTO();
		String test = "abc123";
		cart.setReleaseDate(test);
		assertEquals(test, cart.getReleaseDate());
	}


	@Test
	public void testGetReleaseDate2() {
		CartDTO cart = new CartDTO();
		String test = "あいう１２３";
		cart.setReleaseDate(test);
		assertEquals(test, cart.getReleaseDate());
	}


	@Test
	public void testGetReleaseDate3() {
		CartDTO cart = new CartDTO();
		String test = "abc123あいう１２３漢字";
		cart.setReleaseDate(test);
		assertEquals(test, cart.getReleaseDate());
	}


	@Test
	public void testGetReleaseDate4() {
		CartDTO cart = new CartDTO();
		String test = null;
		cart.setReleaseDate(test);
		assertEquals(test, cart.getReleaseDate());
	}


	@Test
	public void testGetReleaseDate5() {
		CartDTO cart = new CartDTO();
		String test = "";
		cart.setReleaseDate(test);
		assertEquals(test, cart.getReleaseDate());
	}


	@Test
	public void testGetReleaseDate6() {
		CartDTO cart = new CartDTO();
		String test = " ";
		cart.setReleaseDate(test);
		assertEquals(test, cart.getReleaseDate());
	}


	@Test
	public void testGetReleaseDate7() {
		CartDTO cart = new CartDTO();
		String test = "  ";
		cart.setReleaseDate(test);
		assertEquals(test, cart.getReleaseDate());
	}

	@Test
	public void testSetReleaseDate() {
		CartDTO cart = new CartDTO();
		String test = "abc123";
		cart.setReleaseDate(test);
		String result = cart.getReleaseDate();
		assertEquals(test, result);
	}

	@Test
	public void testSetReleaseDate2() {
		CartDTO cart = new CartDTO();
		String test = "あいう１２３";
		cart.setReleaseDate(test);
		String result = cart.getReleaseDate();
		assertEquals(test, result);
	}

	@Test
	public void testSetReleaseDate3() {
		CartDTO cart = new CartDTO();
		String test = "abc123あいう１２３漢字";
		cart.setReleaseDate(test);
		String result = cart.getReleaseDate();
		assertEquals(test, result);
	}

	@Test
	public void testSetReleaseDate4() {
		CartDTO cart = new CartDTO();
		String test = null;
		cart.setReleaseDate(test);
		String result = cart.getReleaseDate();
		assertEquals(test, result);
	}

	@Test
	public void testSetReleaseDate5() {
		CartDTO cart = new CartDTO();
		String test = "";
		cart.setReleaseDate(test);
		String result = cart.getReleaseDate();
		assertEquals(test, result);
	}

	@Test
	public void testSetReleaseDate6() {
		CartDTO cart = new CartDTO();
		String test = " ";
		cart.setReleaseDate(test);
		String result = cart.getReleaseDate();
		assertEquals(test, result);
	}

	@Test
	public void testSetReleaseDate7() {
		CartDTO cart = new CartDTO();
		String test = "  ";
		cart.setReleaseDate(test);
		String result = cart.getReleaseDate();
		assertEquals(test, result);
	}

	@Test
	public void testGetRegistDate() {
		CartDTO cart = new CartDTO();
		String test = "abc123";
		cart.setRegistDate(test);
		assertEquals(test, cart.getRegistDate());
	}

	@Test
	public void testGetRegistDate2() {
		CartDTO cart = new CartDTO();
		String test = "あいう１２３";
		cart.setRegistDate(test);
		assertEquals(test, cart.getRegistDate());
	}

	@Test
	public void testGetRegistDate3() {
		CartDTO cart = new CartDTO();
		String test = "abc123あいう１２３漢字";
		cart.setRegistDate(test);
		assertEquals(test, cart.getRegistDate());
	}

	@Test
	public void testGetRegistDate4() {
		CartDTO cart = new CartDTO();
		String test = null;
		cart.setRegistDate(test);
		assertEquals(test, cart.getRegistDate());
	}

	@Test
	public void testGetRegistDate5() {
		CartDTO cart = new CartDTO();
		String test = "";
		cart.setRegistDate(test);
		assertEquals(test, cart.getRegistDate());
	}

	@Test
	public void testGetRegistDate6() {
		CartDTO cart = new CartDTO();
		String test = " ";
		cart.setRegistDate(test);
		assertEquals(test, cart.getRegistDate());
	}

	@Test
	public void testGetRegistDate7() {
		CartDTO cart = new CartDTO();
		String test = "  ";
		cart.setRegistDate(test);
		assertEquals(test, cart.getRegistDate());
	}

	@Test
	public void testSetRegistDate() {
		CartDTO cart = new CartDTO();
		String test = "abc123";
		cart.setRegistDate(test);
		String result = cart.getRegistDate();
		assertEquals(test, result);
	}

	@Test
	public void testSetRegistDate2() {
		CartDTO cart = new CartDTO();
		String test = "あいう１２３";
		cart.setRegistDate(test);
		String result = cart.getRegistDate();
		assertEquals(test, result);
	}

	@Test
	public void testSetRegistDate3() {
		CartDTO cart = new CartDTO();
		String test = "abc123あいう１２３漢字";
		cart.setRegistDate(test);
		String result = cart.getRegistDate();
		assertEquals(test, result);
	}

	@Test
	public void testSetRegistDate4() {
		CartDTO cart = new CartDTO();
		String test = null;
		cart.setRegistDate(test);
		String result = cart.getRegistDate();
		assertEquals(test, result);
	}

	@Test
	public void testSetRegistDate5() {
		CartDTO cart = new CartDTO();
		String test = "";
		cart.setRegistDate(test);
		String result = cart.getRegistDate();
		assertEquals(test, result);
	}

	@Test
	public void testSetRegistDate6() {
		CartDTO cart = new CartDTO();
		String test = " ";
		cart.setRegistDate(test);
		String result = cart.getRegistDate();
		assertEquals(test, result);
	}

	@Test
	public void testSetRegistDate7() {
		CartDTO cart = new CartDTO();
		String test = "  ";
		cart.setRegistDate(test);
		String result = cart.getRegistDate();
		assertEquals(test, result);
	}

	@Test
	public void testGetId() {
		CartDTO cart = new CartDTO();
		String test = "abc123";
		cart.setId(test);
		assertEquals(test, cart.getId());
	}

	@Test
	public void testGetId2() {
		CartDTO cart = new CartDTO();
		String test = "あいう１２３";
		cart.setId(test);
		assertEquals(test, cart.getId());
	}

	@Test
	public void testGetId3() {
		CartDTO cart = new CartDTO();
		String test = "abc123あいう１２３漢字";
		cart.setId(test);
		assertEquals(test, cart.getId());
	}

	@Test
	public void testGetId4() {
		CartDTO cart = new CartDTO();
		String test = null;
		cart.setId(test);
		assertEquals(test, cart.getId());
	}

	@Test
	public void testGetId5() {
		CartDTO cart = new CartDTO();
		String test = "";
		cart.setId(test);
		assertEquals(test, cart.getId());
	}

	@Test
	public void testGetId6() {
		CartDTO cart = new CartDTO();
		String test = " ";
		cart.setId(test);
		assertEquals(test, cart.getId());
	}

	@Test
	public void testGetId7() {
		CartDTO cart = new CartDTO();
		String test = "  ";
		cart.setId(test);
		assertEquals(test, cart.getId());
	}

	@Test
	public void testSetId() {
		CartDTO cart = new CartDTO();
		String test = "abc123";
		cart.setId(test);
		String result = cart.getId();
		assertEquals(test, result);
	}

	@Test
	public void testSetId2() {
		CartDTO cart = new CartDTO();
		String test = "あいう１２３";
		cart.setId(test);
		String result = cart.getId();
		assertEquals(test, result);
	}

	@Test
	public void testSetId3() {
		CartDTO cart = new CartDTO();
		String test = "abc123あいう１２３漢字";
		cart.setId(test);
		String result = cart.getId();
		assertEquals(test, result);
	}

	@Test
	public void testSetId4() {
		CartDTO cart = new CartDTO();
		String test = null;
		cart.setId(test);
		String result = cart.getId();
		assertEquals(test, result);
	}

	@Test
	public void testSetId5() {
		CartDTO cart = new CartDTO();
		String test = "";
		cart.setId(test);
		String result = cart.getId();
		assertEquals(test, result);
	}

	@Test
	public void testSetId6() {
		CartDTO cart = new CartDTO();
		String test = " ";
		cart.setId(test);
		String result = cart.getId();
		assertEquals(test, result);
	}

	@Test
	public void testSetId7() {
		CartDTO cart = new CartDTO();
		String test = "  ";
		cart.setId(test);
		String result = cart.getId();
		assertEquals(test, result);
	}

	@Test
	public void testGetCount() {
		CartDTO cart = new CartDTO();
		String test = "abc123";
		cart.setCount(test);
		assertEquals(test, cart.getCount());
	}

	@Test
	public void testGetCount2() {
		CartDTO cart = new CartDTO();
		String test = "あいう１２３";
		cart.setCount(test);
		assertEquals(test, cart.getCount());
	}

	@Test
	public void testGetCount3() {
		CartDTO cart = new CartDTO();
		String test = "abc123あいう１２３漢字";
		cart.setCount(test);
		assertEquals(test, cart.getCount());
	}

	@Test
	public void testGetCount4() {
		CartDTO cart = new CartDTO();
		String test = null;
		cart.setCount(test);
		assertEquals(test, cart.getCount());
	}

	@Test
	public void testGetCount5() {
		CartDTO cart = new CartDTO();
		String test = "";
		cart.setCount(test);
		assertEquals(test, cart.getCount());
	}

	@Test
	public void testGetCount6() {
		CartDTO cart = new CartDTO();
		String test = " ";
		cart.setCount(test);
		assertEquals(test, cart.getCount());
	}

	@Test
	public void testGetCount7() {
		CartDTO cart = new CartDTO();
		String test = "  ";
		cart.setCount(test);
		assertEquals(test, cart.getCount());
	}

	@Test
	public void testSetCount() {
		CartDTO cart = new CartDTO();
		String test = "abc123";
		cart.setCount(test);
		String result = cart.getCount();
		assertEquals(test, result);
	}

	@Test
	public void testSetCount2() {
		CartDTO cart = new CartDTO();
		String test = "あいう１２３";
		cart.setCount(test);
		String result = cart.getCount();
		assertEquals(test, result);
	}

	@Test
	public void testSetCount3() {
		CartDTO cart = new CartDTO();
		String test = "abc123あいう１２３漢字";
		cart.setCount(test);
		String result = cart.getCount();
		assertEquals(test, result);
	}

	@Test
	public void testSetCount4() {
		CartDTO cart = new CartDTO();
		String test = null;
		cart.setCount(test);
		String result = cart.getCount();
		assertEquals(test, result);
	}

	@Test
	public void testSetCount5() {
		CartDTO cart = new CartDTO();
		String test = "";
		cart.setCount(test);
		String result = cart.getCount();
		assertEquals(test, result);
	}

	@Test
	public void testSetCount6() {
		CartDTO cart = new CartDTO();
		String test = " ";
		cart.setCount(test);
		String result = cart.getCount();
		assertEquals(test, result);
	}

	@Test
	public void testSetCount7() {
		CartDTO cart = new CartDTO();
		String test = "  ";
		cart.setCount(test);
		String result = cart.getCount();
		assertEquals(test, result);
	}

	@Test
	public void testGetTotalCount() {
		int test = 123;
		CartDTO cart = new CartDTO();
		cart.setTotalCount(test);
		assertEquals(test, cart.getTotalCount());
	}

	@Test
	public void testGetTotalCount2() {
		int test = 2147483647;
		CartDTO cart = new CartDTO();
		cart.setTotalCount(test);
		assertEquals(test, cart.getTotalCount());
	}

	@Test
	public void testGetTotalCount3() {
		int test = -2147483647;
		CartDTO cart = new CartDTO();
		cart.setTotalCount(test);
		assertEquals(test, cart.getTotalCount());
	}

	@Test
	public void testGetTotalCount4() {
		int test = 0;
		CartDTO cart = new CartDTO();
		cart.setTotalCount(test);
		assertEquals(test, cart.getTotalCount());
	}

	@Test
	public void testGetTotalCount5() {
		CartDTO cart = new CartDTO();
		try{
			int test = Integer.parseInt("2147483647");
			cart.setTotalCount(test);
		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input String: \"2147483647\"");
		}
	}

	@Test
	public void testGetTotalCount6() {
		CartDTO cart = new CartDTO();
		try{
			int test = Integer.parseInt("-2147483647");
			cart.setTotalCount(test);
		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input String: \"-2147483647\"");
		}
	}

	@Test
	public void testSetTotalCount() {
		CartDTO cart = new CartDTO();
		int test = 123;
		cart.setTotalCount(test);
		int result = cart.getTotalCount();
		assertEquals(test, result);
	}

	@Test
	public void testSetTotalCount2() {
		CartDTO cart = new CartDTO();
		int test = 2147483647;
		cart.setTotalCount(test);
		int result = cart.getTotalCount();
		assertEquals(test, result);
	}

	@Test
	public void testSetTotalCount3() {
		CartDTO cart = new CartDTO();
		int test = -2147438647;
		cart.setTotalCount(test);
		int result = cart.getTotalCount();
		assertEquals(test, result);
	}

	@Test
	public void testSetTotalCount4() {
		CartDTO cart = new CartDTO();
		int test = 0;
		cart.setTotalCount(test);
		int result = cart.getTotalCount();
		assertEquals(test, result);
	}

	public void testSetTotalCount5() {
		CartDTO cart = new CartDTO();
		try{
			int test = Integer.parseInt("2147483647");
			cart.setTotalCount(test);
		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input String: \"2147483647\"");
		}
	}

	public void testSetTotalCount6() {
		CartDTO cart = new CartDTO();
		try{
			int test = Integer.parseInt("-2147483647");
			cart.setTotalCount(test);
		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input String: \"-2147483647\"");
		}
	}

}
