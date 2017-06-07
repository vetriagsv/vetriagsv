package factorial;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args)
	{
		int n,a=1;
		System.out.println("Enter the number:");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(int m=n;m>=1;m--)
		{
			a=a*m;
		}
		System.out.println(a);
	}

}
