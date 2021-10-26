package chap01;
import java.util.Scanner;

public class Max {

	public static void main(String[] args) {
		Scanner stdIN = new Scanner(System.in);

		System.out.println("세 정수의 최댓값을 구함");

		System.out.print("a의 값 : ");
		int a = stdIN.nextInt(); // 키보드로 입력한 값 중 정수를 얻어냄!
		
		System.out.print("b의 값 : ");
		int b = stdIN.nextInt();
		
		System.out.print("c의 값 : ");
		int c = stdIN.nextInt();
		
		// a, b, c의 최댓값을 구하여 max에 대입
		int max = a;
		
		if (b > max) {
			max = b;
		}
		
		if (c > max) {
			max = c;
		}
		
		System.out.println("최댓값은 " + max);
	}

}
