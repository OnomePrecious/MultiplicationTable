import java.util.Scanner;
public class Calculate  { 
public static void main(String[] args) { 
Scanner input = new Scanner(System.in );

double discount = 0.1;
 
System.out.println("Enter an item:");
String item = input.nextLine();

System.out.println("Enter item price:");
int price = input.nextInt();

if(price < 0) {
System.out.println("Enter a valid number:");
}

else{

discount = (price * 0.1);
discount= (price - discount);

System.out.println("discounted price is:" + discount);

}
}	
}