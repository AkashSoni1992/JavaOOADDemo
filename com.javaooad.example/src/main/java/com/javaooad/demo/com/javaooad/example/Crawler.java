package com.javaooad.demo.com.javaooad.example;

public interface Crawler extends Walker{

	@Override
	default void walk() {
		System.out.println("I can walk(crawl)");
	}

}
