package quiz;

public class B10_Gugudan {
	
	
	// 1. �������� ������ ���� ���η� ���.	
	// 2�� : 2x1=2 2x2=4 2x3=6 ...
	
	// 2. �������� ������ ���� ���η� ���.
	// 2��		3��		4��	  ...
	// 2x1=2	3x1=3	4x1=4 ...
	
	
	public static void main(String[] args) {
		
		
	
		
		// Q1.
		
		System.out.println("Q1. ");
		for (int dan = 2; dan <= 9; dan++) {
			System.out.print(dan + "�� : ");
			
			
			for (int gop = 1; gop <=9; gop++) {
				
				if (gop == 10) {
					System.out.println();
				}
					
				System.out.printf("%dx%d=%d  ", dan, gop, dan*gop);
			}
			
			System.out.println();
			
		}
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		
		// Q2.
		
		/*System.out.println("Q2. ");
		
		for (int dan = 2; dan <= 9; dan++) {
			System.out.print(dan + "�� \t");
		}
		
		for (int dan = 2; dan <= 9; dan++) {
			for (int gop = 1; gop <= 9; gop++) {
				System.out.printf("%dx%dx%d=%d", dan,gop,dan*gop);
			}
				
			}
		*/
		
		
		
		
		for (int gop = 0; gop <= 9; gop++) {
			// ���� ����
			for (int dan =2; dan<= 9; ++dan) {
				if (gop ==0) {
					System.out.printf("%d��\t", dan);
				} else {
					System.out.printf("%dx%d=%d\t", dan, gop, dan*gop);
				}
			}
			System.out.println();  			// ���� ��
			
		}
		
	}	
		
				
	

}


