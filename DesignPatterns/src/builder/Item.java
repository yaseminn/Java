/**
 * 
 */
package builder;

/**
 * @date Mar 9, 2017
 */
public interface Item {
	public String getName();
	public Packing getPacking();
	public float calculatePrice();
}
