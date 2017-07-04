import java.util.Scanner;

public class Beginner24 {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=s.nextInt();
		String str=String.valueOf(num);
		StringBuffer ss=new StringBuffer(str);
		StringBuffer rev=ss.reverse();
		String str1=String.valueOf(rev);
		int ans=Integer.parseInt(str1);
		System.out.println(ans);
	}
}
