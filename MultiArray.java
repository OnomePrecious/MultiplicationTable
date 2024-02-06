import java.util.ArrayList;
public class MultiArray{
public static void main(String[]args){
	ArrayList<String> cars = new ArrayList<String>();
cars.add("Toyota");
cars.add("Bentley");
cars.add("Ford");
cars.add("Benz");
cars.add("Mazda");
cars.set(0, "Opel");
cars.set(3, "Ferari");
cars.set(4, "Lenovo");// can be used to add or replace from a list
//cars.clear();//used to clear an item from a list

for(String index: cars){

//for(int index = 0; index < cars.size(); ++index){

//System.out.println(cars.get(index));

System.out.println(index);

//int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };

//myNumbers[1][0] = 1;
//System.out.println(myNumbers[1][0]);

//for(int index = 0; index < myNumbers.length; index++){
//	for(int index1 = 0; index1 < myNumbers[index].length; index1++) {
//System.out.println(myNumbers[index][index1]);
//}
//}	
}	
}
}