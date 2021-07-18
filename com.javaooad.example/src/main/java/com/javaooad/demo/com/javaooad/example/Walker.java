package com.javaooad.demo.com.javaooad.example;

public interface Walker {

	default public void walk() {
		System.out.println("I can walk");
	}
}
