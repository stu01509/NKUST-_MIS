import java.util.Scanner;

public class E12_ReverseArray {

	public static void main(String[] args) {
		
		System.out.println("E12. ����}�C");		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�п�J: ");
		String inputValue[] = scanner.nextLine().split(" ");
		invert(inputValue, inputValue.length -1);
		
	}
	
	public static void invert(String[] input, int inputLength) {
		
		if (inputLength == 0 ) {
			System.out.print(input[0] + " ");
		} else {
		
			System.out.print(input[inputLength] + " ");
			invert(input, inputLength - 1);
		}

	}
	
}
