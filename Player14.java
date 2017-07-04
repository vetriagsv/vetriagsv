import java.util.Scanner;

public class Player14 {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=s.nextLine();
		str=str.replaceAll("[aeiouAEIOU]","");
		System.out.println(str);
	}

}
