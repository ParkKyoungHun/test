package p03;

public class GuGuDan {
	
	GuGuDan(){
		System.out.println("GuGuDan 실행");
	}
	
	void printLoop(ObjectExam oe) {
		for(int i=1;i<oe.num1;i++) {
			for(int j=1;j<oe.num2;j++) {
				System.out.print("[" + i + "," + j + "]");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
	}
}
