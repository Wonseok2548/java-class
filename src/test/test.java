package test;
import java.util.Scanner;

public class test {
	
//	����ڰ� �ð��� ���� ������� �Է��Ѵ�.
//	9�� 10�� �����̶�� "����"��, 9�� 10�� ���Ķ�� "����"��, ���� 3�� ���Ķ�� "�Ἦ"�� ����Ѵ�.
//	���������� ���� �ð� �Ǵ� ���� �Էµȴٸ� "����"�� ����Ѵ�.
//	(��, �ð��� 24�ð����� �Է¹޴´�)
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ð� �Է� : ");
		int time = sc.nextInt();
		
		System.out.print("�� �Է� : ");
		int minute = sc.nextInt();
		
		System.out.printf("����� �ð� : %d�� %d��\n", time, minute);
		
		
		
		
		
		while (time < 10) {
			
			if (time > 24 || time < 0 ||  minute < 0 || minute > 60) {
				System.err.println("�����Դϴ�.");
				break;
			}
			
			if (time == 9 && minute <= 10){
				System.out.println("����");
				break;
			}
			else if (time < 9 && time >= 0) {
				System.out.println("����");
				break;
			}
			else if (time == 9 && minute > 10) {
				System.out.println("����");
				break;
			}
			
		}		
		
		while (time >= 10) {
			
			if (time > 24 || time < 0 ||  minute < 0 || minute > 60) {
				System.err.println("�����Դϴ�.");
				break;
			}
			
			if (time >= 10 && time < 15) {
				System.out.println("����");
				break;
			}
			
			else if (time >= 15) { 
				System.out.println("�Ἦ");
				break;
			}
		
		}
		
    }   
	
	
}
