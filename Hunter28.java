import java.util.Scanner;

public class Hunter28 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();char c=0;
		StringBuffer ss=new StringBuffer(str);
		for(int i=0;i<ss.length()-1;i++){
			for(int j=i+1;j<str.length();j++){
			c=str.charAt(j);
			if(ss.charAt(i)==c){
				ss=ss.deleteCharAt(j);
			}
			else{
				c=str.charAt(j);
			}
			}
		}
		System.out.println(ss);
	}

}
