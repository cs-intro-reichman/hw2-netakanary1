// Computes an approximation of PI.
public class CalcPi {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		double sum = 0.0;
		int a = 1;

		for (int i = 1; i < num * 2; i += 2) {
			sum = sum + (1.0 / i) * a;
			a *= -1.0;
		}

		System.out.println("pi according to java: " + Math.PI);
		System.out.println("pi, approximated:     " + sum * 4.0);
	}
}
