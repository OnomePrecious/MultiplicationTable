import java.util.Scanner;
public class Myself {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.println("What is your name?");
String name = scanner.nextLine();

System.out.println("How old are you?");
int age = scanner.nextInt();

System.out.println("What is the name of your school?");
String school = scanner.next();
System.out.println();

System.out.println("My name is " + name);
System.out.println("I am " + age + (" years old"));
System.out.println("The name of my school is " + school + (" School"));
System.out.println();

System.out.println("Name" + "\t" + "Age" + "\t" + "School");
System.out.println("=========================");
System.out.println();

}


}