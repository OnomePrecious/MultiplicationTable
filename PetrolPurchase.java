public class PetrolPurchase {
	private String location;
	private String petrolType;
	private int quantity;
	private double pricePerLitre;
	private double percentageDiscount;
	private double purchaseAmount;

public void setLocation(String location){
	this.location = location; 
}
public void setPetrolType(String petrolType){
	this.petrolType = petrolType;
}
public void setQuantity(int quantity){
	this.quantity = quantity;
}
public void setPricePerLitre(double pricePerLitre){
	this.pricePerLitre = pricePerLitre;
}
public void setPercentageDiscount(double percentageDiscount){
	this.percentageDiscount = percentageDiscount;
}
public void setPurchaseAmount(double purchaseAmount){
	this.purchaseAmount = purchaseAmount;
}
public String getLocation(){
	return location;
}
public String getPetrolType(){
	return petrolType;
}
public int getQuantity(){
	return quantity;
}

public double getPricePerLitre(){
	return pricePerLitre;
}

public double getPercentageDiscount(){
	return percentageDiscount;
}
public double getPurchaseAmount(){
	return purchaseAmount;
}
}