//Time Complexity
// n2

//Find the smallest item and move to first item

public class SelectionSort {  
	
    public static int[] selectionSort(int[] arr){  
    	
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[index]){  
                    index = j;  //searching for lowest index  
                }  
            }  
            int smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
        }
		return arr;  
    }  
}  
