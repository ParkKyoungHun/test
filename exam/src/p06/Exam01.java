package p06;

public class Exam01 {

	public static void main(String[] args) {
		for (int i = 9; i >0 ;i--) {
			for(int j=9;j>0;j--) {
				String str = i + " X " + j + " = " + (i*j);
				if(i*j % 3 == 0) {
					str = "3의배수";
				}
				System.out.print(str);
				if(j!=1) {
					System.out.print(",");	
				}
			}
			System.out.println();
		}
	}
}
