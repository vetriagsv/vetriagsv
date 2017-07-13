import java.util.Scanner;

public class Hunter124 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		int count=0;
		String[] ss=str.split(" ");
		for(int i=0;i<ss.length;i++){
			String s1=ss[i];
			if(Character.isUpperCase(s1.charAt(0))){
				count++;
			}
			else{
				count=0;
			}
		}
		if(count==ss.length){
			System.out.println("TRUE");
		}
		else {
			System.out.println("FALSE");
		}
	}

}
