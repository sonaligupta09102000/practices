import java.util.*;

  public class Anagrams{
     
	   public static void main(String[] args)
	   {
	        String x="SONALI";
            String y="NOSALI";

            char a[]=x.toCharArray();
            char b[]=y.toCharArray();

                        Arrays.sort(a);
			Arrays.sort(b);
			
			boolean result=Arrays.equals(a,b);
       			 
	        if(result==true)
            {
			  System.out.println("It is Anagrams");
			    
			}			
			
			else
			{
                   System.out.println("It is not Anagrams");			
			}
	   
	   
	   
	   
	   }
  
  
  
  
  
  
  
  
  
  }