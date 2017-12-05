package p10;

public class Excute {
	
	public void print(Father f) {
		System.out.println(f.toString());
	}
	
	public static void main(String[] args) {
		Father f = new Father(1,2);
		Excute e = new Excute();
		e.print(f);
		Object p = new P2();
		System.out.println(p.toString());
	}
}
