package p11;

import java.util.ArrayList;
import java.util.HashMap;

public class MapExam {

	public static void setHm(HashMap<String,String> hm) {
		hm.put("name", "박경훈");
		hm.put("age", "33");
	}
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		ArrayList alMap = new ArrayList();
		for(int i=0;i<4;i++) {
			hm = new HashMap<String,String>();
			hm.put("age",i+"");
			alMap.add(hm);
		}
	}
}
