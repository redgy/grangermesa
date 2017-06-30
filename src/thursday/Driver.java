package thursday;

import java.util.Random;
public class Driver {
	Grocery g;	
	Random rGen;
	
	public void runTests() {
		g = new Grocery();
		rGen = new Random();
		int num = rGen.nextInt(10) + 1;
		System.out.println(num);
		g.showCart();
		g.buyBread(2);
		g.showCart();
		g.returnEggs(2);
	}
	
	
	
	/************ Ignore this given code, just trust it ************/
	public Driver() 
	{
		runTests();
	}
	
	public static void main(String [] args) 
	{
		new Driver();
	} // End main
	
} // End class

