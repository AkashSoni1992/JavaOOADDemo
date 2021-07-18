package com.javaooad.demo.com.javaooad.example;

public class Chicken implements Bird{

	public void move() {
		System.out.println("I cannot fly");
		
	}

	@Override
	public void sound() {
		System.out.println("Cluck, cluck");
		
	}

	
}
