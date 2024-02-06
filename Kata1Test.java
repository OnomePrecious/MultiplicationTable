import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions. *;

public class Kata1Test {

 @Test
 public void testReverseArray(){
	Kata1 kata1 = new Kata1();
	int[] numbers = {1, 2, 3, 4, 5};// an array of int([])
	int[] numbersInReverse = kata1.reverse(numbers);

	//int[] expected ={5, 4, 3, 2, 1};
	//assertEquals(new int[]{5, 4, 3, 2, 1}, numbersInReverse);
          assertArrayEquals(new int[]{5, 4, 3, 2, 1}, numbersInReverse);
}


}