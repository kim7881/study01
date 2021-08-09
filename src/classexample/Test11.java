package classexample;

// 멤버변수의 초기화
// 맨처음 클래스 초기화 블럭이 가장 먼저 수행 -> 그 다음 main메서드가 수행되어 Test11의 인스턴스가 생성되면서 
// 인스턴스 초기화 블럭이 먼저 수행되고, 끝으로 생성자가 수행

public class Test11 {
	static {		// 클래스 초기화 블럭
		System.out.println("static { }");
	}
	
	{				// 인스턴스 초기화 블럭
		System.out.println("{ }");
	}	
	
	public Test11() {
		System.out.println("생성자");
	}
	
	public static void main(String[] args) {
		System.out.println("Test11 bt = new Test11(); ");
		Test11 bt = new Test11();

		System.out.println("Test11 bt2 = new Test11(); ");
		Test11 bt2 = new Test11();
	}
}
