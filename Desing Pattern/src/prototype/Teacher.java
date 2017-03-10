/**
 * 
 */
package prototype;

/**
 * @date Mar 10, 2017
 */
public class Teacher extends User{
	
	public Teacher(){
		type = "Teacher";
	}

	/* (non-Javadoc)
	 * @see prototype.User#create()
	 */
	@Override
	void create() {
		// TODO Auto-generated method stub
		System.out.println("Teacher:create method");
	}

}
