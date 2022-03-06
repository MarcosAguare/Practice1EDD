package Back.Control;

import Back.Objects.Bet;

/**
 *
 * @author aguare
 */
public class Order {

    private int steps = 0;

    public void sortByPoints(Bet[] bets) {

    }

    private void quicksortForPoints(Bet[] bets, int left, int right) {
        Bet pivot = bets[left];
        int i = left;
        int j = right;
        int aux;

        while (i < j) {
            while (bets[i].getPoints() <= pivot.getPoints() && i < j) {
                i++;
            }
            while (bets[j].getPoints() > pivot.getPoints()) {
                j--;
            }
            if (i < j) {
                aux = bets[i].getPoints();
                bets[i] = bets[j];
                bets[j].setPoints(aux);
            }
        }

        bets[left] = bets[j];
        bets[j] = pivot;

        if (left < j - 1) {
            quicksortForPoints(bets, left, j - 1);
        }
        if (j + 1 < right) {
            quicksortForPoints(bets, j + 1, right);
        }
    }

    public void sortByNameGamblers(Bet[] bets) {
        
    }
}
