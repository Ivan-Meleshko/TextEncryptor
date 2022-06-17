package com.skillfactory;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;


public class Encrypter {
	
	static SimpleDateFormat dateFormat = new SimpleDateFormat("Y MM d HH:mm:ss");
	static Date date = new Date();
	static Calendar calendar = Calendar.getInstance();
	
	static StringBuffer dateString = new StringBuffer();
	
	
	public static void announceDate() {

		calendar.setTime(date);
		System.out.println(dateFormat.format(date.getTime()));
		
	}
	
	public static String dateToString() {
		calendar.setTime(date);
		return Encrypter.Encrypt(dateFormat.format(date.getTime()));
	}
	
	

	public static String Encrypt(String text) {
		String result = "";
		String[] words = text.split(" ");
		for (int i = 0; i < words.length; i++) {
			char[] chars = words[i].toCharArray();
			String newWord;
			for (int j = 0; j < words[i].length(); j++) {
				chars[j] = EncryptChar(chars[j]);
			}
			newWord = String.valueOf(chars);
			result = result.concat(newWord + " ");
		}
		
		return result;
		
	}
	
	public static String EncryptPlusDate(String text) {
		calendar.setTime(date);
		String result = "";
		String dateHello = "Date is: ";
		String[] words = text.split(" ");
		for (int i = 0; i < words.length; i++) {
			char[] chars = words[i].toCharArray();
			String newWord;
			for (int j = 0; j < words[i].length(); j++) {
				chars[j] = EncryptChar(chars[j]);
			}
			newWord = String.valueOf(chars);
			result = result.concat(newWord + " ");
		}
		
		return result + Encrypter.Encrypt(dateHello) + Encrypter.Encrypt(dateFormat.format(date.getTime()));
		
	}
	
	
	public static String Decrypt(String text) {
		String result = "";
		String[] words = text.split(" ");
		for (int i = 0; i < words.length; i++) {
			char[] chars = words[i].toCharArray();
			String newWord;
			for (int j = 0; j < words[i].length(); j++) {
				chars[j] = EncryptChar(chars[j]);
			}
			newWord = String.valueOf(chars);
			result = result.concat(newWord + " ");
		}
		return result;
		
	}
	
	
	
	public static char EncryptChar(char x) {
		switch (x) {
		case 'a' : return 'z';
		case 'b' : return 'y';
		case 'c' : return 'x';
		case 'd' : return 'w';
		case 'e' : return 'v';
		case 'f' : return 'u';
		case 'g' : return 't';
		case 'h' : return 's';
		case 'i' : return 'r';
		case 'j' : return 'q';
		case 'k' : return 'p';
		case 'l' : return 'o';
		case 'm' : return 'n';
		case 'n' : return 'm';
		case 'o' : return 'l';
		case 'p' : return 'k';
		case 'q' : return 'j';
		case 'r' : return 'i';
		case 's' : return 'h';
		case 't' : return 'g';
		case 'u' : return 'f';
		case 'v' : return 'e';
		case 'w' : return 'd';
		case 'x' : return 'c';
		case 'y' : return 'b';
		case 'z' : return 'a';
		case 'A' : return 'Z';
		case 'B' : return 'Y';
		case 'C' : return 'X';
		case 'D' : return 'W';
		case 'E' : return 'V';
		case 'F' : return 'U';
		case 'G' : return 'T';
		case 'H' : return 'S';
		case 'I' : return 'R';
		case 'J' : return 'Q';
		case 'K' : return 'P';
		case 'L' : return 'O';
		case 'M' : return 'N';
		case 'N' : return 'M';
		case 'O' : return 'L';
		case 'P' : return 'K';
		case 'Q' : return 'J';
		case 'R' : return 'I';
		case 'S' : return 'H';
		case 'T' : return 'G';
		case 'U' : return 'F';
		case 'V' : return 'E';
		case 'W' : return 'D';
		case 'X' : return 'C';
		case 'Y' : return 'B';
		case 'Z' : return 'A';
		case '0' : return '9';
		case '1' : return '8';
		case '2' : return '7';
		case '3' : return '6';
		case '4' : return '5';
		case '5' : return '4';
		case '6' : return '3';
		case '7' : return '2';
		case '8' : return '1';
		case '9' : return '0';
		}
		return x;
	}
	
	
			
	
	
}
