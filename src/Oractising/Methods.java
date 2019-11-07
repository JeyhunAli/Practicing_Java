package Oractising;

public class Methods {

	public static void main(String[] args) {
		findGrades("john " , 90);
		findGrades("Jeyhun " , 95);
		findGrades("Tom ", 70);
		findGrades("Chloe  ", 89);
		findGrades("Anayet ", 90);
		findGrades("Ahmed " , 89);
	}	
		
			
		public static void findGrades(String studentName, int score) {
      
       
       String grade;
       if(score>=90 && score<=100){
    	   grade = "A";
       }else if (score>=80 && score<=90){
    	   grade="B";
       }else if (score >=70 && score <=80) {
    	   grade = "c";
    	   }else {
    		   grade = "D";
    	   }
    	   System.out.println("Grade of "+ studentName + " is:"+ grade);
    	   
		
		
    	   
 
	
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    		   
    	   
    	   
  
       
	}

}
