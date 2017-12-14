package p16;

import java.util.ArrayList;
import java.util.Scanner;

public class ExceptionExam {
	
	public void convertAndPrint(String numStr) throws Exception {
		System.out.println(Integer.parseInt(numStr)+1);
	}
	public static void main(String[] args) {
		ExceptionExam ee = new ExceptionExam();
		System.out.println("출력하실 숫자를 적어주세요");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.println("입력하신 숫자가 그거였군요");
		System.out.println("잘했어요 연산해볼게요 조만 기댕기봐요");
	}
}
