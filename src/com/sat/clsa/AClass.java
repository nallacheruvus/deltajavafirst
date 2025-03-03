package com.sat.clsa;

import java.util.Arrays;

public class AClass {
	@FunctionalInterface
	interface IFaceA {
		public void methOne();
	}

	@FunctionalInterface
	interface IFaceB {
		public void methTwo(int a);

		default void methA() {
			System.out.println("This is default");
		}
	}

	@FunctionalInterface
	interface IFaceC {
		public double retSqrRootSum(int a, int b);
	}

	@FunctionalInterface
	interface IFaceD extends IFaceC {
	}

	@FunctionalInterface
	interface IFaceE {
		void prnStrArr(String[] arr);
	}
	
	@FunctionalInterface
	interface RvS{
		String retRev(String j);
	}
	
	@FunctionalInterface
	interface VarAr{
		String retComb(String...str);
	}
	

	public static void main(String[] args) {
		IFaceA aa = () -> System.out.println("Hello There");
		aa.methOne();
		IFaceB bb = (int a) -> System.out.println(Math.sqrt(a));
		bb.methTwo(21);
		bb.methA();
		IFaceC cc = (int a, int b) -> (Math.hypot(a, b));
		System.out.println(cc.retSqrRootSum(21, 22));
		IFaceD dd = (int a, int b) -> Math.pow(a, b);
		System.out.println(dd.retSqrRootSum(21, 2));
		RvS rs=(String j)->{
			StringBuffer sb=new StringBuffer(j);
			return sb.reverse().toString();
		};
		IFaceE ee = (String[] arr) -> {
			for (String j : arr) {
				System.out.println(rs.retRev(j));
			}
		};
		ee.prnStrArr(new String[] { "John", "Jeevan", "Jacob" });
		MyBas bas=new MyBas() {
			@Override
			public void prnTwoRoot() {
				System.out.println(Math.sqrt(2));
			}
		};
		bas.prnTwoRoot();
		bas.prnRootThree();
		
		VarAr ar=(String...a)->{
			String ab=Arrays.toString(a).replace('[', ' ').replace(']', ' ').trim();
			return ab;
		};
		var str=ar.retComb("Sunil","Maqbool","Simha","David","Krishna");
		System.out.println(str);
	}
}
