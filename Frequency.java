/*
 * File          : Frequency.java
 * Description   : Finding frequency of a character using java 
 * Author        : Chris Reji Kuriakose
 * Version       : 1.0
 * Date          : 29/09/23
 */
import java.util.Scanner;
public class Frequency {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String input=sc.nextLine();
		System.out.println("enter the character");
		char checkMe=sc.next().charAt(0);
		int charCount=checkFreq(input,checkMe);
		System.out.println("the number of occurence of the character is"+charCount);
		
	}
	static int checkFreq(String input,char checkMe) {
		char[]charArray=input.toCharArray();
		int charCount=0;
		for(int i=0;i<input.length();i++) {
			if(charArray[i]==checkMe) {
				charCount++;
			}
		}
		return charCount;
	}

}
