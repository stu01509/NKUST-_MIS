import java.util.Scanner;

public class CalculationResults {

	public static void main(String[] args) {
		
		System.out.println("�p�⵲�G ");
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("�п�JM.");
		int inputM = Integer.valueOf(scanner.nextLine());
		System.out.println("�п�JN.");
		int inputN = Integer.valueOf(scanner.nextLine());
		
		
		int mResult = 1;
		int nResult = 1;
		int subResult = 1;
		
		for(int i = 1; i <= inputM; i++) {
			mResult *= i;
		}
		
		for(int i = 1; i <= inputN; i++) {
			nResult *= i;
		}
		
		for(int i = 1; i <= inputM - inputN; i++) {
			subResult *= i;
		}
		
		int ans = mResult / (nResult * subResult);
		
		System.out.println(ans);

		
		
	}
	
}
