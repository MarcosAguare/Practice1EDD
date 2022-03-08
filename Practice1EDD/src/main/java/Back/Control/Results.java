package Back.Control;

import Back.DataEstructure.ListDin;
import Back.DataEstructure.Node;
import Back.Objects.Bet;

/**
 *
 * @author aguare
 */
public class Results {

    private int[] results;
    private ListDin bets;

    public Results(int[] results, ListDin bets) {
        this.results = results;
        this.bets = bets;
        calculateResults();
    }

    private void calculateResults() {
        Node node = bets.getFirst();
        while (node.getNext() != null) {
            Bet bet = node.getElement();
            int[] horses = bet.getHorses();
            for (int i = 0; i < horses.length; i++) {
                if (horses[i] == results[i]) {
                    bet.sumPoints(10 - i);
                }
            }
            node = node.getNext();
        }
    }

    public int[] getResults() {
        return results;
    }

    public void setResults(int[] results) {
        this.results = results;
    }

    public ListDin getBets() {
        return bets;
    }

    public void setBets(ListDin bets) {
        this.bets = bets;
    }
}
