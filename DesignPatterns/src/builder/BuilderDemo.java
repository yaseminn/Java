/**
 * 
 */
package builder;

/**
 * @date Mar 9, 2017
 */
public class BuilderDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MealBuilder mealBuilder = new MealBuilder();
		
		Meal vegMeal = mealBuilder.getVegPizzaWithCoke();
		vegMeal.showItems();
		System.out.println("Total Price: " + vegMeal.getTotalPrice());
		
		Meal meatMeal = mealBuilder.getMeatPizzaWithWater();
		meatMeal.showItems();
		System.out.println("Total Price: " + meatMeal.getTotalPrice());
	}

}
