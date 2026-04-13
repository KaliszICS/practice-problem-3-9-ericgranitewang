import java.util.ArrayList;

public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static String[] towerOfHanoi(int n) {
		ArrayList<String> real = new ArrayList<String>();
		towerOfHanoiReal(n, "L", "R", real);
		String[] amog = new String[real.size()];
		for (int i = 0; i < real.size(); i++) {
			amog[i] = real.get(i);
		}
		return amog;
	}

	public static int towerOfHanoiReal(int n, String a, String b, ArrayList<String> moves) {
		if (n == 0) {
			return 0;
		}
		int num;
		if (a.equals("L") && b.equals("R")) {
			num = towerOfHanoiReal(n - 1, a, "M", moves);
			moves.add(a+b);
			num += towerOfHanoiReal(n - 1, "M", b, moves);
		} else if (a.equals("R") && b.equals("L")) {
			num =towerOfHanoiReal(n - 1, a, "M", moves);
			moves.add(a+b);
			num += towerOfHanoiReal(n - 1, "M", b, moves);
		} else if (a.equals("L") && b.equals("M")) {
			num = towerOfHanoiReal(n - 1, a, "R", moves);
			moves.add(a+b);
			num += towerOfHanoiReal(n - 1, "R", b, moves);
		} else if (a.equals("M") && b.equals("L")) {
			num = towerOfHanoiReal(n - 1, a, "R", moves);
			moves.add(a+b);
			num += towerOfHanoiReal(n - 1, "R", b, moves);
		} else if (a.equals("M") && b.equals("R")) {
			num = towerOfHanoiReal(n - 1, a, "L", moves);
			moves.add(a+b);
			num += towerOfHanoiReal(n - 1, "L", b, moves);
		} else {
			num = towerOfHanoiReal(n - 1, a, "L", moves);
			moves.add(a+b);
			num += towerOfHanoiReal(n - 1, "L", b, moves);
		}
		return num + 1;
	}

}
