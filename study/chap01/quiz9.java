package chap01;
import java.util.*;
public class quiz9 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("a�� ���� �Է��ϼ��� : ");
		int a = stdIn.nextInt();
		
		int b = 0;
		while(true) 
		{
			System.out.print("b�� ���� �Է��ϼ��� : ");
			b = stdIn.nextInt();
			
			if(b > a)
				break;
			System.out.println("a���� ū���� �Է��ϼ���.");
			
		}
	
		System.out.println("b - a�� " + (b - a) + " �Դϴ�.");
	
	}
	

}
