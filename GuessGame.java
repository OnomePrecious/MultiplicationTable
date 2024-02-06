import java.util.Scanner;
public class GuessGame {    
public static void main(String[] args) { 
Scanner input = new Scanner(System.in);

System.out.println("Enter an integer");
int userInput1 = input.nextInt();

System.out.println("Enter an integer");
int userInput2 = input.nextInt();

if(userInput1 == 0) {
System.out.printf("%d%s%n", 0, "Heads");
}
if(userInput2 == 1) {
System.out.printf("%d%s%n", 1, "Tails");
} else {
System.out.println("Guess is incorrect");
}

   }  
}

