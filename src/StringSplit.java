import java.util.Scanner;

public class StringSplit {

	public static void main(String[] args){

		//		Scanner scan = new Scanner(System.in);
		//		int k = scan.nextInt();
		//		String s = scan.next();
		String s = "aabbccaa";
		char a[] = s.toCharArray();
		int length = s.length();
		int k = 2;
		char one[] = new char[length];
		char two[] = new char[length];
		int ol =0;
		int tl =0;
		int mid = length/2;
		int n = s.length(); 

		char newArr[] = new char[length];
		int[] freq = new int[26]; 

		// accumulate freqeuncy of each character 
		// in 'str' 
		for (int i = 0; i < n-1; i++) 
			freq[s.charAt(i) - 'a']++; 
		int x=0;
		int find = -1;
		// traverse 'str' from left to right 
		for (int i = 0; i < n; i++) { 
			if (freq[s.charAt(i) - 'a'] >= k) {
				find = 0;
				newArr[x]=s.charAt(i); 
				//System.out.print(freq[s.charAt(i) - 'a'] + " ");  
//				freq[s.charAt(i) - 'a'] = 0; 
			} 
		}
		if(find ==-1){
			System.out.println("0");
		}else{
			for(int i = 0, j=length-1; i<=mid; i++,j--){
			
						if(a[i] == a[i+1]){
			
						}
					}	
		}
			

	}
}
