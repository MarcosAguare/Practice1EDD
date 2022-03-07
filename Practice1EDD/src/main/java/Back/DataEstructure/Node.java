package Back.DataEstructure;

import Back.Objects.Bet;

/**
 *
 * @author aguare
 */
public class Node {

    private Node next;
    private Bet element;
    private Node previous;

    public Node(Node next, Bet element, Node previous) {
        this.next = next;
        this.element = element;
        this.previous = previous;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Bet getElement() {
        return element;
    }

    public void setElement(Bet element) {
        this.element = element;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    @Override
    public String toString() {
        if (previous != null && next != null) {
            return "Anterior: " + previous.getElement().getBettor_name() + " Actual: " + element.getBettor_name() + " Siguiente: " + next.getElement().getBettor_name();
        } else {
            return "Actual: " + element.getBettor_name();
        }
    }

}
