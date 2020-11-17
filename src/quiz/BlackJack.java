package quiz;

import java.util.Scanner;

public class BlackJack {
		public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        
	        boolean uCardSetFull = false;        // '����'�� ī��set�� ����ִ� ���·� �ʱ�ȭ
	        boolean dCardSetFull = false;        // '����'�� ī��set�� ����ִ� ���·� �ʱ�ȭ
	        boolean gameWin = true;              // ���� ��� �Ǵ�. �¸��� �ʱ�ȭ
	        int comCardSet[] = new int[52];      // �������� ������ ���ڸ� ����
	 
	        comCardSetInit(comCardSet);          // ���� ī��set ���� �� �ʱ�ȭ 
	        
	        // �׽�Ʈ: ������ ���� ī��set Ȯ��
	/*      System.out.print("���� ī��set");
	        comCardSetPrint(comCardSet);
	*/
	        // �÷��̾�, ���� ���� �Ǵ��� ���� ���� ����
	        boolean uBlackjack[] = new boolean[2];        // ������ ī��set�� ���� �������� �Ǵ��ϴ� ����
	        boolean dBlackjack[] = new boolean[2];        // ������ ī��set�� ���� �������� �Ǵ��ϴ� ����
	        boolean uBlackjackWin = false;                // ������ ���� �¸� ���� �ʱ�ȭ
	        boolean dBlackjackWin = false;                // ������ ���� �¸� ���� �ʱ�ȭ
	        
	        // ī�� �⺻ ����: ���� 2��, ���� 2�� ���
	        String uCardSet[] = new String[6];            // ������ ī��set �غ�
	        String dCardSet[] = new String[3];            // ������ ī��set �غ�
	        cardSetInit(uCardSet, dCardSet);              // ������ ������ ī��set ����
	        basicCardSetInit(comCardSet, uCardSet, uBlackjack);        // ������ �⺻ ī�� 2�� ���
	        basicCardSetInit(comCardSet, dCardSet, dBlackjack);        // ������ �⺻ ī�� 2�� ���
	        
	/*      // �׽�Ʈ: ���� Ȯ��
	        uCardSet[0] = checkNum(27, uBlackjack);
	        uCardSet[1] = checkNum(1, uBlackjack);
	*/
	        
	/*      // �׽�Ʈ: ����, ������ ���� ī�� 'A(1), K(13)' �Ǵ� ��� Ȯ��
	        System.out.println("uBlackjackWin = " + uBlackjackWin + ", dBlackjackWin = " + dBlackjackWin);
	*/        
	        
	/*      // �׽�Ʈ: ����� ���� ī��set Ȯ��
	        System.out.println();
	        System.out.print("����� ī�� ����");
	        comCardSetPrint(comCardSet);
	*/        
	        // ���� ���� ����
	        gameLoop(comCardSet, uCardSet, dCardSet, uCardSetFull, dCardSetFull,
	                uBlackjack, dBlackjack, uBlackjackWin, dBlackjackWin, gameWin, scan);
	 
	        // ��� ���
	        gameResult(uCardSet, dCardSet, uBlackjackWin, dBlackjackWin, gameWin);
	 
