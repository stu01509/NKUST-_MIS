import java.util.Scanner;

public class M4_CoinBuyTicket {

	public static void main(String[] args) {
		
		System.out.println("M4. �w���R����");		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("��J���� P�G");
		int ticketPrice = Integer.valueOf(scanner.nextLine());
		
		int ten = ticketPrice / 10;
		int five = (ticketPrice - (ten * 10)) / 5;
		int one = ticketPrice - (ten * 10) - (five * 5);
		
		System.out.println("�����һݪ��`�w���ƶq��" + (ten + five + one) + "�T�C");
		System.out.println("10 ���w���ƶq  = " + ten);
		System.out.println("5 ���w���ƶq  = " + five);
		System.out.println("1 ���w���ƶq  = " + one);
	}
	
}
