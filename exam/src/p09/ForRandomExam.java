package p09;

import java.util.Random;

public class ForRandomExam {

	private static boolean isDupl(int[] nums, int num) {
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==num) {
				return true;
			}
		}
		return false;
	}
	
	private static int[] checkMaxNum(int[][] nums, int[] inNums) {
		int maxNum = nums[inNums[0]][inNums[1]];
		int[] rNums = new int[2];
		for(int i=inNums[0];i<nums.length;i++) {
			int sec = 0;
			if(i==inNums[0]) {
				sec = inNums[1]+1;
			}
			for(int j=sec;j<nums[i].length;j++) {
				if(maxNum<nums[i][j]) {
					maxNum = nums[i][j];
					rNums[0] = i;
					rNums[1] = j;
				}
			}
		}
		if(rNums[0] ==0  && rNums[1]==0) {
			return null;
		}
		return rNums;
	}
	public static void main(String[] args) {
		// 3  X 3 개의 방갯수를 가진 2차원 인트형 배열변수를 선언해주세요.
		// 각 방에 랜던함 숫자를 넣어 주시는데
		// 중복 불가
		// 랜덤한 숫자의 미니멈값은 1 맥시멈값은 20
		// 0번째층의 0번째 방부터 큰수가 들어갈 수 있도록 프로그램을
		// 만들어서 출력해주세요.
		Random r = new Random();
		int nums[][] = new int[3][3];
		int checkNums[] = new int[9];
		int cnt = 0;
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums[i].length;j++) {
				int num = r.nextInt(20)+1;
				if(isDupl(checkNums,num)) {
					j--;
				}else {
					checkNums[cnt] = num;
					nums[i][j] = num;
					cnt++;
				}
			}
		}

		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<nums[i].length;j++) {
				int[] inNums = {i,j};
				int[] rNums = checkMaxNum(nums,inNums);
				if(rNums!=null) {
					int tmp = nums[i][j];
					nums[i][j] = nums[rNums[0]][rNums[1]];
					nums[rNums[0]][rNums[1]] = tmp;
				}
			}
		}

		for(int i=0;i<nums.length;i++) {
			int[] num = nums[i];
			for(int j=0;j<num.length;j++) {
				System.out.print("[" + i + "][" + j+ "]=" + num[j] + "\t");
			}
			System.out.println();
		}
	}
}
