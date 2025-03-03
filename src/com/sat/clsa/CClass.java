package com.sat.clsa;

public class CClass {

	interface RVal{
		int retInt(int a);
	}
	
	interface GVal{
		void retMet(RVal r);
	}
	
	public static void main(String[] args) {
		RVal rv=(int a)->a*a;
		RVal rvv=(int a)->a*a*a;
		GVal gv=(RVal r)->System.out.println(r.retInt(10));
		gv.retMet(rvv);
	}

	private static void withLambda() {
		Thread thrc=new Thread(()->System.out.println("Local thread Lambda"));
		thrc.start();
		new Thread(()->System.out.println("New Local Thread")).start();
		Runnable rr=()->System.out.println("New Local Thread Runnable");
		rr.run();
	}

	private static void withoutLambda() {
		Thread thra=new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Iam a local thread");				
			}
		});
		thra.start();
		Runnable thrb=new Runnable() {
			@Override
			public void run() {
				System.out.println("Yet another local thread");
			}
		};
		thrb.run();
	}
}