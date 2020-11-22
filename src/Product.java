/**
 * Base class for a product
 * @author pattersonhowell
 *
 */
public class Product implements ProductListing {
	
	private String title;
	private double price;
	private String description;
	
	/**
	 * Creating a product
	 * @param title Name of product
	 * @param price Cost of product
	 * @param description Details about product
	 */
	public Product(String title, double price, String description) {
		
		this.title = title;
		this.price = price;
		this.description = description;
	}
	
	/**
	 * Getting the title
	 */
	public String getTitle() {
		return title;
	}
	
	/**
	 * Getting the price
	 */
	public double getPrice() {
		return price;
	}
	
	/**
	 * Getting the description
	 */
	public String getDescription() {
		return description;
	}

}
