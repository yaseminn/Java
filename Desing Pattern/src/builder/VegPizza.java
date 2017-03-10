/**
 * 
 */
package builder;

/**
 * @date Mar 9, 2017
 */
public class VegPizza extends Pizza{

	/* (non-Javadoc)
	 * @see builder.Item#getName()
	 */
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Vegeterian Pizza";
	}

	/* (non-Javadoc)
	 * @see builder.Pizza#calculatePrice()
	 */
	@Override
	public float calculatePrice() {
		// TODO Auto-generated method stub
		return 25.0f;
	}

}
