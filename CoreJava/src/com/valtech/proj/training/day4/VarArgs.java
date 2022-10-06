package com.valtech.proj.training.day4;

public class VarArgs {
	public int add(int... a) {
		int res=0;
		for(int i:a) {
			res+=i;
		}
		return res;
	}
}
