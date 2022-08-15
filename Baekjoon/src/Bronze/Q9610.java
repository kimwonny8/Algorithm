package Bronze;

import java.util.Scanner;

public class Q9610 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        int T=sc.nextInt();
        int[] arr=new int[5];
        
        while(T-->0){
            int x=sc.nextInt(), y=sc.nextInt();
            if(x>0 && y>0) arr[0]++;
            else if(x<0 && y>0) arr[1]++;
            else if(x<0 && y<0) arr[2]++;
            else if(x>0 && y<0) arr[3]++;
            else arr[4]++;
        }
        
        sb.append("Q1: "+arr[0]+"\n");
        sb.append("Q2: "+arr[1]+"\n");
        sb.append("Q3: "+arr[2]+"\n");
        sb.append("Q4: "+arr[3]+"\n");
        sb.append("AXIS: "+arr[4]);
        System.out.print(sb);
    }
}