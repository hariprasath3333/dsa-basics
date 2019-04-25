
public class MergeSort {

	void merge(int a[], int l,int m, int r){

		// Find sizes of two subarrays to be merged 
		int n1 = m - l + 1; 
		int n2 = r - m;

		/* Create temp arrays */
		int L[] = new int [n1]; 
		int R[] = new int [n2]; 

		/*Copy data to temp arrays*/
		for (int i=0; i<n1; ++i) 
			L[i] = a[l + i]; 
		for (int j=0; j<n2; ++j) 
			R[j] = a[m + 1+ j]; 

		/* Merge the temp arrays */

		// Initial indexes of first and second subarrays 
		int i = 0, j = 0; 

		// Initial index of merged subarry array 
		int k = l; 

		while (i < n1 && j < n2) 
		{ 
			if (L[i] <= R[j]){ 
				a[k] = L[i]; 
				i++; 
			}else{ 
				a[k] = R[j]; 
				j++; 
			} 
			k++; 
		} 

		/* Copy remaining elements of L[] if any */
		while (i < n1){ 
			a[k] = L[i]; 
			i++; 
			k++; 
		} 

		/* Copy remaining elements of R[] if any */
		while (j < n2){ 
			a[k] = R[j]; 
			j++; 
			k++; 
		} 
	}

	void mergeSort(int a[], int l, int r){
		if (l < r) { 
			// Find the middle point 
			int m = (l+r)/2; 

			// Sort first and second halves 
			mergeSort(a, l, m); 
			mergeSort(a , m+1, r); 

			// Merge the sorted halves 
			merge(a, l, m, r); 
		} 
	}

	void printArray(int a[]){
		int n = a.length;
		for(int i =0; i< n; i++){
			System.out.print(" " + a[i]);
		}
	}
	public static void main(String[] args){
		MergeSort ob = new MergeSort();
		int a[] = {12,11,2,3,10};
		int n = a.length;
		ob.mergeSort(a,0 , n-1);
		ob.printArray(a);
	}
}
