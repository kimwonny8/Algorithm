package yju_algorithm;

public class 소수 {
	public static void main(String[] args) {
		// 2에서 1000까지의 소수 나열하기
		method01();
		method02();
		method03();

	}

	public static void method01() {
		int cnt=0;
		for(int i=0; i<999; i++) {
			int n=i+2;
			boolean isPrime=true;

			for(int j=0; j<i; j++) {
				cnt++;
				if(n%(j+2)==0) {
					isPrime=false;
					break;
				}
			}
			if(isPrime) System.out.print(n+", ");
		}
		System.out.println("\n나눗셈 횟수: "+cnt);
	}

	public static void method02() {
		// 홀수만 검사
		int cnt=0;
		System.out.print(2+", ");
		for(int i=3; i<=1000; i+=2) {
			boolean isPrime=true;

			for(int j=0; j<i-2; j++) {
				cnt++;
				if(i%(j+2)==0) {
					isPrime=false;
					break;
				}
			}
			if(isPrime) System.out.print(i+", ");
		}
		System.out.println("\n나눗셈 횟수: "+cnt);
	}

	public static void method03() {
		// 자신보다 작은 소수로 나누어 떨어지지 않으면 소수
		int cnt=0;
		int []prime=new int[500]; // 소수를 저장할 배열
		int ptr=0; // 저장된 소수의 개수

		prime[ptr++]=2; // 초기에 2를 소수 배열에 넣는다

		for(int i=3; i<=1000; i+=2) {
			boolean isPrime=true;

			for(int j=1; j<ptr; j++) {
				cnt++;
				if(i%prime[j]==0) {
					isPrime=false;
					break;
				}
			}
			if(isPrime) prime[ptr++]=i;
		}

		for(int i=0; i<ptr; i++) System.out.print(prime[i]+", ");
		System.out.println("\n나눗셈 횟수: "+cnt);
	}
}
