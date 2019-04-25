
public class BubbleSort {
	
	void bubbleSort(int a[]){
		int n = a.length;
		boolean swapped;
		for(int i =0; i<n-1; i++){
			swapped = false;
			for(int j=0; j<n-i-1 ;j++){
				if(a[j] > a[j+1]){
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1]= temp;
					swapped = true;
				}
			}
			// IF no two elements were  
            // swapped by inner loop, then break 
			if(swapped==false){
				break;
			}
		}
	}
	
	void printElements(int a[]){
		int n = a.length;
		for(int i =0; i< n; i++){
			System.out.println(a[i]);
		}
	}
	
	public static void main(String[] args){
		BubbleSort ob = new BubbleSort();
		int a[] = {1,3,5,2,4};
		ob.bubbleSort(a);
		ob.printElements(a);
	}
}
