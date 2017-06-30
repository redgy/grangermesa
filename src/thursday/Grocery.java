package thursday;

import java.util.Random;
public class Grocery {
	int numEggs, numBread;
	Random rand;
	public Grocery() {
		rand = new Random();
		numEggs = 0;
		numBread = 0;
	} // End constructor
	
	/*
	Display the contents of your cart with println statements
	And add a new line at the end
	<<OUTPUT>>
	Your cart has...
		-## eggs
		-## loaves of bread
	*/
	public void showCart() 
	{
		System.out.println("Your cart has...");
		System.out.println("    - " + numEggs + " eggs");
		System.out.println("    - " + numBread + " loaves of bread");
		System.out.println();
	} // End showBasket
	

	 /* Print out a statement that tells you how many eggs you bought
	 * Update the number of eggs in your cart */
	public void buyEggs(int num) 
	{
		System.out.println("You bought " + num + " eggs");
		numEggs += num;
	}
	
	/* Print out a statement that tells you how many loaves of bread you bought
	 * Update the number of eggs in your cart */
	public void buyBread(int num) 
	{
		System.out.println("You bought " + num + " loaves of bread");
		numBread += num;
	}
	
	
	/* Print out a statement that tells you how many eggs you returned
	 * Update the number of eggs in your cart 
	 * Be sure to take care of the case you return too many
	 * Display an error message if that's the case (but don't update the number of eggs)
	 */
	public void returnEggs(int num) 
	{
		if(num > numEggs)
			System.out.println("Couldn't return eggs");
		else {
			numEggs -= num;
			System.out.println("You returned " + num + " eggs");
		}
	}
	
	
	/* Print out a statement that tells you how many loves of bread you returned
	 * Update the number of loaves of bread in your cart 
	 * Be sure to take care of the case you return too many
	 * Display an error message if that's the case (but don't update the number of loaves of bread)
	 */
	public void returnBread(int num) {
		if(num > numBread)
			System.out.println("Couldn't return bread");
		else {
			numBread -= num;
			System.out.println("You returned " + num + " loaves of bread");
		}
	}
	
	/*
	 * haveMoreOf method returns a String saying which you have more of
	 * Either: eggs, bread, or both
	 */
	public String haveMoreOf() {
		if(numEggs < numBread)
			return "bread";
		else if(numBread < numEggs)
			return "eggs";
		else
			return "both";
	}
	
	public void grabRandom() {
		int num = rand.nextInt();
		if(num %2 == 0)
			numEggs++;
		else
			numBread++;
	}
	
} // End class

