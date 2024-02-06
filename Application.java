import java.util.Scanner;
public class Application {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.println("Enter first number: ");
int number1 = input.nextInt();

System.out.println("Enter second number: ");
int number2 = input.nextInt();

int square1 = number1 * number1;
int square2 = number2 * number2;
int sum = square1 + square2;
int difference = square1 - square2;

System.out.printf("Square of the first number: %d%n", square1);
System.out.printf("Square of the second number: %d%n", square2 );
System.out.printf("Sum of the squared numbers: %d%n", sum );
System.out.printf("Differnce of the squared numbers: %d%n", difference );




}

}

