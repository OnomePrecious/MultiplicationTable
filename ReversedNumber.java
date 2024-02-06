import java.util.Scanner;
public class ReversedNumber{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

System.out.println("Enter a 5 - digit number");
int number = scanner.nextInt();

int lastDigit = number % 10;
int removeDigit1 = number / 10;
int fourthDigit = removeDigit1 % 10;
int removeDigit2 =removeDigit1 / 10;
int thirdDigit = removeDigit2 % 10;
int removeDigit3 = removeDigit2 / 10;
int secondDigit = removeDigit3 % 10;
int removeDigit4 = removeDigit3 / 10;
int firstDigit = removeDigit4 % 10;
int removeDigit5 = removeDigit4 / 10;

System.out.println("When reversed it becomes:");
System.out.printf("%d%d%d%d%d", lastDigit, fourthDigit, thirdDigit, secondDigit, firstDigit);
		}
}