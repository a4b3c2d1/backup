package com.internousdevwork.sagaone.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdevwork.sagaone.dto.DestinationDTO;

public class DestinationDTOTest {

	@Test
	public void testGetDestinationId() {
		DestinationDTO des = new DestinationDTO();
		String test = "abc123";
		des.setDestinationId(test);
		assertEquals(test, des.getDestinationId());
	}

	@Test
	public void testGetDestinationId2() {
		DestinationDTO des = new DestinationDTO();
		String test = "あいう１２３";
		des.setDestinationId(test);
		assertEquals(test, des.getDestinationId());
	}

	@Test
	public void testGetDestinationId3() {
		DestinationDTO des = new DestinationDTO();
		String test = "abc123あいう１２３漢字";
		des.setDestinationId(test);
		assertEquals(test, des.getDestinationId());
	}

	@Test
	public void testGetDestinationId4() {
		DestinationDTO des = new DestinationDTO();
		String test = null;
		des.setDestinationId(test);
		assertEquals(test, des.getDestinationId());
	}

	@Test
	public void testGetDestinationId5() {
		DestinationDTO des = new DestinationDTO();
		String test = "";
		des.setDestinationId(test);
		assertEquals(test, des.getDestinationId());
	}

	@Test
	public void testGetDestinationId6() {
		DestinationDTO des = new DestinationDTO();
		String test = " ";
		des.setDestinationId(test);
		assertEquals(test, des.getDestinationId());
	}

	@Test
	public void testGetDestinationId7() {
		DestinationDTO des = new DestinationDTO();
		String test = "  ";
		des.setDestinationId(test);
		assertEquals(test, des.getDestinationId());
	}

	@Test
	public void testSetDestinationId() {
		DestinationDTO des = new DestinationDTO();
		String test = "abc123";
		des.setDestinationId(test);
		String result = des.getDestinationId();
		assertEquals(test, result);
	}

	@Test
	public void testSetDestinationId2() {
		DestinationDTO des = new DestinationDTO();
		String test = "あいう１２３";
		des.setDestinationId(test);
		String result = des.getDestinationId();
		assertEquals(test, result);
	}

	@Test
	public void testSetDestinationId3() {
		DestinationDTO des = new DestinationDTO();
		String test = "abc123あいう１２３漢字";
		des.setDestinationId(test);
		String result = des.getDestinationId();
		assertEquals(test, result);
	}

	@Test
	public void testSetDestinationId4() {
		DestinationDTO des = new DestinationDTO();
		String test = null;
		des.setDestinationId(test);
		String result = des.getDestinationId();
		assertEquals(test, result);
	}

	@Test
	public void testSetDestinationId5() {
		DestinationDTO des = new DestinationDTO();
		String test = "";
		des.setDestinationId(test);
		String result = des.getDestinationId();
		assertEquals(test, result);
	}

	@Test
	public void testSetDestinationId6() {
		DestinationDTO des = new DestinationDTO();
		String test = " ";
		des.setDestinationId(test);
		String result = des.getDestinationId();
		assertEquals(test, result);
	}

	@Test
	public void testSetDestinationId7() {
		DestinationDTO des = new DestinationDTO();
		String test = "  ";
		des.setDestinationId(test);
		String result = des.getDestinationId();
		assertEquals(test, result);
	}

	@Test
	public void testGetUserId() {
		DestinationDTO des = new DestinationDTO();
		String test = "abc123";
		des.setUserId(test);
		assertEquals(test, des.getUserId());
	}

	@Test
	public void testGetUserId2() {
		DestinationDTO des = new DestinationDTO();
		String test = "aあいう１２３";
		des.setUserId(test);
		assertEquals(test, des.getUserId());
	}

	@Test
	public void testGetUserId3() {
		DestinationDTO des = new DestinationDTO();
		String test = "abc123あいう１２３漢字";
		des.setUserId(test);
		assertEquals(test, des.getUserId());
	}

	@Test
	public void testGetUserId4() {
		DestinationDTO des = new DestinationDTO();
		String test = null;
		des.setUserId(test);
		assertEquals(test, des.getUserId());
	}

	@Test
	public void testGetUserId5() {
		DestinationDTO des = new DestinationDTO();
		String test = "";
		des.setUserId(test);
		assertEquals(test, des.getUserId());
	}

