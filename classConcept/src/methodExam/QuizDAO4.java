package methodExam;

import java.util.ArrayList;
import java.util.HashMap;

public class QuizDAO4 {
	// Data Access Object
	// 하나의 hashmap으로
	// 입력, 검색, 삭제, 수정 기능. => 메서드들 만들기.
	
	private ArrayList<QuizDTO4> members = new ArrayList<>();
	
	
	public int indexOf(String id) {
		// id의 index를 알아내야해.
		int index;
		QuizDTO4 dto = new QuizDTO4();
		dto.setId(id);
//		members.contains(dto);
		index = members.indexOf(dto);
//		
////		index = members.indexOf(id);
		return index;
	};
	public void add(QuizDTO4 quizDto) {
		members.add(quizDto);
		System.out.println(members.get(members.indexOf(quizDto)));
	}
	
	public QuizDTO4 get(String id) {
		QuizDAO4 QuizDAO4 = new QuizDAO4();
		int index = QuizDAO4.indexOf(id);
		QuizDTO4 dto = members.get(index);
		return dto;
	};
//	public void set() {};
//	public void remove() {};
}
