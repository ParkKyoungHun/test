package p15;

import java.util.ArrayList;

public class Excute {
	public static void main(String[] args) {
		Controller c = new Controller();
		for(int i=1;i<=5;i++) {
			User user = new User("이름" + i, i);
			c.get("add",user);
		}
		ArrayList<User> userList = c.get("list",null);
		for(User user:userList) {
			System.out.println(user);
		}
		User ru = new User("이름3",3);
		c.get("remove", ru);
		for(User user:userList) {
			System.out.println(user);
		}
	}
}
