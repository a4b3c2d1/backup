package com.internousdevwork.sagaone.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdevwork.sagaone.dto.PaymentProductInfoDTO;

public class PaymentProductInfoDTOTest {

	@Test
	public void testGetProductId() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		int test = 123;
		paypro.setProductId(test);
		assertEquals(test, paypro.getProductId());
	}

	@Test
	public void testGetProductId2() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		int test = 2147483647;
		paypro.setProductId(test);
		assertEquals(test, paypro.getProductId());
	}

	@Test
	public void testGetProductId3() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		int test = -2147483647;
		paypro.setProductId(test);
		assertEquals(test, paypro.getProductId());
	}

	@Test
	public void testGetProductId4() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		int test = 0;
		paypro.setProductId(test);
		assertEquals(test, paypro.getProductId());
	}

	@Test
	public void testGetProductId5() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		try{
			int test = Integer.parseInt("2147483647");
			paypro.setProductId(test);
		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input String: \"2147483647\"");
		}
	}

	@Test
	public void testGetProductId6() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		try{
			int test = Integer.parseInt("-2147483647");
			paypro.setProductId(test);
		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input String: \"-2147483647\"");
		}
	}

	@Test
	public void testSetProductId() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		int test = 123;
		paypro.setProductId(test);
		int result = paypro.getProductId();
		assertEquals(test, result);
	}

	@Test
	public void testSetProductId2() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		int test = 2147483647;
		paypro.setProductId(test);
		int result = paypro.getProductId();
		assertEquals(test, result);
	}

	@Test
	public void testSetProductId3() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		int test = -2147483647;
		paypro.setProductId(test);
		int result = paypro.getProductId();
		assertEquals(test, result);
	}

	@Test
	public void testSetProductId4() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		int test = 0;
		paypro.setProductId(test);
		int result = paypro.getProductId();
		assertEquals(test, result);
	}

	@Test
	public void testSetProductId5() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		try{
			int test = Integer.parseInt("2147483647");
			paypro.setProductId(test);
		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input String: \"2147483647\"");
		}
	}

	@Test
	public void testSetProductId6() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		try{
			int test = Integer.parseInt("-2147483647");
			paypro.setProductId(test);
		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input String: \"-2147483647\"");
		}
	}

	@Test
	public void testGetProductName() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = "abc123";
		paypro.setProductName(test);
		assertEquals(test, paypro.getProductName());
	}

	@Test
	public void testGetProductName2() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = "あいう１２３";
		paypro.setProductName(test);
		assertEquals(test, paypro.getProductName());
	}

	@Test
	public void testGetProductName3() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = "abc123あいう１２３漢字";
		paypro.setProductName(test);
		assertEquals(test, paypro.getProductName());
	}

	@Test
	public void testGetProductName4() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = null;
		paypro.setProductName(test);
		assertEquals(test, paypro.getProductName());
	}

	@Test
	public void testGetProductName5() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = "";
		paypro.setProductName(test);
		assertEquals(test, paypro.getProductName());
	}

	@Test
	public void testGetProductName6() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = " ";
		paypro.setProductName(test);
		assertEquals(test, paypro.getProductName());
	}

	@Test
	public void testGetProductName7() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = "  ";
		paypro.setProductName(test);
		assertEquals(test, paypro.getProductName());
	}

	@Test
	public void testSetProductName() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = "abc123";
		paypro.setProductName(test);
		String result = paypro.getProductName();
		assertEquals(test, result);
	}

	@Test
	public void testSetProductName2() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = "あいう１２３";
		paypro.setProductName(test);
		String result = paypro.getProductName();
		assertEquals(test, result);
	}

	@Test
	public void testSetProductName3() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = "abc123あいう１２３漢字";
		paypro.setProductName(test);
		String result = paypro.getProductName();
		assertEquals(test, result);
	}

	@Test
	public void testSetProductName4() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = null;
		paypro.setProductName(test);
		String result = paypro.getProductName();
		assertEquals(test, result);
	}

	@Test
	public void testSetProductName5() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = "";
		paypro.setProductName(test);
		String result = paypro.getProductName();
		assertEquals(test, result);
	}

	@Test
	public void testSetProductName6() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = " ";
		paypro.setProductName(test);
		String result = paypro.getProductName();
		assertEquals(test, result);
	}

	@Test
	public void testSetProductName7() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = "  ";
		paypro.setProductName(test);
		String result = paypro.getProductName();
		assertEquals(test, result);
	}

	@Test
	public void testGetProductNameKana() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = "abc123";
		paypro.setProductNameKana(test);
		assertEquals(test, paypro.getProductNameKana());
	}

	@Test
	public void testGetProductNameKana2() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = "あいう１２３";
		paypro.setProductNameKana(test);
		assertEquals(test, paypro.getProductNameKana());
	}

	@Test
	public void testGetProductNameKana3() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = "abc123あいう１２３漢字";
		paypro.setProductNameKana(test);
		assertEquals(test, paypro.getProductNameKana());
	}

	@Test
	public void testGetProductNameKana4() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = null;
		paypro.setProductNameKana(test);
		assertEquals(test, paypro.getProductNameKana());
	}

	@Test
	public void testGetProductNameKana5() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = "";
		paypro.setProductNameKana(test);
		assertEquals(test, paypro.getProductNameKana());
	}

	@Test
	public void testGetProductNameKana6() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = " ";
		paypro.setProductNameKana(test);
		assertEquals(test, paypro.getProductNameKana());
	}

	@Test
	public void testGetProductNameKana7() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = "  ";
		paypro.setProductNameKana(test);
		assertEquals(test, paypro.getProductNameKana());
	}

	@Test
	public void testSetProductNameKana() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = "abc123";
		paypro.setProductNameKana(test);
		String result = paypro.getProductNameKana();
		assertEquals(test, result);
	}

	@Test
	public void testSetProductNameKana2() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = "あいう１２３";
		paypro.setProductNameKana(test);
		String result = paypro.getProductNameKana();
		assertEquals(test, result);
	}

	@Test
	public void testSetProductNameKana3() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = "abc123あいう１２３漢字";
		paypro.setProductNameKana(test);
		String result = paypro.getProductNameKana();
		assertEquals(test, result);
	}

	@Test
	public void testSetProductNameKana4() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = null;
		paypro.setProductNameKana(test);
		String result = paypro.getProductNameKana();
		assertEquals(test, result);
	}

	@Test
	public void testSetProductNameKana5() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = "";
		paypro.setProductNameKana(test);
		String result = paypro.getProductNameKana();
		assertEquals(test, result);
	}

	@Test
	public void testSetProductNameKana6() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = " ";
		paypro.setProductNameKana(test);
		String result = paypro.getProductNameKana();
		assertEquals(test, result);
	}

	@Test
	public void testSetProductNameKana7() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = "  ";
		paypro.setProductNameKana(test);
		String result = paypro.getProductNameKana();
		assertEquals(test, result);
	}

	@Test
	public void testGetProductDescription() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = "abc123";
		paypro.setProductDescription(test);
		assertEquals(test, paypro.getProductDescription());
	}

	@Test
	public void testGetProductDescription2() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = "あいう１２３";
		paypro.setProductDescription(test);
		assertEquals(test, paypro.getProductDescription());
	}

	@Test
	public void testGetProductDescription3() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = "abc123あいう１２３漢字";
		paypro.setProductDescription(test);
		assertEquals(test, paypro.getProductDescription());
	}

	@Test
	public void testGetProductDescription4() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = null;
		paypro.setProductDescription(test);
		assertEquals(test, paypro.getProductDescription());
	}

	@Test
	public void testGetProductDescription5() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = "";
		paypro.setProductDescription(test);
		assertEquals(test, paypro.getProductDescription());
	}

	@Test
	public void testGetProductDescription6() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = " ";
		paypro.setProductDescription(test);
		assertEquals(test, paypro.getProductDescription());
	}

	@Test
	public void testGetProductDescription7() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = "  ";
		paypro.setProductDescription(test);
		assertEquals(test, paypro.getProductDescription());
	}

	@Test
	public void testSetProductDescription() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = "abc123";
		paypro.setProductDescription(test);
		String result = paypro.getProductDescription();
		assertEquals(test, result);
	}

	@Test
	public void testSetProductDescription2() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = "あいう１２３";
		paypro.setProductDescription(test);
		String result = paypro.getProductDescription();
		assertEquals(test, result);
	}

	@Test
	public void testSetProductDescription3() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = "abc123あいう１２３漢字";
		paypro.setProductDescription(test);
		String result = paypro.getProductDescription();
		assertEquals(test, result);
	}

	@Test
	public void testSetProductDescription4() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = null;
		paypro.setProductDescription(test);
		String result = paypro.getProductDescription();
		assertEquals(test, result);
	}

	@Test
	public void testSetProductDescription5() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = "";
		paypro.setProductDescription(test);
		String result = paypro.getProductDescription();
		assertEquals(test, result);
	}

	@Test
	public void testSetProductDescription6() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = " ";
		paypro.setProductDescription(test);
		String result = paypro.getProductDescription();
		assertEquals(test, result);
	}

	@Test
	public void testSetProductDescription7() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = "  ";
		paypro.setProductDescription(test);
		String result = paypro.getProductDescription();
		assertEquals(test, result);
	}

	@Test
	public void testGetCategoryId() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		int test = 123;
		paypro.setCategoryId(test);
		assertEquals(test, paypro.getCategoryId());
	}

	@Test
	public void testGetCategoryId2() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		int test = 2147483647;
		paypro.setCategoryId(test);
		assertEquals(test, paypro.getCategoryId());
	}

	@Test
	public void testGetCategoryId3() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		int test = -2147483647;
		paypro.setCategoryId(test);
		assertEquals(test, paypro.getCategoryId());
	}

	@Test
	public void testGetCategoryId4() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		int test = 0;
		paypro.setCategoryId(test);
		assertEquals(test, paypro.getCategoryId());
	}

	@Test
	public void testGetCategoryId5() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		try{
			int test = Integer.parseInt("2147483647");
			paypro.setCategoryId(test);
		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input String: \"2147483647\"");
		}
	}

	@Test
	public void testGetCategoryId6() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		try{
			int test = Integer.parseInt("-2147483647");
			paypro.setCategoryId(test);
		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input String: \"-2147483647\"");
		}
	}

	@Test
	public void testSetCategoryId() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		int test = 123;
		paypro.setCategoryId(test);
		int result = paypro.getCategoryId();
		assertEquals(test, result);
	}

	@Test
	public void testSetCategoryId2() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		int test = 2147483647;
		paypro.setCategoryId(test);
		int result = paypro.getCategoryId();
		assertEquals(test, result);
	}

	@Test
	public void testSetCategoryId3() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		int test = -2147483647;
		paypro.setCategoryId(test);
		int result = paypro.getCategoryId();
		assertEquals(test, result);
	}

	@Test
	public void testSetCategoryId4() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		int test = 0;
		paypro.setCategoryId(test);
		int result = paypro.getCategoryId();
		assertEquals(test, result);
	}

	@Test
	public void testSetCategoryId5() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		try{
			int test = Integer.parseInt("2147483647");
			paypro.setCategoryId(test);
		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input String: \"2147483647\"");
		}
	}

	@Test
	public void testSetCategoryId6() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		try{
			int test = Integer.parseInt("-2147483647");
			paypro.setCategoryId(test);
		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input String: \"-2147483647\"");
		}
	}

	@Test
	public void testGetPrice() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		int test = 123;
		paypro.setPrice(test);
		assertEquals(test, paypro.getPrice());
	}

	@Test
	public void testGetPrice2() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		int test = 2147483647;
		paypro.setPrice(test);
		assertEquals(test, paypro.getPrice());
	}

	@Test
	public void testGetPrice3() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		int test = -2147483647;
		paypro.setPrice(test);
		assertEquals(test, paypro.getPrice());
	}

	@Test
	public void testGetPrice4() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		int test = 0;
		paypro.setPrice(test);
		assertEquals(test, paypro.getPrice());
	}

	@Test
	public void testGetPrice5() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		try{
			int test = Integer.parseInt("2147483647");
			paypro.setPrice(test);
		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input String: \"2147483647\"");
		}
	}

	@Test
	public void testGetPrice6() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		try{
			int test = Integer.parseInt("-2147483647");
			paypro.setPrice(test);
		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input String: \"-2147483647\"");
		}
	}

	@Test
	public void testSetPrice() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		int test = 123;
		paypro.setPrice(test);
		int result = paypro.getPrice();
		assertEquals(test, result);
	}

	@Test
	public void testSetPrice2() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		int test = 2147483647;
		paypro.setPrice(test);
		int result = paypro.getPrice();
		assertEquals(test, result);
	}

	@Test
	public void testSetPrice3() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		int test = -2147483647;
		paypro.setPrice(test);
		int result = paypro.getPrice();
		assertEquals(test, result);
	}

	@Test
	public void testSetPrice4() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		int test = 0;
		paypro.setPrice(test);
		int result = paypro.getPrice();
		assertEquals(test, result);
	}

	@Test
	public void testSetPrice5() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		try{
			int test = Integer.parseInt("2147483647");
			paypro.setPrice(test);
		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input String: \"2147483647\"");
		}
	}

	@Test
	public void testSetPrice6() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		try{
			int test = Integer.parseInt("-2147483647");
			paypro.setPrice(test);
		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input String: \"-2147483647\"");
		}
	}

	@Test
	public void testGetReleaseDate() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = "abc123";
		paypro.setReleaseDate(test);
		assertEquals(test, paypro.getReleaseDate());
	}

	@Test
	public void testGetReleaseDate2() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = "あいう１２３";
		paypro.setReleaseDate(test);
		assertEquals(test, paypro.getReleaseDate());
	}

	@Test
	public void testGetReleaseDate3() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = "abc123あいう１２３漢字";
		paypro.setReleaseDate(test);
		assertEquals(test, paypro.getReleaseDate());
	}

	@Test
	public void testGetReleaseDate4() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = null;
		paypro.setReleaseDate(test);
		assertEquals(test, paypro.getReleaseDate());
	}

	@Test
	public void testGetReleaseDate5() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = "";
		paypro.setReleaseDate(test);
		assertEquals(test, paypro.getReleaseDate());
	}

	@Test
	public void testGetReleaseDate6() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = " ";
		paypro.setReleaseDate(test);
		assertEquals(test, paypro.getReleaseDate());
	}

	@Test
	public void testGetReleaseDate7() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = "  ";
		paypro.setReleaseDate(test);
		assertEquals(test, paypro.getReleaseDate());
	}

	@Test
	public void testSetReleaseDate() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = "abc123";
		paypro.setReleaseDate(test);
		String result = paypro.getReleaseDate();
		assertEquals(test, result);
	}

	@Test
	public void testSetReleaseDate2() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = "あいう１２３";
		paypro.setReleaseDate(test);
		String result = paypro.getReleaseDate();
		assertEquals(test, result);
	}

	@Test
	public void testSetReleaseDate3() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = "abc123あいう１２３漢字";
		paypro.setReleaseDate(test);
		String result = paypro.getReleaseDate();
		assertEquals(test, result);
	}

	@Test
	public void testSetReleaseDate4() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = null;
		paypro.setReleaseDate(test);
		String result = paypro.getReleaseDate();
		assertEquals(test, result);
	}

	@Test
	public void testSetReleaseDate5() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = "";
		paypro.setReleaseDate(test);
		String result = paypro.getReleaseDate();
		assertEquals(test, result);
	}

	@Test
	public void testSetReleaseDate6() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = " ";
		paypro.setReleaseDate(test);
		String result = paypro.getReleaseDate();
		assertEquals(test, result);
	}

	@Test
	public void testSetReleaseDate7() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = "  ";
		paypro.setReleaseDate(test);
		String result = paypro.getReleaseDate();
		assertEquals(test, result);
	}

	@Test
	public void testGetReleaseCompany() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = "abc123";
		paypro.setReleaseCompany(test);
		assertEquals(test, paypro.getReleaseCompany());
	}

	@Test
	public void testGetReleaseCompany2() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = "あいう１２３";
		paypro.setReleaseCompany(test);
		assertEquals(test, paypro.getReleaseCompany());
	}

	@Test
	public void testGetReleaseCompany3() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = "abc123あいう１２３漢字";
		paypro.setReleaseCompany(test);
		assertEquals(test, paypro.getReleaseCompany());
	}

	@Test
	public void testGetReleaseCompany4() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = null;
		paypro.setReleaseCompany(test);
		assertEquals(test, paypro.getReleaseCompany());
	}

	@Test
	public void testGetReleaseCompany5() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = "";
		paypro.setReleaseCompany(test);
		assertEquals(test, paypro.getReleaseCompany());
	}

	@Test
	public void testGetReleaseCompany6() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = " ";
		paypro.setReleaseCompany(test);
		assertEquals(test, paypro.getReleaseCompany());
	}

	@Test
	public void testGetReleaseCompany7() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = "  ";
		paypro.setReleaseCompany(test);
		assertEquals(test, paypro.getReleaseCompany());
	}

	@Test
	public void testSetReleaseCompany() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = "abc123";
		paypro.setReleaseCompany(test);
		String result = paypro.getReleaseCompany();
		assertEquals(test, result);
	}

	@Test
	public void testSetReleaseCompany2() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = "あいう１２３";
		paypro.setReleaseCompany(test);
		String result = paypro.getReleaseCompany();
		assertEquals(test, result);
	}

	@Test
	public void testSetReleaseCompany3() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = "abc123あいう１２３漢字";
		paypro.setReleaseCompany(test);
		String result = paypro.getReleaseCompany();
		assertEquals(test, result);
	}

	@Test
	public void testSetReleaseCompany4() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = null;
		paypro.setReleaseCompany(test);
		String result = paypro.getReleaseCompany();
		assertEquals(test, result);
	}

	@Test
	public void testSetReleaseCompany5() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = "";
		paypro.setReleaseCompany(test);
		String result = paypro.getReleaseCompany();
		assertEquals(test, result);
	}

	@Test
	public void testSetReleaseCompany6() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = " ";
		paypro.setReleaseCompany(test);
		String result = paypro.getReleaseCompany();
		assertEquals(test, result);
	}

	@Test
	public void testSetReleaseCompany7() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = "  ";
		paypro.setReleaseCompany(test);
		String result = paypro.getReleaseCompany();
		assertEquals(test, result);
	}

	@Test
	public void testGetImageFilePath() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = "abc123";
		paypro.setImageFilePath(test);
		assertEquals(test, paypro.getImageFilePath());
	}
	
	@Test
	public void testGetImageFilePath2() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = "あいう１２３";
		paypro.setImageFilePath(test);
		assertEquals(test, paypro.getImageFilePath());
	}
	
	@Test
	public void testGetImageFilePath3() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = "abc123あいう１２３漢字";
		paypro.setImageFilePath(test);
		assertEquals(test, paypro.getImageFilePath());
	}
	
	@Test
	public void testGetImageFilePath4() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = null;
		paypro.setImageFilePath(test);
		assertEquals(test, paypro.getImageFilePath());
	}
	
	@Test
	public void testGetImageFilePath5() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = "";
		paypro.setImageFilePath(test);
		assertEquals(test, paypro.getImageFilePath());
	}
	
	@Test
	public void testGetImageFilePath6() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = " ";
		paypro.setImageFilePath(test);
		assertEquals(test, paypro.getImageFilePath());
	}
	
	@Test
	public void testGetImageFilePath7() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = "  ";
		paypro.setImageFilePath(test);
		assertEquals(test, paypro.getImageFilePath());
	}

	@Test
	public void testSetImageFilePath() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = "abc123";
		paypro.setImageFilePath(test);
		String result = paypro.getImageFilePath();
		assertEquals(test, result);
	}
	
	@Test
	public void testSetImageFilePath2() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = "あいう１２３";
		paypro.setImageFilePath(test);
		String result = paypro.getImageFilePath();
		assertEquals(test, result);
	}
	
	@Test
	public void testSetImageFilePath3() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = "abc123あいう１２３漢字";
		paypro.setImageFilePath(test);
		String result = paypro.getImageFilePath();
		assertEquals(test, result);
	}
	
	@Test
	public void testSetImageFilePath4() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = null;
		paypro.setImageFilePath(test);
		String result = paypro.getImageFilePath();
		assertEquals(test, result);
	}
	
	@Test
	public void testSetImageFilePath5() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = "";
		paypro.setImageFilePath(test);
		String result = paypro.getImageFilePath();
		assertEquals(test, result);
	}
	
	@Test
	public void testSetImageFilePath6() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = " ";
		paypro.setImageFilePath(test);
		String result = paypro.getImageFilePath();
		assertEquals(test, result);
	}
	
	@Test
	public void testSetImageFilePath7() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = "  ";
		paypro.setImageFilePath(test);
		String result = paypro.getImageFilePath();
		assertEquals(test, result);
	}

	@Test
	public void testGetImageFileName() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = "abc123";
		paypro.setImageFileName(test);
		assertEquals(test, paypro.getImageFileName());
	}
	
	@Test
	public void testGetImageFileName2() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = "あいう１２３";
		paypro.setImageFileName(test);
		assertEquals(test, paypro.getImageFileName());
	}
	
	@Test
	public void testGetImageFileName3() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = "abc123あいう１２３漢字";
		paypro.setImageFileName(test);
		assertEquals(test, paypro.getImageFileName());
	}
	
	@Test
	public void testGetImageFileName4() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = null;
		paypro.setImageFileName(test);
		assertEquals(test, paypro.getImageFileName());
	}
	
	@Test
	public void testGetImageFileName5() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = "";
		paypro.setImageFileName(test);
		assertEquals(test, paypro.getImageFileName());
	}
	
	@Test
	public void testGetImageFileName6() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = " ";
		paypro.setImageFileName(test);
		assertEquals(test, paypro.getImageFileName());
	}
	
	@Test
	public void testGetImageFileName7() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = "  ";
		paypro.setImageFileName(test);
		assertEquals(test, paypro.getImageFileName());
	}

	@Test
	public void testSetImageFileName() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = "abc123";
		paypro.setImageFileName(test);
		String result = paypro.getImageFileName();
		assertEquals(test, result);
	}
	
	@Test
	public void testSetImageFileName2() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = "あいう１２３";
		paypro.setImageFileName(test);
		String result = paypro.getImageFileName();
		assertEquals(test, result);
	}
	
	@Test
	public void testSetImageFileName3() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = "abc123あいう１２３漢字";
		paypro.setImageFileName(test);
		String result = paypro.getImageFileName();
		assertEquals(test, result);
	}
	
	@Test
	public void testSetImageFileName4() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = null;
		paypro.setImageFileName(test);
		String result = paypro.getImageFileName();
		assertEquals(test, result);
	}
	
	@Test
	public void testSetImageFileName5() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = "";
		paypro.setImageFileName(test);
		String result = paypro.getImageFileName();
		assertEquals(test, result);
	}
	
	@Test
	public void testSetImageFileName6() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = " ";
		paypro.setImageFileName(test);
		String result = paypro.getImageFileName();
		assertEquals(test, result);
	}
	
	@Test
	public void testSetImageFileName7() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		String test = "  ";
		paypro.setImageFileName(test);
		String result = paypro.getImageFileName();
		assertEquals(test, result);
	}

	@Test
	public void testGetProductCount() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		int test = 123;
		paypro.setProductCount(test);
		assertEquals(test, paypro.getProductCount());
	}
	
	@Test
	public void testGetProductCount2() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		int test = 2147483647;
		paypro.setProductCount(test);
		assertEquals(test, paypro.getProductCount());
	}
	
	@Test
	public void testGetProductCount3() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		int test = -2147483647;
		paypro.setProductCount(test);
		assertEquals(test, paypro.getProductCount());
	}
	
	@Test
	public void testGetProductCount4() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		int test = 0;
		paypro.setProductCount(test);
		assertEquals(test, paypro.getProductCount());
	}
	
	@Test
	public void testGetProductCount5() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		try{
			int test = Integer.parseInt("2147483647");
			paypro.setProductCount(test);
		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input String: \"2147483647\"");
		}
	}
	
	@Test
	public void testGetProductCount6() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		try{
			int test = Integer.parseInt("-2147483647");
			paypro.setProductCount(test);
		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input String: \"-2147483647\"");
		}
	}

	@Test
	public void testSetProductCount() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		int test = 123;
		paypro.setProductCount(test);
		int result = paypro.getProductCount();
		assertEquals(test, result);
	}
	
	@Test
	public void testSetProductCount2() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		int test = 2147483647;
		paypro.setProductCount(test);
		int result = paypro.getProductCount();
		assertEquals(test, result);
	}
	
	@Test
	public void testSetProductCount3() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		int test = -2147483647;
		paypro.setProductCount(test);
		int result = paypro.getProductCount();
		assertEquals(test, result);
	}
	
	@Test
	public void testSetProductCount4() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		int test = 0;
		paypro.setProductCount(test);
		int result = paypro.getProductCount();
		assertEquals(test, result);
	}
	
	@Test
	public void testSetProductCount5() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		try{
			int test = Integer.parseInt("2147483647");
			paypro.setProductCount(test);
		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input String: \"2147483647\"");
		}
	}
	
	@Test
	public void testSetProductCount6() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		try{
			int test = Integer.parseInt("-2147483647");
			paypro.setProductCount(test);
		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input String: \"-2147483647\"");
		}
	}

	@Test
	public void testGetTotalPrice() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		int test = 123;
		paypro.setTotalPrice(test);
		assertEquals(test, paypro.getTotalPrice());
	}
	
	@Test
	public void testGetTotalPrice2() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		int test = 2147483647;
		paypro.setTotalPrice(test);
		assertEquals(test, paypro.getTotalPrice());
	}
	
	@Test
	public void testGetTotalPrice3() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		int test = -2147483647;
		paypro.setTotalPrice(test);
		assertEquals(test, paypro.getTotalPrice());
	}
	
	@Test
	public void testGetTotalPrice4() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		int test = 0;
		paypro.setTotalPrice(test);
		assertEquals(test, paypro.getTotalPrice());
	}
	
	@Test
	public void testGetTotalPrice5() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		try{
			int test = Integer.parseInt("2147483647");
			paypro.setTotalPrice(test);
		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input String: \"2147483647\"");
		}
	}
	
	@Test
	public void testGetTotalPrice6() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		try{
			int test = Integer.parseInt("-2147483647");
			paypro.setTotalPrice(test);
		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input String: \"-2147483647\"");
		}
	}

	@Test
	public void testSetTotalPrice() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		int test = 123;
		paypro.setTotalPrice(test);
		int result = paypro.getTotalPrice();
		assertEquals(test, result);
	}
	
	@Test
	public void testSetTotalPrice2() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		int test = 2147483647;
		paypro.setTotalPrice(test);
		int result = paypro.getTotalPrice();
		assertEquals(test, result);
	}
	
	@Test
	public void testSetTotalPrice3() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		int test = -2147483647;
		paypro.setTotalPrice(test);
		int result = paypro.getTotalPrice();
		assertEquals(test, result);
	}
	
	@Test
	public void testSetTotalPrice4() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		int test = 0;
		paypro.setTotalPrice(test);
		int result = paypro.getTotalPrice();
		assertEquals(test, result);
	}
	
	@Test
	public void testSetTotalPrice5() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		try{
			int test = Integer.parseInt("2147483647");
			paypro.setTotalPrice(test);
		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input String: \"2147483647\"");
		}
	}
	
	@Test
	public void testSetTotalPrice6() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		try{
			int test = Integer.parseInt("-2147483647");
			paypro.setTotalPrice(test);
		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input String: \"-2147483647\"");
		}
	}

	private void assertThat(String message, String String){
		assertEquals(message,String);
	}

}
