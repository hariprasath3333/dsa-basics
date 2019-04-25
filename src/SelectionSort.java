
public class SelectionSort {
	void selectionSort(int a[]){
		int n = a.length; 
		  
        // One by one move boundary of unsorted subarray 
        for (int i = 0; i < n-1; i++) 
        { 
            // Find the minimum element in unsorted array 
            int minIdx = i; 
            for (int j = i+1; j < n; j++) 
                if (a[j] < a[minIdx]) 
                    minIdx = j; 
  
            // Swap the found minimum element with the first 
            // element 
            int temp = a[minIdx]; 
            a[minIdx] = a[i]; 
            a[i] = temp; 
        } 
	}
	
	void printArray(int a[]){
		int n = a.length;
		for(int i =0; i< n; i++){
			System.out.print(" " + a[i]);
		}
	}
	public static void main(String[] args){
		SelectionSort ob = new SelectionSort();
		int a[] = {12,11,2,3,10};
		ob.selectionSort(a);
		ob.printArray(a);
	}
}
