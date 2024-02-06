import java.util.Scanner;

public class DemoLoop{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.println("Enter a number");
int number = input.nextInt();

	for(int count = 1; count < 13; count++){
int total = 0;
total =  number * count;
System.out.println(number + " x " + count + " = " + total); 
}



}
}