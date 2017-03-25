package de.michaeldorner;

public class A extends Base {

	public A() {
		super(Type.A);
	}

	public boolean isA() {
		return true;
	}

	public void doA() {
		i = i * -1;
	}

	@Override
	public void doSomething() {
		i = i * -1;
	}
}
