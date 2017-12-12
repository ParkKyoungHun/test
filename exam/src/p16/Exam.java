package p16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import com.google.common.collect.Lists;


public class Exam {
/*
 * 1. 총 5명의 학생의 점수를 Scanner클래스의 nextLine()함수를 
 * 사용하여 입력받아 총점 과 평균을 구하고 점수가 낮은 순서대로 
 * 출력해주세요.
 * ex) 입력 순서가 50점, 60점, 30점, 70점, 100점 이였다면
 * 30, 50, 60, 70, 100 <-- 점수가 낮은 순서대로 출력
 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Integer[] nums = new Integer[5];
		for(int i=0;i<5;i++) {
			System.out.println((i+1) + "번째 학생점수 입력=>");
			nums[i] = Integer.parseInt(s.nextLine());
		} 
		Arrays.sort(nums);
		ArrayList<Integer> numList = Lists.newArrayList(nums);
		System.out.println(numList);
	}
}
