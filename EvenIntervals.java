import java.util.Scanner;


public class EvenIntervals {
	public static void main(String[] args){
       Scanner ss=new Scanner(System.in);
       System.out.println("Enter the number and end value:");
       int number=ss.nextInt();
       int end=ss.nextInt();
       while(number<end){
    	   number=number+1;
    	   if(number%2==0){
    		   System.out.println(number);
    		   number+=1;
    	 }
    		
       }
	}
    	   
}

