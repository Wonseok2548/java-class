package quiz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class D07_PhoneBook {

	// # HashMap�� �̿��� PhoneBook�� �����غ�����
	
	// 1. �׷� / ��ȭ��ȣ / �̸��� �����ؾ� �Ѵ�.
	// 2. �׷� �̸��� Ű������ ������ �ش� �׷��� ��ȭ��ȣ ����� ���´�.
	// 3. ��ȭ��ȣ ��Ͽ� ��ȭ��ȣ�� Ű�� ������ �̸��� ���´�.
	
	// # �����ؾ� �� �޼���
	
	// 1. ���ο� �׷��� �߰��ϴ� �޼���
	// 2. �����ϴ� �׷쿡 ���ο� ��ȭ��ȣ�� ����ϴ� �޼���
	// 3. ��ϵ� ��� ��ȭ��ȣ�� �������� ����ϴ� �޼���				=> ��Ʈ��
	// 4. �̸��� �Ϻθ� �Է��ϸ� ��ġ�ϴ� ��� ��ȭ��ȣ�� ��µǴ� �޼���
	// 5. ��ȭ��ȣ�� �Ϻθ� �Է��ϸ� ��ġ�ϴ� ��� ��ȭ��ȣ�� ��µǴ� �޼���
	
	
	// putAll�� �ٸ� Map�� �����͸� �߰��� �� �ִ�.
	// map1.putAll(map2);
	
//	public static void main(String[] args) {
//		HashMap<String, HashMap<String, String>> phone_book = new HashMap<>();	// �׷�, ��ȭ��ȣ, �̸�
//		
//		phone_book.put("�б�", new HashMap<>());
//		phone_book.put("����", new HashMap<>());
//		phone_book.put("ģ��", new HashMap<>());
//		
//		
//		// �׷�����
//		HashMap<String, String> school_map = phone_book.get("�б�");		
//		HashMap<String, String> family_map = phone_book.get("����");
//		HashMap<String, String> friend_map = phone_book.get("ģ��");
//		
//		
//		school_map.put("010-1234-1234", "�踻��");
//		school_map.put("010-5678-5678", "������");
//		
//		family_map.put("010-0000-0001", "��Ӵ�");
//		family_map.put("010-0000-0002", "�ƹ���");
//		
//		friend_map.put("010-0000-0003", "ģ��A");
//		friend_map.put("010-0000-0004", "ģ��B");
//		
//	}
	
	
	HashMap<String, HashMap<String, String>> phonebook_map;
	
	
	public D07_PhoneBook() {
		
		phonebook_map = new HashMap<>();
		
	}
	
	/** �׷� �߰� ������ true��ȯ */
	
	public boolean addGroup(String groupName) {
		if (phonebook_map.containsKey(groupName)) {
			System.err.println("�̹� �����ϴ� �׷���Դϴ�.");
			return false;
		}
		else {
			phonebook_map.put(groupName, new HashMap<>());
			System.err.println("���ο� �׷��� �߰��Ǿ����ϴ�. [" + groupName +  "]");
			return true;			
		}
	}
	
	/** ��ȭ��ȣ ��� ������ true**/
	public boolean addPhoneNumber(String groupName, String tel, String name) {
		
		if (!phonebook_map.containsKey(groupName)) {
			System.err.println("�׷��� �������� �ʴ� �׷���Դϴ�. [" + groupName +  "]");
			return false;
		}
		
		HashMap<String, String> group = phonebook_map.get(groupName);
		
		if (group.containsKey(tel)) {
			System.out.println("�ش� ������ �����Ǿ����ϴ�.");		// �̹� ��ȣ�� ����Ǿ��ִٴ� ���̱� ������ �����ߴٰ� �˷���
		}
		else {
			System.out.println("���ο� ��ȣ�� �߰��߽��ϴ�.");
		}
		
		phonebook_map.get(groupName).put(tel, name);
		return true;
	}
	
	// chk : ��ü ���ڿ�
	// fr  : �κ� ���ڿ�
	
	// �κ� ���ڿ��� �� �ձ��ڰ� chk�� �ִ��� ���� �˻�
	// ã���� �ش� �κк��� ��� fr�� ��ġ�ϸ� true
	
	private boolean str_contains(String check, String frag) {
		char[] chk = check.toCharArray();
		char[] fr = frag.toCharArray();
		
		char ch1 = fr[0];
		

		for (int i=0; i < chk.length; i++) {
			if (chk[i] == ch1 && (chk.length -i) >= fr.length) {
				int cnt = 0;
				for (int j=0; j < fr.length; j++) {
					if (chk[i + j] == fr[j]) {
						cnt++;
					}
					else {
						break;
					}
				}
				if (cnt == fr.length) {
					return true;					
				}
			}
		}
		
	//	return check.contains(frag);
		return false;
		
	}
	
	
	/** �̸����� �˻��ϸ� �ش��ϴ� entry���� Set���·� ��ȯ�Ǵ� �޼���*/
	public Set<List<String>> searchByName(String name_frag){
		
		Set<List<String>> to_return = new HashSet<>();
		
		// HashMap<String, HashMap<String, String>> phonebook_map
		
		for (HashMap<String, String> groupMap : phonebook_map.values()) {
			
			for (String phoneNumber : groupMap.keySet()) {
				
				String name = groupMap.get(phoneNumber);
				
				if (str_contains(name, name_frag)) {
					// ã�� ����� ������ ����Ʈ�� �籸���Ͽ� ����
					// index 0���� �̸�, 1���� ��ȣ ����
					List<String> found = new ArrayList<>();
					found.add(name);
					found.add(phoneNumber);
					
					to_return.add(found);
					
				}

				
			}
			
		}
		
		return to_return;
	}
	
	/** ��ȣ�� �˻��ϸ� �ش��ϴ� entry���� Set���·� ��ȯ�Ǵ� �޼���*/
	public Set<List<String>> searchByPhoneNumeber(String phone_frag){
		Set<List<String>> to_return = new HashSet<>();
		
		for (HashMap<String, String> groupMap : phonebook_map.values()) {
			for (String phoneNumber : groupMap.keySet()) {
				if (str_contains(phoneNumber, phone_frag)) {
					
					List<String> found = new ArrayList<>();
					found.add(groupMap.get(phoneNumber));
					found.add(phoneNumber);
					
					to_return.add(found);
				}
			}
		}
		return to_return;
	}
	
	
	public static void main(String[] args) {
		D07_PhoneBook phonebook_a = new D07_PhoneBook();
		
		
		
		D07_PhoneBook phonebook_b = new D07_PhoneBook();
		
		phonebook_a.addGroup("�б�");
		
		
		phonebook_a.addPhoneNumber("�б�", "010-123-123", "��浿");
		phonebook_a.addPhoneNumber("�б�", "010-123-121", "ȫ�浿");
		phonebook_a.addPhoneNumber("�б�", "010-123-222", "�ڱ浿");
		phonebook_a.addPhoneNumber("�б�", "010-123-333", "�ӱ浿");
		
		
		System.out.println(phonebook_a.phonebook_map);
		System.out.println(phonebook_a.searchByName("��"));
		System.out.println(phonebook_a.searchByPhoneNumeber("33"));
	}
	
	
	
	
	
	
	
	


		
		
		
}





































