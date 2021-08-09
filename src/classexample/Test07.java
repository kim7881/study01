package classexample;

// 인스턴스 메서드와 클래스 메서드 차이 알아보기
// static은 언제 붙여야 하는가
// 1. 클래스를 설계할 때, 멤버변수 중 모든  인스턴스에 공통으로 사용하는 것에 static을 붙인다
// 2. 클래스 변수(static변수)는 인스턴스를 생성하지 않아도 사용할 수 있다
// 3. 클래스 메서드(static 메서드)는 인스턴스 변수를 사용할 수 없다
// 4. 메서드 내에서 인스턴스 변수를 사용하지 않는다면, static을 붙이는 것을 고려한다
class MyMath2{
	long a, b;
	
	// 인스턴스 변수 a, b만을 이용해서 작업하므로 매개변수가 필요없다
	long add()	{ return a + b; }
	long subtract() { return a - b; }
	long multiply() { return a * b; }
	double divide() { return a / b; }
	
	// 인스턴스 변수와 관계없이 매개변수만으로 작업이 가능하다
	static long 	add(long a, long b)			{ return a + b; } // a, b는 지역변수
	static long		subtract(long a, long b)	{ return a - b; }
	static long		multiply(long a, long b)	{ return a * b; }
	static double	divide(long a, long b)		{ return a / (double)b; } 
}

public class Test07 {
	public static void main(String[] args) {
		// 클래스 메서드 호출, 인스턴스 생성없이 호출가능
		System.out.println(MyMath2.add(200L, 100L));
		System.out.println(MyMath2.subtract(200L, 100L));
		System.out.println(MyMath2.multiply(200L, 100L));
		System.out.println(MyMath2.divide(200L, 100L));
		
		MyMath2 mm = new MyMath2();	// 인스턴스를 생성
		mm.a = 200L;
		mm.b = 100L;
		// 인스턴스 메서드는 객체생성 후에만 호출이 가능함
		System.out.println(mm.add());
		System.out.println(mm.subtract());
		System.out.println(mm.multiply());
		System.out.println(mm.divide());
	}
}
