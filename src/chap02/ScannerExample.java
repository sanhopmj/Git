package chap02;

import java.util.Scanner; 

public class ScannerExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputData;
		
		while(true) {
			inputData = scanner.nextLine(); //enter키가 입력되기 전까지 대기상태가 되며 enter키가 입력되면 입력된 모든 내용을 문자열로 읽는다.
			System.out.println("입력된 문자열 : \"" + inputData + "\"");
			if ( inputData.equals("q")) {
				break;
			}
		}
		
		System.out.println("종료");
		

	}

}
