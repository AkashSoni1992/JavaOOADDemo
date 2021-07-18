package com.javaooad.demo.com.javaooad.example;

public interface Singer {

	default public void sing() {
		System.out.println("I can Sing");
	}
}
