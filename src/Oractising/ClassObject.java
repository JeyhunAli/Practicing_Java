package Oractising;

public class ClassObject {

	public static void main(String[] args) {

             aircraft cessna172 = new aircraft();
             
             aircraft piperseratoga = new aircraft();  // creating object of the class 
             
             cessna172.passenger = 4;
             cessna172.cruisespeed = 140;
             cessna172.fuelburnrate = 56.5;
             cessna172.fuelcapacity = 9.5;
              
 System.out.println("cessna172 passanger sit place is: " + cessna172.passenger);     // accesing the object 
System.out.println("cessna cruisespeed is: " +cessna172.cruisespeed + " mph");
             System.out.println("cessna fuel burn rate is: " + cessna172.fuelburnrate +" gph");
             System.out.println( "ncessna fuel capacity is: "+ cessna172.fuelcapacity +" gallons");
             
             
             
             
             piperseratoga.passenger = 6;
             piperseratoga.cruisespeed = 201;      // accesing the object
             piperseratoga.fuelburnrate =20.5;
           piperseratoga.fuelcapacity=102.5; 	
           
           System.out.println("\npiperseratoga passenger sitting place is: "+ piperseratoga.passenger);
           System.out.println("piperseratoga cruise speed is: "+ piperseratoga.cruisespeed);
             System.out.println("piperseratoga fuel burn rate is: " + piperseratoga.fuelcapacity);
             System.out.println("piperseratoga fuel capacity is "+ piperseratoga.fuelcapacity);
             
             
	}

}
        class aircraft {                // creating class class is bluprint of the object 
        	                                // which is we gonna create 
        	int passenger;              // number of people
        	int cruisespeed;           // miles per hour
        	double fuelburnrate;       //Gallons per hour
        	double fuelcapacity;       //gallons
        	
        	
        	
        }