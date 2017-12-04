package p09;

public class FaFa {
	protected int a = 3;
	
//	public FaFa() {
//		System.out.println("아빠 생성자 호출");
//	}
	
	protected FaFa(String str) {
		System.out.println("아빠 생성자 호출 : " + str);
	}
	
	FaFa() {
		System.out.println("아빠 기본 생성자 호출");
	}
	
	public FaFa(String str1, String str2) {
		System.out.println("아빠 생성자 호출 : " +str2);
	}
	
	public void print() {
		System.out.println("내가 니 애비다!");
	}
	
	protected void print(String str) {
		System.out.println(str + ":아빠함수");
	}
}
