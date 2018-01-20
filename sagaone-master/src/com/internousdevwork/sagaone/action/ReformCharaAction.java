package com.internousdevwork.sagaone.action;

import java.util.ArrayList;
import java.util.List;

import org.atilika.kuromoji.Token;
import org.atilika.kuromoji.Tokenizer;
import org.atilika.kuromoji.Tokenizer.Builder;
import org.atilika.kuromoji.Tokenizer.Mode;

import com.ibm.icu.text.Transliterator;
import com.internousdevwork.sagaone.dto.SearchItemInfoDTO;

public class ReformCharaAction {

	public List<SearchItemInfoDTO> allCharDTO = new ArrayList<SearchItemInfoDTO>();

	public List<SearchItemInfoDTO> reformDescription(List<SearchItemInfoDTO> allCharDTO){

		for(int i=0; i<allCharDTO.size(); i++){

			//漢字をカタカナ
			String str=allCharDTO.get(i).getProductDescription();

	        Builder builder = Tokenizer.builder();
	        builder.mode(Mode.NORMAL);
	        Tokenizer tokenizer = builder.build();
	        List<Token> tokens = tokenizer.tokenize(str);
	        StringBuilder kanjiToKata = new StringBuilder();
	        for (Token token : tokens)
	        	kanjiToKata.append(token.getReading());


	        //カタカナをかな
			StringBuffer toHira = new StringBuffer();
		    for (int j = 0; j < kanjiToKata.length(); j++) {
		      char code = kanjiToKata.charAt(j);
		      if ((code >= 0x30a1) && (code <= 0x30f3)) {
		        toHira.append((char) (code - 0x60));
		      } else {
		        toHira.append(code);
		      }
		    }

		    Transliterator transliterator = Transliterator.getInstance("Hiragana-Latin");
		    String toAlfa = transliterator.transliterate(toHira.toString());


		    allCharDTO.get(i).setDescriptionAll(str + kanjiToKata + toHira + toAlfa + allCharDTO.get(i).getProductName() + allCharDTO.get(i).getProductNameKana() + allCharDTO.get(i).getReleaseCompany());
		}


		return allCharDTO;
	}
}
