package dbConcept5;
/*
SQL> CREATE TABLE dbConcept5(
  2  num number,
  3  subject varchar2(20),
  4  content varchar2(20),
  5  writer varchar2(20),
  6  write_time varchar2(10),
  7  hit number
  8  );

SQL> commit;
 */
public class BoardDTO {
	private int num; // 게시글 번호 (자동 생성) -> PRIMERY KEY
	
	private String subject; // 게시글 제목(입력 받기)
	private String content; // 게시글 내용(입력 받기)
	private String writer; // 게시글 작성자(입력 받기)
	
	private String writeTime; // 게시글 작성일(연월일)
	private int hit; // 게시글 조회수
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriteTime() {
		return writeTime;
	}
	public void setWriteTime(String writeTime) {
		this.writeTime = writeTime;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	
	
}
