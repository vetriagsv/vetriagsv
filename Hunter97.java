import java.util.ArrayList;

public class Hunter97 {
	public static void userMethod(){
		ArrayList<String> s=new ArrayList<String>();
		s.add("Smile");
		s.add("Cry");
		s.add("Fear");
		System.out.println("Alex going to school with "+s.get(1)+" and "+s.get(2)+". while return from school with "+s.get(0));
	}
	public static void main(String[] args) {
		Hunter97 h=new Hunter97();
		h.userMethod();
	}

}
