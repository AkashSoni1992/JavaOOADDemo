package com.javaooad.demo.com.javaooad.example;

public interface Bird extends Animal {

	public abstract void sound();

	default public void sing() {
		System.out.println("I can Sing");
	}
}
