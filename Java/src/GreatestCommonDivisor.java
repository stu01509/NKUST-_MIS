import java.util.Scanner;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		
		System.out.println("�̤j���]��");
		System.out.println("�п�JM�PN.");
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int n = scanner.nextInt();
		
		int ans = 0;
		
		for(int i = 1; i <= m && i <= n; i++) {
			
			if(m % i == 0 && n % i == 0) {
				ans = i;
			}			
		}
		
		System.out.println(ans);
	}
	
}
