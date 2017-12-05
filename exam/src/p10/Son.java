package p10;

public class Son extends Father{
	Son(){
		super(1,2);
	}
	
	public void print() {
		System.out.println("내꺼");
	}
	
	public void print2() {
		this.print();
		super.print();
	}
}
