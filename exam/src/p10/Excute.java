package p10;

public class Excute extends Father{
//	int a = 4;
	public void print() {
		System.out.println("아들 프린트");
	}
	public void print(int a) {
		System.out.println("아들 프린트 : "+a);
	}
	public static void main(String[] args) {
		Excute e = new Excute();
		e.print();
		System.out.println(e.a);
	}
}
