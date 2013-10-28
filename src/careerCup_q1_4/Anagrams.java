package careerCup_q1_4;
import java.util.Scanner;
public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Question:
		//Write a method to decide if two strings are anagrams or not.
		System.out.println("input first strings");
		Scanner aScannar = new Scanner(System.in);
		String a = aScannar.next();
		System.out.println("input second strings");
		aScannar = new Scanner(System.in);
		String b = aScannar.next();
		System.out.println(isAnagrams(a,b) ? "anagrams" : "NOT anagrams");

	}

	public static boolean isAnagrams(String a, String b)
	{
		if(a.length() != b.length())
			return false;
		else
		{
			String[] splitedA = a.split("");
			
			for(int i = 1; i<splitedA.length; i++)
			{
				if(b.indexOf(splitedA[i]) == -1)
				return false;
			}
		}
		
		return true;
	}

}
