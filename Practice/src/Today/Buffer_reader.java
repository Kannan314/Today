package Today;
import java.io.*;
import java.util.*;
public class Buffer_reader {
	public static void main(String[] args)throws IOException {
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(sc.readLine());
		int[] a = new int[n];
		String[] d = sc.readLine().split(" ");
		for(int i=0;i<n;i++) {
			a[i]=Integer.parseInt(d[i]);
		}
		for(int k:a)
			System.out.print(k+" ");
	}
}
