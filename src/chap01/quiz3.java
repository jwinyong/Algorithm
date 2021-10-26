package chap01;
import java.util.Scanner;

public class quiz3 {

	static int min4(int a, int b, int c, int d) {
		int min = a;
		
		if(b < min) {
			min = b;
		}
		
		if(c < min) {
			min = c;
		}
		
		if(d < min) {
			min = d;
		}
	
		return min;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int a;
		int b;
		int c;
		int d;
		
		System.out.println("네 정수의 최솟값을 구합니다.");
		
		System.out.print("a 값은 :");
		a = stdIn.nextInt();
		
		System.out.print("b 값은 :");
		b = stdIn.nextInt();
		
		System.out.print("c 값은 :");
		c = stdIn.nextInt();
		
		System.out.print("d 값은 :");
		d = stdIn.nextInt();
		
		int min = min4(a, b, c, d);

		System.out.println("최솟값은 " + min + " 입니다.");
	}

}
