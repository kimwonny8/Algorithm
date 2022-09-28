package yju_algorithm;

import java.util.Scanner;

public class 기수변환 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		int cd; // 기수
		int dno; // 변환 뒤 자릿수
		
		char[] arr=new char[32]; // 변환 후 각 자리의 숫자를 넣어두는 문자배열
		
		do {
		System.out.print("변환할 숫자 입력(음이 아닌 정수): ");
		num=sc.nextInt(); 
		} while(num<0);
		
		System.out.print("2진수: ");
		dno=cardConv(num, 2, arr);
		for(int i=0; i<dno; i++) System.out.print(arr[i]);
		
		System.out.print("\n8진수: ");
		dno=cardConv(num, 8, arr);
		for(int i=0; i<dno; i++) System.out.print(arr[i]);
		
		System.out.print("\n16진수: ");
		dno=cardConv(num, 16, arr);
		for(int i=0; i<dno; i++) System.out.print(arr[i]);
		
	}
	
	static int cardConv(int n, int r, char[]arr) {
		// 정수 n, r진수로 변환
		int digits=0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {
			arr[digits++]=dchar.charAt(n%r);
			n/=r;
		} while(n!=0);
		
		// 역순으로
		for(int i=0; i<digits/2; i++) {
			char tmp=arr[i];
			arr[i]=arr[digits-i-1];
			arr[digits-i-1]=tmp;
		}
		return digits;
	}
}
