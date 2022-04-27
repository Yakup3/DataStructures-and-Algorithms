//-----------------------------------------------------
// Title: SortingAlgorithmTester class
// Author: Yakugpguly/Malikov
// Section: 1
// Assignment: 2
// Description: This class creates array in ascending, descending, randomly generated order and
//				array with the same element
//-----------------------------------------------------
import java.util.Random;

public class SortingAlgorithmTester {

	public static void main(String[] args) {
		int size = 100000;
		int[] asc = new int[size];
		int[] desc = new int[size];
		int[] rand = new int[size];
		int[] same = new int[size];

		Random randInt = new Random();

		for (int i = 0; i < size; i++) {
			asc[i] = i;
			desc[i] = size - i - 1;
			rand[i] = randInt.nextInt(size);
			same[i] = 0;
		}

		Test test = new Test();

		// to test the sorting algorithms in ascending order remove comments
//      test.Sort1(asc);
//      test.Sort2(asc);
//      test.Sort3(asc);
//      test.Sort4(asc);
//      test.Sort5(asc);

		// to test the sorting algorithms in descending order remove comments
//      test.Sort1(desc);
//      test.Sort2(desc);
//      test.Sort3(desc);
//      test.Sort4(desc);
//      test.Sort5(desc);

		// to test the sorting algorithms in randomly generated order remove comments
//		test.Sort1(rand);
//		test.Sort2(rand);
//		test.Sort3(rand);
//		test.Sort4(rand);
//		test.Sort5(rand);

		// to test the sorting algorithms with the same elements remove comments
//      test.Sort1(same);
//      test.Sort2(same);
//      test.Sort3(same);
//      test.Sort4(same);
//		test.Sort5(same);

	}
}
