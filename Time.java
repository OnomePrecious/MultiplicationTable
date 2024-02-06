import java.util.Scanner;
public class Time { 
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.println("Enter the number of minutes: ");
double minutes = input.nextDouble();
double hours = minutes / 60;
double days = hours / 24;
double years = days / 365;

System.out.println(minutes + " minutes ");
System.out.println(hours + " hours " );
System.out.println(days + " days " );
System.out.println(years + " years " );



     }
}