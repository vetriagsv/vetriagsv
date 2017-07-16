import java.util.Scanner;

public class Hunter96 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();String out="";
		char c=0;
		for(int i=0;i<str.length()-1;i++){
			int a=str.charAt(i);
			if(a==97){
				c=(char) 122;
			}
			else if(a==65){
				c=(char) 90;
			}
			else{
			c=(char)(a-1);
			}
			out=out+c;
		}
		System.out.println(out+str.charAt(str.length()-1));
	}

}
