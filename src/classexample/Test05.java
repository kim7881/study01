package classexample;

// 기본형 매개변수와 참조형 매개변수의 차이점을 완전히 이해해야 한다
// d.x의 값을 1000이라고 했기 때문에 change 이후에도 d.x의 값은 1000이 나온다
class Data2{ int x; }

public class Test05 {
	public static void main(String[] args) {
		Data2 d = new Data2();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d);
		System.out.println("After change(d)");
		System.out.println("main() : x = " + d.x);
	}


	static void change(Data2 d) {	// 참조형 매개변수
		d.x = 1000;
		System.out.println("change() : x = " + d.x);
	}
}
