import java.util.Scanner;

public class Hunter115 {
	public static void main(String[] args) {
		Hunter115 H=new Hunter115();
		H.userMethod("Bhai","cganaprasanth");
	}
	public static void userMethod(String str1,String str2){
		int len1=str1.length();
		int len2=str2.length();
		int diff=0;String password="";
		if(len1>len2){
			diff=len1-len2;
			for(int i=1;i<=diff;i++){
				str2=str2+i;
			}
		}
		else if(len2>len1){
			diff=len2-len1;
			for(int i=1;i<=diff;i++){
				str1=str1+i;
			}
		}
		for(int j=0;j<str1.length();j++){
			password=password+str1.charAt(j)+str2.charAt(j);
		}
	    System.out.println(password);
	 }
 }
