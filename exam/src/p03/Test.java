package p03;


public class Test {
	String str;
	
	Test(String str){
		this.str = str;
	}
	
	void print(ObjectExam oe) {
		System.out.print("ObjectExam이 가지고 있는 변수 2개의 값은 = ");
		System.out.print(oe.num1 + ",");
		System.out.println(oe.num2);
	}
	
	public static void main(String[] args) {		
		ObjectExam oe = new ObjectExam();
		oe.inputNums();
		
		GuGuDan ggd = new GuGuDan();
		ggd.printLoop(oe);
	}
}
