package com.sat.clsa;

@FunctionalInterface
public interface IFaceA {
	public void methOne();
}

class Test {
	public static void main(String[] args) {
		IFaceA aa = () -> System.out.println("Hello There");
		aa.methOne();
	}
}
