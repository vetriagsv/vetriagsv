import java.util.Scanner;

public class Hunter133 {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String[] answer=str.split(" ");
		for(int i=answer.length-1;i>=0;i--){
			System.out.print(answer[i]+" ");
		}
	}

}
