package Chap1;
public class HFJ_2 {
	public static void main(String[] args) {
		int beerNum = 49;
		String word = "bottles";

		while (beerNum > 0) {
			if (beerNum == 1) {
				word = "bottle";
			}

			System.out.println(beerNum + " " + word + " of beer on the wall");
			System.out.println(beerNum + " " + word + " of beer.");
			System.out.println("Take one down.");
			System.out.println("pass it around.");
			beerNum = beerNum - 1;

			if (beerNum > 0) {
				System.out.println(beerNum + " " + word + " of beer on the wall");
			} else {
				System.out.println("No more bottles of beer on the wall");
			}
		}
	}
}
