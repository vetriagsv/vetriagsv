import java.util.ArrayList;

public class Pro62 {
	public static void main(String[] args) {
		userMethod("qwertyuivvvvvvvvvvvvopasdfghjkl");
	}
	public static void userMethod(String str){
		String sub="";
		ArrayList<String> as=new ArrayList<String>();
		for(int i=0;i<str.length();i++){
			for(int j=i+1;j<str.length();j++){
				sub=str.substring(i,j);
				String org=sub;
				StringBuffer s=new StringBuffer(sub);
				StringBuffer rev=s.reverse();
				String rever=String.valueOf(rev);
				if(org.equals(rever)){
					as.add(rever);
				}
			}
		}String[] sss=new String[as.size()];
		for(int i=0;i<as.size();i++){
			sss[i]=as.get(i);
		}
		for(int i=0;i<sss.length-1;i++){
			for(int j=i+1;j<sss.length;j++){
				if(sss[i].length()<sss[j].length()){
					String temp=sss[i];
					sss[i]=sss[j];
					sss[j]=temp;
				}
				else{
					sss[i]=sss[i];
					sss[j]=sss[j];
				}
			}
		}
		System.out.print(sss[0]+" : "+" is the highest length polindrome which is present in the given string.");
	}

}
