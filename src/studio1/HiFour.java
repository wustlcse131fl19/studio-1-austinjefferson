package studio1;

import support.cse131.ArgsProcessor;

/**
 * From Sedgewick and Wayne, COS 126 course at Princeton
 * 
 */
public class HiFour {
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		String s0 = ap.nextString("What's the name of the first person?");
		String s1 = ap.nextString("What's the name of the second person?");
		String s2 = ap.nextString("What's the name of the third person?");
		String s3 = ap.nextString("What's the name of the forth person?");
		System.out.println("Greetings " + s0 + ", " + s1 + ", " + s2 + ", and " + s3 + ".");
		//
		// Say hello to the names in s0 through s3.
		//

	}
}
