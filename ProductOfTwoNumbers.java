import java.util.Scanner;
	
public class ProductOfTwoNumbers{
public static int multiply(int a, int b) {
int result = 0;

	for(int i = 0; i < Math.abs(b); i++){
		result+=a;
}
if ((a < 0 && b > 0) || (a > 0 && b < 0)) {
	result = - result;
}
   return result;

}
public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.println("Enter two integers");

int firstNumber = input.nextInt();
int secondNumber = input.nextInt();

int product = multiply(firstNumber, secondNumber);

System.out.println("Product: " + product);

}
}