import java.util.Scanner;

public class M1_BuyFruit {
	
	public static void main(String[] args) {
		
		System.out.println("M1. �R���G");
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("��J N�G");
		
		int money = scanner.nextInt();
		boolean isSol = false;
		
		for (int i = 5; i <= money; i+=5) {

			for (int j = 3; j <= money; j+=3) {
				
				for (int k = 2; k <= money; k+=2) {
					
					if ((k * 10) + (j * 6) + (i * 5) >= 100 && (k * 10) + (j * 6) + (i * 5) == money) {
						isSol = true;
						System.out.println("x=" + i + " y=" + j + " z=" + k);
					}
					
				}
				
			}					
			
		}
		
		if(!isSol) {
			System.out.println("No Solution");
		}
		
	}
	
}
