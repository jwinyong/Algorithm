package chap01;
import java.util.*;

public class quiz10 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요");
		int a = stdIn.nextInt();
		
		int n;
		do {
			System.out.print("정수값：");
			n = stdIn.nextInt();
		} while (n <= 0);

		int no = 0; 			// 자릿수
		while (n > 0) {
			n /= 10; 			// n을 10으로 나눔
			no++;
		}

		System.out.println("그 수는 " + no + "자리입니다.");
		
	}

}
