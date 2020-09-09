
public class BinarySearch { 
    // Returns index of x if it is present in arr[l.. 
    // r], else return -1 
	
	/* l= 0
     r = array lenth -1
     x= element to be searched*/
    
	int binarySearch(int arr[], int l, int r, int x) 
    { 
        if (r >= l) { 
            int mid = l + (r - l) / 2; 
  
           
            if (arr[mid] == x) {
                return mid; 
            }  // If the element is present at the middle itself 
            
         // If element is smaller than mid, then it can only be present in left subarray 
            if (arr[mid] > x) {   
                return binarySearch(arr, l, mid - 1, x);
            }
  
            // Else the element can only be present in right subarray  
            return binarySearch(arr, mid + 1, r, x); 
        } 
  
        // We reach here when element is not present in right subarray 
        return -1; 
    } 
  
    public static void main(String args[]) 
    { 
        BinarySearch ob = new BinarySearch(); 
        int arr[] = { 60, 3, 4, 10, 40 }; 
        int n = arr.length; 
        int x = 10; 
        int result = ob.binarySearch(arr, 0, n - 1, x); 
        if (result == -1) 
            System.out.println("Element not present"); 
        else
            System.out.println("Element found at index " + result); 
    } 
}