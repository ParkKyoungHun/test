package p11;

import java.util.ArrayList;
import java.util.Random;

public class ListExam3 {
	// Integer클래스만 넣을 수 있는 ArrayList alInt를 선언해주세요
	// 최소값 1부터 최대값 100까지 나오는 랜덤함수의 값을
	// 반복문 0부터 20까지 돌면서 alInt에 추가해주세요.
	// alInt가 가지고 있는 모든 값을 더한 토탈값을 출력해주세요.
	
	public static void main(String[] args) {
		ArrayList<Integer> alInt = new ArrayList<Integer>();
		for(int i=0;i<=20;i++) {
			Random r = new Random();
			alInt.add(r.nextInt(100)+1);
		}
		
		int sum = 0;
		for(Integer i : alInt) {
			sum += i;
		}
		System.out.println(sum);
	}
}
