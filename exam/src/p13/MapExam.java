package p13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class MapExam {

	public static void main(String[] args) {
		HashMap<String, String> hm;
		ArrayList<HashMap<String,String>> al = new ArrayList<HashMap<String,String>>();
		Random r = new Random();
		for(int i=0;i<10;i++) {
			hm = new HashMap<String, String>();
			hm.put("age", (r.nextInt(100)+1)+"");
			hm.put("name", i+"홍길동");
			al.add(hm);
		}

		ArrayList<HashMap<String,String>> al2 = new ArrayList<HashMap<String,String>>();
		int max = 0;
		int idx = 0;
		for(int i=0;i<al.size();i++) {
			if(max<Integer.parseInt(al.get(i).get("age"))) {
				max = Integer.parseInt(al.get(i).get("age"));
				idx = i;
			}
			if(i==al.size()-1) {
				al2.add(al.get(idx));
				al.remove(idx);
				max = idx = 0;
				i = -1;
			}
		}
		for(HashMap<String,String> h : al2) {
			System.out.println(h);
		}
	}
}
