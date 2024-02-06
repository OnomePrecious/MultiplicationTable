//public class WhileCounter {
//public static void main(String[] args) {
 //int counter = 1;

 //while (counter <= 10 ) { 
 //System.out.printf("%d ", counter);
  //++counter;
 //}
//System.out.println();
//} 
//}

import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;
public class Checkout{
	private final List<String> productName = new ArrayList<>();
	private final List<Integer> quantity = new ArrayList<>();
	private final List<Double> price = new ArrayList<>();
	private final List<Double> total = new ArrayList<>();
	private double discountPercentage;
	private double amountPaid;
	private double subTotal;
	private double discountPrice;
	private double vat;
	private double billTotal;
	private double balance;
	private String customerName;
	private String cashierName;
	Scanner input = new Scanner(System.in);

public static void main(String[] args) {
	Checkout checkout = new Checkout();
	checkout.collectInput();
	checkout.calculateTotalForEachProduct();
	checkout.calculateSubTotal();
	checkout.calculateDiscount();
	checkout.calculateVat();
	checkout.calculateBillTotal();
	checkout.printFirstReceipt();
	checkout.calculateBalance();
	checkout.printFinalReceipt();
}
public void collectInput(){
	System.out.println("What is the customer's Name? ");
	customerName = input.nextLine();

	System.out.println("What did the customer buy? ");
        String name = input.nextLine();
	productName.add(name);

	System.out.println("How many pieces?" );
	int piece = input.nextInt();
	quantity.add(piece);
	
	System.out.println("How much per unit?" );
	double unitPrice = input.nextDouble();
	price.add(unitPrice);

 	System.out.println("Do you want to add more items?");
	input.nextLine();
	String response = input.nextLine();

	while(response.equalsIgnoreCase("yes")){
	System.out.println("What did the user buy? ");
	name = input.nextLine();
	productName.add(name);

	System.out.println("How many pieces?" );
	piece = input.nextInt();
	quantity.add(piece);
	
	System.out.println("How much per unit?" );
	unitPrice = input.nextDouble();
	price.add(unitPrice);

 	System.out.println("Do you want to add more items?");
	input.nextLine();
	response = input.nextLine();
}

System.out.println("What is your name?: ");
cashierName = input.nextLine();

