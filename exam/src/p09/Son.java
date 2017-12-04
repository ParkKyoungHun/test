package p09;

public class Son extends FaFa{

	public Son() {
//		super("abc");
	}
	
	public void print() {
		System.out.println("fafa's a=" + a);
		a = 10;
		System.out.println("fafa's a=" + a);
	}
	protected void print(String str) {
		System.out.println(str);
	}
	
	void print(String str, String str2) {
		System.out.println(str +"," + str2);
	}
	
	public static void main(String[] args) {
		Son s = new Son();
		s.print();
	}
}
