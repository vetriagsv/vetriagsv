import java.util.Scanner;

public class Pro15{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of elements in the array:");
		int num=s.nextInt();
		int arr[]=new int[num];
		System.out.println("Enter the elements:");
		for(int i=0;i<num;i++){
			arr[i]=s.nextInt();
		}
		for(int j=0;j<arr.length-1;j++){
			for(int k=j+1;k<arr.length;k++){
			if(arr[j]<arr[k]){
				int temp=arr[k];
				arr[k]=arr[j];
				arr[j]=temp;
			}
		}
	 }
	for(int m=0;m<arr.length;m++){
		System.out.println(arr[m]);
    }s.close();
  }
}
