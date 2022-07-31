package Gold;

import java.util.Scanner;
import java.util.Stack;

public class Q1918 {
   public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      StringBuilder sb = new StringBuilder();
      
      String s=sc.nextLine();
      Stack<Character> stack = new Stack<>();
      
      for(int i=0; i<s.length(); i++) {
       	char tok=s.charAt(i);     
        if(tok=='+' || tok=='-' || tok=='*'|| tok=='/') {
            while(!(stack.isEmpty()) && WhoPrecOp(stack.peek(),tok) >= 0)
               sb.append(stack.pop());
            stack.push(tok);
        }
        else if(tok=='(') stack.add(tok);
        else if(tok==')') {
        	  while(!stack.isEmpty() && stack.peek() != '('){
                  sb.append(stack.pop());
        	  }
        	  stack.pop();
        }
        else sb.append(tok);
      }      
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        System.out.println(sb.toString());

   }
  
	   public static int GetOpPrec(char op) { // 연산자 우선순위 매기기
	      switch(op) {
	      case '*': case'/':
	         return 5;
	      case '+': case'-':
	         return 3;
	      case '(':
	         return 1;
	      }
	      return -1;
	   }
	   
	   public static int WhoPrecOp(char op1, char op2) { // 연산자 우선순위별 비교
	      int op1Prec = GetOpPrec(op1);
	      int op2Prec = GetOpPrec(op2);
	      
	      if(op1Prec > op2Prec) return 1;
	      else if(op1Prec < op2Prec) return -1;
	      else return 0;
	   }
}
