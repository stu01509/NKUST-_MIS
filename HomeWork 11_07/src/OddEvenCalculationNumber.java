import java.util.Scanner;

public class OddEvenCalculationNumber {

	public static void main(String[] args) {

		System.out.println("�_���Ʈt�p��");
		System.out.println("�п�J�Ʀr.");
		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		
		//A
		int odd = 0;
		//B
		int even = 0;
		
		for(int i = 0; i < input.length(); i++) {
			
			if(i % 2 == 0) {
				even += Integer.valueOf(input.charAt(i));
			}else if(i % 2 == 1) {
				odd += Integer.valueOf(input.charAt(i));
			}			
		}
		
		if(Math.abs(odd - even) % 11 == 0) {
			System.out.println(input + "���_���Ʈt�� 11 ������ ");
		}else {
			System.out.println(input + "���_���Ʈt���O 11 ������ ");
		}

	}

}
