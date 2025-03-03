package com.sat.clsa;

public class BClass {

	public static void main(String[] args) {
			MyRunnable runnable=new MyRunnable();
//			runnable.run();
			Thread thr=new Thread(runnable);
			thr.start();
			Runnable r=()->{
				for (int i = 0; i < 1000; i++) {
					System.out.println("*******"+(i+1));
				}
			};
//			r.run();
			Thread thra=new Thread(r);
			thra.start();
	}
}
