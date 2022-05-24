package org.all;
//child class
import org.telugu.Telugu;
public class LanguageClass extends Telugu {
	public void allLanguage() {
		System.out.println("All languages are ");

	}
public static void main(String[] args) {
	LanguageClass l = new LanguageClass();
	l.allLanguage();
	l.tamilLanguage();
	l.englishLanguage();
	l.teluguLanguage();
	
	
}
}
