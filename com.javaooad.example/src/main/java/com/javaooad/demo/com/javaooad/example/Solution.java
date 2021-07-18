package com.javaooad.demo.com.javaooad.example;

public class Solution {
	public static void main(String[] args) {
		Animal[] animals = new Animal[] { new Duck(), new Chicken(), new Rooster(), new ParrotLivingWithDogs(),
				new ParrotLivingWithCats(), new ParrotLivingOnFarmWithRooster(), new Shark(), new Clownfish(),
				new Dolphin(), new Butterfly(), new Caterpillar() };

		int flyCount, walkCount, singCount, swimCount;
		flyCount = walkCount = singCount = swimCount = 0;
		
		for(Animal animal: animals) {
			if(animal instanceof Flyer) {
				flyCount++;
			}
			
			if(animal instanceof Walker) {
				walkCount++;
			}
			
			if(animal instanceof Singer) {
				singCount++;
			}
			
			if(animal instanceof Swimmer) {
				swimCount++;
			}
		}
		
		System.out.println("Total Fly Count : " + flyCount);
		System.out.println("Total Walk Count : " + walkCount);
		System.out.println("Total Sing Count : " + singCount);
		System.out.println("Total Swim Count : " + swimCount);
	}
}
