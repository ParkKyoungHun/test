package p09;

public class OverLoadingExam {

	public OverLoadingExam() {
		
	}
	public OverLoadingExam(int a) {
		
	}
	public int getInt(String s, int a) {
		return 1;
	}
	public void getInt(int a, String s) {
		
	}
	public static void main(String[] args) {
		OverLoadingExam ole = new OverLoadingExam();
		ole = new OverLoadingExam();
		
	}
}
