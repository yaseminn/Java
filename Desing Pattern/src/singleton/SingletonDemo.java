package singleton;

import java.io.ObjectInputStream.GetField;

/**
 * @date Mar 9, 2017
 */
public class SingletonDemo {

	public static void main(String [] args){
		
		// complie time error
//		SingleObject obj = new SingleObject();
		
		SingleObject obj = SingleObject.getInstance();
		obj.getMessage();
 }
}
