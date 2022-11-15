package NajatJavaPOne;

// for solid principle
public class Factorial {
	
	static int factorial(int n) {
		if(n==1) { //base case
			return n;
		}else {
			return n * factorial(n-1);
		}
	}

	public static void main(String[] args) {
		

	}

}
