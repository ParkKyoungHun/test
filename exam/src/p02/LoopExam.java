package p02;

import java.util.Scanner;

public class LoopExam {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int minNum = s.nextInt();
		int maxNum = s.nextInt();
		// minNum부터 maxNum까지 반복하는 반복문을 작성하여
		// 반복되는 i값을 출력해주세요.
		//minNum에 10 maxNum에 1이란 값이 들어갔을 경우
		int tmp = 0;
		if(minNum>maxNum) { // 10>1 이 만족함
			tmp = minNum; //tmp의 값은 10이 됨.
			minNum = maxNum; //minNum의 값은 1
			maxNum = tmp; //maxNum의 값은 10이 됨.
		}
		//결국 minNum = 1, maxNum=10이 됨.
		for (int i = minNum; i <= maxNum; i++) {
			System.out.print(i+",");
		}
	}
}
