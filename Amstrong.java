import java.util.*;

  public class Amstrong{
  
     public static void main(String[] main){
       
        int n,rem,arms=0;
		System.out.println("Enter Any Number: ");
		Scanner sc=new Scanner(System.in);
		
		n=sc.nextInt();
		
		int c=n;
		
		
		
		while(n>0)
		{
	    rem=n%10;
		arms=(rem*rem*rem)+arms;
	
		n=n/10;
		
	   }
		if(c==arms)
		{
		   System.out.println("It is a Armstrong Number!!!.. ");
		}
		else
		{
		   System.out.println("The Number is not Armstrong!!..");
		}
	 }
 
  }