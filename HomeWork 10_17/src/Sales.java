
public class Sales {

	public static void main(String[] args) {
		
		int[][] sales = new int[][] {{32, 35, 26, 30, 0}
									,{34, 30, 33,31, 0}
									,{0, 0, 0, 0, 0}};

		//�p��~�ȭ� �@�~���P��q		
		for(int i = 0; i < sales.length; i++){
			
			for(int j = 0; j < sales[i].length - 1; j++){
				sales[i][sales[i].length-1] += sales[i][j];
			}
			
			System.out.println("");		
		}
		
		//�p��C�@�u���P��q
		for(int j = 0; j < sales[0].length ; j++){
		
			sales[2][j] = sales[0][j] + sales[1][j];
			
		}

		// �N�}�C���G�L�X
		for(int i = 0; i < sales.length; i++){
			
			if(i > 1){
				System.out.print("�~�Z�X�p��:  ");
				
			}else{
				
				System.out.print("�~�ȭ�" + (i +1) + "���~�Z��: ");
			}
	
			for(int j = 0; j < sales[i].length; j++){
				System.out.print(sales[i][j]+ " ");
			}
			
			System.out.println("");
		
		}

	}
	
}
