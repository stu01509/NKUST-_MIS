import java.util.Scanner;

public class Q5 {
	
	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
        System.out.print("�п�J�ʧO�G");
        String sex = scanner.nextLine();
        System.out.print("��J�����G");
        double height = Double.valueOf(scanner.nextLine());
        
        if(sex.equals("M")){
            System.out.println("�A���з��魫�������b " + (height - 80) * 0.7 + " ����C");
        }else if(sex.equals("F")){
            System.out.println("�A���з��魫�������b " + (height - 70) * 0.6 + " ����C");
        }
    }    
}
