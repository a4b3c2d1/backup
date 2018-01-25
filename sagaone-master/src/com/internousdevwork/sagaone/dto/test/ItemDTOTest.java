package com.internousdevwork.sagaone.dto.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.internousdevwork.sagaone.dto.ItemDTO;

public class ItemDTOTest {

	@Test
	public void testGetId() {
		ItemDTO item = new ItemDTO();
		int test = 123;
		item.setId(test);
		assertEquals(test, item.getId());
	}

	@Test
	public void testGetId2() {
		ItemDTO item = new ItemDTO();
		int test = 2147483647;
		item.setId(test);
		assertEquals(test, item.getId());
	}

	@Test
	public void testGetId3() {
		ItemDTO item = new ItemDTO();
		int test = -2147483647;
		item.setId(test);
		assertEquals(test, item.getId());
	}

	@Test
	public void testGetId4() {
		ItemDTO item = new ItemDTO();
		int test = 0;
		item.setId(test);
		assertEquals(test, item.getId());
	}

	@Test
	public void testGetId5() {
		ItemDTO item = new ItemDTO();
		try{
			int test = Integer.parseInt("2147483647");
			item.setId(test);
		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input String: \"2147483647\"");
		}
	}

	@Test
	public void testGetId6() {
		ItemDTO item = new ItemDTO();
		try{
			int test = Integer.parseInt("-2147483647");
			item.setId(test);
		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input String: \"-2147483647\"");
		}
	}

	@Test
	public void testSetId() {
		ItemDTO item = new ItemDTO();
		int test = 123;
		item.setId(test);
		int result = item.getId();
		assertEquals(test, result);
	}

	@Test
	public void testSetId2() {
		ItemDTO item = new ItemDTO();
		int test = 2147483647;
		item.setId(test);
		int result = item.getId();
		assertEquals(test, result);
	}

	@Test
	public void testSetId3() {
		ItemDTO item = new ItemDTO();
		int test = -2147483647;
		item.setId(test);
		int result = item.getId();
		assertEquals(test, result);
	}

	@Test
	public void testSetId4() {
		ItemDTO item = new ItemDTO();
		int test = 0;
		item.setId(test);
		int result = item.getId();
		assertEquals(test, result);
	}

	@Test
	public void testSetId5() {
		ItemDTO item = new ItemDTO();
		try{
			int test = Integer.parseInt("2147483647");
			item.setId(test);
		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input String: \"2147483647\"");
		}
	}

	@Test
	public void testSetId6() {
		ItemDTO item = new ItemDTO();
		try{
			int test = Integer.parseInt("-2147483647");
			item.setId(test);
		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input String: \"2147483647\"");
		}
	}

	@Test
	public void testGetProduct_id() {
		ItemDTO item = new ItemDTO();
		int test = 123;
		item.setProductId(test);
		assertEquals(test, item.getProductId());
	}

	@Test
	public void testGetProduct_id2() {
		ItemDTO item = new ItemDTO();
		int test = 2147483647;
		item.setProductId(test);
		assertEquals(test, item.getProductId());
	}

	@Test
	public void testGetProduct_id3() {
		ItemDTO item = new ItemDTO();
		int test = -2147483647;
		item.setProductId(test);
		assertEquals(test, item.getProductId());
	}

	@Test
	public void testGetProduct_id4() {
		ItemDTO item = new ItemDTO();
		int test = 0;
		item.setProductId(test);
		assertEquals(test, item.getProductId());
	}

	@Test
	public void testGetProduct_id5() {
		ItemDTO item = new ItemDTO();
		try{
			int test = Integer.parseInt("2147483647");
			item.setProductId(test);
		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input String: \"2147483647\"");
		}
	}

	@Test
	public void testGetProduct_id6() {
		ItemDTO item = new ItemDTO();
		try{
			int test = Integer.parseInt("-2147483647");
			item.setProductId(test);
		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input String: \"-2147483647\"");
		}
	}

	@Test
	public void testSetProduct_id() {
		ItemDTO item = new ItemDTO();
		int test = 123;
		item.setProductId(test);
		int result = item.getProductId();
		assertEquals(test, result);
	}

	@Test
	public void testSetProduct_id2() {
		ItemDTO item = new ItemDTO();
		int test = 2147483647;
		item.setProductId(test);
		int result = item.getProductId();
		assertEquals(test, result);
	}

	@Test
	public void testSetProduct_id3() {
		ItemDTO item = new ItemDTO();
		int test = -2147483647;
		item.setProductId(test);
		int result = item.getProductId();
		assertEquals(test, result);
	}

	@Test
	public void testSetProduct_id4() {
		ItemDTO item = new ItemDTO();
		int test = 0;
		item.setProductId(test);
		int result = item.getProductId();
		assertEquals(test, result);
	}

	@Test
	public void testSetProduct_id5() {
		ItemDTO item = new ItemDTO();
		try{
			int test = Integer.parseInt("2147483647");
			item.setProductId(test);
		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input String: \"2147483647\"");
		}
	}

	@Test
	public void testSetProduct_id6() {
		ItemDTO item = new ItemDTO();
		try{
			int test = Integer.parseInt("-2147483647");
			item.setProductId(test);
		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input String: \"-2147483647\"");
		}
	}

	@Test
	public void testGetProduct_name() {
		ItemDTO item = new ItemDTO();
		String test = "abc123";
		item.setProductName(test);
		assertEquals(test, item.getProductName());
	}

	@Test
	public void testGetProduct_name2() {
		ItemDTO item = new ItemDTO();
		String test = "あいう１２３";
		item.setProductName(test);
		assertEquals(test, item.getProductName());
	}

	@Test
	public void testGetProduct_name3() {
		ItemDTO item = new ItemDTO();
		String test = "abc123あいう１２３漢字";
		item.setProductName(test);
		assertEquals(test, item.getProductName());
	}

	@Test
	public void testGetProduct_name4() {
		ItemDTO item = new ItemDTO();
		String test = null;
		item.setProductName(test);
		assertEquals(test, item.getProductName());
	}

	@Test
	public void testGetProduct_name5() {
		ItemDTO item = new ItemDTO();
		String test = "";
		item.setProductName(test);
		assertEquals(test, item.getProductName());
	}

	@Test
	public void testGetProduct_name6() {
		ItemDTO item = new ItemDTO();
		String test = " ";
		item.setProductName(test);
		assertEquals(test, item.getProductName());
	}

	@Test
	public void testGetProduct_name7() {
		ItemDTO item = new ItemDTO();
		String test = "  ";
		item.setProductName(test);
		assertEquals(test, item.getProductName());
	}

	@Test
	public void testSetProduct_name() {
		ItemDTO item = new ItemDTO();
		String test = "abc123";
		item.setProductName(test);
		String result = item.getProductName();
		assertEquals(test, result);
	}

	@Test
	public void testSetProduct_name2() {
		ItemDTO item = new ItemDTO();
		String test = "あいう１２３";
		item.setProductName(test);
		String result = item.getProductName();
		assertEquals(test, result);
	}

	@Test
	public void testSetProduct_name3() {
		ItemDTO item = new ItemDTO();
		String test = "abc123あいう１２３漢字";
		item.setProductName(test);
		String result = item.getProductName();
		assertEquals(test, result);
	}

	@Test
	public void testSetProduct_name4() {
		ItemDTO item = new ItemDTO();
		String test = null;
		item.setProductName(test);
		String result = item.getProductName();
		assertEquals(test, result);
	}

	@Test
	public void testSetProduct_name5() {
		ItemDTO item = new ItemDTO();
		String test = "";
		item.setProductName(test);
		String result = item.getProductName();
		assertEquals(test, result);
	}

	@Test
	public void testSetProduct_name6() {
		ItemDTO item = new ItemDTO();
		String test = " ";
		item.setProductName(test);
		String result = item.getProductName();
		assertEquals(test, result);
	}

	@Test
	public void testSetProduct_name7() {
		ItemDTO item = new ItemDTO();
		String test = "  ";
		item.setProductName(test);
		String result = item.getProductName();
		assertEquals(test, result);
	}

	@Test
	public void testGetProduct_name_kana() {
		ItemDTO item = new ItemDTO();
		String test = "abc123";
		item.setProductNameKana(test);
		assertEquals(test, item.getProductNameKana());
	}

	@Test
	public void testGetProduct_name_kana2() {
		ItemDTO item = new ItemDTO();
		String test = "あいう１２３";
		item.setProductNameKana(test);
		assertEquals(test, item.getProductNameKana());
	}

	@Test
	public void testGetProduct_name_kana3() {
		ItemDTO item = new ItemDTO();
		String test = "abc123あいう１２３漢字";
		item.setProductNameKana(test);
		assertEquals(test, item.getProductNameKana());
	}

	@Test
	public void testGetProduct_name_kana4() {
		ItemDTO item = new ItemDTO();
		String test = null;
		item.setProductNameKana(test);
		assertEquals(test, item.getProductNameKana());
	}

	@Test
	public void testGetProduct_name_kana5() {
		ItemDTO item = new ItemDTO();
		String test = "";
		item.setProductNameKana(test);
		assertEquals(test, item.getProductNameKana());
	}

	@Test
	public void testGetProduct_name_kana6() {
		ItemDTO item = new ItemDTO();
		String test = " ";
		item.setProductNameKana(test);
		assertEquals(test, item.getProductNameKana());
	}

	@Test
	public void testGetProduct_name_kana7() {
		ItemDTO item = new ItemDTO();
		String test = "  ";
		item.setProductNameKana(test);
		assertEquals(test, item.getProductNameKana());
	}

	@Test
	public void testSetProduct_name_kana() {
		ItemDTO item = new ItemDTO();
		String test = "abc123";
		item.setProductNameKana(test);
		String result = item.getProductNameKana();
		assertEquals(test, result);
	}

	@Test
	public void testSetProduct_name_kana2() {
		ItemDTO item = new ItemDTO();
		String test = "あいう１２３";
		item.setProductNameKana(test);
		String result = item.getProductNameKana();
		assertEquals(test, result);
	}

	@Test
	public void testSetProduct_name_kana3() {
		ItemDTO item = new ItemDTO();
		String test = "abc123あいう１２３漢字";
		item.setProductNameKana(test);
		String result = item.getProductNameKana();
		assertEquals(test, result);
	}

	@Test
	public void testSetProduct_name_kana4() {
		ItemDTO item = new ItemDTO();
		String test = null;
		item.setProductNameKana(test);
		String result = item.getProductNameKana();
		assertEquals(test, result);
	}

	@Test
	public void testSetProduct_name_kana5() {
		ItemDTO item = new ItemDTO();
		String test = "";
		item.setProductNameKana(test);
		String result = item.getProductNameKana();
		assertEquals(test, result);
	}

	@Test
	public void testSetProduct_name_kana6() {
		ItemDTO item = new ItemDTO();
		String test = " ";
		item.setProductNameKana(test);
		String result = item.getProductNameKana();
		assertEquals(test, result);
	}

	@Test
	public void testSetProduct_name_kana7() {
		ItemDTO item = new ItemDTO();
		String test = "  ";
		item.setProductNameKana(test);
		String result = item.getProductNameKana();
		assertEquals(test, result);
	}

	@Test
	public void testGetProduct_description() {
		ItemDTO item = new ItemDTO();
		String test = "abc123";
		item.setProductDescription(test);
		assertEquals(test, item.getProductDescription());
	}

	@Test
	public void testGetProduct_description2() {
		ItemDTO item = new ItemDTO();
		String test = "あいう１２３";
		item.setProductDescription(test);
		assertEquals(test, item.getProductDescription());
	}

	@Test
	public void testGetProduct_description3() {
		ItemDTO item = new ItemDTO();
		String test = "abc123あいう１２３漢字";
		item.setProductDescription(test);
		assertEquals(test, item.getProductDescription());
	}

	@Test
	public void testGetProduct_description4() {
		ItemDTO item = new ItemDTO();
		String test = null;
		item.setProductDescription(test);
		assertEquals(test, item.getProductDescription());
	}

	@Test
	public void testGetProduct_description5() {
		ItemDTO item = new ItemDTO();
		String test = "";
		item.setProductDescription(test);
		assertEquals(test, item.getProductDescription());
	}

	@Test
	public void testGetProduct_description6() {
		ItemDTO item = new ItemDTO();
		String test = " ";
		item.setProductDescription(test);
		assertEquals(test, item.getProductDescription());
	}

	@Test
	public void testGetProduct_description7() {
		ItemDTO item = new ItemDTO();
		String test = "  ";
		item.setProductDescription(test);
		assertEquals(test, item.getProductDescription());
	}

	@Test
	public void testSetProduct_description() {
		ItemDTO item = new ItemDTO();
		String test = "abc123";
		item.setProductDescription(test);
		String result = item.getProductDescription();
		assertEquals(test, result);
	}

	@Test
	public void testSetProduct_description2() {
		ItemDTO item = new ItemDTO();
		String test = "あいう１２３";
		item.setProductDescription(test);
		String result = item.getProductDescription();
		assertEquals(test, result);
	}

	@Test
	public void testSetProduct_description3() {
		ItemDTO item = new ItemDTO();
		String test = "abc123あいう１２３漢字";
		item.setProductDescription(test);
		String result = item.getProductDescription();
		assertEquals(test, result);
	}

	@Test
	public void testSetProduct_description4() {
		ItemDTO item = new ItemDTO();
		String test = null;
		item.setProductDescription(test);
		String result = item.getProductDescription();
		assertEquals(test, result);
	}

	@Test
	public void testSetProduct_description5() {
		ItemDTO item = new ItemDTO();
		String test = "";
		item.setProductDescription(test);
		String result = item.getProductDescription();
		assertEquals(test, result);
	}

	@Test
	public void testSetProduct_description6() {
		ItemDTO item = new ItemDTO();
		String test = " ";
		item.setProductDescription(test);
		String result = item.getProductDescription();
		assertEquals(test, result);
	}

	@Test
	public void testSetProduct_description7() {
		ItemDTO item = new ItemDTO();
		String test = "  ";
		item.setProductDescription(test);
		String result = item.getProductDescription();
		assertEquals(test, result);
	}

	@Test
	public void testGetCategory_id() {
		ItemDTO item = new ItemDTO();
		int test = 123;
		item.setCategoryId(test);
		assertEquals(test, item.getCategoryId());
	}

	@Test
	public void testGetCategory_id2() {
		ItemDTO item = new ItemDTO();
		int test = 2147483647;
		item.setCategoryId(test);
		assertEquals(test, item.getCategoryId());
	}

	@Test
	public void testGetCategory_id3() {
		ItemDTO item = new ItemDTO();
		int test = -2147483647;
		item.setCategoryId(test);
		assertEquals(test, item.getCategoryId());
	}

	@Test
	public void testGetCategory_id4() {
		ItemDTO item = new ItemDTO();
		int test = 0;
		item.setCategoryId(test);
		assertEquals(test, item.getCategoryId());
	}

	@Test
	public void testGetCategory_id5() {
		ItemDTO item = new ItemDTO();
		try{
			int test = Integer.parseInt("2147483647");
			item.setCategoryId(test);
		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input String: \"2147483647\"");
		}
	}

	@Test
	public void testGetCategory_id6() {
		ItemDTO item = new ItemDTO();
		try{
			int test = Integer.parseInt("-2147483647");
			item.setCategoryId(test);
		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input String: \"-2147483647\"");
		}
	}

	@Test
	public void testSetCategory_id() {
		ItemDTO item = new ItemDTO();
		int test = 123;
		item.setCategoryId(test);
		int result = item.getCategoryId();
		assertEquals(test, result);
	}

	@Test
	public void testSetCategory_id2() {
		ItemDTO item = new ItemDTO();
		int test = 2147483647;
		item.setCategoryId(test);
		int result = item.getCategoryId();
		assertEquals(test, result);
	}

	@Test
	public void testSetCategory_id3() {
		ItemDTO item = new ItemDTO();
		int test = -2147483647;
		item.setCategoryId(test);
		int result = item.getCategoryId();
		assertEquals(test, result);
	}

	@Test
	public void testSetCategory_id4() {
		ItemDTO item = new ItemDTO();
		int test = 0;
		item.setCategoryId(test);
		int result = item.getCategoryId();
		assertEquals(test, result);
	}

	@Test
	public void testSetCategory_id5() {
		ItemDTO item = new ItemDTO();
		try{
			int test = Integer.parseInt("2147483647");
			item.setCategoryId(test);
		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input String: \"2147483647\"");
		}
	}

	@Test
	public void testSetCategory_id6() {
		ItemDTO item = new ItemDTO();
		try{
			int test = Integer.parseInt("-2147483647");
			item.setCategoryId(test);
		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input String: \"-2147483647\"");
		}
	}

	@Test
	public void testGetPrice() {
		ItemDTO item = new ItemDTO();
		String test = "abc123";
		item.setPrice(test);
		assertEquals(test, item.getPrice());
	}

	@Test
	public void testGetPrice2() {
		ItemDTO item = new ItemDTO();
		String test = "あいう１２３";
		item.setPrice(test);
		assertEquals(test, item.getPrice());
	}

	@Test
	public void testGetPrice3() {
		ItemDTO item = new ItemDTO();
		String test = "abc123あいう１２３漢字";
		item.setPrice(test);
		assertEquals(test, item.getPrice());
	}

	@Test
	public void testGetPrice4() {
		ItemDTO item = new ItemDTO();
		String test = null;
		item.setPrice(test);
		assertEquals(test, item.getPrice());
	}

	@Test
	public void testGetPrice5() {
		ItemDTO item = new ItemDTO();
		String test = "";
		item.setPrice(test);
		assertEquals(test, item.getPrice());
	}

	@Test
	public void testGetPrice6() {
		ItemDTO item = new ItemDTO();
		String test = " ";
		item.setPrice(test);
		assertEquals(test, item.getPrice());
	}

	@Test
	public void testGetPrice7() {
		ItemDTO item = new ItemDTO();
		String test = "  ";
		item.setPrice(test);
		assertEquals(test, item.getPrice());
	}

	@Test
	public void testSetPrice() {
		ItemDTO item = new ItemDTO();
		String test = "abc123";
		item.setPrice(test);
		String result = item.getPrice();
		assertEquals(test, result);
	}

	@Test
	public void testSetPrice2() {
		ItemDTO item = new ItemDTO();
		String test = "あいう１２３";
		item.setPrice(test);
		String result = item.getPrice();
		assertEquals(test, result);
	}

	@Test
	public void testSetPrice3() {
		ItemDTO item = new ItemDTO();
		String test = "abc123あいう１２３漢字";
		item.setPrice(test);
		String result = item.getPrice();
		assertEquals(test, result);
	}

	@Test
	public void testSetPrice4() {
		ItemDTO item = new ItemDTO();
		String test = null;
		item.setPrice(test);
		String result = item.getPrice();
		assertEquals(test, result);
	}

	@Test
	public void testSetPrice5() {
		ItemDTO item = new ItemDTO();
		String test = "";
		item.setPrice(test);
		String result = item.getPrice();
		assertEquals(test, result);
	}

	@Test
	public void testSetPrice6() {
		ItemDTO item = new ItemDTO();
		String test = " ";
		item.setPrice(test);
		String result = item.getPrice();
		assertEquals(test, result);
	}

	@Test
	public void testSetPrice7() {
		ItemDTO item = new ItemDTO();
		String test = "  ";
		item.setPrice(test);
		String result = item.getPrice();
		assertEquals(test, result);
	}

	@Test
	public void testGetImage_file_path() {
		ItemDTO item = new ItemDTO();
		String test = "abc123";
		item.setImageFilePath(test);
		assertEquals(test, item.getImageFilePath());
	}

	@Test
	public void testGetImage_file_path2() {
		ItemDTO item = new ItemDTO();
		String test = "あいう１２３";
		item.setImageFilePath(test);
		assertEquals(test, item.getImageFilePath());
	}

	@Test
	public void testGetImage_file_path3() {
		ItemDTO item = new ItemDTO();
		String test = "abc123あいう１２３漢字";
		item.setImageFilePath(test);
		assertEquals(test, item.getImageFilePath());
	}

	@Test
	public void testGetImage_file_path4() {
		ItemDTO item = new ItemDTO();
		String test = null;
		item.setImageFilePath(test);
		assertEquals(test, item.getImageFilePath());
	}

	@Test
	public void testGetImage_file_path5() {
		ItemDTO item = new ItemDTO();
		String test = "";
		item.setImageFilePath(test);
		assertEquals(test, item.getImageFilePath());
	}

	@Test
	public void testGetImage_file_path6() {
		ItemDTO item = new ItemDTO();
		String test = " ";
		item.setImageFilePath(test);
		assertEquals(test, item.getImageFilePath());
	}

	@Test
	public void testGetImage_file_path7() {
		ItemDTO item = new ItemDTO();
		String test = "  ";
		item.setImageFilePath(test);
		assertEquals(test, item.getImageFilePath());
	}

	@Test
	public void testSetImage_file_path() {
		ItemDTO item = new ItemDTO();
		String test = "abc123";
		item.setImageFilePath(test);
		String result = item.getImageFilePath();
		assertEquals(test, result);
	}

	@Test
	public void testSetImage_file_path2() {
		ItemDTO item = new ItemDTO();
		String test = "あいう１２３";
		item.setImageFilePath(test);
		String result = item.getImageFilePath();
		assertEquals(test, result);
	}

	@Test
	public void testSetImage_file_path3() {
		ItemDTO item = new ItemDTO();
		String test = "abc123あいう１２３漢字";
		item.setImageFilePath(test);
		String result = item.getImageFilePath();
		assertEquals(test, result);
	}

	@Test
	public void testSetImage_file_path4() {
		ItemDTO item = new ItemDTO();
		String test = null;
		item.setImageFilePath(test);
		String result = item.getImageFilePath();
		assertEquals(test, result);
	}

	@Test
	public void testSetImage_file_path5() {
		ItemDTO item = new ItemDTO();
		String test = "";
		item.setImageFilePath(test);
		String result = item.getImageFilePath();
		assertEquals(test, result);
	}

	@Test
	public void testSetImage_file_path6() {
		ItemDTO item = new ItemDTO();
		String test = " ";
		item.setImageFilePath(test);
		String result = item.getImageFilePath();
		assertEquals(test, result);
	}

	@Test
	public void testSetImage_file_path7() {
		ItemDTO item = new ItemDTO();
		String test = "  ";
		item.setImageFilePath(test);
		String result = item.getImageFilePath();
		assertEquals(test, result);
	}

	@Test
	public void testGetImage_file_name() {
		ItemDTO item = new ItemDTO();
		String test = "abc123";
		item.setImageFileName(test);
		assertEquals(test, item.getImageFileName());
	}

	@Test
	public void testGetImage_file_name2() {
		ItemDTO item = new ItemDTO();
		String test = "あいう１２３";
		item.setImageFileName(test);
		assertEquals(test, item.getImageFileName());
	}

	@Test
	public void testGetImage_file_name3() {
		ItemDTO item = new ItemDTO();
		String test = "abc123あいう１２３漢字";
		item.setImageFileName(test);
		assertEquals(test, item.getImageFileName());
	}

	@Test
	public void testGetImage_file_name4() {
		ItemDTO item = new ItemDTO();
		String test = null;
		item.setImageFileName(test);
		assertEquals(test, item.getImageFileName());
	}

	@Test
	public void testGetImage_file_name5() {
		ItemDTO item = new ItemDTO();
		String test = "";
		item.setImageFileName(test);
		assertEquals(test, item.getImageFileName());
	}

	@Test
	public void testGetImage_file_name6() {
		ItemDTO item = new ItemDTO();
		String test = " ";
		item.setImageFileName(test);
		assertEquals(test, item.getImageFileName());
	}

	@Test
	public void testGetImage_file_name7() {
		ItemDTO item = new ItemDTO();
		String test = "  ";
		item.setImageFileName(test);
		assertEquals(test, item.getImageFileName());
	}

	@Test
	public void testSetImage_file_name() {
		ItemDTO item = new ItemDTO();
		String test = "abc123";
		item.setImageFileName(test);
		String result = item.getImageFileName();
		assertEquals(test, result);
	}

	@Test
	public void testSetImage_file_name2() {
		ItemDTO item = new ItemDTO();
		String test = "あいう１２３";
		item.setImageFileName(test);
		String result = item.getImageFileName();
		assertEquals(test, result);
	}

	@Test
	public void testSetImage_file_name3() {
		ItemDTO item = new ItemDTO();
		String test = "abc123あいう１２３漢字";
		item.setImageFileName(test);
		String result = item.getImageFileName();
		assertEquals(test, result);
	}

	@Test
	public void testSetImage_file_name4() {
		ItemDTO item = new ItemDTO();
		String test = null;
		item.setImageFileName(test);
		String result = item.getImageFileName();
		assertEquals(test, result);
	}

	@Test
	public void testSetImage_file_name5() {
		ItemDTO item = new ItemDTO();
		String test = "";
		item.setImageFileName(test);
		String result = item.getImageFileName();
		assertEquals(test, result);
	}

	@Test
	public void testSetImage_file_name6() {
		ItemDTO item = new ItemDTO();
		String test = " ";
		item.setImageFileName(test);
		String result = item.getImageFileName();
		assertEquals(test, result);
	}

	@Test
	public void testSetImage_file_name7() {
		ItemDTO item = new ItemDTO();
		String test = "  ";
		item.setImageFileName(test);
		String result = item.getImageFileName();
		assertEquals(test, result);
	}

	@Test
	public void testGetRelease_date() {
		ItemDTO item = new ItemDTO();
		String test = "abc123";
		item.setReleaseDate(test);
		assertEquals(test, item.getReleaseDate());
	}

	@Test
	public void testGetRelease_date2() {
		ItemDTO item = new ItemDTO();
		String test = "あいう１２３";
		item.setReleaseDate(test);
		assertEquals(test, item.getReleaseDate());
	}

	@Test
	public void testGetRelease_date3() {
		ItemDTO item = new ItemDTO();
		String test = "abc123あいう１２３漢字";
		item.setReleaseDate(test);
		assertEquals(test, item.getReleaseDate());
	}

	@Test
	public void testGetRelease_date4() {
		ItemDTO item = new ItemDTO();
		String test = null;
		item.setReleaseDate(test);
		assertEquals(test, item.getReleaseDate());
	}

	@Test
	public void testGetRelease_date5() {
		ItemDTO item = new ItemDTO();
		String test = "";
		item.setReleaseDate(test);
		assertEquals(test, item.getReleaseDate());
	}

	@Test
	public void testGetRelease_date6() {
		ItemDTO item = new ItemDTO();
		String test = " ";
		item.setReleaseDate(test);
		assertEquals(test, item.getReleaseDate());
	}

	@Test
	public void testGetRelease_date7() {
		ItemDTO item = new ItemDTO();
		String test = "  ";
		item.setReleaseDate(test);
		assertEquals(test, item.getReleaseDate());
	}

	@Test
	public void testSetRelease_date() {
		ItemDTO item = new ItemDTO();
		String test = "abc123";
		item.setReleaseDate(test);
		String result = item.getReleaseDate();
		assertEquals(test, result);
	}

	@Test
	public void testSetRelease_date2() {
		ItemDTO item = new ItemDTO();
		String test = "あいう１２３";
		item.setReleaseDate(test);
		String result = item.getReleaseDate();
		assertEquals(test, result);
	}

	@Test
	public void testSetRelease_date3() {
		ItemDTO item = new ItemDTO();
		String test = "abc123あいう１２３漢字";
		item.setReleaseDate(test);
		String result = item.getReleaseDate();
		assertEquals(test, result);
	}

	@Test
	public void testSetRelease_date4() {
		ItemDTO item = new ItemDTO();
		String test = null;
		item.setReleaseDate(test);
		String result = item.getReleaseDate();
		assertEquals(test, result);
	}

	@Test
	public void testSetRelease_date5() {
		ItemDTO item = new ItemDTO();
		String test = "";
		item.setReleaseDate(test);
		String result = item.getReleaseDate();
		assertEquals(test, result);
	}

	@Test
	public void testSetRelease_date6() {
		ItemDTO item = new ItemDTO();
		String test = " ";
		item.setReleaseDate(test);
		String result = item.getReleaseDate();
		assertEquals(test, result);
	}

	@Test
	public void testSetRelease_date7() {
		ItemDTO item = new ItemDTO();
		String test = "  ";
		item.setReleaseDate(test);
		String result = item.getReleaseDate();
		assertEquals(test, result);
	}

	@Test
	public void testGetRelease_company() {
		ItemDTO item = new ItemDTO();
		String test = "abc123";
		item.setReleaseCompany(test);
		assertEquals(test, item.getReleaseCompany());
	}

	@Test
	public void testGetRelease_company2() {
		ItemDTO item = new ItemDTO();
		String test = "あいう１２３";
		item.setReleaseCompany(test);
		assertEquals(test, item.getReleaseCompany());
	}

	@Test
	public void testGetRelease_company3() {
		ItemDTO item = new ItemDTO();
		String test = "abc123あいう１２３漢字";
		item.setReleaseCompany(test);
		assertEquals(test, item.getReleaseCompany());
	}

	@Test
	public void testGetRelease_company4() {
		ItemDTO item = new ItemDTO();
		String test = null;
		item.setReleaseCompany(test);
		assertEquals(test, item.getReleaseCompany());
	}

	@Test
	public void testGetRelease_company5() {
		ItemDTO item = new ItemDTO();
		String test = "";
		item.setReleaseCompany(test);
		assertEquals(test, item.getReleaseCompany());
	}

	@Test
	public void testGetRelease_company6() {
		ItemDTO item = new ItemDTO();
		String test = " ";
		item.setReleaseCompany(test);
		assertEquals(test, item.getReleaseCompany());
	}

	@Test
	public void testGetRelease_company7() {
		ItemDTO item = new ItemDTO();
		String test = "  ";
		item.setReleaseCompany(test);
		assertEquals(test, item.getReleaseCompany());
	}

	@Test
	public void testSetRelease_company() {
		ItemDTO item = new ItemDTO();
		String test = "abc123";
		item.setReleaseCompany(test);
		String result = item.getReleaseCompany();
		assertEquals(test, result);
	}

	@Test
	public void testSetRelease_company2() {
		ItemDTO item = new ItemDTO();
		String test = "あいう１２３";
		item.setReleaseCompany(test);
		String result = item.getReleaseCompany();
		assertEquals(test, result);
	}

	@Test
	public void testSetRelease_company3() {
		ItemDTO item = new ItemDTO();
		String test = "abc123あいう１２３漢字";
		item.setReleaseCompany(test);
		String result = item.getReleaseCompany();
		assertEquals(test, result);
	}

	@Test
	public void testSetRelease_company4() {
		ItemDTO item = new ItemDTO();
		String test = null;
		item.setReleaseCompany(test);
		String result = item.getReleaseCompany();
		assertEquals(test, result);
	}

	@Test
	public void testSetRelease_company5() {
		ItemDTO item = new ItemDTO();
		String test = "";
		item.setReleaseCompany(test);
		String result = item.getReleaseCompany();
		assertEquals(test, result);
	}

	@Test
	public void testSetRelease_company6() {
		ItemDTO item = new ItemDTO();
		String test = " ";
		item.setReleaseCompany(test);
		String result = item.getReleaseCompany();
		assertEquals(test, result);
	}

	@Test
	public void testSetRelease_company7() {
		ItemDTO item = new ItemDTO();
		String test = "  ";
		item.setReleaseCompany(test);
		String result = item.getReleaseCompany();
		assertEquals(test, result);
	}

	@Test
	public void testGetStatus() {
		ItemDTO item = new ItemDTO();
		int test = 123;
		item.setStatus(test);
		assertEquals(test, item.getStatus());
	}

	@Test
	public void testGetStatus2() {
		ItemDTO item = new ItemDTO();
		int test = 2147483647;
		item.setStatus(test);
		assertEquals(test, item.getStatus());
	}

	@Test
	public void testGetStatus3() {
		ItemDTO item = new ItemDTO();
		int test = -2147483647;
		item.setStatus(test);
		assertEquals(test, item.getStatus());
	}

	@Test
	public void testGetStatus4() {
		ItemDTO item = new ItemDTO();
		int test = 0;
		item.setStatus(test);
		assertEquals(test, item.getStatus());
	}

	@Test
	public void testGetStatus5() {
		ItemDTO item = new ItemDTO();
		try{
			int test = Integer.parseInt("2147483647");
			item.setStatus(test);
		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input String: \"2147483647\"");
		}
	}

	@Test
	public void testGetStatus6() {
		ItemDTO item = new ItemDTO();
		try{
			int test = Integer.parseInt("-2147483647");
			item.setStatus(test);
		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input String: \"-2147483647\"");
		}
	}

	@Test
	public void testSetStatus() {
		ItemDTO item = new ItemDTO();
		int test = 123;
		item.setStatus(test);
		int result = item.getStatus();
		assertEquals(test, result);
	}

	@Test
	public void testSetStatus2() {
		ItemDTO item = new ItemDTO();
		int test = 2147483647;
		item.setStatus(test);
		int result = item.getStatus();
		assertEquals(test, result);
	}

	@Test
	public void testSetStatus3() {
		ItemDTO item = new ItemDTO();
		int test = -2147483647;
		item.setStatus(test);
		int result = item.getStatus();
		assertEquals(test, result);
	}

	@Test
	public void testSetStatus4() {
		ItemDTO item = new ItemDTO();
		int test = 0;
		item.setStatus(test);
		int result = item.getStatus();
		assertEquals(test, result);
	}

	@Test
	public void testSetStatus5() {
		ItemDTO item = new ItemDTO();
		try{
			int test = Integer.parseInt("2147483647");
			item.setStatus(test);
		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input String: \"2147483647\"");
		}
	}

	@Test
	public void testSetStatus6() {
		ItemDTO item = new ItemDTO();
		try{
			int test = Integer.parseInt("-2147483647");
			item.setStatus(test);
		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input String: \"-2147483647\"");
		}
	}

	@Test
	public void testGetRegist_date() {
		ItemDTO item = new ItemDTO();
		String test = "abc123";
		item.setRegistDate(test);
		assertEquals(test, item.getRegistDate());
	}

	@Test
	public void testGetRegist_date2() {
		ItemDTO item = new ItemDTO();
		String test = "あいう１２３";
		item.setRegistDate(test);
		assertEquals(test, item.getRegistDate());
	}

	@Test
	public void testGetRegist_date3() {
		ItemDTO item = new ItemDTO();
		String test = "abc123あいう１２３漢字";
		item.setRegistDate(test);
		assertEquals(test, item.getRegistDate());
	}

	@Test
	public void testGetRegist_date4() {
		ItemDTO item = new ItemDTO();
		String test = null;
		item.setRegistDate(test);
		assertEquals(test, item.getRegistDate());
	}

	@Test
	public void testGetRegist_date5() {
		ItemDTO item = new ItemDTO();
		String test = "";
		item.setRegistDate(test);
		assertEquals(test, item.getRegistDate());
	}

	@Test
	public void testGetRegist_date6() {
		ItemDTO item = new ItemDTO();
		String test = " ";
		item.setRegistDate(test);
		assertEquals(test, item.getRegistDate());
	}

	@Test
	public void testGetRegist_date7() {
		ItemDTO item = new ItemDTO();
		String test = "  ";
		item.setRegistDate(test);
		assertEquals(test, item.getRegistDate());
	}

	@Test
	public void testSetRegist_date() {
		ItemDTO item = new ItemDTO();
		String test = "abc123";
		item.setRegistDate(test);
		String result = item.getRegistDate();
		assertEquals(test, result);
	}

	@Test
	public void testSetRegist_date2() {
		ItemDTO item = new ItemDTO();
		String test = "あいう１２３";
		item.setRegistDate(test);
		String result = item.getRegistDate();
		assertEquals(test, result);
	}

	@Test
	public void testSetRegist_date3() {
		ItemDTO item = new ItemDTO();
		String test = "abc123あいう１２３漢字";
		item.setRegistDate(test);
		String result = item.getRegistDate();
		assertEquals(test, result);
	}

	@Test
	public void testSetRegist_date4() {
		ItemDTO item = new ItemDTO();
		String test = null;
		item.setRegistDate(test);
		String result = item.getRegistDate();
		assertEquals(test, result);
	}

	@Test
	public void testSetRegist_date5() {
		ItemDTO item = new ItemDTO();
		String test = "";
		item.setRegistDate(test);
		String result = item.getRegistDate();
		assertEquals(test, result);
	}

	@Test
	public void testSetRegist_date6() {
		ItemDTO item = new ItemDTO();
		String test = " ";
		item.setRegistDate(test);
		String result = item.getRegistDate();
		assertEquals(test, result);
	}

	@Test
	public void testSetRegist_date7() {
		ItemDTO item = new ItemDTO();
		String test = "  ";
		item.setRegistDate(test);
		String result = item.getRegistDate();
		assertEquals(test, result);
	}

	@Test
	public void testGetUpdate_date() {
		ItemDTO item = new ItemDTO();
		String test = "abc123";
		item.setUpdateDate(test);
		assertEquals(test, item.getUpdateDate());
	}

	@Test
	public void testGetUpdate_date2() {
		ItemDTO item = new ItemDTO();
		String test = "あいう１２３";
		item.setUpdateDate(test);
		assertEquals(test, item.getUpdateDate());
	}

	@Test
	public void testGetUpdate_date3() {
		ItemDTO item = new ItemDTO();
		String test = "abc123あいう１２３漢字";
		item.setUpdateDate(test);
		assertEquals(test, item.getUpdateDate());
	}

	@Test
	public void testGetUpdate_date4() {
		ItemDTO item = new ItemDTO();
		String test = null;
		item.setUpdateDate(test);
		assertEquals(test, item.getUpdateDate());
	}

	@Test
	public void testGetUpdate_date5() {
		ItemDTO item = new ItemDTO();
		String test = "";
		item.setUpdateDate(test);
		assertEquals(test, item.getUpdateDate());
	}

	@Test
	public void testGetUpdate_date6() {
		ItemDTO item = new ItemDTO();
		String test = " ";
		item.setUpdateDate(test);
		assertEquals(test, item.getUpdateDate());
	}

	@Test
	public void testGetUpdate_date7() {
		ItemDTO item = new ItemDTO();
		String test = "  ";
		item.setUpdateDate(test);
		assertEquals(test, item.getUpdateDate());
	}

	@Test
	public void testSetUpdate_date() {
		ItemDTO item = new ItemDTO();
		String test = "abc123";
		item.setUpdateDate(test);
		String result = item.getUpdateDate();
		assertEquals(test, result);
	}

	@Test
	public void testSetUpdate_date2() {
		ItemDTO item = new ItemDTO();
		String test = "あいう１２３";
		item.setUpdateDate(test);
		String result = item.getUpdateDate();
		assertEquals(test, result);
	}

	@Test
	public void testSetUpdate_date3() {
		ItemDTO item = new ItemDTO();
		String test = "abc123あいう１２３漢字";
		item.setUpdateDate(test);
		String result = item.getUpdateDate();
		assertEquals(test, result);
	}

	@Test
	public void testSetUpdate_date4() {
		ItemDTO item = new ItemDTO();
		String test = null;
		item.setUpdateDate(test);
		String result = item.getUpdateDate();
		assertEquals(test, result);
	}

	@Test
	public void testSetUpdate_date5() {
		ItemDTO item = new ItemDTO();
		String test = "";
		item.setUpdateDate(test);
		String result = item.getUpdateDate();
		assertEquals(test, result);
	}

	@Test
	public void testSetUpdate_date6() {
		ItemDTO item = new ItemDTO();
		String test = " ";
		item.setUpdateDate(test);
		String result = item.getUpdateDate();
		assertEquals(test, result);
	}

	@Test
	public void testSetUpdate_date7() {
		ItemDTO item = new ItemDTO();
		String test = "  ";
		item.setUpdateDate(test);
		String result = item.getUpdateDate();
		assertEquals(test, result);
	}

	@Test
	public void testGetAvgvalue() {
		ItemDTO item = new ItemDTO();
		float test = 123;
		item.setAvgValue(test);
		assertEquals(test, item.getAvgValue(), 123);
	}

	@Test
	public void testGetAvgvalue2() {
		ItemDTO item = new ItemDTO();
		float test = (float) 123.0;
		item.setAvgValue(test);
		assertEquals(test, item.getAvgValue(), 123.0);
	}

	@Test
	public void testGetAvgvalue3() {
		ItemDTO item = new ItemDTO();
		float test = Float.MAX_VALUE;
		item.setAvgValue(test);
		assertEquals(test, item.getAvgValue(), Float.MAX_VALUE);
	}

	@Test
	public void testGetAvgvalue4() {
		ItemDTO item = new ItemDTO();
		float test = Float.MIN_VALUE;
		item.setAvgValue(test);
		assertEquals(test, item.getAvgValue(), Float.MIN_VALUE);
	}

	@Test
	public void testGetAvgvalue5() {
		ItemDTO item = new ItemDTO();
		float test = 0;
		item.setAvgValue(test);
		assertEquals(test, item.getAvgValue(), 0);
	}

	@Test
	public void testGetAvgvalue6() {
		ItemDTO item = new ItemDTO();
		float test = (float)0.0;
		item.setAvgValue(test);
		assertEquals(test, item.getStatus(), 0.0);
	}

	@Test
	public void testGetAvgvalue7() {
		ItemDTO item = new ItemDTO();
		try{
			float test = Float.parseFloat("Float.MAX_VALUE");
			item.setAvgValue(test);
		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input string: \"Float.MAX_VALUE\"");
		}
	}

	@Test
	public void testGetAvgvalue8() {
		ItemDTO item = new ItemDTO();
		try{
			float test = Float.parseFloat("Float.MIN_VALUE");
			item.setAvgValue(test);
		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input string: \"Float.MIN_VALUE\"");
		}
	}

	@Test
	public void testSetAvgvalue() {
		ItemDTO item = new ItemDTO();
		float test = 123F;
		item.setAvgValue(test);
		float result = item.getAvgValue();
		assertEquals(test, result, 123);
	}

	@Test
	public void testSetAvgvalue2() {
		ItemDTO item = new ItemDTO();
		float test = (float)123.0;
		item.setAvgValue(test);
		float result = item.getAvgValue();
		assertEquals(test, result, 123.0);
	}

	@Test
	public void testSetAvgvalue3() {
		ItemDTO item = new ItemDTO();
		float test = Float.MAX_VALUE;
		item.setAvgValue(test);
		float result = item.getAvgValue();
		assertEquals(test, result, Float.MAX_VALUE);
	}

	@Test
	public void testSetAvgvalue4() {
		ItemDTO item = new ItemDTO();
		float test = Float.MIN_VALUE;
		item.setAvgValue(test);
		float result = item.getAvgValue();
		assertEquals(test, result, Float.MIN_VALUE);
	}

	@Test
	public void testSetAvgvalue5() {
		ItemDTO item = new ItemDTO();
		float test = 0;
		item.setAvgValue(test);
		float result = item.getAvgValue();
		assertEquals(test, result, 0);
	}

	@Test
	public void testSetAvgvalue6() {
		ItemDTO item = new ItemDTO();
		float test = (float)0.0;
		item.setAvgValue(test);
		float result = item.getAvgValue();
		assertEquals(test, result, 0.0);
	}

	@Test
	public void testSetAvgvalue7() {
		ItemDTO item = new ItemDTO();
		try{
			float test = Float.parseFloat("Float.MAX_VALUE");
			item.setAvgValue(test);
		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input string: \"Float.MAX_VALUE\"");
		}
	}

	@Test
	public void testSetAvgvalue8() {
		ItemDTO item = new ItemDTO();
		try{
			float test = Float.parseFloat("Float.MIN_VALUE");
			item.setAvgValue(test);
		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input string: \"Float.MIN_VALUE\"");
		}
	}

	@Test
	public void testGetCountvalue() {
		ItemDTO item = new ItemDTO();
		int test = 123;
		item.setCountValue(test);
		assertEquals(test, item.getCountValue());
	}

	@Test
	public void testGetCountvalue2() {
		ItemDTO item = new ItemDTO();
		int test = 2147483647;
		item.setCountValue(test);
		assertEquals(test, item.getCountValue());
	}

	@Test
	public void testGetCountvalue3() {
		ItemDTO item = new ItemDTO();
		int test = -2147483647;
		item.setCountValue(test);
		assertEquals(test, item.getCountValue());
	}

	@Test
	public void testGetCountvalue4() {
		ItemDTO item = new ItemDTO();
		int test = 0;
		item.setCountValue(test);
		assertEquals(test, item.getCountValue());
	}

	@Test
	public void testGetCountvalue5() {
		ItemDTO item = new ItemDTO();
		try{
			int test = Integer.parseInt("2147483647");
			item.setCountValue(test);
		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input String: \"2147483647\"");
		}
	}

	@Test
	public void testGetCountvalue6() {
		ItemDTO item = new ItemDTO();
		try{
			int test = Integer.parseInt("-2147483647");
			item.setCountValue(test);
		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input String: \"-2147483647\"");
		}
	}

	@Test
	public void testSetCountvalue() {
		ItemDTO item = new ItemDTO();
		int test = 123;
		item.setCountValue(test);
		int result = item.getCountValue();
		assertEquals(test, result);
	}

	@Test
	public void testSetCountvalue2() {
		ItemDTO item = new ItemDTO();
		int test = 2147483647;
		item.setCountValue(test);
		int result = item.getCountValue();
		assertEquals(test, result);
	}

	@Test
	public void testSetCountvalue3() {
		ItemDTO item = new ItemDTO();
		int test = -2147483647;
		item.setCountValue(test);
		int result = item.getCountValue();
		assertEquals(test, result);
	}

	@Test
	public void testSetCountvalue4() {
		ItemDTO item = new ItemDTO();
		int test = 0;
		item.setCountValue(test);
		int result = item.getCountValue();
		assertEquals(test, result);
	}

	@Test
	public void testSetCountvalue5() {
		ItemDTO item = new ItemDTO();
		try{
			int test = Integer.parseInt("2147483647");
			item.setCountValue(test);
		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input String: \"2147483647\"");
		}
	}

	@Test
	public void testSetCountvalue6() {
		ItemDTO item = new ItemDTO();
		try{
			int test = Integer.parseInt("-2147483647");
			item.setCountValue(test);
		}catch(RuntimeException e){
			assertThat(e.getMessage(), "For input String: \"-2147483647\"");
		}
	}

	private void assertThat(String message, String String){
		assertEquals(message,String);
	}
}
