
public class LinearSearch {

	int linearSearch(int a[], int n, int x){
		for(int i=0;i<n; i++){
			if(a[i] == x){
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args){
		LinearSearch ob = new LinearSearch();
		int a[] = {0,2,3,10,14,25};
		int n = a.length;
		int result = ob.linearSearch(a, n, 25);
		if(result ==-1){
			System.out.println("Element Not Found");
		}else{
			System.out.println("Element is present at: " + result);
		}
	}		
}
