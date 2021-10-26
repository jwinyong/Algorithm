package chap01;
import java.util.*;

public class quiz6 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		// System.out.println("1부터 n까지 정수의 합 구하기");
	
		System.out.print("n의 값을 입력하세요 : ");
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
