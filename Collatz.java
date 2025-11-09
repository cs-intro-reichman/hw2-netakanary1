// Prints a crowd cheering output.
public class Collatz {
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		String mode = args[1];
		int seed = 0;
		boolean a = true;
		int cnt = 0;
		for (int i = 1; i <= num; i++) {
			seed = i;
			if (mode.equals("v"))
				System.out.print(i);
			cnt++;
			while (seed != 1 || a) {
				if (seed % 2 == 0) {
					seed = seed / 2;
				} else {
					seed = (seed * 3) + 1;
				}

				if (mode.equals("v"))
					System.out.print(" " + seed);
				a = false;
				cnt++;
			}

			if (mode.equals("v"))
				System.out.print("(" + cnt + ")\n");
			cnt = 0;
		}
		System.out.println("Every one of the first " + num + " hailstone sequences reached 1.");
	}
}
