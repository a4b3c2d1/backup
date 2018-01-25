package com.internousdevwork.sagaone.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdevwork.sagaone.dto.MyPageDTO;

public class MyPageDTOTest {

	@Test
	public void testGetFamilyName() {
		MyPageDTO mypage = new MyPageDTO();
		String test = "abc123";
		mypage.setFamilyName(test);
		assertEquals(test, mypage.getFamilyName());
	}

	@Test
	public void testGetFamilyName2() {
		MyPageDTO mypage = new MyPageDTO();
		String test = "あいう１２３";
		mypage.setFamilyName(test);
		assertEquals(test, mypage.getFamilyName());
	}

	@Test
	public void testGetFamilyName3() {
		MyPageDTO mypage = new MyPageDTO();
		String test = "abc123あいう１２３漢字";
		mypage.setFamilyName(test);
		assertEquals(test, mypage.getFamilyName());
	}

	@Test
	public void testGetFamilyName4() {
		MyPageDTO mypage = new MyPageDTO();
		String test = null;
		mypage.setFamilyName(test);
		assertEquals(test, mypage.getFamilyName());
	}

	@Test
	public void testGetFamilyName5() {
		MyPageDTO mypage = new MyPageDTO();
		String test = "";
		mypage.setFamilyName(test);
		assertEquals(test, mypage.getFamilyName());
	}

	@Test
	public void testGetFamilyName6() {
		MyPageDTO mypage = new MyPageDTO();
		String test = " ";
		mypage.setFamilyName(test);
		assertEquals(test, mypage.getFamilyName());
	}

	@Test
	public void testGetFamilyName7() {
		MyPageDTO mypage = new MyPageDTO();
		String test = "  ";
		mypage.setFamilyName(test);
		assertEquals(test, mypage.getFamilyName());
	}

	@Test
	public void testSetFamilyName() {
		MyPageDTO mypage = new MyPageDTO();
		String test = "abc123";
		mypage.setFamilyName(test);
		String result = mypage.getFamilyName();
		assertEquals(test, result);
	}

	@Test
	public void testSetFamilyName2() {
		MyPageDTO mypage = new MyPageDTO();
		String test = "あいう１２３";
		mypage.setFamilyName(test);
		String result = mypage.getFamilyName();
		assertEquals(test, result);
	}

	@Test
	public void testSetFamilyName3() {
		MyPageDTO mypage = new MyPageDTO();
		String test = "abc123あいう１２３漢字";
		mypage.setFamilyName(test);
		String result = mypage.getFamilyName();
		assertEquals(test, result);
	}

	@Test
	public void testSetFamilyName4() {
		MyPageDTO mypage = new MyPageDTO();
		String test = null;
		mypage.setFamilyName(test);
		String result = mypage.getFamilyName();
		assertEquals(test, result);
	}

	@Test
	public void testSetFamilyName5() {
		MyPageDTO mypage = new MyPageDTO();
		String test = "";
		mypage.setFamilyName(test);
		String result = mypage.getFamilyName();
		assertEquals(test, result);
	}

	@Test
	public void testSetFamilyName6() {
		MyPageDTO mypage = new MyPageDTO();
		String test = " ";
		mypage.setFamilyName(test);
		String result = mypage.getFamilyName();
		assertEquals(test, result);
	}

	@Test
	public void testSetFamilyName7() {
		MyPageDTO mypage = new MyPageDTO();
		String test = "  ";
		mypage.setFamilyName(test);
		String result = mypage.getFamilyName();
		assertEquals(test, result);
	}

	@Test
	public void testGetFirstName() {
		MyPageDTO mypage = new MyPageDTO();
		String test = "abc123";
		mypage.setFirstName(test);
		assertEquals(test, mypage.getFirstName());
	}

	@Test
	public void testGetFirstName2() {
		MyPageDTO mypage = new MyPageDTO();
		String test = "あいう１２３";
		mypage.setFirstName(test);
		assertEquals(test, mypage.getFirstName());
	}

