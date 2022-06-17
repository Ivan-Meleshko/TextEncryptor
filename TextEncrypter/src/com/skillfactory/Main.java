package com.skillfactory;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char x = '8';
		System.out.println(Encrypter.EncryptChar(x));
		
		String text = "I love red balls";
		String text2 = "Harry Potter is great 123 123";
		
		System.out.println(Encrypter.Encrypt(text2));
		Encrypter.announceDate();
		
		System.out.println(Encrypter.EncryptPlusDate(text2));
		System.out.println(Encrypter.Decrypt(Encrypter.EncryptPlusDate(text2)));
		
		
	}

}
