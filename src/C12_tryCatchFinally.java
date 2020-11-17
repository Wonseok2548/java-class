public class C12_tryCatchFinally {

	// # ���� ó��
	//	- �츮�� ������� �˰��ִ� ���� �۾����� ����(Exception)�̶�� �Ѵ�.
	//	- ���������� Ʋ������ ���ܰ� �ƴ϶� �����̴�.
	//	- ���α׷��Ӱ� ���ܿ� ���� ������ ��ġ�� �����شٸ� 
	//	  ���α׷��� ������������ �ʰ� ����ؼ� �����ϰ� �ȴ�.
	
	// # try
	//	- ���ܰ� �߻��� �� �ִ� �ڵ带 try�� ���ο� ���Խ�Ų��.
	//	- ���ܰ� �߻����� ������ ��� ���� ����ȴ�.
	//	- ���ܰ� �߻��Ѵٸ� �ش� ���ܸ� �޴� catch������ �Ѿ�Եȴ�.
	//	- catch���� �������� ����� �� �ִ�.	
	
	// # catch
	//	- try�� ������ �ڵ忡�� ���ܰ� �߻��ϸ� �ش� catch������ �̵��Ѵ�.
	//	- ù ��° �Ű������� �ش� ���ܿ� ���� ������ ����ִ� ��ü�� �޴´�.
	//	- catch���� ��ø ����� �����ϴ�.
	//	- ExceptionŸ���� catch���� ��� ���ܸ� catch�� �� �ִ�.
	//	  �� Exception : ��� ������ �θ� Ÿ��
	
	// # finally
	//	- try�� ������ ���� �߻� ���ο� ������� ������ ����Ǵ� ����
	
	
	public static void main(String[] args) {
		

		int[] abc = new int[10];
		
		
		
		try {
			System.out.println("try���� ����");
			
			System.out.println(abc[20]);		// ���� �߻� �ڵ�
			
			// Integer.parseInt("str") : ���ڿ��� intŸ���� ������ ��ȯ�ϴ� �ڵ�
			System.out.println(Integer.parseInt("az"));	// ���� �߻� �ڵ�2
			
			System.out.printf("%d", 123);
			

			System.out.println("try���� ������");
		} 
		catch (Exception e) {
			System.out.println("catch : " + e.getMessage());
		}
		finally {
			System.out.println(" /)/)");
			System.out.println("(..  )");
			System.out.println("��<   )");
		}
		

		
		System.out.println("������� �� ����Ǿ����ϴ�.");
		
		
	}
	
}














