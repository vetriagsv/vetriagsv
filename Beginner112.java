import java.util.Scanner;

public class Beginner112 {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=s.nextLine();
		String[] spl=str.split(" ");
		for(int i=0;i<spl.length;i++){
			if(i%2==0){
				StringBuffer ss=new StringBuffer(spl[i]);
				StringBuffer rev=ss.reverse();
				String reverse=String.valueOf(rev);
				spl[i]=reverse;
			}
			else{
				spl[i]=spl[i];
			}
		}
		for(int j=0;j<spl.length;j++){
			System.out.print(spl[j]+" ");
		}
	}

}
