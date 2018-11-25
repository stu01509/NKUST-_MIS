import java.util.Scanner;

public class E1_ArraySumAndMatrixMultiplication {

	public static void main(String[] args) {
		
		System.out.println("E1.  �}�C�ۥ[ �P �x�}�ۭ�");
		
		Scanner scanner = new Scanner(System.in);
		
		int[][] arr1 = new int[3][3];
		int[][] arr2 = new int[3][3];
		
		System.out.println("�п�J�� 1 �Ӱ}�C�G ");		
		for (int i = 0; i < 3; i++) {
			
			for (int j = 0; j < 3; j++) {
				arr1[i][j] = scanner.nextInt();
			}
			
		}
		
		System.out.println("�п�J�� 2 �Ӱ}�C�G ");		
		for (int i = 0; i < 3; i++) {
			
			for (int j = 0; j < 3; j++) {
				arr2[i][j] = scanner.nextInt();
			}
			
		}
		
		System.out.println("�}�C�[�`�ȡG ");
		for (int i = 0; i < 3; i++) {
			
			for (int j = 0; j < 3; j++) {
				
				System.out.print(add(arr1[i][j], arr2[i][j]) + " ");
			}
			System.out.println("");
			
		}
		
		System.out.println("�x�}�ۭ��`�ȡG ");
		matrixMul(arr1, arr2);		
		
	}
	
	public static int add(int num1, int num2) {
		return num1 + num2;
	}
	
	public static void matrixMul(int[][] arr1, int[][] arr2) {
		
		for (int i = 0; i < 3; i++) {
			
			for (int j = 0; j < 3; j++) {
				
				int mulAns = 0;
				for (int k = 0; k < 3; k++) {

					mulAns += arr1[i][k] * arr2[k][j];
					
				}
				
				System.out.print(mulAns + " ");
				
			}
			System.out.println("");
		}	
		
	}	

}
