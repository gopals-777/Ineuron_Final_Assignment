package in.grs.Test;

class Parent {
	public Parent() {
		System.out.println("Parent class constructor invoked");
	}
}

public class Child extends Parent {
	public Child() {
		super(); // Invokes the parent class constructor
		System.out.println("Child class constructor invoked");
	}
}


