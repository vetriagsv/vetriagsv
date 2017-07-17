
public class Hunter72 {
	public static void main(String[] args) {
		userMethod("This is an example for this question");
	}
	public static void userMethod(String sentence){
		String out="";
		String[] str=sentence.split(" ");
		for(int i=0;i<str.length;i++){
			if(i%2==0){
			   StringBuffer ss=new StringBuffer(str[i]);
			   StringBuffer rev=ss.reverse();
			   str[i]=String.valueOf(rev);
		    }
			else{
				str[i]=str[i];
			}
			out=out+" "+str[i];
		}
		System.out.println(out);
	}

}
