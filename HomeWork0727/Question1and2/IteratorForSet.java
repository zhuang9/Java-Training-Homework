package Question1and2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class IteratorForSet {

	public static void main(String[] args) {
		Set<String> hashset = new HashSet<String>();
		Set<Integer> treeset = new TreeSet<Integer>();

		hashset.add("welcome");
		hashset.add("to");
		hashset.add("learn");
		hashset.add("Java");
		hashset.add("programing");
		hashset.add(".");

		treeset.add(9);
		treeset.add(2);
		treeset.add(8);
		treeset.add(7);
		treeset.add(28);
		treeset.add(16);

		Iterator itr1 = hashset.iterator();
		while (itr1.hasNext()) {
			System.out.print(itr1.next() + " ");
		}

		System.out.println();

		Iterator itr2 = treeset.iterator();
		while (itr2.hasNext()) {
			System.out.print(itr2.next() + " ");
		}
	}
}
