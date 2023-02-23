 import java.util.*;

  public class Prime{
  
     public static void main(String[] args)
	 {
	     int n1,n2,i,j;
		 System.out.println("Enter Any Two Number: ");
		 Scanner sc=new Scanner(System.in);
		 n1=sc.nextInt();
		 System.out.println("you enter 1st no :" + n1);
		 n2=sc.nextInt();
		 System.out.println("You enter 2nd no: " + n2);
		 
		 for(i=n1; i<=n2; i++)
		 {
            for(j=2; j<=i; j++)
             {
			    if(i%j==0)
			    break;		
		 }
		 if(i==j)
		    System.out.println(j);
			 
		 }
	 }
  }