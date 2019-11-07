package Oractising;

public class ClassExercising {

	public static void main(String[] args) {
		 
		grocerystore apple = new grocerystore();
		  apple.numsoldapples =1000;
		  apple.reatailprice = 2.5;
		  System.out.println("total sold apple: " + apple.numsoldapples);
		  System.out.println("total retailprice " + apple.reatailprice);
		  
		  
		  grocerystore orange = new grocerystore();
		  orange.numsoldorange =850;
		  orange.retailprice =3.2;
		  System.out.println("total orange sold: "+ orange.numsoldorange);
		  System.out.println("total retail price:" + orange.retailprice);
		  
		 
		
		

	}

}

 class grocerystore {
	 
	 int numsoldapples;
	 double retailprice;
	 int numsoldorange;
	 double reatailprice;
	 
 }