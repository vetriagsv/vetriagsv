import java.util.Scanner;

class MiddleIndex{
	public void FindMiddleIndex(){
		int temp = 0;int j=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the array size");
		int size=s.nextInt();
		System.out.println("enter the array elements:");
		int[] arr=new int[size];
		for(int i=0;i<size;i++){
			arr[i]=s.nextInt();
		}
		int sum=arr[0]+arr[arr.length-1];
		for( j=1;j<=arr.length-2;j++){
			if(sum==arr[j]){
			  System.out.println(j);
		}
	}
  }
}
public class Hunter122 {
	public static void main(String[] args){
		MiddleIndex M=new MiddleIndex();
		M.FindMiddleIndex();
		}
	}

