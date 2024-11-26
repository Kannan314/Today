package Today;
import java.util.*;
public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		int alpha[] = new int[26];
		int flag = 0;
		if(str1.length()==str2.length()) {
			for(int i=0;i<str1.length();i++) {
				char ele1 = str1.charAt(i);
				char ele2 = str2.charAt(i);
				alpha[ele1-'a']++;
				alpha[ele2-'a']--;
			}
		}
		for(int i=0;i<26;i++){
			if(alpha[i]!=0) {
				flag++;
				break;
			}
		}
		if(flag==0)
			System.out.println("YES");
		else
			System.out.println("NO");
	}

}