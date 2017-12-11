package p15;

import java.util.ArrayList;

public class DAO {
	ArrayList<User> userList = new ArrayList<User>();
	
	public boolean insertUser(User user) {
		return userList.add(user);
	}
	public boolean removeUser(User user) {
		for(User u : userList) {
			if(u.getAge() == user.getAge() && u.getName().equals(user.getName())) {
				return userList.remove(u);
			}
		}
		return false;
	}
	public ArrayList<User> getUserList(String str){
		return userList;
	}
}
