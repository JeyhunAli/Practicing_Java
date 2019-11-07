package Oractising;

public class MethodsNum {

	public static void main(String[] args) {
		double num2 = 65.5;
		double answer2;
		           int num1 = 20;  
		            int answer1;                          //instead of this you can also write 
        int num = 15;              //System.out.println("the right answer : "+  multiplyNumbers(num)); 
        int answer;
                    
                   answer = multiplyNumbers(num);     
System.out.println("the right answer : "+ answer); 
                   answer1 = multiplyNum(num1);
 System.out.println("the answer is: "+ answer1);   
                 answer2 = addNumbers(num2);
  System.out.println("after adding numbers the result is: "+ answer2);               
                 
 
                   
 }
	            public static int  multiplyNumbers(int a) {
		                        
		                     int answer = a*2;         //instead of this you can write also
		                     return answer;            //return(a*2);
		                     
		  
	 }
	 public static int multiplyNum(int b) {
		 int answer1= b * 30;
		 return answer1;
		 
		 
	 }
	 
	 public static double addNumbers(double a) {
	
		 double answer2 = a+30;
		 return answer2;
				 
	 }
	 
		 
	 }


