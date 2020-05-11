package de.michaeldorner;

public class B extends Base {

	public B() {
		super(Type.B);
	}

	public void doB() {
		i = i * -1;
	}

	@Override
	public void doSomething() {
		i = i * -1;
	}
}
