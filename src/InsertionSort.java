
public class InsertionSort {
	void insertionSort(int a[]){
		int n = a.length;
		int key,j;
		for(int i=1; i < n; i++){
			
			key = a[i];
			j = i-1;
			
			while(j>=0  && a[j] > key){
				a[j+1] = a[j];
				j = j-1;
			}
			a[j+1] = key;
		}
	}
	
	void printArray(int a[]){
		int n = a.length;
		for(int i =0; i< n; i++){
			System.out.print(" " + a[i]);
		}
	}
	public static void main(String[] args){
		InsertionSort ob = new InsertionSort();
		int a[] = {12,11,2,3,10};
		ob.insertionSort(a);
		ob.printArray(a);
	}
}
