package Oractising;

public class Ifelse {

	public static void main(String[] args) {
		{
 	   int val1 = 20;
 	   int val2 = 40;
 	    
 	   boolean condition = val1 == val2;
 	   System.out.println("the given value is: " +   condition);
		}
		
		int num1 = 56;
		int num2 = 54;
		boolean condition = num1==num2;
		System.out.println("the given value is: "+ condition);
 	   
 	   int score = 95;
 	   String grade ;
 	   
 	   if (score >90 ) 
 		   
 	   {grade="A";}
 	   
 	   else if (score <90) 
 		   { grade  = "B";}
 	    else 
 		  {grade = "C";}
 	   
 	   System.out.println("My score is :" + score );
 	   System.out.println("my grade is : " + grade );
 	   
 	   char MyChar = '\u00D8';
 	   System.out.println(MyChar);  // this is the website Unicode-table.com to find out extended characters
	}

}
