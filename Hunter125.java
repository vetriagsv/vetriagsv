import java.util.Scanner;

public class Hunter125 {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=s.nextLine();
		System.out.println("Enter the Substring size:");
		int size=s.nextInt();
		for(int i=0;i<str.length();i++){
			String substring=str.substring(i,i+size);
			String check=substring;
			StringBuffer ss=new StringBuffer(substring);
			StringBuffer rev=ss.reverse();
			String reverse=String.valueOf(rev);
			if(check.equals(reverse)){
				System.out.println(check);
				break;
			}
			else{
				continue;
			}
			
		}
		
	}

}
