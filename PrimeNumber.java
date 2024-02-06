import java.util.Scanner;
public class PrimeNumber{
public static void main(String[]args){
Scanner input = new Scanner(System.in);

System.out.println("Enter a positive number:");
int positiveNumber = input.nextInt();

if(positiveNumber <= 0){
System.out.printf("%s", "This is not a positive number");
}else{

if(positiveNumber % 1 == 0 && positiveNumber % positiveNumber == 0){
System.out.printf("%d%s", positiveNumber, " is a prime number"); 

}else if(positiveNumber % 1 != 0 && positiveNumber % positiveNumber != 0){
System.out.printf("%d%s", positiveNumber, " is not a prime number");
}

}
}
}