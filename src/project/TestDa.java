package project;

import java.util.Scanner;

public class TestDa {		
		private String id;
		private String password;
		private String email;
		String user;
		Scanner sc = new Scanner(System.in);
		
		TestDac td = new TestDac(id, password, email);
		
		public void User() {			
			System.out.print("아이디 : ");
			id = sc.next();
			System.out.print("비밀번호 : ");
			password = sc.next();
			System.out.print("이메일 : ");
			email = sc.next();
			td.setId(id);
			td.setPassword(password);
			td.setEmail(email);
			System.out.println("아이디 등록 완료!");
			System.out.println("========================");
			System.out.printf("아이디 : %s\n비밀번호 : %s\n이메일 : %s\n",td.getId(),td.getPassword(),td.getEmail());
			
			
		}
}