	@Test
	public void testGetFirstName3() {
		MyPageDTO mypage = new MyPageDTO();
		String test = "abc123あいう１２３漢字";
		mypage.setFirstName(test);
		assertEquals(test, mypage.getFirstName());
	}

	@Test
	public void testGetFirstName4() {
		MyPageDTO mypage = new MyPageDTO();
		String test = null;
		mypage.setFirstName(test);
		assertEquals(test, mypage.getFirstName());
	}

	@Test
	public void testGetFirstName5() {
		MyPageDTO mypage = new MyPageDTO();
		String test = "";
		mypage.setFirstName(test);
		assertEquals(test, mypage.getFirstName());
	}

	@Test
	public void testGetFirstName6() {
		MyPageDTO mypage = new MyPageDTO();
		String test = " ";
		mypage.setFirstName(test);
		assertEquals(test, mypage.getFirstName());
	}

	@Test
	public void testGetFirstName7() {
		MyPageDTO mypage = new MyPageDTO();
		String test = "  ";
		mypage.setFirstName(test);
		assertEquals(test, mypage.getFirstName());
	}

	@Test
	public void testSetFirstName() {
		MyPageDTO mypage = new MyPageDTO();
		String test = "abc123";
		mypage.setFirstName(test);
		String result = mypage.getFirstName();
		assertEquals(test, result);
	}

	@Test
	public void testSetFirstName2() {
		MyPageDTO mypage = new MyPageDTO();
		String test = "あいう１２３";
		mypage.setFirstName(test);
		String result = mypage.getFirstName();
		assertEquals(test, result);
	}

	@Test
	public void testSetFirstName3() {
		MyPageDTO mypage = new MyPageDTO();
		String test = "abc123あいう１２３漢字";
		mypage.setFirstName(test);
		String result = mypage.getFirstName();
		assertEquals(test, result);
	}

	@Test
	public void testSetFirstName4() {
		MyPageDTO mypage = new MyPageDTO();
		String test = null;
		mypage.setFirstName(test);
		String result = mypage.getFirstName();
		assertEquals(test, result);
	}

	@Test
	public void testSetFirstName5() {
		MyPageDTO mypage = new MyPageDTO();
		String test = "";
		mypage.setFirstName(test);
		String result = mypage.getFirstName();
		assertEquals(test, result);
	}

	@Test
	public void testSetFirstName6() {
		MyPageDTO mypage = new MyPageDTO();
		String test = " ";
		mypage.setFirstName(test);
		String result = mypage.getFirstName();
		assertEquals(test, result);
	}

	@Test
	public void testSetFirstName7() {
		MyPageDTO mypage = new MyPageDTO();
		String test = "  ";
		mypage.setFirstName(test);
		String result = mypage.getFirstName();
		assertEquals(test, result);
	}

	@Test
	public void testGetFamilyNameKana() {
		MyPageDTO mypage = new MyPageDTO();
		String test = "abc123";
		mypage.setFamilyNameKana(test);
		assertEquals(test, mypage.getFamilyNameKana());
	}

	@Test
	public void testGetFamilyNameKana2() {
		MyPageDTO mypage = new MyPageDTO();
		String test = "あいう１２３";
		mypage.setFamilyNameKana(test);
		assertEquals(test, mypage.getFamilyNameKana());
	}

	@Test
	public void testGetFamilyNameKana3() {
		MyPageDTO mypage = new MyPageDTO();
		String test = "abc123あいう１２３漢字";
		mypage.setFamilyNameKana(test);
		assertEquals(test, mypage.getFamilyNameKana());
	}

	@Test
	public void testGetFamilyNameKana4() {
		MyPageDTO mypage = new MyPageDTO();
		String test = null;
		mypage.setFamilyNameKana(test);
		assertEquals(test, mypage.getFamilyNameKana());
	}

	@Test
	public void testGetFamilyNameKana5() {
		MyPageDTO mypage = new MyPageDTO();
		String test = "";
		mypage.setFamilyNameKana(test);
		assertEquals(test, mypage.getFamilyNameKana());
	}

