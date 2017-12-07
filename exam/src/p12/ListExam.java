package p12;

import java.util.ArrayList;
import java.util.Scanner;

public class ListExam {
	private ArrayList<String> alStr;
	ListExam(){
		 alStr = new ArrayList<String>();
	}
	
	void inputAlStr() {
		Scanner s = new Scanner(System.in);
		System.out.println("숫자스트링을 넣어주세요. 구분자는 , 입니다.");
		String str = s.nextLine();
		String strs[] = str.split(",");
		for(int i=0;i<strs.length;i++) {
			alStr.add(strs[i]);
		}
	}
	void add(String str) {
		alStr.add(str);
	}
	
	String get(int idx) {
		return alStr.get(idx);
	}
	
	void remove(int idx) {
		alStr.remove(idx);
	}
	
	void printAlStr() {
		for(int i=0;i<alStr.size();i++) {
			String numStr = alStr.get(i);
			int num = Integer.parseInt(numStr);
			if(num%2==0) {
				remove(i);
				i--;
			}else {
				System.out.println(i+"번째 값 : " + alStr.get(i));
			}
		}
	}
	void printAlStr2() {
		int sum = 0;
		for(int i=0;i<alStr.size();i++) {
			String numStr = alStr.get(i);
			int num = Integer.parseInt(numStr);
			sum += num;
			System.out.println(i+"번째 값 : " + numStr);
		}
		System.out.println("입력하신 숫자의 총 합은 : " + sum);
	}
}
