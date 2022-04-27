//-----------------------------------------------------
// Title: Main class
// Author: Yakugpguly/Malikov
// Section: 1
// Assignment: 2
// Description: This is the main class which test all sorting and shuffling 
//-----------------------------------------------------
import java.util.Arrays;

public class Main {

	// creates person array 
	static Comparable[] createPerson() {
		Comparable people[] = { new Person("Murat", "Mammedov", 12324L), new Person("Muhammet", "Kemalov", 78956L),
				new Person("Niyaz", "Kemalov", 45637L), new Person("Guga", "Kemalov", 45678L) };

		return people;
	}

	public static void main(String[] args) {
		Comparable people[] = Main.createPerson();
		int size = people.length;
		Comparable person[] = new Comparable[size];

		// sorts the person according to their id using merge sort
		Merge.sort(people, person, 0, size - 1);

		// prints person
		for (int i = 0; i < people.length; i++) {
			System.out.println(people[i].toString());
		}

		Sort sort = new Sort();

		// read values from file
		int[] integerArray = Reading.readInteger("./src/input1.txt");
		double[] doubleArray = Reading.readDouble("./src/input2.txt");

		sort.shuffleIntegerArray(integerArray);
		sort.shuffleDoubleArray(doubleArray);

		// sorts the array using insertion and bubble sort
		sort.insertionSort(doubleArray);
		sort.bubbleSort(integerArray);
		sort.insertionSort(integerArray);

		// prints arrays that are sorted using insertion and bubble sort 
		System.out.println(Arrays.toString(integerArray));
		System.out.println(Arrays.toString(doubleArray));
		System.out.println(Arrays.toString(integerArray));

	}
}
