package net.panatta.patterns.designpatterns.gof.creational.builder;

public class BuilderDemo {
	public static void main(String[] args) {
		NutritionFacts cocaCola = new NutritionFacts.Builder(240, 8)
			.calories(100).sodium(35).carbohydrate(27).build();
		
		NutritionFacts sprite = new NutritionFacts.Builder(240, 8)
		.calories(80).sodium(30).fat(2).carbohydrate(27).build();
		
		System.out.println("Coca-cola nutriction facts\n" + cocaCola.toString());
		System.out.println("\nSprite nutriction facts\n" + sprite.toString());
	}
}
