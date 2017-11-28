package p05;

import java.util.Scanner;

public class ArrayExam2 {

	public static void main(String[] args) {
		// 스캐너 클래스로 구구단의 최대값을 입력받아 주세요
		// 입력받은 각각의 단 만큼 구구단을 출력하는 프로그램을 
		// 작성해 주시기 바랍니다.
		Scanner s = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력해주세요");
		int num1 = s.nextInt();
		System.out.println("두번째 숫자를 입력해주세요");
		int num2 = s.nextInt();
		
		for(int i=1;i<=num2;i++) {
			for(int j=1;j<=num1;j++) {
				System.out.print(i + " X  " + j + " = " + (i*j));
				if(j!=num1) {
					System.out.print(",");
				}else {
					System.out.println();
				}
			}
		}
	}
}
