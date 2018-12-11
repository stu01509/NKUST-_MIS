import java.util.Scanner;

public class D4_BinarySearch {

	public static void main (String[] args) {
				
		System.out.println("D4. �G���j�M�k");
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���ƧǸ�ơG");
		String[] data = scanner.nextLine().split(", ");
		
		System.out.print("�п�J�n�M�䪺�Ʀr:");
		int find = scanner.nextInt();
		
//		Sort
		for (int i = 0; i < data.length; i++) {
			
			for (int j = 0; j < data.length -1; j++) {
				
				if (Integer.valueOf(data[j]) > Integer.valueOf(data[j + 1])) {
					
					String tempData = data[j];
					data[j] = data[j + 1];
					data[j + 1] = tempData;
					
				}
				
			}
			
		}		

		System.out.println("�Ʀr" + find + "�b��" + (binarySearch(data, find) + 1) + "�Ӧ�m");

	}
	
	
	public static int binarySearch(String[] data, int findValue) {
		
//		�̥��䪺��m		
		int left = 0;
//		�̥k�䪺��m
		int right = data.length - 1;
		
//				
		for (int i = left; i <= right; i++) {
			
//			�p�G�ܩ��B�������ȴN�O�ڭ̩ҭn�� �����^��
			if (Integer.valueOf(data[(left + right) / 2]) == findValue) {
				return (left + right) / 2;
			}
			
//			�p�G������ �j��ڭ̩ҭn���� �ڭ̥i�H���D�� �ڭ̭n���� �b��� ����������
			if (Integer.valueOf(data[(left + right) / 2]) > findValue) {
//				���s�w�q�k�䪺��m
				right = ((left + right) / 2) - 1; 
			}
			
//			�p�G������ �p��ڭ̩ҭn���� �ڭ̥i�H���D�� �ڭ̭n���� �b��� �������k��
			if (Integer.valueOf(data[(left + right) / 2]) < findValue) {
//				���s�w�q���䪺��m
				left = ((left + right) / 2) + 1; 
			}
						
		}
		
		return (left + right) / 2;
	}
	
}
