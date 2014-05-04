package test;

public class FizzBuzzWhizz {
	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		int c = 5;
		if (a == b || a == c || b == c) {
			System.out.println("The three number must be different!\nChange your three numbers, and try again,please.");
			return;
		}

		String s = new String();
		for (int i=1; i<101; i++) {
			if (i%10==a || i/10==a || i/100==a) {
				System.out.println("Fizz");
				continue;
			}
			if (i%a==0) {
				s += "Fizz";
			}
			if (i%b==0) {
				s += "Buzz";
			}
			if (i%c==0) {				
				s += "Whizz";
			}
			if (!s.isEmpty()) {
				System.out.println(s);
				s = "";
				continue;
			}
			System.out.println(i);
		}
	}
}
