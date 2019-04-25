
public class StringPosition {
	public static void main(String[] args){

		//		Scanner scan = new Scanner(System.in);
		//		int k = scan.nextInt();
		//		String s = scan.next();
		String s = "aabbccaa";
		int k =2;
		int n = s.length();
		char a[] = s.toCharArray();
		int[] freq = new int[26]; 
		int minChar =0;
		int pos =0;
//		for(int i=0;i<26;i++){
//			freq[i] =0;
//		}
		for(int i = 0; i < n; i++){
			freq[s.charAt(i) - 'a']++;
			
			if(freq[s.charAt(i) - 'a'] ==1){
				minChar++;	
			}
			if(minChar == k){
				pos = i;
			}
		}
	}
}
