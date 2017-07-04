import java.util.Scanner;

public class Player43 {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string1:");
		String str1=s.nextLine();
		System.out.println("Enter the string2:");
		String str2=s.nextLine();
		int len1=str1.length();
		int len2=str2.length();
		for(int i=0;i<len1-len2;i++){
			if(str2.equals(str1.substring(i,i+len2))){
				System.out.println(str2+" is the substring of "+str1);
				break;
			}
			else{
				continue;
				//System.out.println(str2+"is not a substring of "+str1);
			}
		}
		
	}

}
