package Today;
import java.util.*;
public class Bubble_sort{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Size : ");
        int n=s.nextInt();
        int a[]=new int[n];
        int max=0;
        System.out.println("Enter elements : ");
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
            if(a[i]>max )
                max=a[i];
        }
        max++;
        int a1[]=new int[max];
        for(int i=0;i<n;i++)
                a1[a[i]]=1;
        System.out.println("Sorted elements : ");
        for(int i=0;i<max;i++)
            if(a1[i]==1)
                System.out.print(i+" ");
    }
}