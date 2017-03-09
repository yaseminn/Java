package absractFactory;

/**
 * @date Mar 9, 2017
 */

public class UserFactory extends AbstractFactory{

	/* (non-Javadoc)
	 * @see absractFactory.AbstractFactory#createUser(absractFactory.AbstractFactory.UserType)
	 */
	@Override
	User createUser(UserType uType) {
		
		switch (uType){
		case MANAGER:
			return new Manager();
		case ENGINEER:
			return new Engineer();
		default:
			return null;
		}
		
	}

	/* (non-Javadoc)
	 * @see absractFactory.AbstractFactory#operateUser(absractFactory.AbstractFactory.OperationType)
	 */
	@Override
	Operation operateUser(OperationType opType) {
		// TODO Auto-generated method stub
		return null;
	}

	

	
}