	@Test
	public void testGetUserId6() {
		DestinationDTO des = new DestinationDTO();
		String test = " ";
		des.setUserId(test);
		assertEquals(test, des.getUserId());
	}

	@Test
	public void testGetUserId7() {
		DestinationDTO des = new DestinationDTO();
		String test = "  ";
		des.setUserId(test);
		assertEquals(test, des.getUserId());
	}

	@Test
	public void testSetUserId() {
		DestinationDTO des = new DestinationDTO();
		String test = "abc123";
		des.setUserId(test);
		String result = des.getUserId();
		assertEquals(test, result);
	}

	@Test
	public void testSetUserId2() {
		DestinationDTO des = new DestinationDTO();
		String test = "あいう１２３";
		des.setUserId(test);
		String result = des.getUserId();
		assertEquals(test, result);
	}

	@Test
	public void testSetUserId3() {
		DestinationDTO des = new DestinationDTO();
		String test = "abc123あいう１２３漢字";
		des.setUserId(test);
		String result = des.getUserId();
		assertEquals(test, result);
	}

	@Test
	public void testSetUserId4() {
		DestinationDTO des = new DestinationDTO();
		String test = null;
		des.setUserId(test);
		String result = des.getUserId();
		assertEquals(test, result);
	}

	@Test
	public void testSetUserId5() {
		DestinationDTO des = new DestinationDTO();
		String test = "";
		des.setUserId(test);
		String result = des.getUserId();
		assertEquals(test, result);
	}

	@Test
	public void testSetUserId6() {
		DestinationDTO des = new DestinationDTO();
		String test = " ";
		des.setUserId(test);
		String result = des.getUserId();
		assertEquals(test, result);
	}

	@Test
	public void testSetUserId7() {
		DestinationDTO des = new DestinationDTO();
		String test = "  ";
		des.setUserId(test);
		String result = des.getUserId();
		assertEquals(test, result);
	}

	@Test
	public void testGetFamilyName() {
		DestinationDTO des = new DestinationDTO();
		String test = "abc123";
		des.setFamilyName(test);
		assertEquals(test, des.getFamilyName());
	}

	@Test
	public void testGetFamilyName2() {
		DestinationDTO des = new DestinationDTO();
		String test = "あいう１２３";
		des.setFamilyName(test);
		assertEquals(test, des.getFamilyName());
	}

	@Test
	public void testGetFamilyName3() {
		DestinationDTO des = new DestinationDTO();
		String test = "abc123あいう１２３漢字";
		des.setFamilyName(test);
		assertEquals(test, des.getFamilyName());
	}

	@Test
	public void testGetFamilyName4() {
		DestinationDTO des = new DestinationDTO();
		String test = null;
		des.setFamilyName(test);
		assertEquals(test, des.getFamilyName());
	}

	@Test
	public void testGetFamilyName5() {
		DestinationDTO des = new DestinationDTO();
		String test = "";
		des.setFamilyName(test);
		assertEquals(test, des.getFamilyName());
	}

	@Test
	public void testGetFamilyName6() {
		DestinationDTO des = new DestinationDTO();
		String test = " ";
		des.setFamilyName(test);
		assertEquals(test, des.getFamilyName());
	}

	@Test
	public void testGetFamilyName7() {
		DestinationDTO des = new DestinationDTO();
		String test = "  ";
		des.setFamilyName(test);
		assertEquals(test, des.getFamilyName());
	}

	@Test
	public void testSetFamilyName() {
		DestinationDTO des = new DestinationDTO();
		String test = "abc123";
		des.setFamilyName(test);
		String result = des.getFamilyName();
		assertEquals(test, result);
	}

	@Test
	public void testSetFamilyName2() {
		DestinationDTO des = new DestinationDTO();
		String test = "あいう１２３";
		des.setFamilyName(test);
		String result = des.getFamilyName();
		assertEquals(test, result);
	}

	@Test
	public void testSetFamilyName3() {
		DestinationDTO des = new DestinationDTO();
		String test = "abc123あいう１２３漢字";
		des.setFamilyName(test);
		String result = des.getFamilyName();
		assertEquals(test, result);
	}

	@Test
	public void testSetFamilyName4() {
		DestinationDTO des = new DestinationDTO();
		String test = null;
		des.setFamilyName(test);
		String result = des.getFamilyName();
		assertEquals(test, result);
	}

