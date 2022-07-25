package chap03;

public class SignOperatorExmaple {

	public static void main(String[] args) {
		int x = -100;
		int result1 = +x; // -100
		int result2 = -x; // +100
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);
		
		byte b = 100;
		//byte result3 = -b; 컴파일 에러
		int result3 = -b; //-100
		System.out.println("result3 = " + result3);

	}

}
