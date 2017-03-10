/**
 * 
 */
package prototype;

/**
 * @date Mar 10, 2017
 */
public class Student extends User{

	public Student(){
		type = "Student";
	}
	/* (non-Javadoc)
	 * @see prototype.User#create()
	 */
	@Override
	void create() {
		System.out.println("Student:create method");
	}
	
	

}