	        scan.close();
	    }
	 
	////////////////////////// �޼ҵ� ����
	 
	/*
	 * 52���� ����ִ� Ʈ���� ���� ī��set�� ���� �� �ʱ�ȭ
	 * ������ ī��� �ߺ��Ұ�(�����̵�,���̾Ƹ��,��Ʈ,Ŭ�ι� 13�徿 4�� ����)
	 * ���� ������� �������� ����
	 */
	    public static void comCardSetInit(int comCardSet[]) {
	        
	        boolean noSame[] = new boolean[52];
	        
	        // ������ ���� ���� �� �ߺ� �Ұ��� ���� �غ�
	        for(int i = 0; i < noSame.length ; i++) {
	            noSame[i] = false;
	        }
	        
	        // �� ������ ������ŭ �ߺ����� ���ڰ� ���� ������ ������ ������ �ݺ�
	        int randLoop = 0;
	        int randTemp;
	        while(randLoop < 52) {
	            randTemp = (int)(Math.random() * 52);
	            if(noSame[randTemp] == false) {
	                noSame[randTemp] = true;
	                comCardSet[randLoop] = randTemp + 1;
	                randLoop++;
	            }
	        }
	    }
	    
	    // ���� ���� ī��set�� ���
	    public static void comCardSetPrint(int cardSet[]) {
	        for(int i=0; i < cardSet.length; i++) {
	            if (i % 3 == 0) {
	                System.out.println();
	            }
	            System.out.print("cardSet[" + i + "] = " + cardSet[i] + " ");
	        }
	        System.out.println("\n");
	    }
	    
	    // ������ ������ ī��set �ʱ�ȭ
	    public static void cardSetInit(String uCardSet[], String dCardSet[]) {
	        for (int i = 0; i < uCardSet.length; i++) {
	            uCardSet[i] = "0";
	        }
	        for (int i = 0; i < dCardSet.length; i++) {
	            dCardSet[i] = "0";
	        }
	    }
	    
	    // ���� ī�忡�� �ʱ� ī�� 2�� �̱�
	    public static void basicCardSetInit(int comCardSet[], String cardSet[], boolean blackjack[]) {
	        String drawCardStr = "";
	        int drawCard = 0;
	        int cardSetPos = 0;
	        int drawLoop = 0;
	        
	        // ���� ī��set���� ���� ī��� �ٽ� ���� ����
	        while (drawLoop < 2) {
	            cardSetPos = (int)(Math.random() * 52);
	            drawCard = comCardSet[cardSetPos];
	            if (drawCard != 0) {
	                // �׽�Ʈ: ���� ī��set���� ���� ī���� ��ġ Ȯ��
	                // System.out.println("���� ī���� �迭 �ε��� = " + cardSetPos);
	                
	                drawCardStr = checkNum(drawCard, blackjack);
	                cardSet[drawLoop] = drawCardStr;
	                comCardSet[cardSetPos] = 0;
	                drawLoop++;
	            }
	        }
	 
	/*      // �׽�Ʈ: ����
	        cardSet[0] = checkNum(1, blackjack);
	        cardSet[1] = checkNum(13, blackjack);
	*/
	    }
	 
	/*
	 * ī���ȣ üũ �޼ҵ�� �� ���� ������ ������,
	 * ù ��° üũ�ÿ��� ������ �Ǵ�
	 */
	    // ī���ȣ üũ �� ��ȯ + ���� �Ǵ�
	    public static String checkNum(int cardNum, boolean blackjack[]) {
	        String result = "";
	 
	        // ���� ī���� ��ȣ�� '1'�̸� 'A'�� ��ȯ 
	        if (cardNum == 1 || cardNum % 13 == 1) {
	            result = "A";
	            blackjack[0] = true;
	        } else if (cardNum % 13 == 0) {
	            cardNum = 13;
	            blackjack[1] = true;
	        }
	        else {
	            cardNum = (cardNum % 13);
	        }
	 
	        // ī�� ��ȣ�� '11' �̻��̸� 'J, Q, K'�� ��ȯ
	        if (cardNum > 10) {
	            switch (cardNum) {
	                case 11:
	                    result = "J";
	                    break;
	                case 12:
	                    result = "Q";
	                    break;
	                case 13:
	                    result = "K";
	                    break;
	            }
	        }
	        // �Ϲ� ���ڸ� ��ȯ ����
	        else {
	            if (cardNum > 1 && cardNum <= 10) {
	                result = Integer.toString(cardNum);
	            }
	        }
	 
	        return result;
	    }
	    
	    // ī���ȣ üũ �� ��ȯ
	    public static String checkNum(int cardNum) {
	        String result = "";
	 
	        // ���� ī�� ���ڷ� ��ȯ
	        if (cardNum == 1 || cardNum % 13 == 1) {
	            result = "A";
	        } else if (cardNum % 13 == 0) {
	            cardNum = 13;
	        }
	        else {
	            cardNum = (cardNum % 13);
	        }
	 
	        // ī�� ��ȣ�� '11' �̻��̸� 'J, Q, K'�� ��ȯ
	        if (cardNum > 10) {
	            switch (cardNum) {
	                case 11:
	                    result = "J";
	                    break;
	                case 12:
	                    result = "Q";
	                    break;
	                case 13:
	                    result = "K";
	                    break;
	            }
	        }
	        // �Ϲ� ���ڸ� ��ȯ ����
	        else {
	            result = Integer.toString(cardNum);
	        }
	 
	        return result;
	    }
	    
	    // ���� �ݺ� ����
	    public static void gameLoop(int comCardSet[], String uCardSet[], String dCardSet[],
	            boolean uCardSetFull, boolean dCardSetFull,
	            boolean uBlackjack[], boolean dBlackjack[],
	            boolean uBlackjackWin, boolean dBlackjackWin, boolean gameWin, Scanner scan) {
	        
	        System.out.println("������ �����մϴ�.");
	        System.out.println();
	        
	        // ���ʿ� ��е� �⺻ ī�� 2���� ���� ����
	        System.out.println("�������� ��е� ī��");
	        cardSetNum(uCardSet, 1);
	        
	        System.out.println("�������� ��е� ī��");
	        cardSetNum(dCardSet, 2);
	        System.out.println();
	        
	        // ������ �⺻ ī�� 2���� 'A'�� 'K'�� ������ ���� �¸��� �Ǵ�
	        if (uBlackjack[0] == true && uBlackjack[1] == true) {
	            uBlackjackWin = true;
	        } 
	        // ������ �⺻ ī�� 2���� 'A'�� 'K'�� ������ ���� �¸��� �Ǵ�
	        if (dBlackjack[0] == true && dBlackjack[1] == true) {
	            dBlackjackWin = true;
	        }
	        
	        // �ݺ� ����
	        while (true) {
	            // ī�带 ���� �� ������ ������ '21'�� �ʰ��ϸ� ��� ���� �й�
	            if (pointResult(uCardSet) > 21) {
	                gameWin = false;
	                break;
	            }
	            
	            // ���� or ������ '����'�̸� ��� ���� ����
	            if (uBlackjackWin || dBlackjackWin) {
	                break;
	            } else if (!gameWin) {
	                break;
	            }
	            else {
	            // �������� 'Hit or Stay' ���
	            System.out.print("�ൿ�� �������ּ���. Hit(1), Stay(2): ");
	            int decision = scan.nextInt();
	            System.out.println();
	        
	                // ������ 'Hit' ���� �� �߰� ī�� 1�� ����            
	                if (decision == 1) {
	        
	                    // ī�� �̱� ����: ����� ī��set�� ����ִ� �����̾�� ��
	                    if (!cardFull(uCardSet, uCardSetFull)) {
	                        drawCardOne(comCardSet, uCardSet);        // ī�� �̱�
	                    }
	                    // ī�尡 �� ã�� ��� ������ 'Stay'�� �Ǵ�
	                    else {
	                        System.out.println("�� �̻� ī�带 ���� �� �����ϴ�. ������ 'Stay'�˴ϴ�.");
	                        decision = 2;
	                    }
	                    
	                    // �� ���� �� �� ������ ������ �÷��̾�� ������, ���� �߰� ī�� 1��  �� 1ȸ ����
	                    // ī�� �̱� ����: ������ ������ ������ �������� ����, ������ ������ �ִ� ���¿��� ��(= ī�尡 2���� ����)
	                    if (pointResult(dCardSet) < pointResult(uCardSet) && !cardFull(dCardSet, dCardSetFull)) {        
	                        drawCardOne(comCardSet, dCardSet);        // ī�� �̱�
	                    }
	                    
	                    // ī�带 ���� �� ������ ������ '21'�� �ʰ��ϸ� ��� ���� �й�
	                    if (pointResult(uCardSet) > 21) {
	                        gameWin = false;
	                        break;
	                    }
	                    
	                    System.out.println("�������� ��е� ī�� ����");
	                    cardSetNum(uCardSet, 1);
	                    
	                    System.out.println("�������� ��е� ī�� ����");
	                    cardSetNum(dCardSet, 2);
	                    
	                } else if (decision == 2) {
	                    // �� ���� �� �� ������ ������ �÷��̾�� ������ ���� �߰� ī�� 1��  �� 1ȸ ����
	                    
	                    // ī�� �̱� ����: ������ ������ ������ �������� ����, ������ ������ �ִ� ���¿��� ��(= ī�尡 2���� ����)
	                    if (pointResult(dCardSet) < pointResult(uCardSet) && !cardFull(dCardSet, dCardSetFull)) {        
	                        drawCardOne(comCardSet, dCardSet);        // ī�� �̱�
	                    }
	                    break;
	                }
	                else {
	                    // ���� ó��
	                    System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");
	                    System.out.println();
	                }
	            }
	        }
	    }
	    
	    // ī�� 1�� �̱�
	    public static void drawCardOne(int comCardSet[], String cardSet[]) {
	        int drawLoop = 0;
	        int cardSetPos = 0;
	        int drawCard = 0;
	        String drawCardStr = "";
	        while (drawLoop < 1) {
	            cardSetPos = (int)(Math.random() * 52);
	            drawCard = comCardSet[cardSetPos];
	    
	            if (drawCard != 0) {
	                // �׽�Ʈ: ���� ī��set���� ���� ī���� ��ġ Ȯ��
	                // System.out.println("���� ī���� �迭 �ε��� = " + cardSetPos);
	    
	                drawCardStr = checkNum(drawCard);
	                for (int i = 0; i < cardSet.length; i++) {
	                    if (cardSet[i] == "0") {
	                        cardSet[i] = drawCardStr;
	                        comCardSet[cardSetPos] = 0;
	                        drawLoop++;
	                        break;
	                    }
	                }
	            }
	        }
	    }
	 
	    // ��е� ī�� ���
	    public static void cardSetNum(String cardSet[], int index) {
	        
	        // 'index' ���� 1�̸� ī��set ����
	        // 'index' ���� 2�� ī��set���� ī�� 1�� ����
	        if (index == 1) {
	            for (int i = 0; i < cardSet.length; i++) {
	                if (cardSet[i] == "0") {
	                    System.out.print(" ");
	                }
	                else {
	                    System.out.print(cardSet[i] + " ");
	                }
	            }
	            System.out.println();
	        } else if (index == 2) {
	            for (int i = 0; i < cardSet.length; i++) {
	                if (i == 0) {        // ù ��° �ڸ��� ī�� ����
	                    System.out.print("? ");
	                }
	                else {
	                    if (cardSet[i] == "0") {
	                        System.out.print(" ");
	                    }
	                    else {
	                        System.out.print(cardSet[i] + " ");
	                    }
	                }
	            }
	            System.out.println();
	        } 
	        else {
	            // ���� ó��
	            System.out.println("�����. �ε��� ���� �߸��Ǿ����ϴ�.");
	        }
	    }
	    
	    // ������ ī��set�� �� �� �������� üũ
	    public static boolean cardFull(String cardSet[], boolean cardSetFull) {
	        int count = 0;
	        for (int i = 0; i < cardSet.length; i++) {
	            if (cardSet[i] == "0") {
	                count++;
	            }
	        }
	        // ����ִ� ������ ������ �� �� ����
	        if (count == 0) {
	            cardSetFull = true;
	        }
	        
	        return cardSetFull;
	    }
	    
	    // ���� ���ϱ�
	    public static int pointResult(String cardSet[]) {
	        int point = 0;
	        
	        // 1�� ���� �ջ�: ���ĺ� ī��� ���� ������ �ٸ��� �ջ�
	        for (int i = 0; i < cardSet.length; i++) {
	            if (cardSet[i] == "A") {
	                point += 1;
	            } else if (cardSet[i] == "J") {
	                point += 10;
	            } else if (cardSet[i] == "Q") {
	                point += 10;
	            } else if (cardSet[i] == "K") {
	                point += 10;
	            } else if (Integer.parseInt(cardSet[i]) > 1 
	                    && Integer.parseInt(cardSet[i]) <= 10) {
	                point += Integer.parseInt(cardSet[i]);
	            } 
	            else {
	                point += 0;
	            }
	        }
	        // 2�� ���� �ջ�: 1�� ���� �ջ��� ���� �� ī��set�� 'A'�� ������ ���,
	        // 10���� �߰��� ������ '21�� ����'�� 10�� �߰�(= 'A'�� '11��'�� ���� �ǹ�)
	        for (int i = 0; i < cardSet.length; i++) {
	            if (cardSet[i] == "A" && point + 10 <= 21) {
	                point += 10;
	            } 
	        }
	    
	        return point;
	    }
	    
	/*
	 * ����
	 * 1.���� �¸�
	 *  - ������ �⺻ ī�� 2���� ����(A, K)�̰�, ������ �ش���� ���� ���
	 *  - ���� ������ '21�� ����'�̰�, ������ ������ �� ���� ���
	 *  - ������ ������ '21�� ����'�̰�, ������ ������ '21���� �ʰ�'�� ���
	 *  
	 * 2.���� �й�
	 *  - ������ �⺻ ī�� 2���� ����(A, K)�̰�, ������ �ش���� ���� ���
	 *  - ���� ������ '21�� ����'�̰�, ������ ������ �� ���� ���
	 *  - ������ ������ '21���� �ʰ�'�� ���
	 *  
	 * 3.���º�
	 *  - ���� �⺻ ī�� 2���� ����(A, K)�� ��� 
	 *  - ���� ������ ������ ��� 
	 */
	    
	    // ��� ���
	    public static void gameResult(String uCardSet[], String dCardSet[], 
	            boolean uBlackjackWin, boolean dBlackjackWin, boolean gameWin) {
	        System.out.println("ī�带 �����մϴ�.");
	        System.out.println();
	        
	        // �������� ��е� ī��� ���� ���
	        System.out.println("�������� ��е� ī��");
	        cardSetNum(uCardSet, 1);
	        
	        System.out.println("������ ���� = " + pointResult(uCardSet));
	        System.out.println();
	        
	        // �������� ��е� ī��� ���� ���
	        System.out.println("�������� ��е� ī��");
	        cardSetNum(dCardSet, 1);
	        
	        System.out.println("������ ���� = " + pointResult(dCardSet));
	        System.out.println();
	        
	        // ��� �޽��� - ���� ����
	        if (uBlackjackWin && !dBlackjackWin) {
	            System.out.println("���! �� �����մϴ� �� '����'���� �¸�!!");
	        } else if (!uBlackjackWin && dBlackjackWin) {
	            System.out.println("��... '����'���� �й�!");
	        } else if (uBlackjackWin && dBlackjackWin) {
	            System.out.println("�̷�����!! '����'���� ���º�!!!");
	        }
	        // ��� �޽��� - ���� ��
	        else {
	            if (gameWin && pointResult(uCardSet) > pointResult(dCardSet) 
	                    && pointResult(uCardSet) <= 21
	                    || gameWin && pointResult(uCardSet) < pointResult(dCardSet)
	                    && pointResult(dCardSet) > 21) {
	                System.out.println("��� = �� �����մϴ� �� �¸��ϼ̽��ϴ�!!");
	            } else if (gameWin && pointResult(uCardSet) == pointResult(dCardSet)
	                    && pointResult(uCardSet) <= 21) {
	                System.out.println("�̷�����... ���º��Դϴ�!");
	            }
	            else {
	                System.out.println("��� = �й�!");
	            }
	        }
	    }


	
	

}
