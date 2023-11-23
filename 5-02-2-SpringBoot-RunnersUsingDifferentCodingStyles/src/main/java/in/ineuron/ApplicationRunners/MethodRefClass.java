package in.ineuron.ApplicationRunners;

import java.util.Arrays;

public class MethodRefClass {
	
	public static void test(String...args) {
		System.out.println("from method reference ::"+Arrays.asList(args));
	}

}
