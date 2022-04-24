package br.com.fj;

/*
 * Labeled Loops
 */
public interface LabeledLoops {
	static final int SIZE = 10;

	public static void main(String[] args) {
		five:
		for (int i=0; i<SIZE; i++) {
			if (i == 5) {
				continue five;
			}
			
			System.out.println("Number.: " + i);
		}
	}
}