import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("�п�J���Z�ӼơG");
        int input = Integer.valueOf(scanner.nextLine());
        System.out.print("�п�J���Z�G");
        
        String[] point = scanner.nextLine().split(" ");
        int sum = 0;
        double ave = 0.0;
        
        for(int i = 0; i < point.length; i++){
            sum += Integer.valueOf(point[i]);
        }
        
        ave = sum / point.length;
        
        System.out.println("�`�M�G" + sum);
        System.out.println("�����G" + ave);
        System.out.println("����:�G"); 
        
        for(int i = 0; i < point.length; i++){
        	
        	if(Integer.valueOf(point[i]) <= 19){
                System.out.println(point[i] + " = E");
            }else if(Integer.valueOf(point[i]) >= 20 && Integer.valueOf(point[i]) <= 39){
                System.out.println(point[i] + " = D");
            }else if(Integer.valueOf(point[i]) >= 40 && Integer.valueOf(point[i]) <= 59){
                System.out.println(point[i] + " = C");
            }else if(Integer.valueOf(point[i]) >= 60 && Integer.valueOf(point[i]) <= 79){
                System.out.println(point[i] + " = B");
            }else if(Integer.valueOf(point[i]) >= 80 && Integer.valueOf(point[i]) <= 100){
                System.out.println(point[i] + " = A");
            }
        	
        }      
    }    
	
}
