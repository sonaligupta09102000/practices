import java.util.*;

    public class PowArmstrong{
	
	   public static void main(String[] args){
	   
	     int n,count=0,rem;
		 double arms=0;
		 System.out.println("Enter Any Number: ");
		 Scanner sc=new Scanner(System.in);
		 n=sc.nextInt();
		 
		 int c=n;
		 
		 
		 while(c!=0)
		 {
		    count=count+1;
			c=c/10;
		 
		 }
		 
		 c=n;
		 while(c>0){
		 
		    rem=c%10;
			arms=arms+Math.pow(rem,count);
			c=c/10;
		 
		 }
		 
		 
		 if(arms==n)
		 {
		     System.out.println("The Entered Number is Armstrong!!!...");
		 }
		 else
		 {
		    System.out.println("The Entered Number is Not Armstrong!!..");
		 }
	   
	   
	   
	   
	   
	   
	   
	   
	   }
	
	
	
	
	
	}