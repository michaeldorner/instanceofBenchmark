package de.michaeldorner;

public abstract class Base {
	protected int i = 1;
	public final Type type;

	public Base(Type type) {
		this.type = type;
	}

	public abstract void doSomething();
}
