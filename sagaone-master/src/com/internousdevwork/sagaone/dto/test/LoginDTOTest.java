package com.internousdevwork.sagaone.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdevwork.sagaone.dto.LoginDTO;

public class LoginDTOTest {

	@Test
	public void testGetLoginId() {
		LoginDTO log = new LoginDTO();
		String test = "abc123";
		log.setLoginId(test);
		assertEquals(test, log.getLoginId());
	}

	@Test
	public void testGetLoginId2() {
		LoginDTO log = new LoginDTO();
		String test = "あいう１２３";
		log.setLoginId(test);
		assertEquals(test, log.getLoginId());
	}

	@Test
	public void testGetLoginId3() {
		LoginDTO log = new LoginDTO();
		String test = "abc123あいう１２３漢字";
		log.setLoginId(test);
		assertEquals(test, log.getLoginId());
	}

	@Test
	public void testGetLoginId4() {
		LoginDTO log = new LoginDTO();
		String test = null;
		log.setLoginId(test);
		assertEquals(test, log.getLoginId());
	}

	@Test
	public void testGetLoginId5() {
		LoginDTO log = new LoginDTO();
		String test = "";
		log.setLoginId(test);
		assertEquals(test, log.getLoginId());
	}

	@Test
	public void testGetLoginId6() {
		LoginDTO log = new LoginDTO();
		String test = " ";
		log.setLoginId(test);
		assertEquals(test, log.getLoginId());
	}

	@Test
	public void testGetLoginId7() {
		LoginDTO log = new LoginDTO();
		String test = "  ";
		log.setLoginId(test);
		assertEquals(test, log.getLoginId());
	}

	@Test
	public void testSetLoginId() {
		LoginDTO log = new LoginDTO();
		String test = "abc123";
		log.setLoginId(test);
		String result = log.getLoginId();
		assertEquals(test, result);
	}

	@Test
	public void testSetLoginId2() {
		LoginDTO log = new LoginDTO();
		String test = "あいう１２３";
		log.setLoginId(test);
		String result = log.getLoginId();
		assertEquals(test, result);
	}

	@Test
	public void testSetLoginId3() {
		LoginDTO log = new LoginDTO();
		String test = "abc123あいう１２３漢字";
		log.setLoginId(test);
		String result = log.getLoginId();
		assertEquals(test, result);
	}

	@Test
	public void testSetLoginId4() {
		LoginDTO log = new LoginDTO();
		String test = null;
		log.setLoginId(test);
		String result = log.getLoginId();
		assertEquals(test, result);
	}
	@Test
	public void testSetLoginId5() {
		LoginDTO log = new LoginDTO();
		String test = "";
		log.setLoginId(test);
		String result = log.getLoginId();
		assertEquals(test, result);
	}

	@Test
	public void testSetLoginId6() {
		LoginDTO log = new LoginDTO();
		String test = " ";
		log.setLoginId(test);
		String result = log.getLoginId();
		assertEquals(test, result);
	}

	@Test
	public void testSetLoginId7() {
		LoginDTO log = new LoginDTO();
		String test = "  ";
		log.setLoginId(test);
		String result = log.getLoginId();
		assertEquals(test, result);
	}

	@Test
	public void testGetLoginPassword() {
		LoginDTO log = new LoginDTO();
		String test = "abc123";
		log.setLoginPassword(test);
		assertEquals(test, log.getLoginPassword());
	}

	@Test
	public void testGetLoginPassword2() {
		LoginDTO log = new LoginDTO();
		String test = "あいう１２３";
		log.setLoginPassword(test);
		assertEquals(test, log.getLoginPassword());
	}

	@Test
	public void testGetLoginPassword3() {
		LoginDTO log = new LoginDTO();
		String test = "abc123あいう１２３漢字";
		log.setLoginPassword(test);
		assertEquals(test, log.getLoginPassword());
	}

	@Test
	public void testGetLoginPassword4() {
		LoginDTO log = new LoginDTO();
		String test = null;
		log.setLoginPassword(test);
		assertEquals(test, log.getLoginPassword());
	}

	@Test
	public void testGetLoginPassword5() {
		LoginDTO log = new LoginDTO();
		String test = "";
		log.setLoginPassword(test);
		assertEquals(test, log.getLoginPassword());
	}

	@Test
	public void testGetLoginPassword6() {
		LoginDTO log = new LoginDTO();
		String test = " ";
		log.setLoginPassword(test);
		assertEquals(test, log.getLoginPassword());
	}

	@Test
	public void testGetLoginPassword7() {
		LoginDTO log = new LoginDTO();
		String test = "  ";
		log.setLoginPassword(test);
		assertEquals(test, log.getLoginPassword());
	}

	@Test
	public void testSetLoginPassword() {
		LoginDTO log = new LoginDTO();
		String test = "abc123";
		log.setLoginPassword(test);
		String result = log.getLoginPassword();
		assertEquals(test, result);
	}

	@Test
	public void testSetLoginPassword2() {
		LoginDTO log = new LoginDTO();
		String test = "あいう１２３";
		log.setLoginPassword(test);
		String result = log.getLoginPassword();
		assertEquals(test, result);
	}

