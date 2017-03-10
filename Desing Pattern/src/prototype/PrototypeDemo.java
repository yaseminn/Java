/**
 * 
 */
package prototype;

/**
 * @date Mar 10, 2017
 */
public class PrototypeDemo {
public static void main(String[] args){
	UserCache.loadUser();
	
	User studentClone = UserCache.getUser("1");
	System.out.println("User: " + studentClone.getType());
	
	User teacherClone = UserCache.getUser("2");
	System.out.println("User: " + teacherClone.getType());

}
}
