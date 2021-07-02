package exercise4;

import java.util.HashSet;
import java.util.Set;

public class CompareSets {

	public static Set<Integer> compareSets(Set<Integer> intSet1, Set<Integer> intSet2){
		intSet1.retainAll(intSet2);
		return intSet1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> intSet1 = new HashSet<Integer>();
		Set<Integer> intSet2 = new HashSet<Integer>();
		intSet1.add(1);
		intSet1.add(2);
		intSet1.add(3);
		intSet1.add(4);
		intSet2.add(2);
		intSet2.add(4);
		intSet2.add(6);
		intSet2.add(8);
		System.out.println("Set 1:"+intSet1);
		System.out.println("Set 2:" +intSet2);
		System.out.println("Elements in both Set:"+compareSets(intSet1,intSet2));
	}

}
