//-----------------------------------------------------
// Title: Sort class
// Author: Yakugpguly/Malikov
// Section: 1
// Assignment: 2
// Description: This class sorts and shuffles the given array
//-----------------------------------------------------
import java.util.Random;

public class Sort {

	/* Function to sort int array in descending order using Insertion Sort */
	void insertionSort(int arr[]) {
		int n = arr.length;

		for (int i = n - 2; i >= 0; i--) {
			int key = arr[i];
			int j = i + 1;

			while (j < n && arr[j] > key) {
				arr[j - 1] = arr[j];
				j = j + 1;
			}
			arr[j - 1] = key;
		}
	}

	/* Function to sort double array in descending order using Insertion Sort */
	void insertionSort(double arr[]) {
		int n = arr.length;

		for (int i = n - 2; i >= 0; i--) {
			double key = arr[i];
			int j = i + 1;

			while (j < n && arr[j] > key) {
				arr[j - 1] = arr[j];
				j = j + 1;
			}
			arr[j - 1] = key;
		}
	}

	/* Function to sort int array in descending order using Bubble Sort */
	void bubbleSort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (arr[j] < arr[j + 1]) {
					// swap arr[j+1] and arr[j]
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
	}

	// To shuffle the given integer array using Knuth shuffle
	void shuffleIntegerArray(int[] arr) {

		Random rand = new Random();

		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {
			int j = rand.nextInt(i + 1);

			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}

	// To shuffle the given double array using Knuth shuffle
	void shuffleDoubleArray(double[] arr) {

		Random rand = new Random();

		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {
			int j = rand.nextInt(i + 1);

			double temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
}
