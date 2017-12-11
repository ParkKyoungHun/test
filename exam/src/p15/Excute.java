package p15;

import java.util.ArrayList;

public class Excute {
	public static void main(String[] args) {
		Controller e = new Controller();
		ArrayList<User> userList = e.get("list",null);
		for(int i=1;i<=5;i++) {
			User user = new User("이름" + i, i,i);
			e.get("add",user);
		}
		User user = new User("모모",20,2);
		e.get("update", user);
		System.out.println("수정결과 : ");
		for(User u : userList) {
			System.out.println(u);
		}
		e.get("add",user);
		System.out.println("추가결과 : ");
		for(User u : userList) {
			System.out.println(u);
		}
		e.get("remove",user);
		System.out.println("삭제결과 : ");
		for(User u : userList) {
			System.out.println(u);
		}
		
		userList = e.get("search", user);
		e.get("add",user);
		System.out.println("검색결과 : ");
		for(User u : userList) {
			System.out.println(u);
		}
		userList = e.get("list", null);
		e.get("add",user);
		e.get("add",user);
		e.get("add",user);
		System.out.println("다시 불러오기 : ");
		for(User u : userList) {
			System.out.println(u);
		}

	}
}
