/**
 * 
 */
package prototype;

import java.util.Hashtable;

/**
 * @date Mar 10, 2017
 */
public class UserCache {
	private static Hashtable<String, User> userMap = new Hashtable<>();

	public static User getUser(String id) {
		User userCache = userMap.get(id);
		return (User) userCache.clone();
	}

	public static void loadUser() {
		Student student = new Student();
		student.setId("1");
		userMap.put(student.getId(), student);

		Teacher teacher = new Teacher();
		teacher.setId("2");
		userMap.put(teacher.getId(), teacher);

	}
}
