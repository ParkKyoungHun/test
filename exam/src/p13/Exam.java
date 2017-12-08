package p13;

import java.util.ArrayList;

public class Exam {
	
	public static void main(String[] args) {
		
		ArrayList<Person> al = new ArrayList<Person>();
		Person p = new Person();
		al.add(p);
		p.setAge(1);
		
		al.add(p);
		p.setAge(2);
		
//		System.out.println(al.get(0).getAge());
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(2);
		ar.add(3);
		ar.add(1);
		ar.add(5);
		ar.add(6);
		ar.add(10);
		ar.add(2);
		int idx = 0;
		for(int i=0,maxLen=ar.size()-1;i<=maxLen;i++) {
			if(ar.get(idx)<ar.get(i)) {
				idx = i;
			}
			if(i==maxLen) {
				ar.add(ar.get(idx));
				ar.remove(idx);
				idx = 0;
				i = -1;
				maxLen--;
			}
		}
		for(int i:ar) {
			System.out.println(i);
		}
		
	}
}