	@Test
	public void testSetLoginPassword3() {
		LoginDTO log = new LoginDTO();
		String test = "abc123あいう１２３漢字";
		log.setLoginPassword(test);
		String result = log.getLoginPassword();
		assertEquals(test, result);
	}

	@Test
	public void testSetLoginPassword4() {
		LoginDTO log = new LoginDTO();
		String test = null;
		log.setLoginPassword(test);
		String result = log.getLoginPassword();
		assertEquals(test, result);
	}

	@Test
	public void testSetLoginPassword5() {
		LoginDTO log = new LoginDTO();
		String test = "";
		log.setLoginPassword(test);
		String result = log.getLoginPassword();
		assertEquals(test, result);
	}

	@Test
	public void testSetLoginPassword6() {
		LoginDTO log = new LoginDTO();
		String test = " ";
		log.setLoginPassword(test);
		String result = log.getLoginPassword();
		assertEquals(test, result);
	}

	@Test
	public void testSetLoginPassword7() {
		LoginDTO log = new LoginDTO();
		String test = "  ";
		log.setLoginPassword(test);
		String result = log.getLoginPassword();
		assertEquals(test, result);
	}

	@Test
	public void testGetLoginFlg() {
		LoginDTO log = new LoginDTO();
		boolean test = false;
		log.setLoginFlg(test);
		assertEquals(test, log.getLoginFlg());
	}

	@Test
	public void testGetLoginFlg2() {
		LoginDTO log = new LoginDTO();
		boolean test = true;
		log.setLoginFlg(test);
		assertEquals(test, log.getLoginFlg());
	}

	@Test
	public void testSetLoginFlg() {
		LoginDTO log = new LoginDTO();
		boolean test = false;
		log.setLoginFlg(test);
		boolean result = log.getLoginFlg();
		assertEquals(test, result);
	}

	@Test
	public void testSetLoginFlg2() {
		LoginDTO log = new LoginDTO();
		boolean test = true;
		log.setLoginFlg(test);
		boolean result = log.getLoginFlg();
		assertEquals(test, result);
	}

	@Test
	public void testGetLoginMemory() {
		LoginDTO log = new LoginDTO();
		String test = "abc123";
		log.setLoginMemory(test);
		assertEquals(test, log.getLoginMemory());
	}

	@Test
	public void testGetLoginMemory2() {
		LoginDTO log = new LoginDTO();
		String test = "あいう１２３";
		log.setLoginMemory(test);
		assertEquals(test, log.getLoginMemory());
	}

	@Test
	public void testGetLoginMemory3() {
		LoginDTO log = new LoginDTO();
		String test = "abc123あいう１２３漢字";
		log.setLoginMemory(test);
		assertEquals(test, log.getLoginMemory());
	}

	@Test
	public void testGetLoginMemory4() {
		LoginDTO log = new LoginDTO();
		String test = null;
		log.setLoginMemory(test);
		assertEquals(test, log.getLoginMemory());
	}

	@Test
	public void testGetLoginMemory5() {
		LoginDTO log = new LoginDTO();
		String test = "";
		log.setLoginMemory(test);
		assertEquals(test, log.getLoginMemory());
	}

	@Test
	public void testGetLoginMemory6() {
		LoginDTO log = new LoginDTO();
		String test = " ";
		log.setLoginMemory(test);
		assertEquals(test, log.getLoginMemory());
	}

	@Test
	public void testGetLoginMemory7() {
		LoginDTO log = new LoginDTO();
		String test = "  ";
		log.setLoginMemory(test);
		assertEquals(test, log.getLoginMemory());
	}

	@Test
	public void testSetLoginMemory() {
		LoginDTO log = new LoginDTO();
		String test = "abc123";
		log.setLoginMemory(test);
		String result = log.getLoginMemory();
		assertEquals(test, result);
	}

	@Test
	public void testSetLoginMemory2() {
		LoginDTO log = new LoginDTO();
		String test = "あいう１２３";
		log.setLoginMemory(test);
		String result = log.getLoginMemory();
		assertEquals(test, result);
	}

	@Test
	public void testSetLoginMemory3() {
		LoginDTO log = new LoginDTO();
		String test = "abc123あいう１２３漢字";
		log.setLoginMemory(test);
		String result = log.getLoginMemory();
		assertEquals(test, result);
	}

	@Test
	public void testSetLoginMemory4() {
		LoginDTO log = new LoginDTO();
		String test = null;
		log.setLoginMemory(test);
		String result = log.getLoginMemory();
		assertEquals(test, result);
	}

	@Test
	public void testSetLoginMemory5() {
		LoginDTO log = new LoginDTO();
		String test = "";
		log.setLoginMemory(test);
		String result = log.getLoginMemory();
		assertEquals(test, result);
	}

	@Test
	public void testSetLoginMemory6() {
		LoginDTO log = new LoginDTO();
		String test = " ";
		log.setLoginMemory(test);
		String result = log.getLoginMemory();
		assertEquals(test, result);
	}

	@Test
	public void testSetLoginMemory7() {
		LoginDTO log = new LoginDTO();
		String test = "  ";
		log.setLoginMemory(test);
		String result = log.getLoginMemory();
		assertEquals(test, result);
	}

}
