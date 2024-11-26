package Today;
import java.util.*;
public class Demo {
	public static int colors(int red, int green, int blue) {
		int primary = 0;
		int secondary = 0;
		if(red > 0) {
			primary++;
			red--;
		}
		if(green > 0) {
			primary++;
			green--;
		}
		if(blue > 0) {
			primary++;
			blue--;
		}
		if(red > 0 && green > 0)  {
			secondary++;
			red--;
			green--;
		}
		if(red > 0 && blue > 0) {
			secondary++;
			red--;
			blue--;
		}
		if(blue > 0 && green > 0) {
			secondary++;
			blue--;
			green--;
		}
		return primary + secondary;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int res[] = new int[size];
		for(int i = 0;i < size;i++) {
			int red = sc.nextInt();
			int green = sc.nextInt();
			int blue = sc.nextInt();
			res[i] =  colors(red, green, blue);
		}
		for(int ans : res)
			System.out.println(ans);
	}
}