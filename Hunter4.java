import java.util.Scanner;

public class Hunter4 {
	public static void main(String[] args){
		Scanner ss=new Scanner(System.in);
		int l=ss.nextInt();
		int answer = 0;
		int[] a=new int[l];
		int[] count=new int[l];
		int[] out=new int[l];
		for(int i=0;i<l;i++){
			a[i]=ss.nextInt();
		}
		for(int i=0;i<l;i++){
		     for(int j=0;j<l;j++){
		    	 if(i!=j){
				   if(a[i]!=a[j]){
					answer=1;	
				   }
				   else{
					   answer=0;
					   break;
				   }
				}
		     }
	      if(answer==1){
			System.out.println(a[i]);
			}
		}
	}
}
