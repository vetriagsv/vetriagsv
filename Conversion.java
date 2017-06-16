import java.util.Scanner;


public class Conversion {
	public static void main(String[] args){
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter the String:");
	    String str=ss.nextLine();
	    int number=Integer.parseInt(str);
	    System.out.println("String to Integer conversion is:"+number);
	    }
}
