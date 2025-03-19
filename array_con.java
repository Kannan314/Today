package Today;
import java.io.*;
public class array_con{
    public static void main(String[] args)throws IOException{
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(sc.readLine());
        int[][] d = new int[n][3];
        for(int i=0;i<n;i++){
        	String[] v = sc.readLine().split(" ");
            for(int j=0;j<3;j++){
                d[i][j]=Integer.parseInt(v[j]);
            }
        }
        for(int s[]:d){
            int a=s[0];
            int b=s[1];
            int c=s[2];
            if(a==b && b==c && c==a)
                System.out.print("0 ");
            else if(a!=b && b!=c && c!=a)
                System.out.print("-1 ");
            else{
                int g = (a>b)?((a>c)?a:c):(b>c)?b:c;
                int l = (a<b)?((a<c)?a:c):(b<c)?b:c;
                int co=0;
                if((g-l)%2==0){
                    while(g!=l){
                        g--;
                        l++;
                        co++;
                    }
                System.out.print(co+" ");
                }else{
                    System.out.print("-1 ");
                }
            }
        }
    }
}