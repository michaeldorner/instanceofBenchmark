package de.michaeldorner;

public class E extends Base {

	public E() {
		super(Type.E);
	}

	public void doE() {
		i = i * -1;
	}

	@Override
	public void doSomething() {
		i = i * -1;
	}
}
