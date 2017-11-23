package p02;

public class Operator {

	public static void main(String[] args) {
		int a = 3;
		int b = a;
				
		if(a==b) {
			System.out.println("a와 b는 같습니다.");
		}
		
		for(int i=1; i<=10; i++) {
			if(i%2==0) {//짝수일때
				System.out.println((i)+".a와 b는 같습니다.");
			}
		}
		System.out.println("");
		
		for(int i=10; i>0; i--) {
			if(i%2==1) {//홀수일때
				System.out.println((i)+".a와 b는 같습니다.");
			}
		}
		
		int len = 7;
		String[] strArr = new String[len];
		// strArr는 7개의 방을 가지고 있습니다.
		// strArr[0]="10" 부터 strArr[6]="70" 까지 들어갈수 있는 for문을 작성해 주세요.
		for(int i=0;i<strArr.length;i++) {
			strArr[i] = (i+1)+"0";
			System.out.println("strArr[" + i + "]=" + strArr[i]);
		}
		System.out.println("");
		for(len--; len>=0; len--) {
			System.out.println("strArr[" + len + "]=" + strArr[len]);
		}
		
		for(int i=5;i<=100;i+=5) {
			System.out.println(i);
		}
		for(int i=10;i<101;i+=10) {
			System.out.println(i);
		}
		for(int i=5;i<101;i+=10) {
			System.out.println(i);
		}

		
		for(int i=100;i>=5;i-=5) {
			System.out.println(i);
		}
		for(int i=100;i>9;i-=10) {
			System.out.println(i);
		}
		for(int i=95;i>4;i-=10) {
			System.out.println(i);
		}
	}
}
