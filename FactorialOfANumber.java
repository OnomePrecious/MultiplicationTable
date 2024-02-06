import java.util.Scanner;

public class FactorialOfANumber{

public static void main(String[]args){

Scanner input = new Scanner(System.in);

System.out.println("Enter any positive number between 1 and 20:");
int positiveNumber = input.nextInt();

	if(positiveNumber > 20){
System.out.println("Try again");
}else{

int factorial = 1;

	for(int count = 1; count <= positiveNumber; count++) {
factorial*= count;

System.out.println(positiveNumber + "===>" + factorial);
}
}		}
	}