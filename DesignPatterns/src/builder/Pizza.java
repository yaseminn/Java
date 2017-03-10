/**
 * 
 */
package builder;

/**
 * @date Mar 9, 2017
 */
public abstract class Pizza implements Item{

	@Override
	public abstract float calculatePrice();

	/* (non-Javadoc)
	 * @see builder.Item#getPacking()
	 */
	@Override
	public Packing getPacking() {
		// TODO Auto-generated method stub
		return new Wrapper();
	}

}
