package p02;

public class ArrayExam {
	public static void main(String[] args) {
		int a1 = 1;
		int a2 = 2;
		int a3 = 3;
		int a4 = 4;
		int a5 = 5;
		int[] arr = {1,2,3,4,5};
		int[] arr2 = new int[5];
		arr2[0] = 1;
		arr2[1] = 2;
		arr2[2] = 3;
		arr2[3] = 4;
		arr2[4] = 5;
//		int num=1;
//		System.out.println(num);
//		num = num + 1;
//		System.out.println(num);
//		num++;
//		System.out.println(num);
		
		String[] strArr = {"월", "화","수","목","금","토","일"};
		for(int i=0 ; i<7 ; i++) {
			System.out.println(strArr[i]);
		}
		System.out.println(strArr.length);
	}
}
