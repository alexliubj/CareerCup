package careerCup_q1_2;

import java.util.Arrays;


// Write code to reverse a C-Style String (C-String means that ¡°abcd¡± is 
// represented as five characters, including the null character )
public class RevertString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(revertString(new String[]{"1","2","3","4","5"})));
		System.out.println(Arrays.toString(revertString(new String[]{"23","dd","99","00","5","2"})));

	}

	public static String[] revertString(String[] s)
	{
		int firstIndex = 0;
		int lastIndex = s.length - 1;
		while(firstIndex != lastIndex && firstIndex < lastIndex)
		{
			String temp = s[firstIndex];
			s[firstIndex] = s[lastIndex];
			s[lastIndex] = temp;
			firstIndex ++;
			lastIndex --;
		}
		return s;
	}
}
