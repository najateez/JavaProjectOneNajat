package NajatJavaPOne;

// for solid principle
public class FibonacciSeries {
	
	static int fibonacciSeries(int n) {
		if(n==0|n==1) {
			return n;
		}else {
			return fibonacciSeries(n-1)+ fibonacciSeries(n-2);
		}
	}

	public static void main(String[] args) {
		

	}

}
