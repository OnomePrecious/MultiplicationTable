import java.util.Scanner;
public class AgeChecker{
public static void main(String[]args){
Scanner scanner = new Scanner(System.in);

System.out.println("Enter your year of birth:");
int yearOfBirth = scanner.nextInt();

System.out.println("Enter the year:");
int year = scanner.nextInt();

int userAge = year - yearOfBirth;

System.out.println("You are " + userAge + " years old.");

}
}