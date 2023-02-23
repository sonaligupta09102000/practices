import java.util.*;

  public class PrimeNo{
  
     public static void main(String[] args)
      
	  {
	     int n,count=0;
		 System.out.println("Enter Any Number: ");
	         Scanner sc=new Scanner(System.in);
		 
		 n=sc.nextInt();
		 int i;
		 
		for(i=1;i<=n;i++)
		 {
		            if(n%i==0)
                    {
                    count++;	   
                    }
                 
		 }

		  if(count==2)
		  {
		  System.out.println(i  + "  "   + "It is a Prime No");
	      
		  }


		  else
                  {
                     System.out.println(i +  "  "  + "It is not a Prime No"); 
                  }
	
		
	  }
	  
	 }