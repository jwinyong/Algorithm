package chap01;
import java.util.*;

public class quiz7 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1���� n������ ������ ��");

		System.out.print("n�� ���� : ");
		int n = stdIn.nextInt();
		
		int sum = (n + 1) * (n / 2) + (n % 2 == 1 ? (n + 1) / 2 : 0); // ��
		
		System.out.println(sum);
		
	}

}
