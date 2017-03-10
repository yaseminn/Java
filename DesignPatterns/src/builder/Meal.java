/**
 * 
 */
package builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @date Mar 9, 2017
 */
public class Meal {
	public List<Item> items = new ArrayList<Item>();

	public void addItem(Item item) {
		items.add(item);
	}

	public float getTotalPrice() {
		float cost = 0.0f;

		for (Item item : items) {
			cost += item.calculatePrice();
		}

		return cost;
	}

	public void showItems() {
		for (Item item : items) {
			System.out.println("Name: " + item.getName());
			System.out.println("Packing: " + item.getPacking());
			System.out.println("Price: " + item.calculatePrice());
		}

	}

}
