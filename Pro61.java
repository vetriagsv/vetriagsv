import java.util.Scanner;

public class Pro61 {
	public static void main(String[] args) {
		userMethod("vETri","baSkarAn");
	}
	public static void userMethod(String s1,String s2){
		String str1=s1.toLowerCase();
		String str2=s2.toLowerCase();
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter the number u want to encode:");
		int num=ss.nextInt();String out1="";String out2="";
		for(int i=0;i<str1.length();i++){
			int sub1=(int) str1.charAt(i)+num;
			char c=0;
			if(sub1>122){
				int a=sub1%122;
				c=(char) (96+a);
			}else{
			c=(char) sub1;
			}
			out1+=c;
		}String out="";
		for(int i=1;i<str2.length()-1;i++){
			int sub2=(int) str2.charAt(i)+num;
			char c1=0;
			if(sub2>122){
				int b=sub2%122;
				c1=(char)(96+b);
			}else{
			c1=(char) sub2;
			}
			out+=c1;
		}
		out2=str2.charAt(0)+out+str2.charAt(str2.length()-1);
		System.out.println(out1);
		System.out.println(out2);
	}
}