	@Test
	public void testSetFamilyName5() {
		DestinationDTO des = new DestinationDTO();
		String test = "";
		des.setFamilyName(test);
		String result = des.getFamilyName();
		assertEquals(test, result);
	}

	@Test
	public void testSetFamilyName6() {
		DestinationDTO des = new DestinationDTO();
		String test = " ";
		des.setFamilyName(test);
		String result = des.getFamilyName();
		assertEquals(test, result);
	}

	@Test
	public void testSetFamilyName7() {
		DestinationDTO des = new DestinationDTO();
		String test = "  ";
		des.setFamilyName(test);
		String result = des.getFamilyName();
		assertEquals(test, result);
	}

	@Test
	public void testGetFirstName() {
		DestinationDTO des = new DestinationDTO();
		String test = "abc123";
		des.setFirstName(test);
		assertEquals(test, des.getFirstName());
	}

	@Test
	public void testGetFirstName2() {
		DestinationDTO des = new DestinationDTO();
		String test = "あいう１２３";
		des.setFirstName(test);
		assertEquals(test, des.getFirstName());
	}

	@Test
	public void testGetFirstName3() {
		DestinationDTO des = new DestinationDTO();
		String test = "abc123あいう１２３漢字";
		des.setFirstName(test);
		assertEquals(test, des.getFirstName());
	}

	@Test
	public void testGetFirstName4() {
		DestinationDTO des = new DestinationDTO();
		String test = null;
		des.setFirstName(test);
		assertEquals(test, des.getFirstName());
	}

	@Test
	public void testGetFirstName5() {
		DestinationDTO des = new DestinationDTO();
		String test = "";
		des.setFirstName(test);
		assertEquals(test, des.getFirstName());
	}

	@Test
	public void testGetFirstName6() {
		DestinationDTO des = new DestinationDTO();
		String test = " ";
		des.setFirstName(test);
		assertEquals(test, des.getFirstName());
	}

	@Test
	public void testGetFirstName7() {
		DestinationDTO des = new DestinationDTO();
		String test = "  ";
		des.setFirstName(test);
		assertEquals(test, des.getFirstName());
	}

	@Test
	public void testSetFirstName() {
		DestinationDTO des = new DestinationDTO();
		String test = "abc123";
		des.setFirstName(test);
		String result = des.getFirstName();
		assertEquals(test, result);
	}

	@Test
	public void testSetFirstName2() {
		DestinationDTO des = new DestinationDTO();
		String test = "あいう１２３";
		des.setFirstName(test);
		String result = des.getFirstName();
		assertEquals(test, result);
	}

	@Test
	public void testSetFirstName3() {
		DestinationDTO des = new DestinationDTO();
		String test = "abc123あいう１２３漢字";
		des.setFirstName(test);
		String result = des.getFirstName();
		assertEquals(test, result);
	}

	@Test
	public void testSetFirstName4() {
		DestinationDTO des = new DestinationDTO();
		String test = null;
		des.setFirstName(test);
		String result = des.getFirstName();
		assertEquals(test, result);
	}

	@Test
	public void testSetFirstName5() {
		DestinationDTO des = new DestinationDTO();
		String test = "";
		des.setFirstName(test);
		String result = des.getFirstName();
		assertEquals(test, result);
	}

	@Test
	public void testSetFirstName6() {
		DestinationDTO des = new DestinationDTO();
		String test = " ";
		des.setFirstName(test);
		String result = des.getFirstName();
		assertEquals(test, result);
	}

	@Test
	public void testSetFirstName7() {
		DestinationDTO des = new DestinationDTO();
		String test = "  ";
		des.setFirstName(test);
		String result = des.getFirstName();
		assertEquals(test, result);
	}

	@Test
	public void testGetFamilyNameKana() {
		DestinationDTO des = new DestinationDTO();
		String test = "abc123";
		des.setFamilyNameKana(test);
		assertEquals(test, des.getFamilyNameKana());
	}

	@Test
	public void testGetFamilyNameKana2() {
		DestinationDTO des = new DestinationDTO();
		String test = "あいう１２３";
		des.setFamilyNameKana(test);
		assertEquals(test, des.getFamilyNameKana());
	}

	@Test
	public void testGetFamilyNameKana3() {
		DestinationDTO des = new DestinationDTO();
		String test = "abc123あいう１２３漢字";
		des.setFamilyNameKana(test);
		assertEquals(test, des.getFamilyNameKana());
	}

