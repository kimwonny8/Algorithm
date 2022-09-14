package Silver;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class Q1935 {
    public static void main(String args[])  {
        Scanner sc=new Scanner(System.in);
 
        int N=sc.nextInt();
        char[] arr=sc.next().toCharArray();
        Stack<Double> stack=new Stack<>();
        Map<Character, Double> map=new HashMap<>();

        char key='A';
        for (int i=0; i<N; i++) {
            map.put(key, sc.nextDouble());
            key++;
        }

        for(int i=0; i<arr.length; i++) {
            if('A'<=arr[i] && arr[i]<='Z') {
                stack.push(map.get(arr[i]));
            }
            else{
                double x=stack.pop();
                double y=stack.pop();

                switch(arr[i]) {
                    case '+':
                        stack.push(y+x);
                        break;
                    case '-':
                        stack.push(y-x);
                        break;
                    case '*':
                        stack.push(y*x);
                        break;
                    case '/':
                        stack.push(y/x);
                        break;
                }
            }
        }
        System.out.printf("%.2f", stack.pop());
    }
}