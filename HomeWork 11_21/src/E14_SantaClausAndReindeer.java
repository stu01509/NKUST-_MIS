import java.util.Scanner;

public class E14_SantaClausAndReindeer {

	public static void main(String[] args) {
		
		System.out.println("E14. �t�ϦѤH�P����");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("�п�J�Y���ƶq.");
		int head = Integer.valueOf(scanner.nextLine());
		System.out.println("�п�J�}���ƶq.");
		int foot = Integer.valueOf(scanner.nextLine());
			
	
        int y1 = (foot - (head * 2)) / 2;
        int x1 = head - y1;
        
        System.out.println(x1 + " " + y1);
        System.out.println("�t�ϦѤH�@�� " + x1 + " ��");
        System.out.println("�����@�� " + x1 + " ��");
		
	}
	
}