	@Test
	public void testGetFamilyNameKana4() {
		DestinationDTO des = new DestinationDTO();
		String test = null;
		des.setFamilyNameKana(test);
		assertEquals(test, des.getFamilyNameKana());
	}

	@Test
	public void testGetFamilyNameKana5() {
		DestinationDTO des = new DestinationDTO();
		String test = "";
		des.setFamilyNameKana(test);
		assertEquals(test, des.getFamilyNameKana());
	}

	@Test
	public void testGetFamilyNameKana6() {
		DestinationDTO des = new DestinationDTO();
		String test = " ";
		des.setFamilyNameKana(test);
		assertEquals(test, des.getFamilyNameKana());
	}

	@Test
	public void testGetFamilyNameKana7() {
		DestinationDTO des = new DestinationDTO();
		String test = "  ";
		des.setFamilyNameKana(test);
		assertEquals(test, des.getFamilyNameKana());
	}

	@Test
	public void testSetFamilyNameKana() {
		DestinationDTO des = new DestinationDTO();
		String test = "abc123";
		des.setFamilyNameKana(test);
		String result = des.getFamilyNameKana();
		assertEquals(test, result);
	}

	@Test
	public void testSetFamilyNameKana2() {
		DestinationDTO des = new DestinationDTO();
		String test = "あいう１２３";
		des.setFamilyNameKana(test);
		String result = des.getFamilyNameKana();
		assertEquals(test, result);
	}

	@Test
	public void testSetFamilyNameKana3() {
		DestinationDTO des = new DestinationDTO();
		String test = "abc123あいう１２３漢字";
		des.setFamilyNameKana(test);
		String result = des.getFamilyNameKana();
		assertEquals(test, result);
	}

	@Test
	public void testSetFamilyNameKana4() {
		DestinationDTO des = new DestinationDTO();
		String test = null;
		des.setFamilyNameKana(test);
		String result = des.getFamilyNameKana();
		assertEquals(test, result);
	}

	@Test
	public void testSetFamilyNameKana5() {
		DestinationDTO des = new DestinationDTO();
		String test = "";
		des.setFamilyNameKana(test);
		String result = des.getFamilyNameKana();
		assertEquals(test, result);
	}

	@Test
	public void testSetFamilyNameKana6() {
		DestinationDTO des = new DestinationDTO();
		String test = " ";
		des.setFamilyNameKana(test);
		String result = des.getFamilyNameKana();
		assertEquals(test, result);
	}

	@Test
	public void testSetFamilyNameKana7() {
		DestinationDTO des = new DestinationDTO();
		String test = "  ";
		des.setFamilyNameKana(test);
		String result = des.getFamilyNameKana();
		assertEquals(test, result);
	}

	@Test
	public void testGetFirstNameKana() {
		DestinationDTO des = new DestinationDTO();
		String test = "abc123";
		des.setFirstNameKana(test);
		assertEquals(test, des.getFirstNameKana());
	}

	@Test
	public void testGetFirstNameKana2() {
		DestinationDTO des = new DestinationDTO();
		String test = "あいう１２３";
		des.setFirstNameKana(test);
		assertEquals(test, des.getFirstNameKana());
	}

	@Test
	public void testGetFirstNameKana3() {
		DestinationDTO des = new DestinationDTO();
		String test = "abc123あいう１２３漢字";
		des.setFirstNameKana(test);
		assertEquals(test, des.getFirstNameKana());
	}

	@Test
	public void testGetFirstNameKana4() {
		DestinationDTO des = new DestinationDTO();
		String test = null;
		des.setFirstNameKana(test);
		assertEquals(test, des.getFirstNameKana());
	}

	@Test
	public void testGetFirstNameKana5() {
		DestinationDTO des = new DestinationDTO();
		String test = "";
		des.setFirstNameKana(test);
		assertEquals(test, des.getFirstNameKana());
	}

	@Test
	public void testGetFirstNameKana6() {
		DestinationDTO des = new DestinationDTO();
		String test = " ";
		des.setFirstNameKana(test);
		assertEquals(test, des.getFirstNameKana());
	}

	@Test
	public void testGetFirstNameKana7() {
		DestinationDTO des = new DestinationDTO();
		String test = "  ";
		des.setFirstNameKana(test);
		assertEquals(test, des.getFirstNameKana());
	}

