/**
 * 
 */
package singleton;

/**
 * @date Mar 9, 2017
 */
public class SingleObject {

	private static SingleObject sinOb = new SingleObject();
	
	private SingleObject(){}
	
	public static SingleObject getInstance(){
		return sinOb;
	}
	
	public void getMessage(){
		System.out.println("Single Object created");
	}
}
