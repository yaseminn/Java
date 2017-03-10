/**
 * 
 */
package builder;

/**
 * @date Mar 9, 2017
 */
public class MeatPizza extends Pizza{

	/* (non-Javadoc)
	 * @see builder.Item#getName()
	 */
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Meat Pizza";
	}

	/* (non-Javadoc)
	 * @see builder.Pizza#calculatePrice()
	 */
	@Override
	public float calculatePrice() {
		// TODO Auto-generated method stub
		return 30.0f;
	}

}
