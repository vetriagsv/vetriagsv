import java.util.Scanner;
import java.util.TreeSet;

public class Hunter128 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in); 
		int size=s.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<size;i++){
			arr[i]=s.nextInt();
		}
		for(int i=0;i<size-1;i++){
			for(int j=i;j<size;j++){
				if(arr[i]>arr[j]){
					int t=arr[i];
					arr[i]=arr[j];
					arr[j]=t;
				}
			}
		}
		int a=arr.length/2;
		int[] out=new int[size];
		for(int i=0,j=1;i<=a&&j<arr.length;i++,j+=2){
			out[j]=arr[i];
		}
		for(int i=arr.length-1,j=0;i>=a&&j<arr.length;i--,j+=2){
			out[j]=arr[i];
	    }
		for(int i=0;i<out.length;i++){
			System.out.print(out[i]+" ");
		}
	}
}
