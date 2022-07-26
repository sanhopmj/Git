package chap04;

public class P43 {

	public static void main(String[] args) {
		int m;
		int n;
		
		while(true) {
			m = (int)(Math.random()*6)+1;
			n = (int)(Math.random()*6)+1;
			int sum = m+n;
			System.out.println("(" + m + "," + n + ")");
			if(sum == 5) {
				break;
			}
		}
	     
	}

}
