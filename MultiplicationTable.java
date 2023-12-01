import java.util.Scanner;
public class MultiplicationTable { 
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.println("Enter a number between 1 - 10:");
int number = input.nextInt();

int count = 1;
	while(count < 13) {
while (number > 10){
System.out.println("Enter valid number:");
number = input.nextInt();

} 

int table = number * count;
System.out.println(number + " x " + count + " = " + table);
count = count + 1;
    
}

}

}