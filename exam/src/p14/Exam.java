package p14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

public class Exam {

	public HashMap<Integer,ArrayList<Integer>> getAL(int num){
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=1;i<=num;i++) {
			if(num % i==0) {
				al.add(i);
			}
		}
		HashMap<Integer,ArrayList<Integer>> hm = new HashMap<Integer,ArrayList<Integer>>();
		hm.put(num, al);
		return hm;
	}
	public static void main(String[] args) {
		Exam e = new Exam();
		HashMap<Integer, ArrayList<Integer>>
		hm =  new HashMap<Integer, ArrayList<Integer>>();
		Random r = new Random();
		for(int i=0;i<5;i++) {
			int n = r.nextInt(51)+50;
			hm.putAll(e.getAL(n));
		}
		Iterator<Integer> it = hm.keySet().iterator();
		while(it.hasNext()) {
			Integer key = it.next();
			System.out.println(hm.get(key).size());
		}
	}
}
