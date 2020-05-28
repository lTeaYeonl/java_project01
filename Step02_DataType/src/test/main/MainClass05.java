package test.main;

public class MainClass05 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작 되었습니다.");
		
		// "김지훈" 정보를 담고 있는 참조값(id값) 이 변수에 들어간다.
		String name="김지훈";
		String tmp=name; // 참조값 복사
		name="김찬미"; // 새로운 참조값으로 대입하기
		name=null; // name 변수를 empty(빈) 상태로 만들기
	}
}
