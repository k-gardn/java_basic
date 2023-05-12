package disassemble.main;

import java.util.Scanner;

import disassemble.DAO.MemberDAO;
import disassemble.DTO.RegisterRequest;
import disassemble.Service.ChangePasswordService;
import disassemble.Service.MemberAllService;
import disassemble.Service.MemberDeleteService;
import disassemble.Service.MemberRegisterService;

public class Main {
	/*
	 * static을 붙이는 이유 
	 * : 코드 실행시 바로 메모리에 올리기 때문에 new 사용할 필요없이(인스턴스로 만들 필요 없이),
	 *  클래스 import없이 메서드 이름만(같은 패키지 안에 있기 때문에)으로 사용이 가능하다.
	 *  
	 *  new Main();  : static 붙어 있지 않은 애들도 메모리에 올린다.
	 */
	
	private static MemberDAO memberDao = new MemberDAO();
	//MemberDAO 만들어야함.
	public static void main(String[] args) { //CLI 처럼 만들려고 설계한 것.
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.println("명령어를 입력하세요");
			System.out.print("> ");
			String command = sc.nextLine();
			
			if(command.equalsIgnoreCase("exit")){
				System.out.println("종료합니다.");
				break;
			}
			
			// new [이메일] [이름] [암호] [암호확인]
			if(command.startsWith("new")){ //시작 문자열이 같으면 true
				processNewCommand(command.split(" "));
				continue;
			} else if(command.startsWith("change")){
				processChangeCommand(command.split(" "));
				continue;
			} else if(command.startsWith("all")) {
				processAllCommand();
				continue;
			} else if(command.startsWith("delete")) {
				processDeleteCommand(command.split(" "));
				continue;
			}
			printHelp();
		}
	}
	private static void processNewCommand(String[] arg) {
		if(arg.length != 5){
			printHelp();
			return;
		}
		// new [이메일] [이름] [암호] [암호확인]
		// MemberRegisterService 객체 생성
		// RegisterRequest 객체 생성 
		// 데이터는 RegisterRequest 객체에 입력
		MemberRegisterService regSvc = new MemberRegisterService(memberDao);
		RegisterRequest regReqDTO = new RegisterRequest();
		
		regReqDTO.setEmail(arg[1]);
		regReqDTO.setName(arg[2]);
		regReqDTO.setPassword(arg[3]);
		regReqDTO.setConfirmPassword(arg[4]);
		
		// regSvc.regist() 호출
		regSvc.regist(regReqDTO);
	}
	//입력값 없음.
	private static void processAllCommand() {
		// MemberAllService 객체 생성
		MemberAllService allSvc = new MemberAllService(memberDao);
		// allSvc.selectAll() 호출
		allSvc.selectAll();
		
	}

	private static void processChangeCommand(String[] arg) {
		if(arg.length != 4) {
			printHelp();
			return;
		}
		//change [이메일] [현재비밀번호] [변경할비밀번호]
		// ChangePasswordService 객체 생성
		ChangePasswordService change = new ChangePasswordService(memberDao);
		// change.changePassword() 호출
		String email = arg[1];
		String oldPw = arg[2];
		String newPw = arg[3];
		change.changePassword(email,oldPw,newPw);
//		change.changePassword(arg[1],arg[2],arg[3]);
	}

	private static void processDeleteCommand(String[] arg) {
		if(arg.length != 4) {
			printHelp();
			return ;
		}
		//delete [이메일] [암호] [암호확인]
		// MemberDeleteService 객체 생성
		MemberDeleteService delete = new MemberDeleteService(memberDao);
		// delete.checkPassword() 호출
		String email = arg[1];
		String password = arg[2];
		String confirmPassword = arg[3];
		delete.checkPassword(email, password, confirmPassword);
//		delete.checkPassword(arg[1],arg[2],arg[3]);
	}

	private static void printHelp(){
		System.out.println();
		System.out.println("명령어 사용법을 확인하세요.");
		System.out.println("usage : ");
		System.out.println("모든 정보 출력 : all");
		System.out.println("정보 등록 : new [이메일] [이름] [암호] [암호확인]");
		System.out.println("비밀번호 수정 : change [이메일] [현재비밀번호] [변경할비밀번호]"); //nextLine으로 한번에 인식
		System.out.println("정보 삭제 : delete [이메일] [암호] [암호확인]");
		System.out.println("종료 : exit");
		System.out.println();
	}
}
