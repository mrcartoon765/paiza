import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int studentNo = scanner.nextInt();
		int okLine = scanner.nextInt();
		int[] score = new int[studentNo];
		int[] out_seat = new int[studentNo];
		for (int i = 0; i < studentNo; i++) {
			score[i] = scanner.nextInt();
			out_seat[i] = scanner.nextInt();
			int minusScore = out_seat[i] * 5;
			int sumScore = score[i] - minusScore;
			if (sumScore <= 0) {
				sumScore = 0;
			}

			if (okLine <= sumScore) {
				System.out.println(i + 1);

			}
		}
	}
}
