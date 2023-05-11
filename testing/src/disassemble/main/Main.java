package disassemble.main;

import java.util.Scanner;

import disassemble.DAO.MemberDAO;
import disassemble.DTO.RegisterRequest;
import disassemble.Service.ChangePasswordService;
import disassemble.Service.MemberAllService;
import disassemble.Service.MemberDeleteService;
import disassemble.Service.MemberRegisterService;

public class Main {
	private static MemberDAO memberDao = new MemberDAO();
	//MemberDAO 만들어야함.
	public static void main(String[] args) {
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
		// regSvc.regist() 호출
		MemberRegisterService regSvc = new MemberRegisterService(memberDao);
		RegisterRequest regReqDTO = new RegisterRequest();
		
		regReqDTO.setEmail(arg[1]);
		regReqDTO.setName(arg[2]);
		regReqDTO.setPassword(arg[3]);
		regReqDTO.setConfirmPassword( arg[4]);
		
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
