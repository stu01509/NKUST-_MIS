import java.util.Scanner;

public class EveryDigitSort {

	public static void main(String[] args) {
		
		System.out.println("�U��Ʀr�M�Ƨ�");
		System.out.println("�п�J�Ӽ�.");
		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		
		System.out.println("�п�J�Ʀr.");
		
		String[] inputValue = scanner.nextLine().split(" ");
		int[][] valueData = new int [Integer.valueOf(input)][2];
		
		
		for(int i = 0; i < inputValue.length; i++) {
			// �N����x�s�� valueData[][0]
			valueData[i][0] = Integer.valueOf(inputValue[i]);
			
			// �N�ӼƦr�[�` ���x�s��valueData[][1]
			for(int j = 0; j <= 3; j++) {
				valueData[i][1] += Character.getNumericValue(inputValue[i].charAt(j));
			}
		}

		for (int i = 0; i < inputValue.length; i++)
        {
            for(int j = 0; j < inputValue.length - 1; j++)
            {
                if(valueData[j][1] > valueData[j + 1][1])
                {
                    // [0] N����� [1]Total���ӼƦrSum
                    int tempN;
                    int tempTotal;

                    tempN = valueData[j][0];
                    tempTotal = valueData[j][1];

                    valueData[j][0] = valueData[j + 1][0];
                    valueData[j][1] = valueData[j + 1][1];

                    valueData[j + 1][0] = tempN;
                    valueData[j + 1][1] = tempTotal;

                }
            }
        }
		
		//�ƧǹJ���`�M�۵��ɤp���� �j���k
        for(int i = 0; i < inputValue.length; i++)
        {
            for(int j = 0; j < inputValue.length - 1; j++)
            {
                if(valueData[j][1] == valueData[j + 1][1])
                {
                    if(valueData[j][0] > valueData[j + 1][0])
                    {
                        int tempN;
                        int tempTotal;

                        tempN = valueData[j][0];
                        tempTotal = valueData[j][1];

                        valueData[j][0] = valueData[j + 1][0];
                        valueData[j][1] = valueData[j + 1][1];

                        valueData[j + 1][0] = tempN;
                        valueData[j + 1][1] = tempTotal;

                    }
                }
            }
        }                   
		
		for(int i = 0; i < inputValue.length; i++) {
			System.out.print(valueData[i][0] + " ");

		}		
		
	}
	
}
