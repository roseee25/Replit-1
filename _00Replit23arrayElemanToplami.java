package _00Replit;

import java.util.Arrays;

public class _00Replit23arrayElemanToplami {



public static void main(String args[]) {
		/*
	Bir String'i parametre olarak kabul eden ve 
	verilen string'de bulunan rakamların toplamını yazdıran bir metot yazın.
	input : ade1r4d3

	output : 8

	 Hint :     Use Character.isDigit()     Integer.valueOf()
		 */
	String str1="ade1r4d3".replaceAll("\\D", "");
	
	
	int str=143;
	  int toplam=0;
	  while(str > 0) {
          toplam += str % 10;
          str /= 10;  // sayi = sayi / 10;
      }
      System.out.println(toplam);
  }
}


