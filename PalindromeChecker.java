import java.util.Scanner;
public class PalindromeChecker{
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

String name = "level";
System.out.println("Enter a string");
String nameCheck = input.nextLine();

if(nameCheck == name) {
System.out.println(nameCheck + " is a palindrome");
}else{
System.out.println(nameCheck + " is not a palindrome");
}
}
}