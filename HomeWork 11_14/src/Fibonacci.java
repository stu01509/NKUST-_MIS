import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		System.out.println("M16. �O��ƦC");

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�п�J�� n �ӶO��ƦC����: ");
			
		int inputN = Integer.valueOf(scanner.nextLine());
			
		System.out.println("�O��ƦC���`�� fib(" + inputN + ") = " + fib(inputN));
		
	}
	
	public static long fib(int n) {
		
		if (n == 1 || n== 2) {
			return 1;
		} else {
			return fib(n - 1) + fib(n - 2);
		}
		
	}

}
