import java.util.Scanner;

public class E9_GCD_LCM {

	public static void main(String[] args) {
		
		System.out.println("E9. �j���]�ƻP�p������");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("��J����� 1�G");
		int num1 = Integer.valueOf(scanner.nextLine());
		System.out.print("��J����� 2�G");
		int num2 = Integer.valueOf(scanner.nextLine());
		
		int gcd = 0;
		int lcm = 0;
		
		for (int i = 1; i <= num1 && i <= num2; i++) {
			
			if (num1 % i == 0 && num2 % i == 0) {
				gcd = i;
			}
			
		}
		
		lcm = (num1 * num2) / gcd;
		
		System.out.println(num1 + "�P" + num2 + "���j���]�ƬO" + gcd);
		System.out.println(num1 + "�P" + num2 + "���p�����ƬO" + lcm);
	}
	
}
