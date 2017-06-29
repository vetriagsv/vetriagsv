import java.util.Scanner;

public class Hunter11 {
	public static void main(String [] args){
		Scanner s=new Scanner(System.in);
		System.out.println("enter the String:");
		String str=s.nextLine();
		String[] ans=str.split(" ");
		for(int i=ans.length-1;i>=0;i--){
			System.out.print(ans[i]+" ");
		}
	}

}
