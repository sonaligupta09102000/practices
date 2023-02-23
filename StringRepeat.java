import java.util.*;

 public class StringRepeat{

    public static void main(String[] args){
	
	
	    String x1;
		System.out.println("Enter Any String");
		Scanner sc=new Scanner(System.in);
		x1=sc.next();
		char a[]=x1.toCharArray();
		int size=a.length;
	     
		Map<Character, Integer> RepeatedString=new LinkedHashMap<>();
       int i=0;
       while(a[i]!=0)
       {
	      if(RepeatedString.containsKey(a[i])==false)
		  {
		  
              RepeatedString.put(a[i],1);		  
		  
		  }
	   
	   else
	   {
	     int oldvalue=RepeatedString.get(a[i]);
		 int newvalue=oldvalue+1;
		 RepeatedString.put(a[i],newvalue);
	   
	   }	   
	   ++i;
	
	   }
	   
	   
    Set<Map.Entry<Character,Integer>> RepeatedString1=RepeatedString.entrySet();
	
	String x2=" ";
	for(Map.Entry<Character,Integer> list : RepeatedString1)
	{
	    x2=x2+list.getKey();
	}
    System.out.println(x2);

   }

}


 
       