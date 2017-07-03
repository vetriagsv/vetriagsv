import java.util.Scanner;

public class Hunter123 {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=s.nextLine();
		for(int i=0;i<=str.length()-1;i++){
			for(int j=i+1;j<str.length();j++){
			if(str.charAt(i)==str.charAt(j)){
				str=str.replace(str.substring(j,j+1),"");
				
			}
		}
			
	}
		System.out.println(str);
	}
}

