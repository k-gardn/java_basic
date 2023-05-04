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
//		int index;
		for(QuizDTO4 qd: members) {// ArrayList의 각 인덱스를 순회
			if(qd.getId().equals(id))
				return members.indexOf(qd);
		} 
		return -1; // 찾는 id가 없다.
	};
	
	public void add(QuizDTO4 quizDto) {
		members.add(quizDto);
	}
	
	public QuizDTO4 get(int index) {
		return members.get(index);
	};
	
	public void set(int index, QuizDTO4 quizDto) {
		members.set(index, quizDto);
	};
	
	public void remove(int index) {
		members.remove(index);
	};
	
	public ArrayList<QuizDTO4> getAll() {
		
		return members;
	};
}
