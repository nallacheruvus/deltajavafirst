package com.sat.clsa;

public class DClass {
	
	
	interface IFaceA{
		void prnRes(int a);
	}
	static int x=10;
	public static void main(String[] args) {
		int y=120;
		IFaceA ff=(int a)->{
			x=100000;
			System.out.println("****"+y);
			System.out.println(a);
		};
		ff.prnRes(y);
		
		new Thread(new Runnable() {
			int i=10;
			@Override
			public void run() {
				x++;
				System.out.println(i+1);
				System.out.println(y);
				System.out.println(this.toString());
			}
		}).run();
		new Thread(()-> {
			int i=10;
				x++;
				System.out.println(i+1);
				System.out.println(y);
//				System.out.println(this.toString());
		}).run();
		
		IFaceBImpl implb=new IFaceBImpl();
		implb.testa();
		IFaceB fb=new IFaceB() {
			@Override
			public void testa() {
//				IFaceB.super.testa();
				System.out.println("Another implementation");
			}
		};
		fb.testa();
		System.out.println(fb.I_VAL);
		
	}

}
