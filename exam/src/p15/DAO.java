package p15;

import java.util.ArrayList;

public class DAO {
	ArrayList<User> userList = new ArrayList<User>();
	
	public boolean insertUser(User user) {
		return userList.add(user);
	}
	public User getUser(User user) {
		for(User u : userList) {
			if(u.getAge() == user.getAge() && u.getName().equals(user.getName())
					&& u.getNo()==user.getNo()) {
				return u;
			}
		}
		return null;
	}
	public User getUser(int no) {
		for(User u : userList) {
			if(u.getNo() == no) {
				return u;
			}
		}
		return null;
	}

	public boolean updateUser(User user) {
		User u = getUser(user.getNo());
		if(u==null) {
			return false;
		}else {
			u.setName(user.getName());
			u.setAge(user.getAge());
			return true;
		}
	}
	public ArrayList<User> getUser(String name) {
		ArrayList<User> userList = new ArrayList<User>();
		for(User u : this.userList) {
			if(u.getName().indexOf(name)!=-1) {
				userList.add(u);
			}
		}
		return userList;
	}
	public boolean removeUser(User user) {
		User u = getUser(user.getNo());
		if(u==null) {
			return false;
		}
		return userList.remove(u);
	}
	public ArrayList<User> getUserList(String str){
		if(str==null) {
			return userList;
		}else {
			ArrayList<User> userList = getUser(str);
			return userList;
		}
	}
}
