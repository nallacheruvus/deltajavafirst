package com.sat.clsa;


public class MnCls implements MyIFace {

	public static void main(String[] args) {
			methAB();
			var a="This is text string";
			System.out.println(a);
			var b=1000.63636363f;
			System.out.println(b);
			var c= new Integer[]{1,2,3,5,6,7};
			System.out.println(c.length);
			for(var i=0;i<10;i++) {
				System.out.println(i);
			}
			var d='a';
			System.out.println(d);
			var e=true;
			System.out.println(e);
			MyIFace iface=new MnCls();
			iface.methA();
			iface.testera();
			MyIFace.testerb();
			
	}
	
	public  void methAA() {
		System.out.println("The square root of 2 is "+Math.sqrt(2));
	}
	
	
	private static void methAB() {
		System.out.println("This is a static method");
	}

	@Override
	public void methA() {
		System.out.println("Hai test string");
		
	}

}
