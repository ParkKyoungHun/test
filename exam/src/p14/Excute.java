package p14;

import java.util.ArrayList;
import java.util.Random;

public class Excute {

	public static void main(String[] args) {
		ArrayList<MapExam> al = new ArrayList<MapExam>();
		MapExam me = new MapExam();
		Random r = new Random();
		for(int i=0;i<10;i++) {
			me = new MapExam();
			me.put("name", "r" + i);
			int age = r.nextInt(100)+1;
			me.put("age", age + "");
			me.put("address", "서울");
			al.add(me);
		}
		for(MapExam m : al) {
			System.out.println(m);
		}
	}
}
