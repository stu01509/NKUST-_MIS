import java.util.Scanner;

public class ArrayCalculation {

	public static void main(String[] args) {
		
		System.out.println("�}�C�p��");
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("�п�J�}�C1.");
		String[]arr1 =scanner.nextLine().split("");
		System.out.println("�п�J�}�C2.");
		String[]arr2 =scanner.nextLine().split("");
		
		String ans = "";

		
		for(int i = 0; i < arr1.length; i++) {
			if((Integer.valueOf(arr1[i]) + Integer.valueOf(arr2[i])) % 2 == 0) {
				ans += "0";
			}else {
				ans += "1";
			}
		}
		
		System.out.println(ans);
	}
	
}
