package TAm;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the STring 1 ");
		String str1 = s.next();
		System.out.println("Enter the STring 2 ");
		String str2= s.next();
		
		
		String lstr1=str1.toLowerCase();
		String lstr2=str2.toLowerCase();
		
		
		
		char[]ch1=lstr1.toCharArray();
		char[] ch2=lstr2.toCharArray();
		
		
		
	Arrays.sort(ch1);
	Arrays.sort(ch2);
		
	
	boolean result = Arrays.equals(ch1, ch2);
	
	if (result==true)
		System.out.println("its is anagram");
	
	else
		
		System.out.println("its is not an anagram");
	
	}

}
