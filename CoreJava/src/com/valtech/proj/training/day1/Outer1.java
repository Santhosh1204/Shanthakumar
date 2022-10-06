package com.valtech.proj.training.day1;

public class Outer1 {
	private int x=5;
	private void printY(Inner i) {
		System.out.println("Y="+i.y);
	}
	private static class Inner{
		private int y=5;
		void printX(Outer1 o) {
			System.out.println("X="+o.x);
		}
		public void increment(Outer1 o) {
			o.x++;
		}
	}
	public static void main(String[] args) {
		Outer1 o=new Outer1();
		Inner i=new Inner();
		o.printY(i);
		i.printX(o);
		i.increment(o);
		new Inner().increment(o);
		i.printX(o);
		i.printX(new Outer1());
	}
}
