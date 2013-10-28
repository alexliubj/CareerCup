package careerCup_q1_5;

import java.util.Scanner;

public class ReplaceSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Question: 
		//Write a method to replace all spaces in a string with ¡®%20¡¯
		Scanner aScannar;
		System.out.println("input strings to replace");
		aScannar = new Scanner(System.in);
		System.out.println(RemoveSpace(aScannar.nextLine()));
	}
	
	public static String RemoveSpace(String s)
	{
		String[] splitedS = s.split("");
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<splitedS.length;i++)
		{
			if( !splitedS[i].equals(""))
			{
				if(splitedS[i].equals(" "))
					sb.append("%20");
				else
					sb.append(splitedS[i]);
			}
		}
		
		return sb.toString();
	}
}
