import java.util.Scanner;

public class E3_StringReplace {

	public static void main(String[] args) {
		
		System.out.println("E3. �r����");
		System.out.print("�п�J�����r���G");
		
		Scanner scanner = new Scanner(System.in);
		String[] inputValue = scanner.nextLine().split("");
		
		System.out.print("�п�J�ĴX�Ӧr���έn�������r���G");
		String[] inputParm = scanner.nextLine().split(" ");
		
		Replace(inputValue, Integer.valueOf(inputParm[0]), inputParm[1]);
		
	}
	
	public static void Replace(String inputValue[], int digit, String change) {
				
		String[] inputReplace = inputValue;
		inputReplace[digit - 1] = change;
		
		for(int i = 0; i < inputReplace.length; i++) {
			System.out.print(inputReplace[i]);
		}
	}
}
