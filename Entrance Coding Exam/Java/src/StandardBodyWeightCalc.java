import java.text.DecimalFormat;
import java.util.Scanner;

public class StandardBodyWeightCalc {

	public static void main(String[] args) {
		
		System.out.println("�з��魫�p��");
		System.out.println("�п�J�����P�ʧO.");
		
		Scanner scanner = new Scanner(System.in);

		int height = scanner.nextInt();
        int sex = scanner.nextInt();
		
        double ans = 0.0;
        
        if(sex == 1) {
        	ans = (height - 80) * 0.7;
        }else if(sex == 2) {
        	ans = (height - 70) * 0.6;
        }
        
        DecimalFormat df = new DecimalFormat("0.0");   
        String outputAns = df.format(ans);
        
        System.out.println(outputAns);

	}
	
}
