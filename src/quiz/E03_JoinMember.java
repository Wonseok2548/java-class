package quiz;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.charset.Charset;

public class E03_JoinMember {
	
	// 1. 사용자가 자신의 여러가지 정보를 입력하면 
	//	  그 정보를 사용자의 이름으로 된 파일에 저장해보세요.
	
	// 2. 사용자의 이름을 전달받으면 해당 사용자가
	//	  (1) 가입된 회원이라면 파일에서 정보를 읽어 출력해주고
	//	  (2) 아직 가입하지 않은 사람이라면 가입되지 않았다고 출력
	//	해주는 메서드를 작성해보세요.
	
	// 3. 저장된 사용자의 정보를 수정할 수 있는 메서드를 구현해 보세요.
	
	// ※ D:\\java_io\\member\\ 디렉터리에 저장할 것
	
	static class Member {
		String name;
		int age;
		String blood_type;
		String tel;
		
		public Member(String name, int age, String blood_type, String tel) {
			this.name = name;
			this.age = age;
			this.blood_type = blood_type;
			this.tel = tel;
		}
		
		@Override
		public String toString() {
			return String.format("%s/%d/%s/%s", name, age, blood_type, tel);
		}
	
	}
	
	public static boolean checkNotMember(String name) throws IOException{
		String dir = "D:\\java_io\\member\\";
		String filename = name + ".txt";
		
		BufferedReader br = null;	
		try {
			br = new BufferedReader(new FileReader(dir + filename, Charset.forName("UTF-8")));
			
			
			String[] data = br.readLine().split("/");
			System.out.printf("<< '%s'님의 정보 >>\n", data[0]);
			System.out.println("이름 : " 	+ data[0]);
			System.out.println("나이 : " 	+ data[1]);
			System.out.println("혈액형 : "	+ data[2]);
			System.out.println("TEL : " 	+ data[3]);
			
			return false;
		}
		catch (FileNotFoundException e) {
			System.out.println("[System] - 회원가입을 진행합니다.");
			return true;
		}
		finally {
			if (br != null) {
				br.close();
			}
		}
		
	}
	
	public static void save(Member info) throws IOException{
		String dir = "D:\\java_io\\member\\";
		String filename = info.name + ".txt";
		
		PrintWriter pw = new PrintWriter(
				new BufferedWriter(
						new FileWriter(
								dir + filename,
								Charset.forName("UTF-8")
								)
						)
				);
		
		pw.print(info);
		pw.close();
	}
	
	public static void main(String[] args) {
		
		
		try {
			// InputStreamReader : InputStream을 문자로 변환 (byte -> char)
			BufferedReader br = new BufferedReader(
					new InputStreamReader(System.in));
			
			System.out.print("이름 > ");
			String name = br.readLine();
			
		if(checkNotMember(name)) {
			
			System.out.print("나이 > ");
			int age = Integer.parseInt(br.readLine());
			
			System.out.print("혈액형 > ");
			String blood_type = br.readLine();
			
			System.out.print("전화번호 > ");
			String tel = br.readLine();
			
			save(new Member(name, age, blood_type, tel));
			
			br.close();
		}
		}
		catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}

}

























































