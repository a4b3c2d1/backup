package com.internousdevwork.sagaone.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdevwork.sagaone.dto.PaymentUserAddressDTO;

public class PaymentUserAddressDTOTest {

	@Test
	public void testGetUserAddress() {
		PaymentUserAddressDTO address = new PaymentUserAddressDTO();
		String test = "abc123";
		address.setUserAddress(test);
		assertEquals(test, address.getUserAddress());
	}

	@Test
	public void testGetUserAddress2() {
		PaymentUserAddressDTO address = new PaymentUserAddressDTO();
		String test = "あいう１２３";
		address.setUserAddress(test);
		assertEquals(test, address.getUserAddress());
	}

	@Test
	public void testGetUserAddress3() {
		PaymentUserAddressDTO address = new PaymentUserAddressDTO();
		String test = "abc123あいう１２３漢字";
		address.setUserAddress(test);
		assertEquals(test, address.getUserAddress());
	}

	@Test
	public void testGetUserAddress4() {
		PaymentUserAddressDTO address = new PaymentUserAddressDTO();
		String test = null;
		address.setUserAddress(test);
		assertEquals(test, address.getUserAddress());
	}

	@Test
	public void testGetUserAddress5() {
		PaymentUserAddressDTO address = new PaymentUserAddressDTO();
		String test = "";
		address.setUserAddress(test);
		assertEquals(test, address.getUserAddress());
	}

	@Test
	public void testGetUserAddress6() {
		PaymentUserAddressDTO address = new PaymentUserAddressDTO();
		String test = " ";
		address.setUserAddress(test);
		assertEquals(test, address.getUserAddress());
	}

	@Test
	public void testGetUserAddress7() {
		PaymentUserAddressDTO address = new PaymentUserAddressDTO();
		String test = "  ";
		address.setUserAddress(test);
		assertEquals(test, address.getUserAddress());
	}

	@Test
	public void testSetUserAddress() {
		PaymentUserAddressDTO address = new PaymentUserAddressDTO();
		String test = "abc123";
		address.setUserAddress(test);
		String result = address.getUserAddress();
		assertEquals(test, result);
	}

	@Test
	public void testSetUserAddress2() {
		PaymentUserAddressDTO address = new PaymentUserAddressDTO();
		String test = "あいう１２３";
		address.setUserAddress(test);
		String result = address.getUserAddress();
		assertEquals(test, result);
	}

	@Test
	public void testSetUserAddress3() {
		PaymentUserAddressDTO address = new PaymentUserAddressDTO();
		String test = "abc123あいう１２３漢字";
		address.setUserAddress(test);
		String result = address.getUserAddress();
		assertEquals(test, result);
	}

	@Test
	public void testSetUserAddress4() {
		PaymentUserAddressDTO address = new PaymentUserAddressDTO();
		String test = null;
		address.setUserAddress(test);
		String result = address.getUserAddress();
		assertEquals(test, result);
	}

	@Test
	public void testSetUserAddress5() {
		PaymentUserAddressDTO address = new PaymentUserAddressDTO();
		String test = "";
		address.setUserAddress(test);
		String result = address.getUserAddress();
		assertEquals(test, result);
	}

	@Test
	public void testSetUserAddress6() {
		PaymentUserAddressDTO address = new PaymentUserAddressDTO();
		String test = " ";
		address.setUserAddress(test);
		String result = address.getUserAddress();
		assertEquals(test, result);
	}

	@Test
	public void testSetUserAddress7() {
		PaymentUserAddressDTO address = new PaymentUserAddressDTO();
		String test = "  ";
		address.setUserAddress(test);
		String result = address.getUserAddress();
		assertEquals(test, result);
	}

	@Test
	public void testGetTelNumber() {
		PaymentUserAddressDTO address = new PaymentUserAddressDTO();
		String test = "abc123";
		address.setTelNumber(test);
		assertEquals(test, address.getTelNumber());
	}

	@Test
	public void testGetTelNumber2() {
		PaymentUserAddressDTO address = new PaymentUserAddressDTO();
		String test = "あいう１２３";
		address.setTelNumber(test);
		assertEquals(test, address.getTelNumber());
	}

	@Test
	public void testGetTelNumber3() {
		PaymentUserAddressDTO address = new PaymentUserAddressDTO();
		String test = "abc123あいう１２３漢字";
		address.setTelNumber(test);
		assertEquals(test, address.getTelNumber());
	}

	@Test
	public void testGetTelNumber4() {
		PaymentUserAddressDTO address = new PaymentUserAddressDTO();
		String test = null;
		address.setTelNumber(test);
		assertEquals(test, address.getTelNumber());
	}

	@Test
	public void testGetTelNumber5() {
		PaymentUserAddressDTO address = new PaymentUserAddressDTO();
		String test = "";
		address.setTelNumber(test);
		assertEquals(test, address.getTelNumber());
	}

	@Test
	public void testGetTelNumber6() {
		PaymentUserAddressDTO address = new PaymentUserAddressDTO();
		String test = " ";
		address.setTelNumber(test);
		assertEquals(test, address.getTelNumber());
	}

	@Test
	public void testGetTelNumber7() {
		PaymentUserAddressDTO address = new PaymentUserAddressDTO();
		String test = "  ";
		address.setTelNumber(test);
		assertEquals(test, address.getTelNumber());
	}

	@Test
	public void testSetTelNumber() {
		fail("まだ実装されていません");
	}

}
