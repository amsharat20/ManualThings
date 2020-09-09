
public class MainPrintArray {
	
	public static void main(String[] args) {
		
		int arr[] = {10, 7, 8, 9, 1, 5}; 
        int n = arr.length; 
  
       /* QuickSort ob = new QuickSort(); 
        ob.sort(arr, 0, n-1); */
        
        System.out.println("BUBBLE SORT"); 
        BubbleSort bubblesort = new BubbleSort();
        int bubbleSorted[] = bubblesort.bubbleSort(arr);
        printArray(bubbleSorted); 
        
        System.out.println("SELCTION SORT"); 
        SelectionSort selection = new SelectionSort();
        int selectSorted[] = selection.selectionSort(arr);
        printArray(selectSorted); 
  
        System.out.println("QUICK SORT");
        QuickSort ob = new QuickSort(); 
        int quickSort[] = ob.sort(arr, 0, n-1);
        printArray(quickSort);
        
        System.out.println("MERGE SORT");
        MergeSort merge = new MergeSort(); 
        int mergeSort[] = merge.sort(arr, 0, n-1);
        printArray(mergeSort);
        
        System.out.println("INSERTION SORT");
        InsertionSort insert = new InsertionSort(); 
        int insertSort[] = insert.sort(arr);
        printArray(insertSort);
        
        System.out.println("HEAP SORT");
        HeapSort heap = new HeapSort(); 
        int heapSort[] = heap.sort(arr);
        printArray(heapSort);
        
    } 

	
		  public static  void printArray(int arr[]) 
		    { 
		        int n = arr.length; 
		        for (int i=0; i<n; ++i) {
		            System.out.print(arr[i]+" "); 
		        }
		        System.out.println(); 
		    } 
	}


