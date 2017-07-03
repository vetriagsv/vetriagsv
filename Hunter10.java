import java.util.Scanner;

public class Hunter10 {
	public static void main(String[] args){
		String str1 ="";int flag=0;
		String str2="";String temp="";
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of elements in arr1:");
		int num1=s.nextInt();
		int arr1[]=new int[num1];
		System.out.println("Enter the elements in arr1:");
		for(int i=0;i<num1;i++){
			arr1[i]=s.nextInt();
		}
		System.out.println("Enter the number of elements in arr2:");
		int num2=s.nextInt();
		int arr2[]=new int[num2];
		System.out.println("Enter the elements in arr2:");
		for(int j=0;j<num2;j++){
			arr2[j]=s.nextInt();
		}
		for(int k=0;k<arr1.length;k++){
			 str1=str1+String.valueOf(arr1[k]);
		}
		for(int k=0;k<arr2.length;k++){
		     str2=str2+String.valueOf(arr2[k]);
		}
		boolean B;
		if(B=str1.contains(str2)){
			System.out.println("TRUE");
		}
	    else{
		System.out.println("FALSE");
	    }
	}
	
	}

