package com.sat.clsa;

@FunctionalInterface
public interface MyIFace {
	public void methA();
	default void testera() {
		System.out.println("Hai there");
	}
	static void testerb() {
		System.out.println("This is a static method");
	}
}
