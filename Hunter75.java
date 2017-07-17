import java.util.Scanner;

public class Hunter75 {
	public static void main(String[] args) {
		userMethod();
	}
	public static void userMethod(){
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++){
			arr[i]=s.nextInt();
		}
		int[] newarr=new int[size];
		for(int i=0;i<size-1;i++){
			if(arr[i]>arr[i+1]){
				newarr[i]=arr[i+1];
			}
			else if(arr[i]<arr[i+1]){
				newarr[i]=-1;
			}
		}
		newarr[size-1]=-1;
		for(int i=0;i<size;i++){
			System.out.print(newarr[i]+" ");
		}
	}
}
