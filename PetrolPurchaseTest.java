import java.util.Scanner;
public class PetrolPurchaseTest{
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

PetrolPurchase petrolPurchase = new PetrolPurchase();

System.out.print("Enter station's location:");
String location = input.nextLine();

System.out.print("Enter type of petrol:");
String petrolType = input.nextLine();

System.out.print("Enter the quantity of the purchase in litres:");
int quantity = input.nextInt();

System.out.print("Enter the price per litre:");
double pricePerLitre = input.nextDouble();

System.out.print("Enter the percentage discount:");
double percentageDiscount = input.nextDouble();

petrolPurchase.setLocation(location);
petrolPurchase.setPetrolType(petrolType);
petrolPurchase.setQuantity(quantity);
petrolPurchase.setPricePerLitre(pricePerLitre);
petrolPurchase.setPercentageDiscount(percentageDiscount);
petrolPurchase.setPurchaseAmount(quantity * pricePerLitre - percentageDiscount);
System.out.println();

System.out.println("The Station's location is:" + petrolPurchase.getLocation());
System.out.println("The Type of petrol is:" + petrolPurchase.getPetrolType());
System.out.println("The Quantity per litre is:" + petrolPurchase.getQuantity() + " Litres");
System.out.println("The Price per litre is:" + petrolPurchase.getPricePerLitre());
System.out.println("The Percentage discount is:" + petrolPurchase.getPercentageDiscount());
System.out.println("The purchase amount is:" + petrolPurchase.getPurchaseAmount());


		}
	}