package p04;

import p03.GuGuDan;
import p03.ObjectExam;

public class Excute {
	int num1;
	void getInt() {
		
	}

	public static void main(String[] args) {
		ObjectExam oe = new ObjectExam();
		oe.inputNums();
		
		GuGuDan ggd = new GuGuDan();
		ggd.printLoop(oe);
	}
}
