package chap2;
import java.util.Scanner;

//배열 복사
public class quiz4 {
	
	// 배열 복사
	static void copy(int[] a, int[] b) {
		int num = a.length <= b.length ? a.length : b.length;
		
		for (int i = 0; i < num; i++) {
			a[i] = b[i];
		}
		
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("배열 a의 요솟수 : ");
		int na = stdIn.nextInt();
		int[] a = new int[na];
		for (int i = 0; i < na; i++) {
			System.out.print("a[" + i + "] : ");
			a[i] = stdIn.nextInt();
		}
		
		System.out.print("배열 b의 요솟수 : ");
		int nb = stdIn.nextInt();
		int[] b = new int[nb];
		for (int i = 0; i < nb; i++) {
			System.out.print("b[" + i + "] : ");
			b[i] = stdIn.nextInt();
		}
		
		copy(a, b);
		
		System.out.println("배열 b의 모든 요소를 배열 a에 복사했습니다.");
		for (int i = 0; i < na; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
		
	}
	

}
