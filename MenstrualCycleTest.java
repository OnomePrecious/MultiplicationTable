import java.time.LocalDate;
import java.util.Scanner;
public class MenstrualCycleTest{
public static void main(String[]args) {
Scanner input = new Scanner(System.in);

MenstrualCycle menstrualCycle = new MenstrualCycle();

System.out.println("Enter your age");
int age = input.nextInt();

 
System.out.println("To know your next period");

System.out.print("Enter your menstruation last flow date: (format: yyyy-month-day): ");
            String lastPeriodDate =  input.nextLine();
 
//int nextPeriodDate = input.nextInt();
//nextPeriodDate = 
System.out.println("Do you want to know your safe periods?");
String safePeriod = input.next();  

System.out.print("Do you want to know how to sleep when you have menstrual cramps?");
String sleepingPosition = input.nextLine();
while(safePeriod.equalsIgnoreCase("Yes")){

System.out.println("Sleeping on the back side can reduce discomfort" + "and improve sleep quality during menstruation.\n " + "Periods typically lasts 3-5 days, although this can vary between individuals.\n " + "Research has shown that sleeping on the back can also reduce back pains.+\n " + "As such, this position may relieve lower back pain associated with menstrual cramps");
//while(safePeriod.equalsIgnoreCase("Yes")){

//String womanInfo = "A woman with 32 days between two menstruations ovulates //around 18 days after the first day of the last //menstruation.Thus,the safe //periods are from the first day of the last menstruation and 14 days";

//Most women have their first period between the ages of 11 and 14, and have //regular menstrual cycle until about age 50. The menstrual cycle typically lasts //about 28 days; however it is normal to have a cycle that is a few days shorter //or longer. The days of a menstrual cycle are counted from Day 1 of menstrual //bleeding to day 1 of the next menstrual bleeding.





menstrualCycle.setAge(age);
menstrualCycle.setLastPeriodDate(Integer.toString(lastPeriodDate));


System.out.println("Age:" + menstrualCycle.getAge());
System.out.println("Last period date:" + menstrualCycle.getLastPeriodDate());
System.out.println(sleepingPosition);
//System.out.println(ovulationDate);
//System.out.println("Safe Period:" + safePeriod);
//System.out.print(word + " ");

}

}
}