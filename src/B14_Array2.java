
public class B14_Array2 {
	
	// �迭�ȿ��� �迭�� ���� �� �ִ�.
	
	public static void main(String[] args) {
		
		//int[] scores = {99, 123, 456, 789};
		
		// ������ ���� Ÿ�Կ��� null�� �� �� �ִ�.
		// �迭 ������ ���� �����ϴ� ���� �ƴ϶� �迭�� �����ּҸ� �����Ѵ�.
		// ��, �迭�� ������ ���� Ÿ���̴�.
		String str = null;
		int[] scores = null;
		
		int[][] arr2 = {
				new int[5],	// ����ִ� 5��¥�� int[] �迭
				null,		// ���� �迭�� ����
				{1,2, 3, 4, 5},
				new int[] {1, 2, 3}
		};
		
		System.out.println("arr2�� ����� �迭�� ��ΰ���?" + arr2.length);
		System.out.println("arr2�� ����� �迭 �� 0��° �迭�� ���� : " + arr2[0].length);		
	//	System.out.println("arr2�� ����� �迭 �� 1��° �迭�� ���� : " + arr2[1].length);	// null���̶� ���� �迭�� ���µ� ���̸� ����϶�� �Ͽ����Ƿ� ������ �߻���. null�� length�� ����.
		System.out.println("arr2�� ����� �迭 �� 2��° �迭�� ���� : " + arr2[2].length);
		System.out.println("arr2�� ����� �迭 �� 3��° �迭�� ���� : " + arr2[3].length);
		
		// ���̸� Ȱ���Ͽ� n���� �迭�� n�� �ݺ������� ��� Ž���� �� �ִ�.
		for (int i=0; i < arr2.length; i++) {
			int[] arr = arr2[i];
			
			if (arr != null) {
				for (int j=0; j < arr.length; j++) {
					System.out.print(arr2[i][j] + " ");
					// System.out.print(arr[j]);  // �ٷ� �� �ڵ�� ���� ��
				}
			}
			else {
				System.out.println("null");
			}
		}
		System.out.println();

		
		// Ȱ�� ��
		int[][] points = {
				{0,0},
				{1,1},
				{2,2},
				{3,3}
		};
		
		
		final int width = 10;
		final int height = 10;
		
		for (int i=0; i < width; i++) {
			for(int j=0; j < height; j++) {
				
				
				
				
				
				
				System.out.print("X ");
			}
			System.out.println();
		}
		
		// Ȱ�� ��
		int[][] scores2 = {
				{80,90,100},
				{50,60,70},
				{90,90,90},
				{70,70,70}
		};
		
		// 1: ���׶��
		// 2: �׸�
		// 3: X
		int[][] map = {
				{2, 2, 3, 3, 3},
				{2, 2, 3, 3, 3},
				{2, 2, 3, 3, 3},
				{2, 2, 3, 3, 3},
				{2, 2, 2, 2, 2},
				{2, 2, 2, 2, 2}
		};
		
		for (int i=0; i < map.length; i++) {
			for (int j=0; i < map.length; j++) {
				switch (map[i][j]) {
				case 1:
					System.out.println("�� ");
					break;
				case 2:
					System.out.println("�� ");
					break;
				case 3:
					System.out.println("�� ");
					break;
				default:
					System.out.println("  ");
					break;
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
