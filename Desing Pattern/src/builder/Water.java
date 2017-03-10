/**
 * 
 */
package builder;

/**
 * @date Mar 9, 2017
 */
public class Water extends Drink{

	/* (non-Javadoc)
	 * @see builder.Item#getName()
	 */
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Water";
	}

	/* (non-Javadoc)
	 * @see builder.Drink#calculatePrice()
	 */
	@Override
	public float calculatePrice() {
		// TODO Auto-generated method stub
		return 0.2f;
	}

}
