package methodExam;

import java.util.ArrayList;
import java.util.HashMap;

public class QuizDAO3 {
	// Data Access Object
	// 하나의 hashmap으로
	// 입력, 검색, 삭제, 수정 기능. => 메서드들 만들기.
	
	private HashMap<String, QuizDTO3> members = new HashMap<>();
	
	public QuizDTO3 selectId(String id) { 
		//아이디를 찾아야해.
		//정보는 map이 하나야. key : id / 값: QuizDTO
		QuizDTO3 memberInfo = members.get(id);
		
//		if(memberInfo == null)
//			return null;
		
//		memberInfo.setId(id);
//		memberInfo.setPassword(memberInfo.getPassword());
//		memberInfo.setName(memberInfo.getName());

		return memberInfo; //참조값
	};
	
//	public void insert(String id, String password, String name) {
//		QuizDTO3 dto = new QuizDTO3();
//		dto.setId(id);
//		dto.setName(name);
//		dto.setPassword(password);
//		
//		members.put(id, dto);
//	};
	
	public void put(QuizDTO3 memberDto) {
		
		members.put(memberDto.getId(), memberDto);
	};
	
	
//	public ArrayList<QuizDTO3> selectAll(){
//		ArrayList<QuizDTO3> poeple = new ArrayList<>();
//		
//		for(String id : members.keySet()) {
//			QuizDTO3 dto = new QuizDTO3();
//			QuizDTO3 memberInfo = members.get(id);
//			
//			dto.setId(id);
//			dto.setPassword(memberInfo.getPassword());
//			dto.setName(memberInfo.getName());
//			
//			poeple.add(dto);
//		}
//		return poeple; //참조변수 members의 참조값만 반환함. 이 참조값
//		
//	};
	public ArrayList<QuizDTO3> selectAll(){
		ArrayList<QuizDTO3> poeple = new ArrayList<>(members.values());
		//키(id)가 안들어간다고 생각했는데, QuizDTO3에는 id, name, password가 변수로 모두 있다.
		return poeple; //참조변수 members의 참조값만 반환함.
		
	};
	
	
	public void delete(String id){
		members.remove(id);
	};
	
	
	public void update(QuizDTO3 memberDto){
		QuizDTO3 dto = new QuizDTO3();
		
		dto.setId(memberDto.getId());
		dto.setPassword(memberDto.getPassword());
		dto.setName(memberDto.getName());
		
		members.put(memberDto.getId(),dto);
	};
	
//	private HashMap<String, QuizDTO3> members = new HashMap<>();
//
//	public void put(QuizDTO3 quizDto) {
//		members.put(quizDto.getId(), quizDto);
//	}
//	
//	public QuizDTO3 get(String id) {
//		QuizDTO3 dto = members.get(id);
//		return dto;
//	}
//	
//	public void remove(String id) {
//		members.remove(id);
//	}
//	
//	public ArrayList<QuizDTO3> values() {
//		ArrayList<QuizDTO3> list = new ArrayList<>(members.values());
//		return list;
//	}
//
//	public void update(QuizDTO3 quizDto) {
//		members.put(quizDto.getId(), quizDto);
//	}
	
}
