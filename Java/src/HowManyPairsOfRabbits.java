import java.util.Scanner;

public class HowManyPairsOfRabbits {

	public static void main(String[] args) {
		System.out.println("�쩳���X��ߤl?");
		System.out.println("�п�J���.");

		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		
		System.out.println(fib(month));
	}
	
	
	public static int fib(int num) {
		if(num == 1 || num == 2) {
			return 1;
		}else {
			return fib(num-1) + fib(num-2);    
		}
	}
	
}
