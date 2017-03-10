/**
 * 
 */
package builder;

/**
 * @date Mar 9, 2017
 */
public class MealBuilder {

	public Meal getVegPizzaWithCoke(){
		Meal meal = new  Meal();
		meal.addItem(new VegPizza());
		meal.addItem(new Coke() {
		});
		
		return meal;
	}
	
	public Meal getMeatPizzaWithWater(){
		Meal meal = new  Meal();
		meal.addItem(new MeatPizza());
		meal.addItem(new Water());
		
		return meal;
	}
}
