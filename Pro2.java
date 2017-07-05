import java.util.Scanner;

public class Pro2 {

	public static void main(String[] args) {
		String newstr="";
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=s.nextInt();
		String str=String.valueOf(num);
		int[] mat=new int[str.length()];
		String[] newarr=str.split("");
		for(int i=0;i<newarr.length;i++){
			mat[i]=Integer.parseInt(newarr[i]);
	    }
		for(int j=0;j<mat.length-1;j++){
			for(int k=j+1;k<mat.length;k++){
				if(mat[j]>mat[k]){
					int temp=mat[j];
					mat[j]=mat[k];
					mat[k]=temp;
				}
			}
		}
		System.out.println("Enter the number of digits to delete:");
		int k=s.nextInt();
		for(int i=mat.length-k;i<mat.length;i++){
			mat[i]=0;
	    }
		for(int i=0;i<mat.length;i++){
			String str1=String.valueOf(mat[i]);
			if(str1.equals("0")){
				str1=str1.replace(str1,"");
			}
			else{
				str1=str1;
				newstr=newstr+str1;
				
			}
		}
		 System.out.print(newstr);
	    }
    }
