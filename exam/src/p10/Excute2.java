package p10;

public class Excute2 {

	// P3 클래스 생성 p2 상속받아 주세요
	// p4클래스 생성 p3 상송받아 주세요
	// toString()함수를 모두다 선언해주시구요
	// 각각의 클래스들을 모두다 Object 데이터 타입으로 변수 선언 및 
	// 생성자 호출하여 초기화 한후
	// 오브젝트 배열에 넣어주세요
	//  반복문을 사용하여 오브젝트 배열에 있는 각각의 방에 있는 변수를
	// System.out.println()으로 출력해주시기 바랍니다.
	public static void main(String[] args) {
		Object p1 = new Person();
		Object p2 = new P2();
		Object p3 = new P3();
		Object p4 = new P4();

		Object[] os = new Object[4];
		os[0] = p1;
		os[1] = p2;
		os[2] = p3;
		os[3] = p4;
		
		for(Object o : os) {
			System.out.println(o);
		}
	}
}
