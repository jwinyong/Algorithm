package chap01;
import java.util.*;

public class quiz6 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		// System.out.println("1���� n���� ������ �� ���ϱ�");
	
		System.out.print("n�� ���� �Է��ϼ��� : ");
		int n = stdIn.nextInt();
		
		// int n = 7;
		int sum = 0;
		
		for(int i = 1; i <= n; i++) {
			if(i < n) 
			{
				System.out.print(i + " + ");				
			}
			else 
			{				
				System.out.print(i);				
			}
			sum += i;
			
		}
		
		System.out.println(" = " + sum);
		
	}

}
