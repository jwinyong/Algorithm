package chap01;
import java.util.Scanner;

public class sumFor {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1���� n������ �� ���ϱ�.");
		System.out.print("n�� �� : ");
		int n = stdIn.nextInt();
		
		int sum = 0;
		
		for(int i = 0; i <= n; i++) {
			
			sum += i;
		}
		
		System.out.println("1���� " + n + "������ ���� " + sum + " �Դϴ�.");
		
	}

}