	@Test
	public void testGetFamilyNameKana6() {
		MyPageDTO mypage = new MyPageDTO();
		String test = " ";
		mypage.setFamilyNameKana(test);
		assertEquals(test, mypage.getFamilyNameKana());
	}

	@Test
	public void testGetFamilyNameKana7() {
		MyPageDTO mypage = new MyPageDTO();
		String test = "  ";
		mypage.setFamilyNameKana(test);
		assertEquals(test, mypage.getFamilyNameKana());
	}

	@Test
	public void testSetFamilyNameKana() {
		MyPageDTO mypage = new MyPageDTO();
		String test = "abc123";
		mypage.setFamilyNameKana(test);
		String result = mypage.getFamilyNameKana();
		assertEquals(test, result);
	}

	@Test
	public void testSetFamilyNameKana2() {
		MyPageDTO mypage = new MyPageDTO();
		String test = "あいう１２３";
		mypage.setFamilyNameKana(test);
		String result = mypage.getFamilyNameKana();
		assertEquals(test, result);
	}

	@Test
	public void testSetFamilyNameKana3() {
		MyPageDTO mypage = new MyPageDTO();
		String test = "abc123あいう１２３漢字";
		mypage.setFamilyNameKana(test);
		String result = mypage.getFamilyNameKana();
		assertEquals(test, result);
	}

	@Test
	public void testSetFamilyNameKana4() {
		MyPageDTO mypage = new MyPageDTO();
		String test = null;
		mypage.setFamilyNameKana(test);
		String result = mypage.getFamilyNameKana();
		assertEquals(test, result);
	}

	@Test
	public void testSetFamilyNameKana5() {
		MyPageDTO mypage = new MyPageDTO();
		String test = "";
		mypage.setFamilyNameKana(test);
		String result = mypage.getFamilyNameKana();
		assertEquals(test, result);
	}

	@Test
	public void testSetFamilyNameKana6() {
		MyPageDTO mypage = new MyPageDTO();
		String test = " ";
		mypage.setFamilyNameKana(test);
		String result = mypage.getFamilyNameKana();
		assertEquals(test, result);
	}

	@Test
	public void testSetFamilyNameKana7() {
		MyPageDTO mypage = new MyPageDTO();
		String test = "  ";
		mypage.setFamilyNameKana(test);
		String result = mypage.getFamilyNameKana();
		assertEquals(test, result);
	}

	@Test
	public void testGetFirstNameKana() {
		MyPageDTO mypage = new MyPageDTO();
		String test = "abc123";
		mypage.setFirstNameKana(test);
		assertEquals(test, mypage.getFirstNameKana());
	}

	@Test
	public void testGetFirstNameKana2() {
		MyPageDTO mypage = new MyPageDTO();
		String test = "あいう１２３";
		mypage.setFirstNameKana(test);
		assertEquals(test, mypage.getFirstNameKana());
	}

	@Test
	public void testGetFirstNameKana3() {
		MyPageDTO mypage = new MyPageDTO();
		String test = "abc123あいう１２３漢字";
		mypage.setFirstNameKana(test);
		assertEquals(test, mypage.getFirstNameKana());
	}

	@Test
	public void testGetFirstNameKana4() {
		MyPageDTO mypage = new MyPageDTO();
		String test = null;
		mypage.setFirstNameKana(test);
		assertEquals(test, mypage.getFirstNameKana());
	}

	@Test
	public void testGetFirstNameKana5() {
		MyPageDTO mypage = new MyPageDTO();
		String test = "";
		mypage.setFirstNameKana(test);
		assertEquals(test, mypage.getFirstNameKana());
	}

	@Test
	public void testGetFirstNameKana6() {
		MyPageDTO mypage = new MyPageDTO();
		String test = " ";
		mypage.setFirstNameKana(test);
		assertEquals(test, mypage.getFirstNameKana());
	}

