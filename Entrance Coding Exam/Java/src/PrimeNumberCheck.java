import java.util.Scanner;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		
		System.out.println("��ƧP�O");
		System.out.println("�п�J�Ʀr.");		
		
		Scanner scanner = new Scanner(System.in);
		
		int inputValue = scanner.nextInt();
		int prime = 0;
		
		for(int i = 1; i <= inputValue; i++) {
			if(inputValue % i == 0) {
				prime++;
			}
		}
		
		if(prime == 2) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
	}
	
}
