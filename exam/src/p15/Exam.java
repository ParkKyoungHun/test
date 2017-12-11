package p15;

import java.util.ArrayList;

public class Exam {

	public static void main(String[] args) {
		ArrayList<User> users = new ArrayList<User>();
		
		for(int i=0;i<1;i++) {
			User u = new User("Name",i,i);
			users.add(u);
		}
		
		User u = users.get(0);
		u.setName("test");
		u.setAge(30);
		for(User user : users) {
			System.out.println(user);
		}
	}
}
