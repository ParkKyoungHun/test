package p12;

import java.util.LinkedHashMap;
import java.util.Random;

public class MapExam {
	LinkedHashMap<Integer,String> hm = new LinkedHashMap<Integer,String>();
	
	void add(String str) {
		hm.put(hm.size(), str);
	}
	void add(int idx) {
		hm.put(idx, (hm.size()+1)+"번째값");
	}
	public static void main(String[] args) {
		MapExam me = new MapExam();
		Random r = new Random();
		for(int i=0;i<10;i++) {
			int n =r.nextInt(10); 
			if(me.hm.get(n)==null) {
				me.add(n);
			}else {
				i--;
			}
		}
		System.out.println(me.hm);
	}
}
