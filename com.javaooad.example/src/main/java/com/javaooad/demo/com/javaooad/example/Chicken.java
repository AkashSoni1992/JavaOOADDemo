package com.javaooad.demo.com.javaooad.example;

public class Chicken extends Bird{

	public void move() {
		System.out.println("I cannot fly");
		
	}

	@Override
	public void sound() {
		System.out.println("Cluck, cluck");
		
	}

	
}