	@Test
	public void testGetFirstNameKana7() {
		MyPageDTO mypage = new MyPageDTO();
		String test = "  ";
		mypage.setFirstNameKana(test);
		assertEquals(test, mypage.getFirstNameKana());
	}

	@Test
	public void testSetFirstNameKana() {
		MyPageDTO mypage = new MyPageDTO();
		String test = "abc123";
		mypage.setFirstNameKana(test);
		String result = mypage.getFirstNameKana();
		assertEquals(test, result);
	}

	@Test
	public void testSetFirstNameKana2() {
		MyPageDTO mypage = new MyPageDTO();
		String test = "あいう１２３";
		mypage.setFirstNameKana(test);
		String result = mypage.getFirstNameKana();
		assertEquals(test, result);
	}

	@Test
	public void testSetFirstNameKana3() {
		MyPageDTO mypage = new MyPageDTO();
		String test = "abc123あいう１２３漢字";
		mypage.setFirstNameKana(test);
		String result = mypage.getFirstNameKana();
		assertEquals(test, result);
	}

	@Test
	public void testSetFirstNameKana4() {
		MyPageDTO mypage = new MyPageDTO();
		String test = null;
		mypage.setFirstNameKana(test);
		String result = mypage.getFirstNameKana();
		assertEquals(test, result);
	}

	@Test
	public void testSetFirstNameKana5() {
		MyPageDTO mypage = new MyPageDTO();
		String test = "";
		mypage.setFirstNameKana(test);
		String result = mypage.getFirstNameKana();
		assertEquals(test, result);
	}

	@Test
	public void testSetFirstNameKana6() {
		MyPageDTO mypage = new MyPageDTO();
		String test = " ";
		mypage.setFirstNameKana(test);
		String result = mypage.getFirstNameKana();
		assertEquals(test, result);
	}

	@Test
	public void testSetFirstNameKana7() {
		MyPageDTO mypage = new MyPageDTO();
		String test = "  ";
		mypage.setFirstNameKana(test);
		String result = mypage.getFirstNameKana();
		assertEquals(test, result);
	}

	@Test
	public void testGetSex() {
		MyPageDTO mypage = new MyPageDTO();
		int test = 123;
		mypage.setSex(test);
		assertEquals(test, mypage.getSex());
	}

	@Test
	public void testGetSex2() {
		MyPageDTO mypage = new MyPageDTO();
		int test = 2147483647;
		mypage.setSex(test);
		assertEquals(test, mypage.getSex());
	}

	@Test
	public void testGetSex3() {
		MyPageDTO mypage = new MyPageDTO();
		int test = -2147483647;
		mypage.setSex(test);
		assertEquals(test, mypage.getSex());
	}

	@Test
	public void testGetSex4() {
		MyPageDTO mypage = new MyPageDTO();
		int test = 0;
		mypage.setSex(test);
		assertEquals(test, mypage.getSex());
	}

