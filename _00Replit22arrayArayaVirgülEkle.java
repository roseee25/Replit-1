package _00Replit;

import java.util.Arrays;

public class _00Replit22arrayArayaVirgülEkle {

public static void main(String args[]) {
		/*
		Create a custom return type method accepts a name as parameter and prints the name as a char array.

		(do not use toCharArray() method)

		Input : John

		Output :[J, o, h, n]

		 */


String str="John";

String arr[]=str.split("");

System.out.println(Arrays.toString(arr)); 
	
}
}

