package Day03;

public class Ex09_String {
	public static void main(String[] args) {
		// String은 참조타입
		
		String a = "Hello";
		String b = "Java";
		String c = "Hello";
		String d = new String("Hello");
		String e = new String("Java");
		String f = new String("Java"); //객체로 생성
		
		System.out.println(a==c); //true
		System.out.println(a==d); //false
		System.out.println(a.equals(d)); //true
		
		System.out.println(b==e); //false
		System.out.println(e==f); //false
		System.out.println(e.equals(f)); //true
		
		// == 해당변수의 레퍼런스(참조정보)를 비교
		// equals() 해당 변수의 문자열 자체를 비교
	}
}
