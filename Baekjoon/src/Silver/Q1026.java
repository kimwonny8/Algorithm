package Silver;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
 
public class Q1026 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //Integer,int 다름 주의
        int[] arr=new int[n];
        Integer [] arr2=new Integer[n];
        
        for(int i=0; i<n; i++) arr[i]=sc.nextInt();
        for(int i=0; i<n; i++) arr2[i]=sc.nextInt();
        
        Arrays.sort(arr);
        Arrays.sort(arr2, Collections.reverseOrder());
        
        int sum=0;
        for(int i=0; i<n; i++) sum+=arr[i]*arr2[i];
        System.out.println(sum);
    }
}    
