package yju_algorithm;

import java.util.Random;
import java.util.Scanner;

public class SeqSearch {
    // 100개의 랜덤 정수값(0~100)을 가진 배열을 생성하고
    // 5가 들어있는 배열의 인덱스를 검색, 못 찾으면 못찾았다고 출력
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = 100, KEY = 5;
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = new Random().nextInt(101);
        }

        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");

            if (i == N - 1) System.out.printf("\n%d를 찾지 못했습니다.", KEY);
            if (arr[i] == KEY) {
                System.out.printf("\n%d는 %d번째에 있습니다.", KEY, i+1);
                break;
            }
        }
    }

}
