package structural.composite;

public class Main {
	
	public static void main(String[] args) {
		CompoundProduct compound = new CompoundProduct();
		Product product1 = new Product(20, 4);
		Product product2 = new Product(40, 0);
		Product product3 = new Product(10, 5);
		
		compound.addToCart(product1);
		compound.addToCart(product2);
		compound.addToCart(product3);
		
		System.out.println("Price: $" + compound.getPrice());
		System.out.println("Discount: $" + compound.getDiscount());
		System.out.println("Total: $" + (compound.getPrice() - compound.getDiscount()));
	}
	
}
