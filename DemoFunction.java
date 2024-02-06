import java.util.Scanner;
public class DemoFunction {

public static int add(int number1, int number2){
int total = number1 + number2;
return total;
}

public static int subtract(int number1, int number2){
int total = number1 - number2;
return total;
}

public static int multiply(int number1, int number2){
int total = number1 * number2;
return total;

}



public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print(" Enter number1 : ");
int number3 = input.nextInt();

System.out.print(" Enter number2 : ");
int number4 = input.nextInt();
 
int sum = add(number3,number4);

System.out.println("Sum is: " + sum);
System.out.println("multiply is: " + multiply(number3,number4));
System.out.println("subtract is: " + subtract(number3,number4));
}

}