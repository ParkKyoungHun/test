package p16;

import java.util.ArrayList;

public class ArrayExam {

	private ArrayList<Integer> list;
	ArrayExam(){
		list = new ArrayList<Integer>();
	}
	public ArrayList<Integer> getArrayList(int a, int b) {
		for(int i=0;i<10;i++) {
			list.add(i);
		}
		return list;
	}
}
