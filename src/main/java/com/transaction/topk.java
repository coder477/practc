package google;

import java.util.HashMap;
import java.util.PriorityQueue;

public class topk {
	public static void main(String args[]) {
		int arr[] = new int[] { 1, 11, 2, 3, 3, 5, 1, 2, 3 };
		int k = 5;
		PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b.compareTo(a));
		// m1
		for (int i = 0; i < arr.length; i++) {
			pq.add(arr[i]);
		}
		while (pq.size() > (arr.length - k)) {
			System.out.println(pq.remove());
		}
		System.out.println();

		// m2
		PriorityQueue<Integer> pq1 = new PriorityQueue<>((a, b) -> a.compareTo(b));
		pq1.add(arr[0]);
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] >= pq1.peek()) {
				pq1.add(arr[i]);
			}
			if (pq1.size() > k) {
				pq1.remove();
			}

		}
		while (pq1.size() > 0) {
			System.out.println(pq1.remove());
		}

		pq1.clear();
		System.out.println();
		// m3
		HashMap<Integer, Integer> hm = new HashMap();
		for (int i = 0; i < arr.length; i++) {
			int count = hm.getOrDefault(arr[i], 0);
			hm.put(arr[i], count + 1);
		}

		for (Integer val : hm.keySet()) {
			if (pq1.size() > 0) {
				if (val >= pq1.peek()) {
					pq1.add(val);
				}
				if (pq1.size() > k) {
					pq1.remove();
				}
			} else {
				pq1.add(val);
			}

		}
		while (pq1.size() > 0) {
			System.out.println(pq1.remove());
		}

	}

}
