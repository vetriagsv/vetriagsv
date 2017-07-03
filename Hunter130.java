import java.util.Scanner;

public class Hunter130 {
	public static void main(String[] args){
		String holiday1="sunday";
		String holiday2="saturday";
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the day:");
		String str=s.nextLine();
		if(str.equals(holiday1)||str.equals(holiday2)){
				System.out.println("FALSE");
			}
			else{
				System.out.println("TRUE");
			}
		}
	}
