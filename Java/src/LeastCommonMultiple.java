import java.util.Scanner;

public class LeastCommonMultiple {

	public static void main(String[] args) {
		
		System.out.println("�̤p������");
		System.out.println("�п�JM�PN.");		
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int n = scanner.nextInt();
		
		int gcd = 0;
		
		for(int i = 1; i <= m && i <=n; i++) {
			
			if(m % i == 0 && n % i==0) {
				
				gcd = i;
				
			}
			
		}
		
		int ans = (m * n) / gcd;
		
		System.out.println(ans);
	}
	
}
