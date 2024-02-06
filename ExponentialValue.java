import java.util.Scanner;
public class ExponentialValue { 
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.println("Enter the first number");
double value = input.nextDouble();

System.out.println("Enter the second number");
double exponent = input.nextDouble();

double result = Math.pow(value, exponent);
System.out.println(value + " raised to the power of " + exponent + " is: " + result);


     }
}