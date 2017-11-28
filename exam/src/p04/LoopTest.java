package p04;

public class LoopTest {

	void func1(int num1, int num2) {
		int sum = 0;
		for(int i=num1;i<=num2;i++) {
			sum += i;
		}
		System.out.println(sum);
	}
	
	void func2() {
		for(int i=1;i<=100;i++) {
			if(i%2==1) {
				System.out.print(i + ",");
			}
			if(i%10==1) {
				System.out.println();
			}
		}
	}
	
	void func3(int num1, int num2, int num3) {
		if(num1>num2) {
			int tmp = num1;
			num1 = num2;
			num2 = tmp;
		}
		for(int i=num1;i<=num2;i++) {
			if(i%num3==0) {
				System.out.print(i + ",");
			}
			if(i%10==0) {
				System.out.println();
			}
		}
	}
	public static void main(String[] args) {
		// 1부터 100까지 더한 값을 출력해주세요.
		// 1부터 100까지 홀수만 출력해주세요.
		
		// 1부터 100까지 짝수만 출력해주세요.
		// 위의 3가지 출력을 함수로 정의하여
		// LoopTest라는 데이터 타입의 변수를 선언하여
		// 호출해주시기 바랍니다.
		LoopTest lt = new LoopTest();
		lt.func1(1,50);
		lt.func2();
//		System.out.println();
		lt.func3(100,1,7);
	}
}
