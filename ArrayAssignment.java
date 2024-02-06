import java.util.Arrays;
public class ArrayAssignment{
public static void main(String[]args){

int[] array = new int[10];
	for(int index = 1; index < array.length; index++){

		array[index] += index;
}
System.out.printf("%s", Arrays.toString(array));


}
}  