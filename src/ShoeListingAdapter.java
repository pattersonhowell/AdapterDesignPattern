
public class ShoeListingAdapter implements ProductListing {

	private ShoeListing shoe;
	private String title;
	private String brand;
	private double price;
	private String description;
	
	
	public ShoeListingAdapter(ShoeListing shoe) {
		
		this.title = shoe.toString().substring(shoe.toString().indexOf("Shoe: ") + 6, shoe.toString().indexOf("\nBy: "));
		
		this.description = "Created by " + shoe.toString().substring(shoe.toString().indexOf("By: ") + 4, shoe.toString().indexOf("\nDetails: "))
				+ ", " + shoe.toString().substring(shoe.toString().indexOf("Details: ") + 9, shoe.toString().indexOf("\nCost: $ "));
		
		this.price = Double.parseDouble(shoe.toString().substring(shoe.toString().indexOf("Cost: $ ") + 8));
		this.shoe = shoe; 
	}
	
	public String getTitle() {
		return title;
	}
	
	
	public double getPrice() {
		return price;
	}
	
	
	public String getDescription() {
		return description;
	}
}
