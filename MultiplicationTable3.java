public class MultiplicationTable3 { 
public static void main(String[] args) {
	

	for(int number = 1; number < 13; number++){
           for(int count =1; count < 13; count++){
   int table = number * count;
  System.out.printf("%-1d x %-2d = %-2d\t", count,  number, table);
}
System.out.println();
}
}
}