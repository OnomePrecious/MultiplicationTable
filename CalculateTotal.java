import java.util.Scanner;
public class CalculateTotal {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

int sum = 0;
double average = 0.0;
int number = 1;
int counter = 0;
int count = 1;

while(number != 0) {
System.out.println("Enter integer " + count + "," + (" Or input 0 to finish"));
number = input.nextInt();
counter++;
count++;	
sum += number;
average = sum / counter;
}

System.out.println("The total is:" + sum);
System.out.println("The average is:" + average);
}
	}