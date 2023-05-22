package dbConcept5;

import java.util.ArrayList;

public class BoardService implements IBoardService{

	private BoardDAO dao;
	public BoardService() {
		dao= new BoardDAO();
	}
	
	@Override
	public void insert(BoardDTO board) { //1. 게시글 등록
		dao.insert(board);
		System.out.println("글이 등록되었습니다.");
	}

	@Override
	public void selectNum(String n) { //2. 게시글 번호 검색
		BoardDTO selected = dao.selectNum(Integer.parseInt(n));
		if(selected == null) {
			System.out.println("게시물이 존재하지 않습니다.");
		}else {
			System.out.println("번호 : " + selected.getNum());
			System.out.println("조회수 : " + selected.getHit());
			System.out.println("작성자 : " + selected.getWriter());
			System.out.println("제목 : " + selected.getSubject());
			System.out.println("내용 : " + selected.getContent());
			System.out.println("==============================");
		}
	}

	@Override
	public void selectSubject(String subject) { //3. 게시글 제목 검색
		ArrayList<BoardDTO> selectList = dao.selectSubject(subject);
		if(selectList.isEmpty()) {
			System.out.println("등록된 게시글이 없습니다.");
		}else {
			System.out.println("======== 검색 결과 ========");
			for(BoardDTO dto : selectList) {
				
				System.out.println("번호 : " + dto.getNum());
				System.out.println("조회수 : " + dto.getHit());
				System.out.println("작성자 : " + dto.getWriter());
				System.out.println("제목 : " + dto.getSubject());
				System.out.println("내용 : " + dto.getContent());
				System.out.println("------------------------------");
			}
		}
	}

	@Override
	public void selectAll() {  // 4. 게시글 모두 보기
		ArrayList<BoardDTO> list = dao.selectAll();
		if(list.isEmpty()) {
			System.out.println("등록된 게시글이 없습니다.");
		}else {
			for(BoardDTO dto : list) {
				System.out.println("번호 : " + dto.getNum());
				System.out.println("조회수 : " + dto.getHit());
				System.out.println("작성자 : " + dto.getWriter());
				System.out.println("제목 : " + dto.getSubject());
				System.out.println("내용 : " + dto.getContent());
				System.out.println("------------------------------");
			}
		}
	}

	@Override
	public void delete(String n) {//5. 게시글 삭제
		int num = 0;
		try {
			num = Integer.parseInt(n);
		} catch (Exception e) {
			return;
		}
		
		BoardDTO selected = dao.selectNum(num);
		if(selected == null) {
			System.out.println("등록 되어 있지 않은 게시물 입니다.");
		}else {
			int result = dao.delete(num);
			if(result == 1) {
				System.out.println("삭제가 완료되었습니다.");
			}else {
				System.out.println("삭제가 정상적으로 이루어지지 않았습니다.");
			}
		}
	}

	@Override
	public void update(String n, String subject, String content) { //6. 게시글 수정
		BoardDTO selected = dao.selectNum(Integer.parseInt(n));
		if(selected == null) {
			System.out.println("등록 되어 있지 않은 게시물 입니다.");
		}else {
			selected.setSubject(subject);
			selected.setContent(content);
			 
			dao.update(selected);
		}
	}
	
	public void disconnection() {
		System.out.println("프로그램을 종료합니다.");
		dao.disconnection();
	}

}
