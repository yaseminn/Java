/**
 * 
 */
package absractFactory;

/**
 * @date Mar 9, 2017
 */
public class Manager implements User{

	/* (non-Javadoc)
	 * @see absractFactory.User#create()
	 */
	@Override
	public void create() {
		System.out.println("Manager:create method");
		
	}

}
