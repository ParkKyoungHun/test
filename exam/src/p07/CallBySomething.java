package p07;

public class CallBySomething {

	void doSomething(int[] a, int[]b) {
		a[0] = 1;
		b[0] = 2;
		a=b;
	}
	public static void main(String[] args) {
		CallBySomething cs = new CallBySomething();
		int[] a = new int [1];
		int[] b = new int [2];
		cs.doSomething(a,b);
		System.out.println(a[0]);
		System.out.println(b[0]);
	}
}
