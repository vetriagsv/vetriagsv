import java.util.Scanner;

public class Hunter93{
	public static void main(String[] args) {
		String a="";
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String[] newstr=str.split(" ");
		String[] first=new String[newstr.length];
		for(int i=0;i<newstr.length;i++){
			String sub=newstr[i];
			StringBuffer ss=new StringBuffer(sub);
			StringBuffer rev=ss.reverse();
			String out=String.valueOf(rev);
			a="";
			for(int j=0;j<out.length();j++){
				char c=out.charAt(j);
				if(Character.isUpperCase(sub.charAt(j))){
					c=Character.toUpperCase(c);
				}
				else if(Character.isLowerCase(sub.charAt(j))){
					c=Character.toLowerCase(c);
				}
				a=a+c;
		    }
			first[i]=a;
	     }
		for(int j=0;j<first.length;j++){
			System.out.print(first[j]+" ");
		}
	}
}

