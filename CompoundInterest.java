public class CompoundInterest {
public static void main(String[] args) {

double principal = 1000.0;
double interest = 0.05;
System.out.println( "Year" + "\t" + "\t" + "Amount on deposit");
for(int year = 1; year <= 10; ++year) {
double amount = principal * Math.pow(1 + interest, year);
System.out.printf("%4d%,20.2f%n", year, amount);
}
}
}  
