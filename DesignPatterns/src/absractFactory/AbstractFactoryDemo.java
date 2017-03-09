/**
 * 
 */
package absractFactory;

import absractFactory.AbstractFactory.OperationType;
import absractFactory.AbstractFactory.UserType;
import absractFactory.FactoryProducer.FactoryType;

/**
 * @date Mar 9, 2017
 */
public class AbstractFactoryDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		AbstractFactory userFactory = FactoryProducer.getFactory(FactoryType.USER);
		AbstractFactory operationFactory = FactoryProducer.getFactory(FactoryType.OPERATION);
		
		User engineer = userFactory.createUser(UserType.ENGINEER);
		engineer.create();
		
		Operation update = operationFactory.operateUser(OperationType.UPDATE);
		update.operate();

	}

}
