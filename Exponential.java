import java.util.Scanner;
public class Exponential {
public static void main(String[] args) {  
Scanner input = new Scanner(System.in);

System.out.println("Enter the number:");
double number = input.nextDouble();

System.out.println("Enter the exponent:");
int exponent = input.nextInt();

double result = number * exponent;

System.out.println(number + " raised to the power of " + exponent + " is: "  + result);
     }
}