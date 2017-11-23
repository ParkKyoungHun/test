package p03;


public class Test {
	String str;
	
	Test(String str){
		this.str = str;
	}
	void print() {
		System.out.println(str);
	}
	String getCoffee(int pay) {
		if(pay>1000) {
			return "커피 사왔습니다.";
		}
		return "돈 부족해 임마!!";
	}
	
	public static void main(String[] args) {		
		ObjectExam oe = new ObjectExam();
		
		Test t = new Test("가나다ABC123");
		
		//t.print();
		String result = t.getCoffee(1001);
		System.out.println(result);
		int a = 3;
		a = 4;
	}
}
