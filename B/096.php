import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int for_no = scanner.nextInt();
		int search_no = scanner.nextInt();
		String convert2 = Integer.toBinaryString(search_no);
		StringBuilder strb = new StringBuilder(convert2);
		convert2 = strb.reverse().toString();
		int[] w_number = new int[for_no];

		for (int i = 0; i < for_no; i++) {
			w_number[i] = scanner.nextInt();
			System.out.println(convert2.charAt(w_number[i] - 1));
		}

	}
}