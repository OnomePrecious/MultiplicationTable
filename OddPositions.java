import java.util.List;
public class OddPositions {
public static <T> void oddPositionElements(List<T> list) {

for(int num = 0; num < list.size(); num++) {
System.out.println(list.get(num));
	}
}

public static void main(String[] args) {
List<Integer> numberList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
System.out.println("The Elements in odd positions are: "); oddPositionElements(numberList);
}
}
