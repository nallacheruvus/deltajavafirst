package com.sat.clsa;

public interface IFaceB {
	int I_VAL=100;
	default void testa() {
		System.out.println(I_VAL);
		System.out.println("IFaceB Method");
	}
}
