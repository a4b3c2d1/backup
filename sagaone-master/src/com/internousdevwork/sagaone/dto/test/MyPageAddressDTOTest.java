package com.internousdevwork.sagaone.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdevwork.sagaone.dto.MyPageAddressDTO;

public class MyPageAddressDTOTest {

	@Test
	public void testGetTelNumber() {
		MyPageAddressDTO myadd = new MyPageAddressDTO();
		String test = "abc123";
		myadd.setTelNumber(test);
		assertEquals(test, myadd.getTelNumber());
	}

	@Test
	public void testGetTelNumber2() {
		MyPageAddressDTO myadd = new MyPageAddressDTO();
		String test = "あいう１２３";
		myadd.setTelNumber(test);
		assertEquals(test, myadd.getTelNumber());
	}

	@Test
	public void testGetTelNumber3() {
		MyPageAddressDTO myadd = new MyPageAddressDTO();
		String test = "abc123あいう１２３漢字";
		myadd.setTelNumber(test);
		assertEquals(test, myadd.getTelNumber());
	}

	@Test
	public void testGetTelNumber4() {
		MyPageAddressDTO myadd = new MyPageAddressDTO();
		String test = null;
		myadd.setTelNumber(test);
		assertEquals(test, myadd.getTelNumber());
	}

	@Test
	public void testGetTelNumber5() {
		MyPageAddressDTO myadd = new MyPageAddressDTO();
		String test = "";
		myadd.setTelNumber(test);
		assertEquals(test, myadd.getTelNumber());
	}

	@Test
	public void testGetTelNumber6() {
		MyPageAddressDTO myadd = new MyPageAddressDTO();
		String test = " ";
		myadd.setTelNumber(test);
		assertEquals(test, myadd.getTelNumber());
	}

	@Test
	public void testGetTelNumber7() {
		MyPageAddressDTO myadd = new MyPageAddressDTO();
		String test = "  ";
		myadd.setTelNumber(test);
		assertEquals(test, myadd.getTelNumber());
	}

	@Test
	public void testSetTelNumber() {
		MyPageAddressDTO myadd = new MyPageAddressDTO();
		String test = "abc123";
		myadd.setTelNumber(test);
		String result = myadd.getTelNumber();
		assertEquals(test, result);
	}

	@Test
	public void testSetTelNumber2() {
		MyPageAddressDTO myadd = new MyPageAddressDTO();
		String test = "あいう１２３";
		myadd.setTelNumber(test);
		String result = myadd.getTelNumber();
		assertEquals(test, result);
	}

	@Test
	public void testSetTelNumber3() {
		MyPageAddressDTO myadd = new MyPageAddressDTO();
		String test = "abc123あいう１２３漢字";
		myadd.setTelNumber(test);
		String result = myadd.getTelNumber();
		assertEquals(test, result);
	}

	@Test
	public void testSetTelNumber4() {
		MyPageAddressDTO myadd = new MyPageAddressDTO();
		String test = null;
		myadd.setTelNumber(test);
		String result = myadd.getTelNumber();
		assertEquals(test, result);
	}

	@Test
	public void testSetTelNumber5() {
		MyPageAddressDTO myadd = new MyPageAddressDTO();
		String test = "";
		myadd.setTelNumber(test);
		String result = myadd.getTelNumber();
		assertEquals(test, result);
	}

	@Test
	public void testSetTelNumber6() {
		MyPageAddressDTO myadd = new MyPageAddressDTO();
		String test = " ";
		myadd.setTelNumber(test);
		String result = myadd.getTelNumber();
		assertEquals(test, result);
	}
	@Test
	public void testSetTelNumber7() {
		MyPageAddressDTO myadd = new MyPageAddressDTO();
		String test = "  ";
		myadd.setTelNumber(test);
		String result = myadd.getTelNumber();
		assertEquals(test, result);
	}

	@Test
	public void testGetUserAddress() {
		MyPageAddressDTO myadd = new MyPageAddressDTO();
		String test = "abc123";
		myadd.setUserAddress(test);
		assertEquals(test, myadd.getTelNumber());
	}

	@Test
	public void testGetUserAddress2() {
		MyPageAddressDTO myadd = new MyPageAddressDTO();
		String test = "あいう１２３";
		myadd.setUserAddress(test);
		assertEquals(test, myadd.getTelNumber());
	}

	@Test
	public void testGetUserAddress3() {
		MyPageAddressDTO myadd = new MyPageAddressDTO();
		String test = "abc123あいう１２３漢字";
		myadd.setUserAddress(test);
		assertEquals(test, myadd.getTelNumber());
	}

	@Test
	public void testGetUserAddress4() {
		MyPageAddressDTO myadd = new MyPageAddressDTO();
		String test = null;
		myadd.setUserAddress(test);
		assertEquals(test, myadd.getTelNumber());
	}

	@Test
	public void testGetUserAddress5() {
		MyPageAddressDTO myadd = new MyPageAddressDTO();
		String test = "";
		myadd.setUserAddress(test);
		assertEquals(test, myadd.getTelNumber());
	}

	@Test
	public void testGetUserAddress6() {
		MyPageAddressDTO myadd = new MyPageAddressDTO();
		String test = " ";
		myadd.setUserAddress(test);
		assertEquals(test, myadd.getTelNumber());
	}

	@Test
	public void testGetUserAddress7() {
		MyPageAddressDTO myadd = new MyPageAddressDTO();
		String test = "  ";
		myadd.setUserAddress(test);
		assertEquals(test, myadd.getTelNumber());
	}

	@Test
	public void testSetUserAddress() {
		MyPageAddressDTO myadd = new MyPageAddressDTO();
		String test = "abc123";
		myadd.setUserAddress(test);
		String result = myadd.getUserAddress();
		assertEquals(test, result);
	}

	@Test
	public void testSetUserAddress2() {
		MyPageAddressDTO myadd = new MyPageAddressDTO();
		String test = "あいう１２３";
		myadd.setUserAddress(test);
		String result = myadd.getUserAddress();
		assertEquals(test, result);
	}

	@Test
	public void testSetUserAddress3() {
		MyPageAddressDTO myadd = new MyPageAddressDTO();
		String test = "abc123あいう１２３漢字";
		myadd.setUserAddress(test);
		String result = myadd.getUserAddress();
		assertEquals(test, result);
	}

	@Test
	public void testSetUserAddress4() {
		MyPageAddressDTO myadd = new MyPageAddressDTO();
		String test = null;
		myadd.setUserAddress(test);
		String result = myadd.getUserAddress();
		assertEquals(test, result);
	}

	@Test
	public void testSetUserAddress5() {
		MyPageAddressDTO myadd = new MyPageAddressDTO();
		String test = "";
		myadd.setUserAddress(test);
		String result = myadd.getUserAddress();
		assertEquals(test, result);
	}

	@Test
	public void testSetUserAddress6() {
		MyPageAddressDTO myadd = new MyPageAddressDTO();
		String test = " ";
		myadd.setUserAddress(test);
		String result = myadd.getUserAddress();
		assertEquals(test, result);
	}

	@Test
	public void testSetUserAddress7() {
		MyPageAddressDTO myadd = new MyPageAddressDTO();
		String test = "  ";
		myadd.setUserAddress(test);
		String result = myadd.getUserAddress();
		assertEquals(test, result);
	}

}
