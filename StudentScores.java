import java.util.Scanner;
public class StudentScores {
public static void main(String[] args) { 
Scanner input = new Scanner(System.in);


System.out.print("Enter number of students:");
int numberOfStudents = input.nextInt();

StringName = " ";
highestScorer = 0;

	for (int count = 1; count <= numberOfStudents; count++) {


	System.out.print("Enter the name of students " + count + ": ");
	String studentNames = input.nextLine();

System.out.print("Enter the score of students " + count + ": ");
int studentScore = input.nextInt();

	if (studentScore > highestScorer) {
		highestScorer = studentScore;	} 
          

	}
System.out.print("the student with the highest score is:", "highestScorer:");
      }
}