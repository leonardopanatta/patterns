package net.panatta.patterns.designpattern.gof.creational.builder;

public class NutritionFacts {
	private final int servingSize;
	private final int servings;
	private final int calories;
	private final int fat;
	private final int sodium;
	private final int carbohydrate;

	public static class Builder {
		// Required parameters
		private final int servingSize;
		private final int servings;
		// Optional parameters - initialized to default values
		private int calories;
		private int fat;
		private int carbohydrate;
		private int sodium;

		public Builder(int servingSize, int servings) {
			this.servingSize = servingSize;
			this.servings = servings;
		}

		public Builder calories(int val) {
			calories = val;
			return this;
		}

		public Builder fat(int val) {
			fat = val;
			return this;
		}

		public Builder carbohydrate(int val) {
			carbohydrate = val;
			return this;
		}

		public Builder sodium(int val) {
			sodium = val;
			return this;
		}

		public NutritionFacts build() {
			return new NutritionFacts(this);
		}
	}

	private NutritionFacts(Builder builder) {
		servingSize = builder.servingSize;
		servings = builder.servings;
		calories = builder.calories;
		fat = builder.fat;
		sodium = builder.sodium;
		carbohydrate = builder.carbohydrate;
	}
	
	@Override
	public String toString() {
		return new StringBuilder()
			.append("Serving Size: " + servingSize)
			.append("\n")
			.append("Servings: " + servings)
			.append("\n")
			.append("Calories: " + calories)
			.append("\n")
			.append("Fat: " + fat)
			.append("\n")
			.append("Sodium: " + sodium)
			.append("\n")
			.append("Carbohydrate: " + carbohydrate)
			.toString();
	}
}
