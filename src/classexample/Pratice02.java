package classexample;
// 학생정보에 합계와, 평균 메서드 만들기
public class Pratice02 {
	public static void main(String[] args) {
		Student2 s = new Student2();
		s.name = "홍길동"; 
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		
		System.out.println("이름 :" + s.name); 
		System.out.println("총점 :" + s.getTotal()); 
		System.out.println("평균 :" + s.getAverage());
	}

}

class Student2{
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	Student2() {}
	
	Student2(String name, int ban, int no, int kor, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	int getTotal() {
		return kor + eng + math;
	}
	
	float getAverage() {
		return (int)(getTotal() / 3f * 100) / 100f  ;
	}
}
