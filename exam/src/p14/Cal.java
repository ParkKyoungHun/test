package p14;

import java.util.ArrayList;
import java.util.Scanner;

public class Cal {
	int num1;
	int num2;
	String op;
	/*
	 * 1. 더하기, 빼기, 곱하기, 나누기를 각 각 실행 해주는 인트형 함수 네 개 만들고 
		사용자에게 피연산자 두 개와 연산자 하나를 입력 받아 
		입력받은 연산자에 맞는 함수를 실행하여 리턴받은 값을 어레이 리스트에 저장 
		저장 한 어레이리스트를 거꾸로 출력하는 프로그램을 작성하시오
		(단, 빼거나 나눌땐 자동으로 큰 값에서 작은값을 빼거나 나누어야 한다)
	 */

	void init() {
		Scanner s = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력해주세요.");
		num1 = s.nextInt();
		System.out.println("연산자를 입력해주세요.");
		op = s.next();
		System.out.println("두번째 숫자를 입력해주세요.");
		num2 = s.nextInt();
	}
	void check() {
		if(num1<num2) {
			int tmp = num1;
			num1 = num2;
			num2 = tmp;
		}
	}
	int add() {
		return num1+num2;
	}
	int minus() {
		return num1-num2;
	}
	int multiple() {
		return num1*num2;
	}
	int divide() {
		return num1/num2;
	}
	
	int cal() {
		if(op.equals("+")) {
			return add() ;
		}else if(op.equals("-")) {
			check();
			return minus() ;
		}else if(op.equals("*")) {
			return multiple() ;
		}else if(op.equals("/")) {
			check();
			return divide() ;
		}
		System.out.println("연산자 잘못입력했어 임마!1");
		return 0;
	}
	public static void main(String[] args) {
		Cal c;
		ArrayList<Cal> al = new ArrayList<Cal>();
		for(int i=0;i<2;i++) {
			c = new Cal();
			c.init();
			al.add(c);
		}
		for(int i=al.size()-1;i>=0;i--) {
			c = al.get(i);
			System.out.println(c.cal());
		}
	}
}
