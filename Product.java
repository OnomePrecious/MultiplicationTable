import java.util.Scanner;
public class Product {

private String name;
private double price;
//private Product[] products;
//private int size;

public Product(String name, double price){
	this.name = name;
	this.products = products;
}
public double getPrice() {
	return price;
}
}
//class ShoppingCart {
	private Product[] products;
	private int[] quantities;
	private int size; 

	public ShoppingCart(int capacity) {
		this.products = new Product[capacity];
		this.quantities = new int[capacity];
		this.size = 0;
}
public void addToCart(Product product, int quantity) {
	products[size] = product;
	quantities[size] = quantity; 
	size++;
}
public Product[] getProducts() {
	return products;
}
public int[] getQuantities() {
	return quantities;
}
public int getSize() {
	return size;
}

//class CheckoutSystem {
	private static final double VAT_RATE = 0.075;
	public static void displayInvoice(ShoppingCart cart) {
	System.out.println("===== Invoice =====");
	   double total = 0;

	for(int i = 0; i < cart.getSize(); i++) {
		Product product = cart.getProducts()[i];
		double subtotal = product.getPrice() * quantity;

System.out.println(product.getPrice() + " x "  + quantity + " = " + subtotal);
	total+= subtotal;
}
	double vat = total * VAT_RATE;
	double discount = 0;

System.out.println("======================================");
	System.out.println("Total: " + total);
	System.out.println("VAT(7.5%): " + vat);
	System.out.println("Discount: " + discount);
	System.out.println("Grand Total: " + (total + vat - discount));
}


//public class SemicolonStores {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	Product parfait = new Product("Parfait", 2100.0);
	Product rice = new Product("Rice", 550.0);

     ShoppingCart cart = new ShoppingCart(10);
System.out.println("Enter product details in the user's cart:");
System.out.println("Enter quantity for parfait: ");
int parfaitQuantity = input.nextInt();
cart.addToCart(rice, riceQuantity);
}

