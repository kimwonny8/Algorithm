package Algorithm_Study;

import java.util.StringTokenizer;

public class Test {
	public static void main(String[] args) {
		String a="F ABC CD EEE Z";
		
		StringTokenizer st = new StringTokenizer(a," ");
		
		// 배열 선언
		String [] arr=new String[st.countTokens()];

		// st에 내용이 있는 동안 arr에 다음 토큰을 담는다
		for(int i=0; i<arr.length;i++) arr[i]=st.nextToken();
		
		sort(arr);
	}
	
	public static void sort(String[]arr) {
		String tmp="";
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length-i-1; j++) { // 마지막 요소는 안해도 됨
				if(arr[j].compareTo(arr[j+1]) > 1) {
					tmp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tmp;
				}
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}