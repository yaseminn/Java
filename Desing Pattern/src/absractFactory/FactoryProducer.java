/**
 * 
 */
package absractFactory;

/**
 * @date Mar 9, 2017
 */
public class FactoryProducer {
	
	enum FactoryType{
		OPERATION,
		USER
	};
	
	public static AbstractFactory getFactory(FactoryType type){
		
		switch (type){
		case OPERATION:
			return new OperationFactory();
		case USER:
			return new UserFactory();
		default:
			return null;
		}
	}
	
}
