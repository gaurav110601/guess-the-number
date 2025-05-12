import java.util.Scanner;
public class Main{
    
	public static void main(String[] args) {
		 int a = (int) (Math.random()*101);
		 int guess; 
		 
		 Scanner sc = new Scanner (System.in);
		 System.out.println("Guess the number : ");
		 
		 while (true){
		     
		     guess = sc.nextInt();
		     
		     if ( guess == a){
		         System.out.println("guessed number is correct");
		         break;
		     }
		   
		     else {
		         if(guess<a)
		         System.out.println("low value");
		         else
		         System.out.println("high value");
		     }
		  }
		  
		 
	}
}
