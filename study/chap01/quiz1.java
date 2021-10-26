package chap01;
import java.util.Scanner;

public class quiz1 {
	// 최댓값 구하기
	static int max4(int a, int b, int c, int d) {
		int max = a;
		
		if(b > max) {
			max = b;
		}
		
		if(c > max) {
			max = c;
		}
		
		if(d > max) {
			max = d;
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		
		// System.out.println("max4(33, 55, 66, 77) = " + max4(33, 55, 66, 77));
	
		Scanner stdIn = new Scanner(System.in);
		int a;
		int b;
		int c;
		int d;

		System.out.println("네 정수의 최댓값을 구합니다.");
		
		System.out.print("a의 값：");
		a = stdIn.nextInt();
		
		System.out.print("b의 값：");
		b = stdIn.nextInt();
		
		System.out.print("c의 값：");
		c = stdIn.nextInt();
		
		System.out.print("d의 값：");
		d = stdIn.nextInt();

		int max = max4(a, b, c, d); 	// a, b, c, d의 최댓값

		System.out.println("최댓값은 " + max + "입니다.");
	}

}
