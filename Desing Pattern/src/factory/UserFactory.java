package factory;

public class UserFactory {

	enum UserType {
		STUDENT, TEACHER
	};

	public static User createUser(UserType type) {

		switch (type) {
		case STUDENT:
			return new Student();

		case TEACHER:
			return new Teacher();

		default:
			return new Student();

		}

	}
}