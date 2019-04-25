
public class BinarySearch {
	
	int binarySearch(int a[], int l, int r, int x){

        if (r >= l) { 
            int mid = l + (r - l) / 2; 
  
            // If the element is present at the 
            // middle itself 
            if (a[mid] == x) 
                return mid; 
  
            // If element is smaller than mid, then 
            // it can only be present in left subarray 
            if (a[mid] > x) 
                return binarySearch(a, l, mid - 1, x); 
  
            // Else the element can only be present 
            // in right subarray 
            return binarySearch(a, mid + 1, r, x); 
        } 
		return -1;
	}

	public static void main(String[] args){
		BinarySearch ob = new BinarySearch();
		int a[] = {0,2,3,10,14,25};
		int n = a.length;
		int result = ob.binarySearch(a, 0, n-1, 10);
		if(result ==-1){
			System.out.println("Element Not Found");
		}else{
			System.out.println("Element is present at: " + result);
		}
		
	}
}
