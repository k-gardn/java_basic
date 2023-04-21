package inputs;

import java.util.Scanner;
public class Exam4 {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주소 입력 : ");
		String addr = sc.nextLine();
		System.out.println("주소 : " + addr);
		
		
		System.out.println("이름 입력 : ");
		String name = sc.next();  //공백을 문자열로 인식하여 엔터 전까지를 문자열로 인식. 한줄을 프린트 할 때 사용하면 될 듯.
		System.out.println("이름 : " + name);
		
		sc.nextLine(); // buffer를 썼다면 비워줘야한다.-> buffer 청소. buffer를 비우겠다. = 남아있는 엔터를 없애준다.
		//이를 안써주면, 위에서 입력한 엔터가 밑에 nextLine에서의 입력처럼 인식되어 입력을 받지 못하고 넘어가 버린다.
		System.out.println("주소 입력 : ");
		String addr1 = sc.nextLine(); //남아있는 엔터를 입력으로 인식해버림.
		System.out.println("주소 : " + addr1);
		
		sc.close(); // 운영체제가 대기중이기 때문에 자원이 낭비됨.
		
	}
}
