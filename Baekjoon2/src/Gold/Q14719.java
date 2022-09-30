package Gold;

import java.util.Scanner;

public class Q14719 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int h=sc.nextInt(), w=sc.nextInt();
        int[] arr=new int[w];
        for(int i=0; i<w; i++) arr[i]=sc.nextInt();
        
        int result=0;
        for(int i=1; i<w-1; i++) {
            int current=arr[i]; 
            int left=0, right=0; 
            
            // 왼 오 큰 벽 찾기
            for(int j=i-1; j>=0; j--) left=Math.max(left, arr[j]);
            for(int j=i+1; j<w; j++) right=Math.max(right, arr[j]);
            
            if(Math.min(left, right) > current) { // 현재 벽보다 높은 벽이 양쪽에 있으면 물 채울수 없음
                result+=Math.min(left, right)-arr[i];
            }
        }
        System.out.println(result);
    }
}