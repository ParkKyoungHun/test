package p11;

import java.util.ArrayList;

public class ListExam2 {
	ArrayList<String> alStr;
	ListExam2(){
		alStr = new ArrayList<String>();
	}
	
	public String getStr() {
//		System.out.println("123");
		return "123";
	}
	
	public int getInt() {
		return 1;
	}
	public static void main(String[] args) {
		ListExam2 le = new ListExam2();
		System.out.println(le.alStr.size());
		le.alStr.indexOf("3");
		String str = "123";
		System.out.println(str);
		System.out.println("123");
		System.out.println(le.getStr());
		System.out.println(1);
		int a = le.getInt();
	}
}
