import java.util.Scanner;

public class Hunter45 {

	public static void main(String[] args) {
		String temp="";
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of String:");
		int size=s.nextInt();
		String[] str=new String[size];
		System.out.println("Enter the array strings:");
		for(int i=0;i<size;i++){
			str[i]=s.nextLine();
		}
		for(int j=0;j<size-1;j++){
			for(int k=j+1;k<size;k++){
				if(str[j].length()<str[k].length()){
					temp=str[j];
					str[j]=str[k];
					str[k]=temp;
				}
				else{
					str[j]=str[j];
					str[k]=str[k];
				}
			}
		}
		System.out.println(str[str.length-2]);

	}

}
