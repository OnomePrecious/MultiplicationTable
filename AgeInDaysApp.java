import java.util.Scanner;
public class AgeInDaysApp {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter your age in years:");
int userAgeYears = input.nextInt();

int ageInDays = userAgeYears * 365;

System.out.println("display " + ageInDays);



}


}