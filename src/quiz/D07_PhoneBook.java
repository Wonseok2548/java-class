package quiz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class D07_PhoneBook {

	// # HashMap을 이용한 PhoneBook을 구현해보세요
	
	// 1. 그룹 / 전화번호 / 이름을 저장해야 한다.
	// 2. 그룹 이름을 키값으로 넣으면 해당 그룹의 전화번호 목록이 나온다.
	// 3. 전화번호 목록에 전화번호를 키로 넣으면 이름이 나온다.
	
	// # 구현해야 할 메서드
	
	// 1. 새로운 그룹을 추가하는 메서드
	// 2. 존재하는 그룹에 새로운 전화번호를 등록하는 메서드
	// 3. 등록된 모든 전화번호를 보기좋게 출력하는 메서드				=> 엔트리
	// 4. 이름의 일부를 입력하면 일치하는 모든 전화번호가 출력되는 메서드
	// 5. 전화번호의 일부를 입력하면 일치하는 모든 전화번호가 출력되는 메서드
	
	
	// putAll로 다른 Map의 데이터를 추가할 수 있다.
	// map1.putAll(map2);
	
//	public static void main(String[] args) {
//		HashMap<String, HashMap<String, String>> phone_book = new HashMap<>();	// 그룹, 전화번호, 이름
//		
//		phone_book.put("학교", new HashMap<>());
//		phone_book.put("가족", new HashMap<>());
//		phone_book.put("친구", new HashMap<>());
//		
//		
//		// 그룹지정
//		HashMap<String, String> school_map = phone_book.get("학교");		
//		HashMap<String, String> family_map = phone_book.get("가족");
//		HashMap<String, String> friend_map = phone_book.get("친구");
//		
//		
//		school_map.put("010-1234-1234", "김말숙");
//		school_map.put("010-5678-5678", "김현숙");
//		
//		family_map.put("010-0000-0001", "어머니");
//		family_map.put("010-0000-0002", "아버지");
//		
//		friend_map.put("010-0000-0003", "친구A");
//		friend_map.put("010-0000-0004", "친구B");
//		
//	}
	
	
	HashMap<String, HashMap<String, String>> phonebook_map;
	
	
	public D07_PhoneBook() {
		
		phonebook_map = new HashMap<>();
		
	}
	
	/** 그룹 추가 성공시 true반환 */
	
	public boolean addGroup(String groupName) {
		if (phonebook_map.containsKey(groupName)) {
			System.err.println("이미 존재하는 그룹명입니다.");
			return false;
		}
		else {
			phonebook_map.put(groupName, new HashMap<>());
			System.err.println("새로운 그룹이 추가되었습니다. [" + groupName +  "]");
			return true;			
		}
	}
	
	/** 전화번호 등록 성공시 true**/
	public boolean addPhoneNumber(String groupName, String tel, String name) {
		
		if (!phonebook_map.containsKey(groupName)) {
			System.err.println("그룹이 존재하지 않는 그룹명입니다. [" + groupName +  "]");
			return false;
		}
		
		HashMap<String, String> group = phonebook_map.get(groupName);
		
		if (group.containsKey(tel)) {
			System.out.println("해당 정보가 수정되었습니다.");		// 이미 번호가 저장되어있다는 뜻이기 때문에 수정했다고 알려줌
		}
		else {
			System.out.println("새로운 번호를 추가했습니다.");
		}
		
		phonebook_map.get(groupName).put(tel, name);
		return true;
	}
	
	// chk : 전체 문자열
	// fr  : 부분 문자열
	
	// 부분 무자열의 맨 앞글자가 chk에 있는지 먼저 검사
	// 찾으면 해당 부분부터 모든 fr이 일치하면 true
	
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
	
	
	/** 이름으로 검색하면 해당하는 entry들이 Set형태로 반환되는 메서드*/
	public Set<List<String>> searchByName(String name_frag){
		
		Set<List<String>> to_return = new HashSet<>();
		
		// HashMap<String, HashMap<String, String>> phonebook_map
		
		for (HashMap<String, String> groupMap : phonebook_map.values()) {
			
			for (String phoneNumber : groupMap.keySet()) {
				
				String name = groupMap.get(phoneNumber);
				
				if (str_contains(name, name_frag)) {
					// 찾은 사람의 정보를 리스트로 재구성하여 전달
					// index 0번에 이름, 1번에 번호 저장
					List<String> found = new ArrayList<>();
					found.add(name);
					found.add(phoneNumber);
					
					to_return.add(found);
					
				}

				
			}
			
		}
		
		return to_return;
	}
	
	/** 번호로 검색하면 해당하는 entry들이 Set형태로 반환되는 메서드*/
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
		
		phonebook_a.addGroup("학교");
		
		
		phonebook_a.addPhoneNumber("학교", "010-123-123", "김길동");
		phonebook_a.addPhoneNumber("학교", "010-123-121", "홍길동");
		phonebook_a.addPhoneNumber("학교", "010-123-222", "박길동");
		phonebook_a.addPhoneNumber("학교", "010-123-333", "임길동");
		
		
		System.out.println(phonebook_a.phonebook_map);
		System.out.println(phonebook_a.searchByName("임"));
		System.out.println(phonebook_a.searchByPhoneNumeber("33"));
	}
	
	
	
	
	
	
	
	


		
		
		
}





































