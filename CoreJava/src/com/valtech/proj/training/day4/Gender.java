package com.valtech.proj.training.day4;

public enum Gender {
	
	MALE(1),FEMALE(-1),OTHER(0);
	private Gender(int value) {
		this.value=value;
	}
	
	private int value;
	
	public int getValue() {
		return value;
	}
	
	public static void main(String[] args) {
		//foreach loop can be used when even our class implements iterable
		for(Gender g:Gender.values()) {
			System.out.println(g+" "+g.getValue());
		}
		System.out.println(Gender.MALE);
	}
}
