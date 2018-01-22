package com.internousdevwork.sagaone.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdevwork.sagaone.dto.PaymentCartInfoDTO;

public class PaymentCartInfoDTOTest {

	@Test
	public void testGetProductId() {
		int test = 123;
		PaymentCartInfoDTO paycart = new PaymentCartInfoDTO();
		paycart.setProductId(test);
		assertEquals(test, paycart.getProductId());
	}

	@Test
	public void testGetProductId2() {
		int test = 2147483647;
		PaymentCartInfoDTO paycart = new PaymentCartInfoDTO();
		paycart.setProductId(test);
		assertEquals(test, paycart.getProductId());
	}

	@Test
	public void testGetProductId3() {
		int test = -2147483647;
		PaymentCartInfoDTO paycart = new PaymentCartInfoDTO();
		paycart.setProductId(test);
		assertEquals(test, paycart.getProductId());
	}

	@Test
	public void testGetProductId4() {
		int test = 0;
		PaymentCartInfoDTO paycart = new PaymentCartInfoDTO();
		paycart.setProductId(test);
		assertEquals(test, paycart.getProductId());
	}

	@Test
	public void testGetProductId5() {
		PaymentCartInfoDTO paycart = new PaymentCartInfoDTO();
		try{
			int test = Integer.parseInt("2147483647");
			paycart.setProductId(test);
		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input String: \"2147483647\"");
		}
	}

	@Test
	public void testGetProductId6() {
		PaymentCartInfoDTO paycart = new PaymentCartInfoDTO();
		try{
			int test = Integer.parseInt("-2147483647");
			paycart.setProductId(test);
		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input String: \"-2147483647\"");
		}
	}

	@Test
	public void testSetProductId() {
		PaymentCartInfoDTO paycart = new PaymentCartInfoDTO();
		int test = 123;
		paycart.setProductId(test);
		int result = paycart.getProductId();
		assertEquals(test, result);
	}

	@Test
	public void testSetProductId2() {
		PaymentCartInfoDTO paycart = new PaymentCartInfoDTO();
		int test = 2147483647;
		paycart.setProductId(test);
		int result = paycart.getProductId();
		assertEquals(test, result);
	}

	@Test
	public void testSetProductId3() {
		PaymentCartInfoDTO paycart = new PaymentCartInfoDTO();
		int test = -2147483647;
		paycart.setProductId(test);
		int result = paycart.getProductId();
		assertEquals(test, result);
	}

	@Test
	public void testSetProductId4() {
		PaymentCartInfoDTO paycart = new PaymentCartInfoDTO();
		int test = 0;
		paycart.setProductId(test);
		int result = paycart.getProductId();
		assertEquals(test, result);
	}

	@Test
	public void testSetProductId5() {
		PaymentCartInfoDTO paycart = new PaymentCartInfoDTO();
		try{
			int test = Integer.parseInt("2147483647");
			paycart.setProductId(test);
		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input String: \"2147483647\"");
		}
	}

	@Test
	public void testSetProductId6() {
		PaymentCartInfoDTO paycart = new PaymentCartInfoDTO();
		try{
			int test = Integer.parseInt("-2147483647");
			paycart.setProductId(test);
		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input String: \"-2147483647\"");
		}
	}

	@Test
	public void testGetProductCount() {
		int test = 123;
		PaymentCartInfoDTO paycart = new PaymentCartInfoDTO();
		paycart.setProductCount(test);
		assertEquals(test, paycart.getProductCount());
	}

	@Test
	public void testGetProductCount2() {
		int test = 2147483647;
		PaymentCartInfoDTO paycart = new PaymentCartInfoDTO();
		paycart.setProductCount(test);
		assertEquals(test, paycart.getProductCount());
	}

	@Test
	public void testGetProductCount3() {
		int test = -2147483647;
		PaymentCartInfoDTO paycart = new PaymentCartInfoDTO();
		paycart.setProductCount(test);
		assertEquals(test, paycart.getProductCount());
	}

	@Test
	public void testGetProductCount4() {
		int test = 0;
		PaymentCartInfoDTO paycart = new PaymentCartInfoDTO();
		paycart.setProductCount(test);
		assertEquals(test, paycart.getProductCount());
	}

	@Test
	public void testGetProductCount5() {
		PaymentCartInfoDTO paycart = new PaymentCartInfoDTO();
		try{
			int test = Integer.parseInt("2147483647");
			paycart.setProductCount(test);
		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input String: \"2147483647\"");
		}
	}

	@Test
	public void testGetProductCount6() {
		PaymentCartInfoDTO paycart = new PaymentCartInfoDTO();
		try{
			int test = Integer.parseInt("2147483647");
			paycart.setProductCount(test);
		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input String: \"2147483647\"");
		}
	}

	@Test
	public void testSetProductCount() {
		PaymentCartInfoDTO paycart = new PaymentCartInfoDTO();
		int test = 123;
		paycart.setProductCount(test);
		int result = paycart.getProductId();
		assertEquals(test, result);
	}

	@Test
	public void testSetProductCount2() {
		PaymentCartInfoDTO paycart = new PaymentCartInfoDTO();
		int test = 2147483647;
		paycart.setProductCount(test);
		int result = paycart.getProductId();
		assertEquals(test, result);
	}

	@Test
	public void testSetProductCount3() {
		PaymentCartInfoDTO paycart = new PaymentCartInfoDTO();
		int test = -2147483647;
		paycart.setProductCount(test);
		int result = paycart.getProductId();
		assertEquals(test, result);
	}

	@Test
	public void testSetProductCount4() {
		PaymentCartInfoDTO paycart = new PaymentCartInfoDTO();
		int test = 0;
		paycart.setProductCount(test);
		int result = paycart.getProductId();
		assertEquals(test, result);
	}

	@Test
	public void testSetProductCount5() {
		PaymentCartInfoDTO paycart = new PaymentCartInfoDTO();
		try{
			int test = Integer.parseInt("2147483647");
			paycart.setProductCount(test);
		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input String: \"2147483647\"");
		}
	}

	@Test
	public void testSetProductCount6() {
		PaymentCartInfoDTO paycart = new PaymentCartInfoDTO();
		try{
			int test = Integer.parseInt("-2147483647");
			paycart.setProductCount(test);
		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input String: \"-2147483647\"");
		}
	}

	private void assertThat(String message, String string){
		assertEquals(message,string);
	}

}
