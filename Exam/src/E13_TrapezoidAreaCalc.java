import java.util.Scanner;

public class E13_TrapezoidAreaCalc {

	public static void main(String[] args) {
		
		System.out.println("E13. �p��諬���n");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�п�J�W���G");
		int topValue = Integer.valueOf(scanner.nextLine());
		
		System.out.println("�п�J�U���G");
		int bottomValue = Integer.valueOf(scanner.nextLine());
		
		System.out.println("�п�J���G");
		int heightValue = Integer.valueOf(scanner.nextLine());
		
		double area = ((topValue + bottomValue) * heightValue) / 2;
		
		System.out.println("��έ��n�� " + area);
	}
	
}
