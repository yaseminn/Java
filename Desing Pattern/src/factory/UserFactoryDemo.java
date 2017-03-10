package factory;

import java.util.Scanner;

public class UserFactoryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User userStudent = UserFactory.createUser(UserFactory.UserType.STUDENT);
		userStudent.create();

		User userTeacher = UserFactory.createUser(UserFactory.UserType.TEACHER);
		userTeacher.create();
		
	}

}
