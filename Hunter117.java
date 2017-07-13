
public class Hunter117 {
	public static void main(String[] args) {
		Hunter117 h=new Hunter117();
		h.userMethod(1);
	}
	public static void userMethod(int a){
		if(a<=100){
			System.out.println(a+" ");
			userMethod(a+1);
		}
	}

}