	@Test
	public void testSetFirstNameKana() {
		DestinationDTO des = new DestinationDTO();
		String test = "abc123";
		des.setFirstNameKana(test);
		String result = des.getFirstNameKana();
		assertEquals(test, result);
	}

	@Test
	public void testSetFirstNameKana2() {
		DestinationDTO des = new DestinationDTO();
		String test = "あいう１２３";
		des.setFirstNameKana(test);
		String result = des.getFirstNameKana();
		assertEquals(test, result);
	}

	@Test
	public void testSetFirstNameKana3() {
		DestinationDTO des = new DestinationDTO();
		String test = "abc123あいう１２３漢字";
		des.setFirstNameKana(test);
		String result = des.getFirstNameKana();
		assertEquals(test, result);
	}

	@Test
	public void testSetFirstNameKana4() {
		DestinationDTO des = new DestinationDTO();
		String test = null;
		des.setFirstNameKana(test);
		String result = des.getFirstNameKana();
		assertEquals(test, result);
	}

	@Test
	public void testSetFirstNameKana5() {
		DestinationDTO des = new DestinationDTO();
		String test = "";
		des.setFirstNameKana(test);
		String result = des.getFirstNameKana();
		assertEquals(test, result);
	}

	@Test
	public void testSetFirstNameKana6() {
		DestinationDTO des = new DestinationDTO();
		String test = " ";
		des.setFirstNameKana(test);
		String result = des.getFirstNameKana();
		assertEquals(test, result);
	}

	@Test
	public void testSetFirstNameKana7() {
		DestinationDTO des = new DestinationDTO();
		String test = "  ";
		des.setFirstNameKana(test);
		String result = des.getFirstNameKana();
		assertEquals(test, result);
	}

	@Test
	public void testGetUserAddress() {
		DestinationDTO des = new DestinationDTO();
		String test = "abc123";
		des.setUserAddress(test);
		assertEquals(test, des.getUserAddress());
	}

	@Test
	public void testGetUserAddress2() {
		DestinationDTO des = new DestinationDTO();
		String test = "あいう１２３";
		des.setUserAddress(test);
		assertEquals(test, des.getUserAddress());
	}

	@Test
	public void testGetUserAddress3() {
		DestinationDTO des = new DestinationDTO();
		String test = "abc123あいう１２３漢字";
		des.setUserAddress(test);
		assertEquals(test, des.getUserAddress());
	}

	@Test
	public void testGetUserAddress4() {
		DestinationDTO des = new DestinationDTO();
		String test = null;
		des.setUserAddress(test);
		assertEquals(test, des.getUserAddress());
	}

	@Test
	public void testGetUserAddress5() {
		DestinationDTO des = new DestinationDTO();
		String test = "";
		des.setUserAddress(test);
		assertEquals(test, des.getUserAddress());
	}

	@Test
	public void testGetUserAddress6() {
		DestinationDTO des = new DestinationDTO();
		String test = " ";
		des.setUserAddress(test);
		assertEquals(test, des.getUserAddress());
	}

	@Test
	public void testGetUserAddress7() {
		DestinationDTO des = new DestinationDTO();
		String test = "  ";
		des.setUserAddress(test);
		assertEquals(test, des.getUserAddress());
	}

	@Test
	public void testSetUserAddress() {
		DestinationDTO des = new DestinationDTO();
		String test = "abc123";
		des.setUserAddress(test);
		String result = des.getUserAddress();
		assertEquals(test, result);
	}

	@Test
	public void testSetUserAddress2() {
		DestinationDTO des = new DestinationDTO();
		String test = "あいう１２３";
		des.setUserAddress(test);
		String result = des.getUserAddress();
		assertEquals(test, result);
	}

	@Test
	public void testSetUserAddress3() {
		DestinationDTO des = new DestinationDTO();
		String test = "abc123あいう１２３漢字";
		des.setUserAddress(test);
		String result = des.getUserAddress();
		assertEquals(test, result);
	}

	@Test
	public void testSetUserAddress4() {
		DestinationDTO des = new DestinationDTO();
		String test = null;
		des.setUserAddress(test);
		String result = des.getUserAddress();
		assertEquals(test, result);
	}

	@Test
	public void testSetUserAddress5() {
		DestinationDTO des = new DestinationDTO();
		String test = "";
		des.setUserAddress(test);
		String result = des.getUserAddress();
		assertEquals(test, result);
	}

