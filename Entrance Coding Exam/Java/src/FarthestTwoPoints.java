import java.util.Scanner;

public class FarthestTwoPoints {

	public static void main(String[] args) {
		
		System.out.println("�̻������I");
		System.out.println("�п�J�X���I.");
		Scanner scanner = new Scanner(System.in);
		int inputValue = scanner.nextInt();
		
		int[][] dataDot = new int[inputValue + 1][2];
		
		System.out.println("�п�J�y��.");
		
		for (int i = 1; i <= inputValue; i++) {
            
			dataDot[i][0] = scanner.nextInt();
			dataDot[i][1] = scanner.nextInt();

        }
		
        int distanceMax = 0;
        
        for (int i = 1; i < inputValue; i++) {
            for (int j = i + 1; j <= inputValue; j++) {
                int distance = (int)(Math.pow(dataDot[i][0] - dataDot[j][0], 2) + Math.pow(dataDot[i][1] - dataDot[j][1], 2));
                
                if (distance > distanceMax) {
                	
                    distanceMax = distance;
                }
            }
        }
        
        System.out.println(distanceMax);
	}
	
}
