import java.util.Scanner;

public class CheckCoordinateInsideTheCircleRange {

	public static void main(String[] args) {
		
		System.out.println("10. 判斷座標是否在圓形的範圍內");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("輸入X座標.");
		int x = scanner.nextInt();
		System.out.println("輸入Y座標.");
		int y = scanner.nextInt();
		
		if((x * x) + (y * y) > 10000){
			
			System.out.println("Outside");
			
        }else if ((x * x)+(y * y) <= 10000){
        	
        	System.out.println("Inside");
        	
        }
	}	
}
