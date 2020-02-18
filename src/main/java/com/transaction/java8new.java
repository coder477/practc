package google;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class java8new {

	public static void main(String[] args) {
		String s = "aaaadfffffghbifljk";
		
		List<String> arr = new ArrayList<>();
		arr.add("AWSERTYUN");
		arr.add("gwdkh");
		arr.add("edyrugjbn");
		arr.sort(new Comparator<String>() {
			public int compare(String a, String b) {
				return a.compareTo(b);
			}
		});
		System.out.println(arr);

		arr.sort((a, b) -> a.compareTo(b));// since its a one line comparator method

		test test = new test() {
			public int sum() {
				System.out.println("hii");
				return 0;
			}

			@Override
			public int sum(int a, int b) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public int convert(String s) {
				// TODO Auto-generated method stub
				return 0;
			}

		};

//		int ab = testainterface((int a, int b) -> {
//			return a + b;
//		});

		Function<Integer, Integer> tp = (Integer a) -> {
			return a;
		};
		System.out.println(tp.apply(1));
		int a = 4;
		int b = 5;
		// test t=(a,b)->(a+b);

		test tes = (ab) -> Integer.valueOf(ab);
		test tes1 = Integer::valueOf;

		test2 tes2 = new test2();
		test tes3 = tes2::func;

		testinterface t = (a1, b1) -> (a1 + b1);
		testinterface inf = Integer::sum;
		System.out.println(inf.sum(a, b));
		BiFunction<Integer, Integer, Integer> sum = (Integer a1, Integer b1) -> (a1 + b1);
		Supplier<Integer> sup = () -> new Random().nextInt();
		sup.get();

		streams();

	}

	public static void streams() {
		List<String> myList = Arrays.asList("a1", "a1", "b1", "c2", "c1");
		System.out.println(myList);

		String obj = "k";
		Optional<Character> a = myList.stream().map(x -> x.charAt(1))
				.collect(Collectors.maxBy(Comparator.comparing(String::valueOf)));
		System.out.println(myList.stream().sorted(Comparator.reverseOrder()).limit(2).sorted().findFirst().get());
		Object[] objArrayOfIntArrays = new Object[] { new int[] { 1, 2 }, // add 2
				new int[] { 1, 2 }, // add 2
				new int[] { 3, 2 }, // query freq 2
				new int[] { 2, 2 }, // delete 2
				new int[] { 3, 2 }, // query freq 2
		};

		List<List<Integer>> b = Arrays.stream(objArrayOfIntArrays).map(z -> {
			return Arrays.stream((int[]) z).boxed().collect(Collectors.toList());
		}).collect(Collectors.toList());
		System.out.println(b);
	}

	public static int testainterface(test test) {
		return 0;
	}

}
