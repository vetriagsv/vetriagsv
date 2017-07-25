import java.util.ArrayList;
import java.util.Collections;

public class Pro57 {
	public static void main(String[] args) {
		userMethod("xyz123klm","abc123hij");
	}
	public static void userMethod(String s1,String s2){
		String sub="";
		ArrayList a=new ArrayList();
		ArrayList a2=new ArrayList();
		for(int i=0;i<s1.length()-1;i++){
			for(int j=i+2;j<=s1.length();j++){
				 sub=s1.substring(i,j);
				 a.add(sub);
			}
	    }
		for(int i=0;i<a.size();i++){
			String tem=(String) a.get(i);
			if(s2.contains(tem)){
				a2.add(tem);
			}
		}
		System.out.println("These all the substrings from input1 present in the input2:");
		//System.out.println("");
		for(int i=0;i<a2.size();i++){
		System.out.print((String) a2.get(i)+" ");
		}
	}
}

