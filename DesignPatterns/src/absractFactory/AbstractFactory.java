/**
 * 
 */
package absractFactory;

/**
 * @date Mar 9, 2017
 */
public abstract class AbstractFactory {
	enum UserType{
		MANAGER,
		ENGINEER
	};
	
enum OperationType{
	DELETE,
	UPDATE
};

	abstract User createUser(UserType uType);
	abstract Operation operateUser(OperationType opType);
}
