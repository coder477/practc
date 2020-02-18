package google;

public interface test {
	
	default void testmethod() {
		System.out.println("test");
	}
	default int sum(int a,int b) {
		return 0;
	}
	int convert(String s);
	//int div(int a, int b);

}
