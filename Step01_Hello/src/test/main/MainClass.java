package test.main;

public class MainClass {
	// run(실행) 했을 때 실행의 흐름이 시작되는 main 메소드
	// public : class 내/외부 어디에서나 해당 main 메소드가 호출 될 수 있음을 뜨함
	// static : main() 메소드가 메모리에 인스턴스 되는 공간의 주소가 모두 똑같음 을 나타냄
	// void : main()메소드 안에서 작업을 처리하고 main 을 호출한 호출자에게 반환한(리턴값) 결괎이 아무 것도 없다는 것을 의미합니다.
	// main(String[] args) : java application 프로그램에 꼭 들어가야 하는 문장이며, 컴파일하여 실행 시킬 경우 자바 런타임 인터 프리터가 제일 먼저 이 main() 메소드를 찾아 실행을 하는 곳.
	// main() 메소드는 "String args[]"라는 한개의 파라미터 값을 갖도록 정의되어 있음.
	// args 는 실행 시의 클래스에 전달되는 커맨드 라인 인자로서 String의 배열형으로 정의함으로써 여러개의 문자열을 받아 들일수 있음
	// 쉽게 말해, 자바 애플리케이션 프로그램을 자바 인터프리터(java)로 실행 할 경우,
	// 실행 명령 뒤에 문자열을 인자로 줄 수 있는데, 이것을 받아들이는 String 형 배열.
	// args = arguments = 전달인자
	public static void main(String[] args) {
		System.out.println("Hello, World!");
	}
}
