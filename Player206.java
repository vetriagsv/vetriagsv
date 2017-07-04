import java.util.Scanner;

public class Player206 {
	public static void main(String[] args){
		String newstr="";
		Scanner ss=new Scanner(System.in);
		String str=ss.nextLine();
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			if(Character.isUpperCase(str.charAt(i))){
				ch=Character.toLowerCase(str.charAt(i));
			}
			if(Character.isLowerCase(str.charAt(i))){
				ch=Character.toUpperCase(str.charAt(i));
			}
			newstr=newstr+ch;
		  }
		System.out.println(newstr);
	}

}
