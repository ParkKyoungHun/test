package p17;

public class Exam {

	private static int add(int num1, int num2) {
		return num1 + num2;
	}
	
	public static String getCalStr(String op, int num1, int num2) {
		int result = 0;
		if(op.equals("+")) {
			result = add(num1,num2);
		}
		
		return num1 + op + num2 + " = " + result;
	}
}
