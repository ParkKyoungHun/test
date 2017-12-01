package p09;

public class Son extends FaFa{

	public Son() {
		
	}
	
	public void print() {
		System.out.println("쫄지마 나야 나 썬!!");
	}
	public static void main(String[] args) {
		Son s = new Son();
		System.out.println(s.a);
		s.print();
	}
}
