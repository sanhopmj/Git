package chap04;

public class ContinueExample {

	public static void main(String[] args) {
		for(int i= 1; i<=10; i++) {
			if(i%2 !=0) { //홀수인 경우 continue
				continue;
			}
			System.out.println(i);
		}

	}

}
