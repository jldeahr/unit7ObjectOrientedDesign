/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

    /**
     * The main method in this class checks the Deck operations for consistency.
     *  @param args is not used.
     */
    public static void main(String[] args) {
        String[] ranks = {"ace", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king"};
        String[] suits = {"diamond", "heart", "spade", "club"};
        int[] pointValues = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        Deck d = new Deck(ranks, suits, pointValues);

        System.out.println("**** Original Deck Methods ****");
        System.out.println("  toString:\n" + d.toString());
        System.out.println("  isEmpty: " + d.isEmpty());
        System.out.println("  size: " + d.size());
        System.out.println();
        System.out.println();

        System.out.println("**** Deal a Card ****");
        System.out.println("  deal: " + d.deal());
        System.out.println();
        System.out.println();

        System.out.println("**** Deck Methods After 1 Card Dealt ****");
        System.out.println("  toString:\n" + d.toString());
        System.out.println("  isEmpty: " + d.isEmpty());
        System.out.println("  size: " + d.size());
        System.out.println();
        System.out.println();

        System.out.println("**** Deal Remaining 5 Cards ****");
        for (int i = 0; i < 5; i++) {
            System.out.println("  deal: " + d.deal());
        }
        System.out.println();
        System.out.println();

        System.out.println("**** Deck Methods After All Cards Dealt ****");
        System.out.println("  toString:\n" + d.toString());
        System.out.println("  isEmpty: " + d.isEmpty());
        System.out.println("  size: " + d.size());
        System.out.println();
        System.out.println();

        System.out.println("**** Deal a Card From Empty Deck ****");
        System.out.println("  deal: " + d.deal());
        System.out.println();
        System.out.println();
        
        Deck e = new Deck (ranks, suits, pointValues);
        System.out.println("Deck before shuffle:");
        System.out.println(e.toString());
        System.out.println("Shuffle Test:");
        System.out.println("Shuffle 1:");
        e.shuffle();
        System.out.println("Result of Shuffle 1:");
        System.out.println(e.toString());
        System.out.println("Shuffle 2:");
        e.shuffle();
        System.out.println("Result of Shuffle 2:");
        System.out.println(e.toString());
    }
}
