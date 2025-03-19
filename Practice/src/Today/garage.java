package Today;
import java.util.*;
public class garage {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int w = sc.nextInt();
		System.out.print(((n-1)*10)+w*n);
	}
}
