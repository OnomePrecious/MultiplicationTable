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

System.out.println("How much discount will the person get?");
 discountPercentage = input.nextDouble();
}
public void calculateTotalForEachProduct(){
	for(int index = 0; index < quantity.size(); index++){
		double totalPrice = price.get(index) * quantity.get(index);
		total.add(totalPrice);
	}
}
public void calculateSubTotal(){
	for(int index = 0; index < total.size(); index++) {
		subTotal += total.get(index);
	}
}
public void calculateDiscount() {
	discountPrice = (discountPercentage / 100) * subTotal;
}
public void calculateVat() {
	vat = (17.50 / 100) * subTotal;
}
public void calculateBillTotal() {
	billTotal = subTotal - discountPrice + vat;
}
public void calculateBalance() {
	System.out.println("How much did your customer pay?");
	amountPaid = input.nextDouble();
	balance = amountPaid - billTotal;
}

public void printFirstReceipt(){
System.out.println("SEMICOLON STORES");
System.out.println("MAIN BRANCH");
System.out.println("LOCATION 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.");
//System.out.printf("%s%d", "TEL:", 03293828343);
System.out.println("Cashier name:" + cashierName);
System.out.println("Customer Name:" + customerName);
System.out.println("""
==========================================
ITEM\tQTY\tPRICE\tTOTAL(NGN)
============================================
""");
	for(int index = 0; index < productName.size(); index++) {
	    System.out.printf("%s\t%d\t%.2f%n",productName.get(index),                              quantity.get(index), price.get(index) + quantity.get(index) * price.get(index));
}
System.out.printf("""
=====================================================
	Sub total: %.2f
	Discount: %.2f
	VAT @ 17.50%%: %.2f
=======================================================%n""", subTotal, discountPrice, vat);
System.out.println("This is not the real receipt, kindly pay " + "#" +  billTotal);
System.out.println("=====================================================");
}

public void printFinalReceipt(){
System.out.println("SEMICOLON STORES");
System.out.println("MAIN BRANCH");
System.out.println("LOCATION 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.");
//System.out.printf("%s%d", "TEL:", 03293828343);
System.out.println("Date:");
System.out.println("Cashier name:");
System.out.println("Customer Name:");
System.out.println("""
====================================
ITEM\tQTY\tPRICE\tTOTAL(NGN)
=====================================
""");
	for(int index = 0; index < productName.size(); index++) {
	    System.out.printf("%s\t%d\t%.2f%n",productName.get(index), quantity.get(index), price.get(index));
}
System.out.printf("""
==================================
	Sub total: %.2f
	Discount: %.2f
	VAT @ 17.50%%: %.2f
===================================%n""", subTotal, discountPrice, vat);
System.out.printf("""
	Bill Total: %.2f

	Amount Paid: %.2f
	    Balance: %.2f%n""",billTotal, amountPaid, balance);
System.out.println("""
=====================================

THANK YOU FOR YOUR PATRONAGE
========================================
""");

}

}


