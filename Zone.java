import java.util.Scanner;
public class Zone { 
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.println("Enter your State:");
String state = input.next();

switch(state) {
  case "Kebbi", "Sokoto", "Katsina","Zamfara","Kaduna","Kano" ->System.out.println("You are from the NorthWest" );

case "Adamawa","Yobe","Borno","Bauchi","Gombe","Taraba" -> System.out.println("You are from the NorthEast");

case "Plateau", "Kwara", "Kogi","Benue","Niger", "Nassarawa", "FCT" ->System.out.println("You are from the NorthCentral");

case "Lagos","Ondo","Osun", "Oyo", "Ogun", "Ekiti" -> System.out.println("You are from the SouthWest");
        
case "Abia", "Anambra", "Ebonyi", "Enugu", "Imo" -> System.out.println("You are from the SouthEast");

case "Bayelsa", "Edo","Crossriver","Delta","Rivers","AkwaIbom" -> System.out.println("You are from the SouthSouth");

    }

  
  }
	}