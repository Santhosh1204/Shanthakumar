package com.valtech.proj.training.day4;

import static org.junit.Assert.*;

import java.lang.reflect.Method;

import org.junit.Test;

import com.valtech.proj.training.day1.Point;

public class ReflectTest {

	@Test
	public void test() throws Exception,InstantiationException, IllegalAccessException {
		Point p=Point.class.newInstance();
		System.out.println(p);
		Method m=Point.class.getMethod("setX", int.class);
		m.invoke(p, 10);
		System.out.println();
	}

}
