package dice;

import java.util.ArrayList;

import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.List;
import java.util.Set;

public class Dice {
	
	// �������� 5���� �ֻ����� ���� ������ (�ֻ����� ���� 1 ~ 6)
	
	// Ǯ�Ͽ콺 (���� ���ڰ� 2�� + 3��)
	// ���� ��Ʈ����Ʈ (1234/2345/3456)
	// ���� ��Ʈ����Ʈ (12345/23456)
	// 4���̽� (���� ���� 4��)
	// 5���̽� (���� ���� 5��)
	
	// �� �����ϴ� Ŭ������ �ۼ��ϰ� �׽�Ʈ �غ�����
	
	// �� �ٸ� ���Ͽ� �ۼ��ϰ� ���⼭�� ������ ���⸸ �� ��
	
	// ���� �Ŀ� ���ϴ� �ֻ����� ������ (0~5��)
	// ��� �ٽ� ���� �� �ִ� ����� �߰��غ�����.

	//���� �ڵ�
//	ArrayList<Integer> num_arr;
//	
//	public Dice() {						// Ŭ���� ������
//		num_arr = new ArrayList<>();
//		
//	}
//	
//	public void diceNumber() {
//		Random ran = new Random();
//		
//		int diceNumber;
//		
//		
//		for (int i = 0; i < 5; i++) {
//			diceNumber = ran.nextInt(6)+1;
//			num_arr.add(diceNumber);
//		}		
//		
//	}			
//	
//	@Override
//	public String toString() {
//		return num_arr.toString();
//	}
//	
//	
//	public void n_Dice() {
//		for (int i=0; i<5; i++) {
//			if (Collections.frequency(num_arr, num_arr.get(i)) ==4) {
//				System.out.println("4���̽� �Դϴ�.");
//				break;
//			}
//			if (Collections.frequency(num_arr, num_arr.get(i)) ==5) {
//				System.out.println("5���̽� �Դϴ�.");
//				break;
//			}
//			
//		}
//	}
//	
//	public void straight() {
//		Collections.sort(num_arr);
//		System.out.println("���� �� : " + num_arr);
//		if (num_arr.get(0) == 1 && num_arr.get(1) == 2 && num_arr.get(2) == 3 && num_arr.get(3) == 4 && num_arr.get(4) == 5 ||
//				num_arr.get(0) == 2 && num_arr.get(1) == 3 && num_arr.get(2) == 4 && num_arr.get(3) == 5 && num_arr.get(4) == 6) {
//			System.out.println("���� ��Ʈ����Ʈ");
//		}
//		
//		if (num_arr.get(0) == 1 && num_arr.get(1) == 2 && num_arr.get(2) == 3 && num_arr.get(3) == 4  ||
//				num_arr.get(0) == 2 && num_arr.get(1) == 3 && num_arr.get(2) == 4 && num_arr.get(3) == 5 ||
//				num_arr.get(0) == 3 && num_arr.get(1) == 4 && num_arr.get(2) == 5 && num_arr.get(3) == 6) {
//			System.out.println("���� ��Ʈ����Ʈ");
//		}
//		
//		
//				
//	}
//  --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	
	private Random ran;
	private List<Integer> dices;	// 5���� �ֻ��� ���� ����� ����Ʈ
	private List<Integer> counts;	// �� ���ڰ� ����� �����ߴ��� ���� �� ����Ʈ
	
	
	private String made;
	
	
	
	private static int NUM_OF_DICE = 5;
	private static int DICE_FACET = 6;
	
	 
	
	private final static Set<Set<Integer>> LARGE_CASES;
	private final static Set<Set<Integer>> SMALL_CASES;
		

	static {
		LARGE_CASES = new HashSet<>();
		
		for (int i=1; i<=2; i++) {
			Set<Integer> large = new HashSet<>(5);
			Collections.addAll(large, i, i+1, i+2, i+3, i+4);
			LARGE_CASES.add(large);
			
		}
	}
	
	static {
		SMALL_CASES = new HashSet<>();
		
		for (int i=1; i<=3; i++) {
			Set<Integer> small = new HashSet<>(4);
			Collections.addAll(small, i, i+1, i+2, i+3);
			SMALL_CASES.add(small);
			
		}
	}
	
	
	public Dice() {
		ran = new Random();
		made = "UNCHECKED";
		// �ֻ����� 5�� �̻����� �þ�� �ʱ� ������ �÷��� �뷮�� 5�� �����Ѵ�.
		// �� ArrayList�� �ʱ� �뷮�� ���� ���ԵǸ� �뷮�� 1.5�辿 ������Ų��.
		dices = new ArrayList<>(NUM_OF_DICE);
		counts = new ArrayList<>(DICE_FACET);
		
		Collections.addAll(dices, 0,0,0,0,0);
		Collections.addAll(counts, 0,0,0,0,0,0);		
	}
	
	private void count() {
		for (int i=0; i < DICE_FACET; i++) {
			int dice_num = i+1;
			counts.set(i, Collections.frequency(dices, dice_num));
		}
		
	}
	
	private String check() {
		// check by counts
		
		if (counts.contains(5)) {
			return "FIVE DICE!!";
		}
		else if (counts.contains(4)) {
			return "FOUR DICE!!";
		}
		else if (counts.contains(2) && counts.contains(3)) {
			return "FULL HOUSE!!";
		}
		
		// check by dices
		for (Set<Integer> ls : LARGE_CASES) {
			if (dices.containsAll(ls)) {
				return "LARGE STRAIGHT!!!";
			}
		}
		
		for (Set<Integer> ss : SMALL_CASES) {
			if (dices.containsAll(ss)) {
				return "SMALL STRAIGHT!!!";
			}
		}
		
		
		
		return "NO MATCHES";
	}
	
	public void print() {
		System.out.print(dices + " - ");
		
		if (made.equals("UNCHECKED")) {
			made = check();
		}
		System.out.println(made);
		
	}
	
	
	
	public void reroll(Set<Integer> rerolls) {
		
		if (rerolls.size() == 0) {
			System.out.println("NOTHINS CHANGES");
			return;
		}
		
		made = "UNCHECKED";
		
		for (int i : rerolls) {
			int to_change = ran.nextInt(DICE_FACET) + 1;
			dices.set(i-1, to_change);
			System.out.printf("DICE %d HAS CHANGED : %d\n", i, to_change);
		}
		
		count();
		print();
	}
	
	
	
	public void roll() {
		made = "UNCHECKED";
		
		for (int i=0; i< NUM_OF_DICE; i++) {
			dices.set(i,  ran.nextInt(DICE_FACET)+1);
		}
		count();
		print();
		System.out.println("�� ���� ����Ƚ�� : " + counts);
		
		
	}
	
	
	public static void main(String[] args) {
		Dice dice01 = new Dice();
		
		dice01.roll();
		
		
		
		
		
	}
		
}















































