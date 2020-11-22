/**
 * Base class for a shoe
 * @author pattersonhowell
 *
 */
public class Shoe implements ShoeListing {

	private String brand;
	private String name;
	private double cost;
	private String description;
	
	/**
	 * Creating a shoe
	 * @param brand Brand of shoe
	 * @param name Name of shoe
	 * @param price Cost of shoe
	 * @param description details about shoe
	 */
	public Shoe(String brand, String name, double price, String description) {
		
		this.brand = brand;
		this.name = name;
		this.cost = price;
		this.description = description;
	}
	
	/**
	 * Displaying information about shoe
	 */
	public String toString() {
		
		return "Shoe: " + name + 
			   "\nBy: " + brand +
			   "\nDetails: " + description +
			   "\nCost: $ " + cost;
	}
	
}
