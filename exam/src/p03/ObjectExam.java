package p03;

import java.util.Scanner;

public class ObjectExam {
	int num1;
	int num2;
	int add() {
		return num1 + num2;
	}
	int getNum2(int num2) {
		return num2;
	}
	void inputNums() {
		Scanner s = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력해주세요 : " );
		num1 = s.nextInt();
		System.out.println("두번째 숫자를 입력해주세요 : " );
		num2 = s.nextInt();
	}
	void printLoop() {
		for(int i=num1;i<num2;i++) {
			System.out.print(i+",");
			if(i%10==0) {
				System.out.println("");
			}
		}
		System.out.println(num2);
	}
	public static void main(String[] args) {
		ObjectExam o;
		o = new ObjectExam();
	}
}