	@Test
	public void testGetSex5() {
		MyPageDTO mypage = new MyPageDTO();
		try{
			int test = Integer.parseInt("2147483647");
			mypage.setSex(test);
		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input String: \"2147483647\"");
		}
	}

	@Test
	public void testGetSex6() {
		MyPageDTO mypage = new MyPageDTO();
		try{
			int test = Integer.parseInt("-2147483647");
			mypage.setSex(test);
		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input String: \"-2147483647\"");
		}
	}

	@Test
	public void testSetSex() {
		MyPageDTO mypage = new MyPageDTO();
		int test = 123;
		mypage.setSex(test);
		int result = mypage.getSex();
		assertEquals(test, result);
	}

	@Test
	public void testSetSex2() {
		MyPageDTO mypage = new MyPageDTO();
		int test = 2147483647;
		mypage.setSex(test);
		int result = mypage.getSex();
		assertEquals(test, result);
	}

	@Test
	public void testSetSex3() {
		MyPageDTO mypage = new MyPageDTO();
		int test = -2147483647;
		mypage.setSex(test);
		int result = mypage.getSex();
		assertEquals(test, result);
	}

	@Test
	public void testSetSex4() {
		MyPageDTO mypage = new MyPageDTO();
		int test = 0;
		mypage.setSex(test);
		int result = mypage.getSex();
		assertEquals(test, result);
	}

	@Test
	public void testSetSex5() {
		MyPageDTO mypage = new MyPageDTO();
		try{
			int test = Integer.parseInt("2147483647");
			mypage.setSex(test);
		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input String: \"2147483647\"");
		}
	}

	@Test
	public void testSetSex6() {
		MyPageDTO mypage = new MyPageDTO();
		try{
			int test = Integer.parseInt("-2147483647");
			mypage.setSex(test);
		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input String: \"-2147483647\"");
		}
	}

	@Test
	public void testGetEmail() {
		MyPageDTO mypage = new MyPageDTO();
		String test = "abc123";
		mypage.setEmail(test);
		assertEquals(test, mypage.getEmail());
	}

	@Test
	public void testGetEmail2() {
		MyPageDTO mypage = new MyPageDTO();
		String test = "あいう１２３";
		mypage.setEmail(test);
		assertEquals(test, mypage.getEmail());
	}

	@Test
	public void testGetEmail3() {
		MyPageDTO mypage = new MyPageDTO();
		String test = "abc123あいう１２３漢字";
		mypage.setEmail(test);
		assertEquals(test, mypage.getEmail());
	}

	@Test
	public void testGetEmail4() {
		MyPageDTO mypage = new MyPageDTO();
		String test = null;
		mypage.setEmail(test);
		assertEquals(test, mypage.getEmail());
	}

	@Test
	public void testGetEmail5() {
		MyPageDTO mypage = new MyPageDTO();
		String test = "";
		mypage.setEmail(test);
		assertEquals(test, mypage.getEmail());
	}

	@Test
	public void testGetEmail6() {
		MyPageDTO mypage = new MyPageDTO();
		String test = " ";
		mypage.setEmail(test);
		assertEquals(test, mypage.getEmail());
	}

	@Test
	public void testGetEmail7() {
		MyPageDTO mypage = new MyPageDTO();
		String test = "  ";
		mypage.setEmail(test);
		assertEquals(test, mypage.getEmail());
	}

	@Test
	public void testSetEmail() {
		MyPageDTO mypage = new MyPageDTO();
		String test = "abc123";
		mypage.setEmail(test);
		String result = mypage.getEmail();
		assertEquals(test, result);
	}

	@Test
	public void testSetEmail2() {
		MyPageDTO mypage = new MyPageDTO();
		String test = "あいう１２３";
		mypage.setEmail(test);
		String result = mypage.getEmail();
		assertEquals(test, result);
	}

	@Test
	public void testSetEmail3() {
		MyPageDTO mypage = new MyPageDTO();
		String test = "abc123あいう１２３漢字";
		mypage.setEmail(test);
		String result = mypage.getEmail();
		assertEquals(test, result);
	}

	@Test
	public void testSetEmail4() {
		MyPageDTO mypage = new MyPageDTO();
		String test = null;
		mypage.setEmail(test);
		String result = mypage.getEmail();
		assertEquals(test, result);
	}

	@Test
	public void testSetEmail5() {
		MyPageDTO mypage = new MyPageDTO();
		String test = "";
		mypage.setEmail(test);
		String result = mypage.getEmail();
		assertEquals(test, result);
	}

	@Test
	public void testSetEmail6() {
		MyPageDTO mypage = new MyPageDTO();
		String test = " ";
		mypage.setEmail(test);
		String result = mypage.getEmail();
		assertEquals(test, result);
	}

	@Test
	public void testSetEmail7() {
		MyPageDTO mypage = new MyPageDTO();
		String test = "  ";
		mypage.setEmail(test);
		String result = mypage.getEmail();
		assertEquals(test, result);
	}

	private void assertThat(String message, String String){
		assertEquals(message,String);
	}

}
