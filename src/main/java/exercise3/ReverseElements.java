package exercise3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseElements {

	public static List<Integer> reverseElements(List<Integer> integerList){
		Collections.reverse(integerList);
		return integerList;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> integerList=new ArrayList<Integer>();
		integerList.add(1);
		integerList.add(2);
		integerList.add(3);
		System.out.println(integerList);
		System.out.println(reverseElements(integerList));
	}

}
