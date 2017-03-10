/**
 * 
 */
package builder;

/**
 * @date Mar 9, 2017
 */
public abstract class Drink implements Item{

	/* (non-Javadoc)
	 * @see builder.Item#getPacking()
	 */
	@Override
	public Packing getPacking() {
		// TODO Auto-generated method stub
		return new Bottle();
	}

	/* (non-Javadoc)
	 * @see builder.Item#calculatePrice()
	 */
	@Override
	public abstract float calculatePrice();

}
