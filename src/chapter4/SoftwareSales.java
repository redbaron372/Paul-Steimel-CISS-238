package chapter4;

/**Paul Steimel
 * Chapter 4
 * Programming Challenge 4
 *
 */


/**
 *The SoftwareSales class determines the discount and total 
 *cost of the sales based on quantity sold.
 */

public class SoftwareSales {

	private int quantity; // Stores quantity sold
	
	/**
	 * The constructor accepts an argument
	 * for the quantity field
	 */
	
	public SoftwareSales(int q)
	{
		quantity = q;
	}
	
	
	/**
	 * The getUnitsSold method returns the total of quantity.
	 */
	
	public int getUnitsSold()
	{
		return quantity;
	}
	
	/**
	 * The getDiscount method returns the amount of discount.
	 */
	
	public double getDiscount()
	{
		double discount = 0;
		
		if (quantity < 10)
		{
			discount = (quantity * 0);
		}
		
		else if (quantity > 9 && quantity < 20)
		{
			discount = (quantity * (99 * .2));
		}
		
		else if (quantity > 19 && quantity < 50)
		{
			discount = (quantity * (99 * .3));
		}
	
		else if (quantity > 49 && quantity < 100)
		{
			discount = (quantity * (99 * .4));
		}
		
		else
		{
			discount = (quantity * (99 * .5));
		}
		
		return discount;
		
	}
	
	
	/**
	 * The getCost method returns the cost of units sold.
	 */
	
	public double getCost()
	{
		double cost = 0;
		
		if (quantity < 10)
		{
			cost = (quantity * 99);
		}
		
		else if (quantity > 9 && quantity < 20)
		{
			cost = (quantity * (99 * .8));
		}
		
		else if (quantity > 19 && quantity < 50)
		{
			cost = (quantity * (99 * .7));
		}
	
		else if (quantity > 49 && quantity < 100)
		{
			cost = (quantity * (99 * .6));
		}
		
		else
		{
			cost = (quantity * (99 * .5));
		}
		
		return cost;
	}
	
	
	
}
