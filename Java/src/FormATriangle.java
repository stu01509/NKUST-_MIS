import java.util.Scanner;

public class FormATriangle {

	public static void main(String[] args) {
		
		System.out.println("��ƬO�_��c���T���Τ��T���");
		System.out.println("�п�J�T���.");
		
		Scanner scanner = new Scanner(System.in);
		
		int sideOne = scanner.nextInt();
		int sideTwo = scanner.nextInt();
		int sideThree = scanner.nextInt();
	
		if(sideOne + sideTwo > sideThree && sideTwo + sideThree > sideOne & sideThree + sideOne > sideTwo) {
			
			System.out.println("fit");			
		}else {
			System.out.println("unfit");
		}
		
	}
	
}
