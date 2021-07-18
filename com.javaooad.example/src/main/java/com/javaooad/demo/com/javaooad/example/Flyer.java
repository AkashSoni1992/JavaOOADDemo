package com.javaooad.demo.com.javaooad.example;

public interface Flyer {
	
	default public void fly() {
		System.out.println("I can Fly");
	}

}
