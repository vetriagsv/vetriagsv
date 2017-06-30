import java.util.Scanner;

public class Hunter2 {
	public static void main(String[] args){
		int temp=0;
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter the number of students :");
		int l=ss.nextInt();
		int[] a=new int[l];
		int[] index=new int[l];
		System.out.println("Enter their heights:");
		for(int i=0;i<l;i++){
		a[i]=ss.nextInt();
		}
		for(int j=0;j<l;j++){
			for(int k=j+1;k<l;k++)
			if(a[j]<a[k]){
				temp=a[j];
				a[j]=a[k];
				a[k]=temp;
			}
		}
		for(int k=0;k<a.length;k++){
		System.out.print(a[k]+" ");
		}
		System.out.println("\nEnter the index of the height which u need:");
		int need=ss.nextInt();
		System.out.println("The "+need+"th tallest height is "+a[need-1]);
		}
}
