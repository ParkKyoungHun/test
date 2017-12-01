package p07;

import java.util.Scanner;

public class Exam01 {
	int[] nums;
	int cnt;
	
	void inputNums() {
		Scanner s = new Scanner(System.in);
		nums = new int[5];
		for(int i=0;i<nums.length;i++) {
			System.out.println((i+1) + "번째 숫자를 입력해주세요~~");
			nums[i] = s.nextInt();
		}
	}
	void print() {
		for (int i = nums[0]; i >nums[1] ;i--) {
			for(int j=nums[2];j>nums[3];j--) {
				String str = i + " X " + j + " = " + (i*j);
				if(i*j % nums[4] == 0) {
					cnt ++;
					str = nums[4] + "의배수";
				}
				System.out.print(str);
				if(j!=1) {
					System.out.print(",");	
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Exam01 e = new Exam01();
		e.inputNums();
		e.print();
		System.out.println(e.nums[4] + "의 배수의 갯수는 = " + e.cnt + "입니다.");
	}
}
