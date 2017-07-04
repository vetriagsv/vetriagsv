import java.util.Scanner;

public class HunterPro102 {
	public static void main(String[] args){
		int sum=0;
		int answer=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int number=s.nextInt();
		String str=String.valueOf(number);
		for(int i=0;i<=str.length()-1;i++){
			int num=Integer.parseInt(str.substring(i,i+1));
			sum=sum+num;
			answer=answer+sum;
		}
		System.out.println(answer);
		s.close();
	}
}
