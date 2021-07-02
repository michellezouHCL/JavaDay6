package exercise1;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Color pink = new Color("pink");
		Color red = new Color("red");
		ArrayList<Color> colorList = new ArrayList<Color>();
		colorList.add(pink);
		colorList.add(red);
		for (Color x : colorList) {
			System.out.println(x.getColor());
		}
	}

}
