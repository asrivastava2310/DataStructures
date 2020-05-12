package general;

public class Fibonacci {

	public static void main(String[] args) {
		int n = 9;
		System.out.println("Using Recursion");
		System.out.println(fibUsingRecursion(n));

		System.out.println("Using DP");
		System.out.println(fibUsingDPWithSpaceOptimized(n));
	}

	// exponential running time
	private static int fibUsingRecursion(int n) {
		if (n <= 1)
			return n;

		return fibUsingRecursion(n - 1) + fibUsingRecursion(n - 2);
	}

	// O(n) time
	private static int fibUsingDPWithSpaceOptimized(int n) {
		int fib0 = 0;
		int fib1 = 1;
		int fibNext = 0;

		if (n == 0) {
			return fib0;
		}

		for (int i = 2; i <= n; i++) {
			fibNext = fib0 + fib1;
			fib0 = fib1;
			fib1 = fibNext;
		}
		return fib1;
	}

}
