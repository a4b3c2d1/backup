package com.internousdevwork.sagaone.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdevwork.sagaone.dto.MyPageCardDTO;

public class MyPageCardDTOTest {

	@Test
	public void testGetCardNumber() {
		MyPageCardDTO mycard = new MyPageCardDTO();
		String test = "abc123";
		mycard.setCardNumber(test);
		assertEquals(test, mycard.getCardNumber());
	}

	@Test
	public void testGetCardNumber2() {
		MyPageCardDTO mycard = new MyPageCardDTO();
		String test = "あいう１２３";
		mycard.setCardNumber(test);
		assertEquals(test, mycard.getCardNumber());
	}

	@Test
	public void testGetCardNumber3() {
		MyPageCardDTO mycard = new MyPageCardDTO();
		String test = "abc123あいう１２３漢字";
		mycard.setCardNumber(test);
		assertEquals(test, mycard.getCardNumber());
	}

	@Test
	public void testGetCardNumber4() {
		MyPageCardDTO mycard = new MyPageCardDTO();
		String test = null;
		mycard.setCardNumber(test);
		assertEquals(test, mycard.getCardNumber());
	}

	@Test
	public void testGetCardNumber5() {
		MyPageCardDTO mycard = new MyPageCardDTO();
		String test = "";
		mycard.setCardNumber(test);
		assertEquals(test, mycard.getCardNumber());
	}

	@Test
	public void testGetCardNumber6() {
		MyPageCardDTO mycard = new MyPageCardDTO();
		String test = " ";
		mycard.setCardNumber(test);
		assertEquals(test, mycard.getCardNumber());
	}

	@Test
	public void testGetCardNumber7() {
		MyPageCardDTO mycard = new MyPageCardDTO();
		String test = "  ";
		mycard.setCardNumber(test);
		assertEquals(test, mycard.getCardNumber());
	}

	@Test
	public void testSetCardNumber() {
		MyPageCardDTO mycard = new MyPageCardDTO();
		String test = "abc123";
		mycard.setCardNumber(test);
		String result = mycard.getCardNumber();
		assertEquals(test, result);
	}

	@Test
	public void testSetCardNumber2() {
		MyPageCardDTO mycard = new MyPageCardDTO();
		String test = "あいう１２３";
		mycard.setCardNumber(test);
		String result = mycard.getCardNumber();
		assertEquals(test, result);
	}

	@Test
	public void testSetCardNumber3() {
		MyPageCardDTO mycard = new MyPageCardDTO();
		String test = "abc123あいう１２３漢字";
		mycard.setCardNumber(test);
		String result = mycard.getCardNumber();
		assertEquals(test, result);
	}

	@Test
	public void testSetCardNumber4() {
		MyPageCardDTO mycard = new MyPageCardDTO();
		String test = null;
		mycard.setCardNumber(test);
		String result = mycard.getCardNumber();
		assertEquals(test, result);
	}

	@Test
	public void testSetCardNumber5() {
		MyPageCardDTO mycard = new MyPageCardDTO();
		String test = "";
		mycard.setCardNumber(test);
		String result = mycard.getCardNumber();
		assertEquals(test, result);
	}

	@Test
	public void testSetCardNumber6() {
		MyPageCardDTO mycard = new MyPageCardDTO();
		String test = " ";
		mycard.setCardNumber(test);
		String result = mycard.getCardNumber();
		assertEquals(test, result);
	}

	@Test
	public void testSetCardNumber7() {
		MyPageCardDTO mycard = new MyPageCardDTO();
		String test = "  ";
		mycard.setCardNumber(test);
		String result = mycard.getCardNumber();
		assertEquals(test, result);
	}

}
