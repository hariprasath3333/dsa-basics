import java.util.Arrays;
import java.util.Scanner;

public class Steps {
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		for(int j =0; j<t;j++){

			int q = scanner.nextInt();
			long[] a = new long[q];
			
			long[] c = new long[q];
			long[] d = new long[q];
			for(int i=0;i<q;i++){
				a[i] = scanner.nextInt();
			}
			for(int i=0;i<q;i++){
				c[i] = scanner.nextInt();
			}
//			for(int i=0;i<q;i++){
//				b[i] = 1000000000;
//			}
			for(int i=0; i< q; i++){
//				long[] b = new long[i+1];
//				b[i]=a[i];
				Arrays.sort(a, 0, i+1);
				if(c[i]<=i+1){
					d[i]= a[(int) (c[i]-1)];
				}
			}
			for(int i=0;i<q;i++){
				System.out.print(d[i] + " ");
			}
			
		}
	}
}
