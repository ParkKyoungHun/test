package p02;

public class FunctionTest {

	static void add(int num1, int num2) {
		System.out.println(num1+num2);
	}
	static String add2(int num1, int num2) {
		return num1 + " 과 " + num2 + "의 합은 " + (num1+num2) + "이란다.";
	}
	static int add3(int num1, int num2,int num3) {
		return num1 + num2 + num3;
	}

	static int add4(int[] numArr) {
		int result = 0;
		for(int i=0;i<numArr.length;i++) {
			result += numArr[i];
		}
		return result;
	}
	public static void main(String[] args) {
		add(1,2);
		System.out.println(add2(1,2));
		String a = "    3    1       ";
		System.out.println(a.trim()+"끝");
	}
}
