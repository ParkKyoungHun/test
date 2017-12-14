package p16;

public class Person implements Action{
	public String name;
	public int age;
	public int height;
	public String email;
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", height=" + height + ", email=" + email + "]";
	}
	@Override
	public void eat() {
		System.out.println(this.name + "사료를 먹는다");
	}
	@Override
	public void sleep() {
		System.out.println(this.name + "잠을 잔다");
	}
	@Override
	public void walk() {
		System.out.println(this.name + "걷는다");
	}

	public void eat(String spam) {
		System.out.println("입맛이 저질이구만~");
	}
	
}
