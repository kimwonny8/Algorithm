package yju_algorithm;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class PhyscData {
	String name;
	int height;
	double vision;

	// --- 생성자(constructor) ---//
	public PhyscData() {

	}

	public PhyscData(String name, int height, double vision) {
		this.name = name;
		this.height = height;
		this.vision = vision;
	}

	// --- 문자열로 만들어 반환하는 메서드 --//
	public String toString() {
		return name + " " + height + " " + vision;
	}
}

class nameComparator implements Comparator<PhyscData> {
	public int compare(PhyscData d1, PhyscData d2) {
		if (d1.name.compareTo(d2.name) > 0)
			return 1;
		else
			return (d1.name.compareTo(d2.name) < 0) ? -1 : 0;
	}

}

public class 이진검색_과제 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PhyscData[] x = { // 이름 오름차순으로 정렬
				new PhyscData("가", 162, 0.3), new PhyscData("나", 168, 0.4), new PhyscData("다", 169, 0.8),
				new PhyscData("라", 171, 1.5), new PhyscData("마", 173, 0.7), new PhyscData("바", 174, 1.2),
				new PhyscData("사", 175, 2.0), };

		nameComparator n = new nameComparator();

		System.out.print("이름이 어떤 사람을 찾고 있나요?");
		String key = sc.next();

		int idx = Arrays.binarySearch(x, new PhyscData(key, 0, 0.0), n);
		System.out.println((idx<0)? "값이 없습니다." : key+"는 x["+idx+"]에 있습니다.");
	}
}
