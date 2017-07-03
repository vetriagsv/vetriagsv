import java.util.Scanner;

public class Hunter116 {
	public static void main(String[] args){
		int sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int number=s.nextInt();
		String str=String.valueOf(number);
		for(int i=0;i<str.length();i++){
			int num1=Integer.parseInt(str.substring(i,i+1));
			int power=(int) Math.pow(num1,num1-1);
			sum=sum+power;
		}
		System.out.println(sum);
	}

}
