package structural.composite;

public class Product implements Purchasable {

	private float price = 0;
	private float discount = 0;
	
	public Product(float price, float discount) {
		this.price = price;
		this.discount = discount;
	}
	
	public float getPrice() {
		return price;
	}

	public float getDiscount() {
		return discount;
	}

}
