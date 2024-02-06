import java.util.Scanner;
public class Pounds { 
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.println("Enter a number in pounds");
double pounds = input.nextDouble();

double conversion = 0.454;
double kilograms = pounds * conversion;

System.out.println(pounds + "pounds is equal to " + kilograms + "kilograms.");


     }
}