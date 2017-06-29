import java.util.Scanner;

public class Hunter3 {
	public static void main(String[] args){
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter the number of elements in the array:");
		int l=ss.nextInt();
		int[] a=new int[l];
		int[] index=new int[l];
		System.out.println("Enter the number of elements in the array:");
		for(int i=0;i<l;i++){
			a[i]=ss.nextInt();
		}
		for(int j=0;j<l;j++){
			index[j]=j;
		 if(a[j]==index[j]){
			System.out.println(a[j]+" is in the same index of "+index[j]);
		}
		}
	}

}
