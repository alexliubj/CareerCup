package careerCup_q1_1;

import java.util.Scanner;

//Implement an algorithm to determine if a string has all unique characters 
//What if you can not use additional data structures?
public class UniqueStringCharactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("input strings");
		Scanner aScannar = new Scanner(System.in);
		System.out.println(isUniqueString(aScannar.next()) ? "UNIQUE" : "NOT UNIQUE");

	}
	
	public static boolean isUniqueString(String s)
	{
		boolean ret = false;
		boolean[] strings = new boolean[256];
		for(int i=0; i< s.length(); i++)
		{
			int stringAtIndex = s.charAt(i);
			if(strings[stringAtIndex])
			{
				ret = false;
				break;
			}
			else
				strings[stringAtIndex] = true;
		}
		return ret;
	}
}
