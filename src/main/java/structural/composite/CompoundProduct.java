package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CompoundProduct implements Purchasable {

	private List<Purchasable> cart;
	
	public CompoundProduct() {
		cart = new ArrayList<Purchasable>();
	}
	
	public void addToCart(Purchasable purchasable) {
		cart.add(purchasable);
	}
	
	public float getPrice() {
		return (float) cart.stream().mapToDouble(item -> item.getPrice()).sum();
	}

	public float getDiscount() {
		return (float) cart.stream().mapToDouble(item -> item.getDiscount()).sum();	
	}

}
