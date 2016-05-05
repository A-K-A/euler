package p1;

/*
 * Problem 1
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 * 
 * @Kuldeep
 */
public class KuldeepP1 {

	public static void main(String[] args) {
		KuldeepP1 o1 = new KuldeepP1();
		int input = 1000;
		System.out.println("answer for input=" + input + " is " + o1.solve(input));
	}

	/*
	 * TC = O(n)
	 */
	public int solve(int input) {
		int ans = 0;
		for (int i=1; i<input; i++) {
			if ((i%3 == 0) || (i%5 == 0) ) {
				ans += i;
			} 
		}
		return ans;
	}
}
