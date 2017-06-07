package stringreverse;

import java.util.Scanner;

public class Stringreverse {
	public static void main(String[] args)
	{
		String str;
		System.out.println("Enter the string");
		Scanner s=new Scanner(System.in);
		str=s.nextLine();
		StringBuffer ss=new StringBuffer(str);
		System.out.println(ss.reverse());
		
	}

}
