package com.javaooad.demo.com.javaooad.example;

public abstract class Fish implements Animal, Swimmer {
	String appearance;
	String action;

	public Fish(String appearance, String action) {
		super();
		this.appearance = appearance;
		this.action = action;
	}

}
