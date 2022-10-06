package com.valtech.proj.training.day1;

public class Outer {
	private static class Inner extends Outer{
		public void Print() {
			System.out.println("hello");
		}
		
	}
	public static void main(String[] args) {
		Inner i=new Inner();
		i.Print();
	}
	public void printInner(Inner i) {
		i.Print();
	}
}
