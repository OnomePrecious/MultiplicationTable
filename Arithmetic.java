import java.util.Scanner;
public class Arithmetic {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.println("Enter first number: ");
int number1 = input.nextInt(); 

System.out.println("Enter second number: ");
int number2 = input.nextInt();

System.out.println("Enter third number: ");
int number3 = input.nextInt();

int sum = number1 + number2 + number3;
int average = sum / 3;
int product = number1 * number2 * number3;
int largest = Math.max(Math.max(number1, number2), number3);
int smallest= Math.min(Math.min(number1, number2), number3);

System.out.println("Sum of the numbers:" + sum );
System.out.println("Average of the numbers:" + average);
System.out.println("Product of the numbers:" + product);
System.out.println("The largest number: " + largest);
System.out.println("The smallest number: " + smallest);
}


}
