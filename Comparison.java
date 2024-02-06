import java.util.Scanner;
public class Comparison {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter an integer: ");
int number = input.nextInt();

int square = number * number;

if(square > 100){
System.out.println("The square of " + number + "(" + square + ")  is greater than 100" );
}


if(square == 100){
System.out.println("The square of " + number + "(" + square + ") is equal to 100" );
}


if(square != 100){
System.out.println("The square of " + number + "(" + square + ") is not equal to 100");
}

if(square < 100){
System.out.println("The square of " + number + "(" + square + ") is less than 100");
}


}
}