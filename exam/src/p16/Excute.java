package p16;

public class Excute {

	public static void main(String[] args) {
		Action p = new Hong("Hong",20,173,"hone@gmail.com");
		System.out.println(p);
		((Person)p).eat("스팸 만개!!");
		p.sleep();
		p.walk();
	}
}