	@Test
	public void testSetUserAddress6() {
		DestinationDTO des = new DestinationDTO();
		String test = " ";
		des.setUserAddress(test);
		String result = des.getUserAddress();
		assertEquals(test, result);
	}

	@Test
	public void testSetUserAddress7() {
		DestinationDTO des = new DestinationDTO();
		String test = "  ";
		des.setUserAddress(test);
		String result = des.getUserAddress();
		assertEquals(test, result);
	}

	@Test
	public void testGetTelNumber() {
		DestinationDTO des = new DestinationDTO();
		String test = "abc123";
		des.setTelNumber(test);
		assertEquals(test, des.getTelNumber());
	}

	@Test
	public void testGetTelNumber2() {
		DestinationDTO des = new DestinationDTO();
		String test = "あいう１２３";
		des.setTelNumber(test);
		assertEquals(test, des.getTelNumber());
	}

	@Test
	public void testGetTelNumber3() {
		DestinationDTO des = new DestinationDTO();
		String test = "abc123あいう１２３漢字";
		des.setTelNumber(test);
		assertEquals(test, des.getTelNumber());
	}

	@Test
	public void testGetTelNumber4() {
		DestinationDTO des = new DestinationDTO();
		String test = null;
		des.setTelNumber(test);
		assertEquals(test, des.getTelNumber());
	}

	@Test
	public void testGetTelNumber5() {
		DestinationDTO des = new DestinationDTO();
		String test = "";
		des.setTelNumber(test);
		assertEquals(test, des.getTelNumber());
	}

	@Test
	public void testGetTelNumber6() {
		DestinationDTO des = new DestinationDTO();
		String test = " ";
		des.setTelNumber(test);
		assertEquals(test, des.getTelNumber());
	}

	@Test
	public void testGetTelNumber7() {
		DestinationDTO des = new DestinationDTO();
		String test = "  ";
		des.setTelNumber(test);
		assertEquals(test, des.getTelNumber());
	}

	@Test
	public void testSetTelNumber() {
		DestinationDTO des = new DestinationDTO();
		String test = "abc123";
		des.setTelNumber(test);
		String result = des.getTelNumber();
		assertEquals(test, result);
	}

	@Test
	public void testSetTelNumber2() {
		DestinationDTO des = new DestinationDTO();
		String test = "あいう１２３";
		des.setTelNumber(test);
		String result = des.getTelNumber();
		assertEquals(test, result);
	}

	@Test
	public void testSetTelNumber3() {
		DestinationDTO des = new DestinationDTO();
		String test = "abc123あいう１２３漢字";
		des.setTelNumber(test);
		String result = des.getTelNumber();
		assertEquals(test, result);
	}

	@Test
	public void testSetTelNumber4() {
		DestinationDTO des = new DestinationDTO();
		String test = null;
		des.setTelNumber(test);
		String result = des.getTelNumber();
		assertEquals(test, result);
	}

	@Test
	public void testSetTelNumber5() {
		DestinationDTO des = new DestinationDTO();
		String test = "";
		des.setTelNumber(test);
		String result = des.getTelNumber();
		assertEquals(test, result);
	}

	@Test
	public void testSetTelNumber6() {
		DestinationDTO des = new DestinationDTO();
		String test = " ";
		des.setTelNumber(test);
		String result = des.getTelNumber();
		assertEquals(test, result);
	}

	@Test
	public void testSetTelNumber7() {
		DestinationDTO des = new DestinationDTO();
		String test = "  ";
		des.setTelNumber(test);
		String result = des.getTelNumber();
		assertEquals(test, result);
	}

	@Test
	public void testGetEmail() {
		DestinationDTO des = new DestinationDTO();
		String test = "abc123";
		des.setEmail(test);
		assertEquals(test, des.getEmail());
	}

	@Test
	public void testGetEmail2() {
		DestinationDTO des = new DestinationDTO();
		String test = "あいう１２３";
		des.setEmail(test);
		assertEquals(test, des.getEmail());
	}

	@Test
	public void testGetEmail3() {
		DestinationDTO des = new DestinationDTO();
		String test = "abc123あいう１２３漢字";
		des.setEmail(test);
		assertEquals(test, des.getEmail());
	}

	@Test
	public void testGetEmail4() {
		DestinationDTO des = new DestinationDTO();
		String test = null;
		des.setEmail(test);
		assertEquals(test, des.getEmail());
	}

