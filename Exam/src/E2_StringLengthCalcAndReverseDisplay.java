import java.util.Scanner;

public class E2_StringLengthCalcAndReverseDisplay {

	public static void main(String[] args) {
		
		System.out.println("E2. �r����׭p��ΤϦV���");
		
		Scanner scanner = new Scanner(System.in);
		String[] inputValue = scanner.nextLine().split("");
		
		Length(inputValue);
		Reverse(inputValue);
		
	}
	
	public static void Length(String[] inputValue) {
		System.out.println("�r����סG" + inputValue.length);
	}
	
	public static void Reverse(String[] inputValue) {
		System.out.print("�����r��G");
		
		for (int i = inputValue.length - 1; i >= 0; i--) {
			System.out.print(inputValue[i]);
		}
	}
	
}
