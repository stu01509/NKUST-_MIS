import java.util.Scanner;

public class CheckCoordinateInsideTheCircleRange {

	public static void main(String[] args) {
		
		System.out.println("�P�_�y�ЬO�_�b��Ϊ��d��");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�п�J�y��.");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		if((x * x) + (y * y) > 10000){
			
			System.out.println("Outside");
			
        }else if ((x * x)+(y * y) <= 10000){
        	
        	System.out.println("Inside");
        	
        }
	}	
}