	@Test
	public void testGetEmail5() {
		DestinationDTO des = new DestinationDTO();
		String test = "";
		des.setEmail(test);
		assertEquals(test, des.getEmail());
	}

	@Test
	public void testGetEmail6() {
		DestinationDTO des = new DestinationDTO();
		String test = " ";
		des.setEmail(test);
		assertEquals(test, des.getEmail());
	}

	@Test
	public void testGetEmail7() {
		DestinationDTO des = new DestinationDTO();
		String test = "  ";
		des.setEmail(test);
		assertEquals(test, des.getEmail());
	}

	@Test
	public void testSetEmail() {
		DestinationDTO des = new DestinationDTO();
		String test = "abc123";
		des.setEmail(test);
		String result = des.getEmail();
		assertEquals(test, result);
	}

	@Test
	public void testSetEmail2() {
		DestinationDTO des = new DestinationDTO();
		String test = "あいう１２３";
		des.setEmail(test);
		String result = des.getEmail();
		assertEquals(test, result);
	}

	@Test
	public void testSetEmail3() {
		DestinationDTO des = new DestinationDTO();
		String test = "abc123あいう１２３漢字";
		des.setEmail(test);
		String result = des.getEmail();
		assertEquals(test, result);
	}

	@Test
	public void testSetEmail4() {
		DestinationDTO des = new DestinationDTO();
		String test = null;
		des.setEmail(test);
		String result = des.getEmail();
		assertEquals(test, result);
	}

	@Test
	public void testSetEmail5() {
		DestinationDTO des = new DestinationDTO();
		String test = "";
		des.setEmail(test);
		String result = des.getEmail();
		assertEquals(test, result);
	}

	@Test
	public void testSetEmail6() {
		DestinationDTO des = new DestinationDTO();
		String test = " ";
		des.setEmail(test);
		String result = des.getEmail();
		assertEquals(test, result);
	}

	@Test
	public void testSetEmail7() {
		DestinationDTO des = new DestinationDTO();
		String test = "  ";
		des.setEmail(test);
		String result = des.getEmail();
		assertEquals(test, result);
	}

	@Test
	public void testGetMyAddressFlg() {
		DestinationDTO des = new DestinationDTO();
		String test = "abc123";
		des.setMyAddressFlg(test);
		assertEquals(test, des.getMyAddressFlg());
	}

	@Test
	public void testGetMyAddressFlg2() {
		DestinationDTO des = new DestinationDTO();
		String test = "あいう１２３";
		des.setMyAddressFlg(test);
		assertEquals(test, des.getMyAddressFlg());
	}

	@Test
	public void testGetMyAddressFlg3() {
		DestinationDTO des = new DestinationDTO();
		String test = "abc123あいう１２３漢字";
		des.setMyAddressFlg(test);
		assertEquals(test, des.getMyAddressFlg());
	}

	@Test
	public void testGetMyAddressFlg4() {
		DestinationDTO des = new DestinationDTO();
		String test = null;
		des.setMyAddressFlg(test);
		assertEquals(test, des.getMyAddressFlg());
	}

	@Test
	public void testGetMyAddressFlg5() {
		DestinationDTO des = new DestinationDTO();
		String test = "";
		des.setMyAddressFlg(test);
		assertEquals(test, des.getMyAddressFlg());
	}

	@Test
	public void testGetMyAddressFlg6() {
		DestinationDTO des = new DestinationDTO();
		String test = " ";
		des.setMyAddressFlg(test);
		assertEquals(test, des.getMyAddressFlg());
	}

	@Test
	public void testGetMyAddressFlg7() {
		DestinationDTO des = new DestinationDTO();
		String test = "  ";
		des.setMyAddressFlg(test);
		assertEquals(test, des.getMyAddressFlg());
	}

	@Test
	public void testSetMyAddressFlg() {
		DestinationDTO des = new DestinationDTO();
		String test = "abc123";
		des.setMyAddressFlg(test);
		String result = des.getMyAddressFlg();
		assertEquals(test, result);
	}

	@Test
	public void testSetMyAddressFlg2() {
		DestinationDTO des = new DestinationDTO();
		String test = "あいう１２３";
		des.setMyAddressFlg(test);
		String result = des.getMyAddressFlg();
		assertEquals(test, result);
	}

