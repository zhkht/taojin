package test;

public class test {
	public static void main(String args[]) {
		test t = new test();
		int b = t.get();
		System.out.println(b);
	}

	public int get() {
		try {
			return 1;
		} finally {
			return 2;
		}
	}
} 
