package p16;

public class Excute {
	
	public void printAction(Action act) {
		// eat호출시 누구누구가 먹습니다.
		act.eat();
		// sleep 호출시 누구누구가 잡니다.
		act.sleep();
		// walr호출시 누구누구가 걷습니다.
		act.walk();
	}

	public static void main(String[] args) {
		Action hong = new Hong("Hong",20,173,"hone@gmail.com");
		Excute e = new Excute();
		e.printAction(hong);
		//동물도 이름, 나이, 몸길이를 가지게 만들어 주시구요
		// Cat생성자 호출시 이름 나이 몸길이를 저장하게 만들어주세요
		Cat c = new Cat("DongDong",5,45);
		e.printAction(c);
	}
}
