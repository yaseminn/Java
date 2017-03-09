package factory;

public class Student implements User{

	/* (non-Javadoc)
	 * @see factory.User#create()
	 */
	@Override
	public void create() {
		
		System.out.println("Creating Student");
	}

}
