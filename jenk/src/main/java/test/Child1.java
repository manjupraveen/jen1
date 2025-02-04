package test;

public class Child1 extends ParentA{
	public void display1() {
		System.out.println("Hierarchial child 1");
	}
	public static void main(String[] args) {
		Child1 child1 = new Child1();
		child1.display1();
		child1.display();
	}

}
