/**
 * 
 */
package absractFactory;

/**
 * @date Mar 9, 2017
 */
public class OperationFactory extends AbstractFactory{

	/* (non-Javadoc)
	 * @see absractFactory.AbstractFactory#createUser(absractFactory.AbstractFactory.UserType)
	 */
	@Override
	User createUser(UserType uType) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see absractFactory.AbstractFactory#operateUser(absractFactory.AbstractFactory.OperationType)
	 */
	@Override
	Operation operateUser(OperationType opType) {
		
		switch(opType){
		case DELETE:
			return new Delete();
		case UPDATE:
			return new Update();
		default:
			return null;
		}
	}

}
