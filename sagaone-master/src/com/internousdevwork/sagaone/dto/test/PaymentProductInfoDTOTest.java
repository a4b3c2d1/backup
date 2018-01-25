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
	public void testSetPrice() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		int test = 123;
		paypro.setPrice(test);
		int result = paypro.getPrice();
		assertEquals(test, result);
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
	public void testSetPrice() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		int test = 123;
		paypro.setPrice(test);
		int result = paypro.getPrice();
		assertEquals(test, result);
	}

	@Test
	public void testSetPrice() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		try{
			int test = Integer.parseInt("2147483647");
			paypro.setPrice(test);
		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input String: \"2147483647\"");
		}
	}

	@Test
	public void testSetPrice() {
		PaymentProductInfoDTO paypro = new PaymentProductInfoDTO();
		try{
			int test = Integer.parseInt("2147483647");
			paypro.setPrice(test);
		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input String: \"2147483647\"");
		}
	}

	@Test
	public void testGetReleaseDate() {
		fail("まだ実装されていません");
	}

	@Test
	public void testSetReleaseDate() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetReleaseCompany() {
		fail("まだ実装されていません");
	}

	@Test
	public void testSetReleaseCompany() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetImageFilePath() {
		fail("まだ実装されていません");
	}

	@Test
	public void testSetImageFilePath() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetImageFileName() {
		fail("まだ実装されていません");
	}

	@Test
	public void testSetImageFileName() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetProductCount() {
		fail("まだ実装されていません");
	}

	@Test
	public void testSetProductCount() {
		fail("まだ実装されていません");
	}

	@Test
	public void testGetTotalPrice() {
		fail("まだ実装されていません");
	}

	@Test
	public void testSetTotalPrice() {
		fail("まだ実装されていません");
	}

	private void assertThat(String message, String String){
		assertEquals(message,String);
	}

}
