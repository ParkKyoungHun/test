package p05;

import java.util.Scanner;

public class ArrayExam {
	int num1;
	int num2;
	int[][] numArr;
	
	void inputNums() {
		Scanner scanner;
		scanner = new Scanner(System.in);
		System.out.println("1차원 배열변수의 갯수를 입력해주세요.");
		num1 = scanner.nextInt();
		System.out.println("2차원 배열변수의 갯수를 입력해주세요.");
		num2 = scanner.nextInt();
	}
	
	void initNumArr() {
		numArr = new int[num1][num2];
		int num = 0;
		for(int i=0;i<numArr.length;i++) {
			for(int j=0;j<numArr[i].length;j++) {
				numArr[i][j] = ++num;
			}
		}
	}
	
	void printNumArr() {
		for(int i=0;i<numArr.length;i++) {
			for(int j=0;j<numArr[i].length;j++) {
				System.out.print(numArr[i][j]);
				if(j!=numArr[i].length-1) {
					System.out.print(",");
				}else {
					System.out.println();
				}
			}
		}
	}

	public static void main(String[] args) {
		//Scanner 클래스를 사용하여 콘솔창에서 배열변수의 각각의 방갯수를 입력받아 주세요.
		//단 ArrayExam클래스의 num1과 num2라는 변수를 사용하셔야 합니다.
		//ex => ae.num1 = scanner.nextInt();
//		ArrayExam ae = new ArrayExam();
//		ae.inputNums();
//		System.out.println(ae.num1);
//		System.out.println(ae.num2);
//		ae.initNumArr();
//		ae.printNumArr();
		int a = 1;
		a++;
		System.out.println(a);
		a = 1;
		System.out.println(++a);
		
	}
}
