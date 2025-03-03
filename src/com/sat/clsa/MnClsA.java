package com.sat.clsa;

public class MnClsA {
	interface IMyFaceA{
		String retStr(String a);
	}
	
	interface IMyFaceB{
		char[] retArr(String a);
	}
	
	interface IMyFaceC{
		String retOrigStr(char[] arr);
	}
	public static void main(String[] args) {
		IMyFaceA facea=(String a)->a.toUpperCase();
		IMyFaceB faceb=(String a)->a.toCharArray();
		IMyFaceC facec=(char[] a)->String.valueOf(a);
		System.out.println(facec.retOrigStr(faceb.retArr(facea.retStr("satish n"))));
	}
}
