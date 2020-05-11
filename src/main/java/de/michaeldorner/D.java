package de.michaeldorner;

public class D extends Base {

	public D() {
		super(Type.D);
	}

	public void doD() {
		i = i * -1;
	}

	@Override
	public void doSomething() {
		i = i * -1;
	}
}
