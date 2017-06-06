package primenumber;

import java.util.Scanner;

public class primenumber {
	public static void main(String[] args)
	{
		int n,m;
		System.out.println("Enter the n:");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(m=1;m<=n/2;m++)
		{
			if(n%m==0)
			{
				System.out.println("prime number");
			}
			else
			{

		    	System.out.println("Not a prime number");
		    	break;
		     }
	     }
	}
}

