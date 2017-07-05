import java.util.Scanner;

public class Hunter8 {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Size:");
		int size=s.nextInt();
		System.out.println("Enter the elements of the string:");
		int[] arr=new int[size];
		for(int i=0;i<size;i++){
			arr[i]=s.nextInt();
		}
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				for(int k=0;k<arr.length;k++){
					if(arr[i]+arr[j]==arr[k]){
						System.out.println(arr[k]+" is the sum of "+arr[i]+","+arr[j]);
					}
				}
			}
		}
	}

}
