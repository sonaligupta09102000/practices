import java.util.*;

    public class RepeatedString{
	
	  public static void main(String[] args){
	
	  
	    //String x;//="AAKASH";
		String x1;
		System.out.println("Enter Any String");
		Scanner sc=new Scanner(System.in);
		x1=sc.next();
		char a[]=x1.toCharArray();
		
		//System.out.println(a);
		
		//Arrays.sort(a);
		
		
//System.out.println(a);
		
		int i,j;
		
		//lengthofArray =a.length;
		int count;
		 for(i=0;i< a.length; i++)
		 {
			  count=0;
			 for(j=i+1; j<a.length; j++)
			 {
				 if(a[i]==a[j])
					 
				 {
					 count++;
					 //System.out.println(a[j]);
					 //break;
				 }
				 
			 }
			 
			 if(count!=0)
			 {
				 System.out.println(x1.charAt(i)+ "occurence"+  count+ "time");
				 
			 }
		 }
	  }
	}
		
		
		//for(i>l-1; i<=l; i++)
		//{
			//boolean re=a.equals(x1);
			
			//System.out.println(x1);
			
			
		//}
		
		
	
	 
	  
	  	
	
	
