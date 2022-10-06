package com.valtech.proj.training.day1;

public class Dog implements Animal {

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("Animal");
	}
	public static void main(String[] args) {
		Animal a=new Dog();
		a.makeSound();
	}

}
