
public class Hunter88 {
	public static void main(String[] args) {
		userMethod("aabdceaaabbbcd");
	}
	public static void userMethod(String s){
		String str="";
		int len=s.length();
		for(int i=0;i<len-1;i++){
			char c=s.charAt(i);
			str+=c;
			s=s.replace(c,' ');
		}
		str=str.replace(" ","");
		System.out.println("Original unreversed String : "+str);
		StringBuffer ss=new StringBuffer(str);
		StringBuffer rev=ss.reverse();
		System.out.println("Reversed Proceesed String : "+(String.valueOf(rev)));
		}
	}

