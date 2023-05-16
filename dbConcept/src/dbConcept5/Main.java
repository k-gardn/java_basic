package dbConcept5;

import java.util.Scanner;

public class Main {
	private	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		while (true) {
			System.out.println("1. 게시글 등록");
			System.out.println("2. 게시글 번호 검색");
			System.out.println("3. 게시글 제목 검색");
			System.out.println("4. 게시글 모두 보기");
			System.out.println("5. 게시글 삭제");
			System.out.println("6. 게시글 수정");
			System.out.println("7. 프로그램 종료");
			System.out.print("선택 > ");
			int select;
			try {
				select = Integer.parseInt(in.next());
			} catch (Exception e) {
				continue;
			}
			switch (select) {
			case 1:	insert(); break;
			case 2:	selectNum(); break;
			case 3:	selectSubject(); break;
			case 4:	selectAll(); break;
			case 5:	delete(); break;
			case 6: update(); break;
			case 7: disconnection();
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
			default:
				System.out.println("메뉴 확인 후 다시 입력하세요.");
			}
			
			
		}
	}
	private static BoardService bsv = new BoardService();
	
	private static void disconnection() {
		bsv.disconnection();
	}

	private static void update() {//6. 게시글 수정
		System.out.println("=== 게시글 수정하기 ===");
		System.out.println("글 번호 : "); String n = in.next();
		System.out.println("제목 : "); String subject = in.next();
		System.out.println("내용 : "); String content = in.next();
		bsv.update(n, subject, content);
	}

	private static void delete() { //5. 게시글 삭제
		System.out.println("=== 게시글 삭제하기 ===");
		System.out.println("글 번호 : "); String n = in.next();
		bsv.delete(n);
	}

	private static void selectAll() { // 4. 게시글 모두 보기
		System.out.println("=== 게시글 전체 보기 ===");
		bsv.selectAll();
	}

	private static void selectSubject() { //3. 게시글 제목 검색
		System.out.println("=== 게시글 제목 검색 ===");
		System.out.println("제목 검색 : "); String subject = in.next();
		bsv.selectSubject(subject);
	}

	private static void selectNum() { //2. 게시글 번호 검색
		System.out.println("=== 게시글 번호 검색 ===");
		System.out.println("글 번호 : "); 
		bsv.selectNum(in.next());
	}

	private static void insert() { //1. 게시글 등록
		BoardDTO dto = new BoardDTO();
		
		System.out.println("=== 게시글 등록 ===");
		in.nextLine();
		System.out.println("제목 : "); dto.setSubject(in.nextLine());
		System.out.println("내용 : "); dto.setContent(in.nextLine());
		System.out.println("작성자 : "); dto.setWriter(in.nextLine());
		
		bsv.insert(dto);
	}
}
