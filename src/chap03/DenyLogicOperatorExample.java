package chap03;

public class DenyLogicOperatorExample {

	public static void main(String[] args) {
		boolean play = true;
		System.out.println(play); // true
		
		play = !play ; // play == false
		System.out.println(play); //false
		
		play = !play ; // play == true
		System.out.println(play); //true

	}

}
