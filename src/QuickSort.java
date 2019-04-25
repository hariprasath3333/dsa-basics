
public class QuickSort {

	int partition(int a[], int low, int high){
		int i = low-1;
		int pivot = a[high];
		int temp;
		for(int j = low; j < high;j++){
			
			if(a[j] <= pivot){
				i++;
				
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		
		temp = a[i+1];
		a[i+1] = a[high];
		a[high] = temp;
		return i+1;
	}
	
	void quickSort(int a[], int low, int high){
		
		if(low < high){
			int pi = partition(a, low,high);
			quickSort(a, low, pi-1);
			quickSort(a, pi+1, high);
		}
	}

	void printArray(int a[]){
		int n = a.length;
		for(int i =0; i< n; i++){
			System.out.print(" " + a[i]);
		}
	}
	public static void main(String[] args){
		QuickSort ob = new QuickSort();
		int a[] = {12,11,2,3,10};
		int n = a.length;
		ob.quickSort(a,0 , n-1);
		ob.printArray(a);
	}
}
