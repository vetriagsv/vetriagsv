import java.util.Scanner;

public class Player39 {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=s.nextInt();
		int power=(int) Math.pow(2,num);
		System.out.println(power);
	}

}
