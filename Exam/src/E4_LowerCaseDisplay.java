import java.util.Scanner;

public class E4_LowerCaseDisplay {

	public static void main(String[] args) {
		
		System.out.println("E4. �p�g���");
		System.out.print("�п�J���N�j�p�g�r��G");
		
		Scanner scanner = new Scanner(System.in);
		String inputValue = scanner.nextLine();
		
		for(int i = 0; i < inputValue.length(); i++) {
			
			int ascii = Integer.valueOf(inputValue.charAt(i));
									
			if(65 <= ascii && ascii <= 90) {
				
				System.out.print((char)(ascii + 32));
			}else {
				System.out.print((char)(ascii));
			}
			
		}
		
	}
	
}
