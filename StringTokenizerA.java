package com.advance.stringtokenizer;
import java.util.StringTokenizer;

public class StringTokenizerA {

	public static void main(String[] args) {
		
		String famousdialog= "all the beings in the universe should be happy";
		System.out.println("using stringTokenizer here");
		StringTokenizer stringTokenizer=new StringTokenizer(famousdialog);
		System.out.println("number of tokens:"+stringTokenizer.countTokens());
		while(stringTokenizer.hasMoreTokens()) {
			System.out.println("stringTokenizer.nextToken()");}
		
		System.out.println("using split's function here: ");
		String[] famousdialogwords=famousdialog.split(",");
		System.out.println("number of elements:"+famousdialogwords.length);
		for(String famousdialogword:famousdialogwords) {
			System.out.println(famousdialogword);
		}
		}
	
	}
	


