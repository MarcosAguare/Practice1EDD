package Back.DataEstructure;

import Back.Objects.Bet;

/**
 *
 * @author aguare
 */
public class ListDin {

    private Node first, latest;

    private int size;

    public ListDin() {
        this.first = null;
        this.latest = null;
        this.size = 0;
    }

    public void addStart(Bet bet) {
        if (isEmpty()) {
            first = new Node(null, bet, null);
            size++;
        } else {
            first = new Node(first, bet, null);
            latest.getNext().setPrevious(first);
            size++;
        }
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void showList() {
        System.out.println("Tamaño: " + size);
        Node actually = first;
        while (actually.getNext() != null) {
            System.out.println(" Actual: " + actually.getElement().getBettor_name());
        }

    }

}
