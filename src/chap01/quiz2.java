package chap01;
import java.util.Scanner;

public class quiz2 {

	static int min3(int a, int b, int c) {
		int min = a;
		
		if(b < min) {
			min = b;
		}
		
		if(c < min) {
			min = c;
		}
		
		return min;
	}
	
	public static void main(String[] args) {
		// System.out.println("min(11, 22, 33) = " + min3(11, 22, 33));
	
		Scanner stdIN = new Scanner(System.in);
		int a;
		int b;
		int c;
		
		System.out.println("세 정수의 최솟값을 구합니다.");
		
		System.out.print("a 값 : ");
		a = stdIN.nextInt();
		
		System.out.print("b 값 : ");
		b = stdIN.nextInt();
		
		System.out.print("c 값 : ");
		c = stdIN.nextInt();
		
		int min = min3(a, b, c);
		
		System.out.println("최솟값은 : " + min + " 입니다.");
		
	}

}