	@Test
	public void testSetMyAddressFlg3() {
		DestinationDTO des = new DestinationDTO();
		String test = "abc123あいう１２３漢字";
		des.setMyAddressFlg(test);
		String result = des.getMyAddressFlg();
		assertEquals(test, result);
	}

	@Test
	public void testSetMyAddressFlg4() {
		DestinationDTO des = new DestinationDTO();
		String test = null;
		des.setMyAddressFlg(test);
		String result = des.getMyAddressFlg();
		assertEquals(test, result);
	}

	@Test
	public void testSetMyAddressFlg5() {
		DestinationDTO des = new DestinationDTO();
		String test = "";
		des.setMyAddressFlg(test);
		String result = des.getMyAddressFlg();
		assertEquals(test, result);
	}

	@Test
	public void testSetMyAddressFlg6() {
		DestinationDTO des = new DestinationDTO();
		String test = " ";
		des.setMyAddressFlg(test);
		String result = des.getMyAddressFlg();
		assertEquals(test, result);
	}

	@Test
	public void testSetMyAddressFlg7() {
		DestinationDTO des = new DestinationDTO();
		String test = "  ";
		des.setMyAddressFlg(test);
		String result = des.getMyAddressFlg();
		assertEquals(test, result);
	}

	@Test
	public void testGetUpdateDate() {
		DestinationDTO des = new DestinationDTO();
		String test = "abc123";
		des.setUpdateDate(test);
		assertEquals(test, des.getUpdateDate());
	}

	@Test
	public void testGetUpdateDate2() {
		DestinationDTO des = new DestinationDTO();
		String test = "あいう１２３";
		des.setUpdateDate(test);
		assertEquals(test, des.getUpdateDate());
	}

	@Test
	public void testGetUpdateDate3() {
		DestinationDTO des = new DestinationDTO();
		String test = "abc123あいう１２３漢字";
		des.setUpdateDate(test);
		assertEquals(test, des.getUpdateDate());
	}

	@Test
	public void testGetUpdateDate4() {
		DestinationDTO des = new DestinationDTO();
		String test = null;
		des.setUpdateDate(test);
		assertEquals(test, des.getUpdateDate());
	}

	@Test
	public void testGetUpdateDate5() {
		DestinationDTO des = new DestinationDTO();
		String test = "";
		des.setUpdateDate(test);
		assertEquals(test, des.getUpdateDate());
	}

	@Test
	public void testGetUpdateDate6() {
		DestinationDTO des = new DestinationDTO();
		String test = " ";
		des.setUpdateDate(test);
		assertEquals(test, des.getUpdateDate());
	}

	@Test
	public void testGetUpdateDate7() {
		DestinationDTO des = new DestinationDTO();
		String test = "  ";
		des.setUpdateDate(test);
		assertEquals(test, des.getUpdateDate());
	}

	@Test
	public void testSetUpdateDate() {
		DestinationDTO des = new DestinationDTO();
		String test = "abc123";
		des.setUpdateDate(test);
		String result = des.getUpdateDate();
		assertEquals(test, result);
	}

	@Test
	public void testSetUpdateDate2() {
		DestinationDTO des = new DestinationDTO();
		String test = "あいう１２３";
		des.setUpdateDate(test);
		String result = des.getUpdateDate();
		assertEquals(test, result);
	}

	@Test
	public void testSetUpdateDate3() {
		DestinationDTO des = new DestinationDTO();
		String test = "abc123あいう１２３漢字";
		des.setUpdateDate(test);
		String result = des.getUpdateDate();
		assertEquals(test, result);
	}

	@Test
	public void testSetUpdateDate4() {
		DestinationDTO des = new DestinationDTO();
		String test = null;
		des.setUpdateDate(test);
		String result = des.getUpdateDate();
		assertEquals(test, result);
	}

	@Test
	public void testSetUpdateDate5() {
		DestinationDTO des = new DestinationDTO();
		String test = "";
		des.setUpdateDate(test);
		String result = des.getUpdateDate();
		assertEquals(test, result);
	}

	@Test
	public void testSetUpdateDate6() {
		DestinationDTO des = new DestinationDTO();
		String test = " ";
		des.setUpdateDate(test);
		String result = des.getUpdateDate();
		assertEquals(test, result);
	}
	@Test
	public void testSetUpdateDate7() {
		DestinationDTO des = new DestinationDTO();
		String test = "  ";
		des.setUpdateDate(test);
		String result = des.getUpdateDate();
		assertEquals(test, result);
	}

}
