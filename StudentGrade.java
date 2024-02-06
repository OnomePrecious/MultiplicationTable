import java.util.Scanner;
public class StudentGrade {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.println("How many students do you have ?");
int numberOfStudents = input.nextInt();

System.out.println("How many subjects do they offer ?");
int numberOfSubjects = input.nextInt();
System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>" + "\n" + "Saved successfully");

if(numberOfStudents <= 0 || numberOfSubjects <= 0) {  
System.out.println("Enter a valid number ");
}

int[][] scores = new int[numberOfStudents] [numberOfSubjects];
	for(int index = 0; index < numberOfStudents; index++) {
System.out.println();
System.out.println("Entering score for student" +(index+1));
System.out.println("Enter scores for student " + (index + 1) + ":");

	for(int index1 = 0; index1 < numberOfSubjects; index1++) {

System.out.println("  Enter score for subject  "  + (index1 + 1) + ", " + ("Please enter a score between 0 and 100"));

	   scores[index][index1] = input.nextInt();
System.out.println();

	     

		}
	}



System.out.println("=======================================================");
System.out.println("STUDENT" + "\t" + "TOTAL" + "\t" +"AVE" + "\t" + "POS");
System.out.println("=======================================================");

for(int index = 0; index < numberOfStudents; index++) {
	int total = 0;
for(int index1 = 0; index1 < numberOfSubjects; index1++) {
	    total += scores[index][index1];
System.out.println("  Subject  "  + (index1 + 1) + ": " + scores[index][index1]);
}
	double average = (double) total / numberOfSubjects;
	  System.out.println("Total: " +      total);
	   System.out.println("Average: " +   average);	
	


}

}

			}