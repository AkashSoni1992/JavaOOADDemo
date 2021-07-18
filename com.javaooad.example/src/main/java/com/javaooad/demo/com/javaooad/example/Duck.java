package com.javaooad.demo.com.javaooad.example;

public class Duck implements Bird{

	public void move() {
		System.out.println("I can Swin");
		
	}

	@Override
	public void sound() {
		System.out.println("Quack, quack");
		
	}


}
