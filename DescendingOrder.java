import java.util.Arrays;
import java.util.Comparator;


public class DescendingOrder{
public static void main(String[] args){

Integer[] number = {3, 4, 7, 5, 8, 6, 2};
//Comparator descComparator = (a, b) -> b - a;

Arrays.sort(number, descComparator);

System.out.println("Array sorted in descending order: " + Arrays.toString(number)); 
		
		}
	}