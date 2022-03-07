package Back.DataEstructure;

import Back.Objects.Bet;

/**
 *
 * @author aguare
 */
public class ListDin {

    private Node first, last;
    private int size;

    public ListDin() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    public void addStart(Bet bet) {
        Node node = new Node(null, bet, null);
        if (isEmpty()) {
            first = node;
        } else {
            last.setNext(node);
            node.setPrevious(last);
        }
        last = node;
        size++;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void showList() {
        System.out.println("Tamaño: " + size);
        if (!isEmpty()) {
            Node actually = first;
            while (actually.getNext() != null) {
                System.out.println(actually.toString());
                actually = actually.getNext();
            }
        }
    }

    public Node getFirst() {
        return first;
    }

    public void setFirst(Node first) {
        this.first = first;
    }

    public Node getLast() {
        return last;
    }

    public void setLast(Node last) {
        this.last = last;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
