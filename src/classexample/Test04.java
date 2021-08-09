package classexample;

// 기본형 매개변수는 변수에 저장된 값만 읽을 수만 있을 뿐 변경할 수는 없다
// d.x의 값이 변경된 것이 아니라 x의 값이 변경되었으므로 change이후에도 d.x의 값은 10이다
class Data { int x; }

public class Test04 {
	public static void main(String[] args) {
		Data d= new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d.x);
		System.out.println("Agter change(d.x)");
		System.out.println("main() : x = " + d.x);
	}
	
	static void change(int x) { // 기본형 매개변수
		x = 1000;
		System.out.println("change() : x = " + x);
	}
}
 