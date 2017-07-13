import java.util.Scanner;

public class Hunter129 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		int len=str.length();int sum=0;
		int[] arr=new int[len];
		for(int i=0;i<len;i++){
			int a=str.charAt(i);
			arr[i]=a;
		}
		for(int j=1;j<len;j++){
			sum=sum+(arr[j]-arr[j-1]);
		}
		arr[0]=sum-arr[0];
		System.out.println(arr[0]);
	}

}
