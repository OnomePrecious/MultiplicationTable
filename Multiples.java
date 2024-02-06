import java.util.Scanner;
public class Multiples {    
public static void main(String[] args) { 
Scanner input = new Scanner(System.in);  

System.out.println("Enter an integer: ");
int number1 = input.nextInt();
 
System.out.println("Enter an integer: ");
int number2 = input.nextInt();

int number3 = number1 * 3;
int number4 = number2 * 2;

if(number3 % number4 == 0){

System.out.println("The first number tripled is a multiple of the second number doubled ");
} else {
System.out.println("The first number tripled is not a multiple of the second number doubled ");
    } 
  }
}