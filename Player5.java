import java.util.Scanner;

public class Player5 {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the romen:");
		String str=s.nextLine();
		char romen[]={'I','V','X','L','C','D','M'};
		int value[]={1,5,10,50,100,500,1000};
		int[] ans=new int[str.length()];int finalvalue=0;
		if(str.length()==1){
			for(int i=0;i<romen.length;i++){
				if(str.charAt(0)==romen[i]){
					System.out.println(value[i]);
				}
			}
		}
		if(str.length()>1){
			for(int j=0;j<str.length();j++){
				for(int k=0;k<romen.length;k++){
					if(str.charAt(j)==romen[k]){
						ans[j]=value[k];
					}
				}
			}
			for(int n=0;n<ans.length;n++){
				if(ans[0]>ans[1]){
					finalvalue=finalvalue+ans[n];
				}
				else if(ans[0]<ans[1]){
					//for(int m=ans.length()-2;m>=0;m--){
				       //int temp=ans.charAt(ans.length()-1);
					 finalvalue=Math.abs(finalvalue-ans[n]);
					}
				else{
					finalvalue=finalvalue+ans[n];
					}
			}
			System.out.println(finalvalue);
		}
	}
}

