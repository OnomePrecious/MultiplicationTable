import java.util.Scanner;
public class MultiplicationTable2{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.println("Enter a number:");
int number = input.nextInt();

	for(int count = 1; count < 13; count++) {
	 
int table = number * count;
System.out.println(number + " x " + count + " = " + table);
    }

	}
}