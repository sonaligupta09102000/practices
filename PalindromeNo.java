
import java.util.*;

   public class PalindromeNo{
        
         public static void main(String[] args){
		 
		 int n,c,sum=0,rem;
		 System.out.println("Enter Any Number: ");
		 Scanner sc=new Scanner(System.in);
		 
		 n= sc.nextInt();
		 
		 c=n;
		 
		 while(n>0)
		 {
		   rem=n%10;
		   sum=(rem*rem*rem)+sum;
		   n=n/10;
		 }
		 if(c==sum)
		 {
		   System.out.println("It is a Palindrome Number!!!!....");
		 }
		  else
		  {
		   System.out.println("It is Not a Palindrome Number!!!.....");
		 
		  }
		 
		 
		 } 		 
   
   
   
   
   
   
   
   
   
   
   }