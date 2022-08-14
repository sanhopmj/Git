package chap05;

public class cp52 {

	public static void main(String[] args) {
		LoginResult result = LoginResult.FAIL_PASSWORD;
		if(result == LoginResult.SUCCESS) {
			System.out.println("성공");
		} else if( result == LoginResult.FAIL_ID) {
			System.out.println("id 실패");
		} else if( result == LoginResult.FAIL_PASSWORD) {
			System.err.println("pw 실패");
		}

	}

}
