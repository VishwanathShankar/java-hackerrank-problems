//Task:
//	Reading a multiline input from the user as strings
//	Example:
//		Input:
//			Hi I am Vishwanath
//			I am 35 years of age
//			I have started hackerrank now
//			
//		Output:
//			Hi I am Vishwanath
//			I am 35 years of age
//			I have started hackerrank now

package com.hackerrank.java.basics;

import java.util.ArrayList;
import java.util.Scanner;

public class ReadingMultilineInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> sentenceList = new ArrayList<String>();
		while(scanner.hasNextLine()) {
			String line = scanner.nextLine();
			if(line == null || line.isEmpty()) {
				break;
			} else {
				sentenceList.add(line);
			}
		}
		
		for (String string : sentenceList) {
			System.out.println(string);
		}

	}

}
