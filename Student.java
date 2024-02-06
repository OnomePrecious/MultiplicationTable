import java.util.Scanner;
public class Student {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

int total = 0;
double average = 0.0;

System.out.println("Enter number of students");
int number = input.nextInt();

int[] scores = new int [number];

for(int index = 0; index < number; index++);

System.out.println("Enter scores of student:" + (index + 1) + ":");
total += number;
average = total / number;

System.out.println("The total:" + total);
System.out.println("The average:" + average);


		}
	}