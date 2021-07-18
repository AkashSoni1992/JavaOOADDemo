package com.javaooad.demo.com.javaooad.example;

public interface Swimmer {

	default public void swim() {
		System.out.println("I can swim");
	}
}
