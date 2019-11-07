package Oractising;

public class Methods2 {
	
    public static void main(String[] args) {
    	KgTomato("tomato ", 39);
    	KgTomato("Apple ", 43);
    	KgTomato("Cucumber ", 50);
    	KgTomato("Orange ", 37);
    	KgTomato("Parslays ", 29);
    	KgTomato("Egplant ", 20);
    }
    public static void KgTomato(String VegetableName , int kg) {
		
	   String grade;
		if (kg < 35 && kg >40){
			grade = "A";
		}else if (kg <30 && kg >35) {
			grade= "B";}
			
				
		else if (kg<28 && kg>30) {
			grade = "C";
			
		}else
			{grade = "D";
			
			}	System.out.println(" grade of "  + VegetableName + "is:" + grade);
			
		
		
		
		
		
    }
	}


