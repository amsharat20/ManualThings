import java.util.Random;

//https://www.youtube.com/watch?v=Fiot5yuwPAg

//Time Complexity
//worst - n2
//avg - n log n 

public class QuickSort {

	/* The main function that implements QuickSort() 
	   arr[] --> Array to be sorted, 
	   low  --> Starting index, 
	   high  --> Ending index */

	public int[] sort(int arr[], int low, int high) 
	{ 
		if (low < high + 1) 
		{ 
			/* pi is partitioning index, arr[pi] is   now at right place */
			int pivot = partition(arr, low, high); 

			// Recursively sort elements before partition and after partition 
			sort(arr, low, pivot-1); 
			sort(arr, pivot+1, high); 
		}
		return arr; 
	} 
	
	// Moves all n < pivot to left of pivot and all n > pivot to right of pivot, then returns pivot index.
	
	private int partition(int[] arr, int low, int high) {
		swap(arr, low, getPivot(low, high));
		int border = low + 1;
		for (int i = border; i <= high; i++) {
			if (arr[i] < arr[low]) {  //flip for descending
				swap(arr, i, border++);
			}
		}
		swap(arr, low, border-1);
		return border-1;
	}

	private void swap(int[] arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;		
	}

	private int getPivot(int low, int high) {
		Random rand = new Random();
		return rand.nextInt((high - low) + 1) + low;
	}
}