package Today;
import java.util.*;
public class Duplicate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int rep = 0;
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(a[i]==a[j]) {
					rep++;
				}
			}
			if(rep==1)
				System.out.print(a[i]+" ");
			rep=0;
		}
	}
}
