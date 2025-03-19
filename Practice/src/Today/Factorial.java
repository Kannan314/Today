package Today;
import java.util.*;
public class Factorial {
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i=1,f=1;
		while(i<=n) {
			f*=i;
			if(f>=n) {
				break;
			}
			i++;
		}
		if(f==n)
			System.out.print("Yes");
		else
			System.out.print("No");
	}
}
