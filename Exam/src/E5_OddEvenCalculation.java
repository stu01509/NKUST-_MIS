import java.util.Scanner;

public class E5_OddEvenCalculation {

	public static void main(String[] args) {
		
		System.out.println("E5. �_���Ʈt�p��");
		System.out.print("�п�J�Ʀr�G");
		
		Scanner scanner = new Scanner(System.in);
		String inputValue = scanner.nextLine();
		String[] input =  inputValue.split("");
		
		int odd = 0;
		int even = 0;
		
		for (int i = 0; i < input.length; i++) {
			
			if (i % 2 == 0) {
				
				odd += Integer.valueOf(input[i]);
				
			} else if ( i % 2 == 1){
				
				even += Integer.valueOf(input[i]);
			}
			
		}
		
		String ans = ""; 
		
		if (Math.abs(odd - even) % 11 == 0) {
			ans = "��";
		} else {
			ans = "���O ";
		}
		
		System.out.println(inputValue + "���_���Ʈt" + ans + "11 ������");
		
	}
	
}
