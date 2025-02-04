package test;

public class Child2 extends ParentA {
	public void display2() {
		System.out.println("hierarchial child B");
		super.display();
	}

	public static void main(String[] args) {
		Child2 child2 = new Child2();
		child2.display();
		child2.display2();

	}

}
