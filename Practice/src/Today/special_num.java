package Today;
import java.util.*;
public class special_num {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int e = sc.nextInt();
		for(int i=n;i<=e;i++) {
			int p=1,a=0,g=i;
			while(g!=0) {
				int r=g%10;
				p*=r;
				a+=r;
				g/=10;
			}
			if(p+a==i)
				System.out.println(i);
			p=1;
			a=0;
		}
	}
}
