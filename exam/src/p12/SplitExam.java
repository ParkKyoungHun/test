package p12;

import java.util.Scanner;

public class SplitExam {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("숫자를 ,기준으로 입력해주세요.");
		String str = s.nextLine();
		String strs[] = str.split(",");
		for(int i=0;i<strs.length;i++) {
			System.out.println("strs[" + i + "]=" + strs[i]);
		}
	}
}
