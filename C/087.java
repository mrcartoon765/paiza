import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int first_no = scanner.nextInt();
		String reverse_no = String.valueOf(first_no);
		StringBuilder strb = new StringBuilder(reverse_no);
		int first_reverse = Integer.parseInt(strb.reverse().toString());
		int first_answer = first_no + first_reverse;
		String reverse_2 = String.valueOf(first_answer);
		StringBuilder strb2 = new StringBuilder(reverse_2);
		int secound_reverse = Integer.parseInt(strb2.reverse().toString());
		if (first_answer == secound_reverse) {
			System.out.println(first_answer);
		} else {
			int final_answer = secound_reverse + first_answer;
			System.out.println(final_answer);
		}
	}
}