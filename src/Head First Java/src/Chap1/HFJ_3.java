package Chap1;

public class HFJ_3 {
	public static void main(String[] args) {
		// make three sets of words to chosse from.. Add you own!!
		String[] wordListOne = { "ABC", "YUM", "SIM" };

		String[] wordListTwo = { "DT", "PIPIPO", "LIO" };

		String[] wordListThree = { "GXG", "HXH", "IXI" };

		// find out how many words are in each list
		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;

		// generate three random numbers
		int rand1 = (int) (Math.random() * oneLength);
		int rand2 = (int) (Math.random() * twoLength);
		int rand3 = (int) (Math.random() * threeLength);

		// now build a phrase
		String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

		// print out the phrase
		System.out.println("What we need is a " + phrase);
	}
}
