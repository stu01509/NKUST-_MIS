import java.util.Scanner;

public class E11_Prime {

	public static void main(String[] args) {
		
		System.out.println("E11. ��ư��D");
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("�п�J���:");
		
		int num = Integer.valueOf(scanner.nextLine());
		int check = 0;
		
		for (int i = 1 ; i <= num; i++) {
			
			if (num % i == 0) {
				check++;
			}
			
		}
		
		if (check == 2) {
			System.out.println(num + "�O���");
		} else {
			System.out.println(num + "���O��� ");
		}
		
	}
	
}
