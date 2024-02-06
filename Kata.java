import java.util.Scanner;
public class Kata { 
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

int count = 10;
System.out.println("Enter a number:");
int number = input.nextInt();
	while (count < 20) {
System.out.println("number:" + count);
count = count + 1;
}
}
}
