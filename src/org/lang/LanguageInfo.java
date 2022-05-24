package org.lang;

public class LanguageInfo extends StateDetails {

	private void tamilLanguage() {
System.out.println("Tamil is the language of TamilNadu ");
	}
	private void englishLanguage() {
System.out.println("English is the language of British ");
	}
	private void hindiLanguage() {
System.out.println("Hindi is the language of Maharastra ");
	}
	public static void main(String[] args) {
		LanguageInfo l = new LanguageInfo();
		l.tamilLanguage();
		l.englishLanguage();
		l.hindiLanguage();
		l.southIndia();
		l.northIndia();
		
	}
}

