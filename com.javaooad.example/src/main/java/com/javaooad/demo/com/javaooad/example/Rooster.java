package com.javaooad.demo.com.javaooad.example;

public interface Rooster extends Bird {

	default public void sound() {
		System.out.println("Cock-a-doodle-doo");
	}
}
