package Back.Control;

import Back.DataEstructure.ListDin;
import Back.DataEstructure.Node;
import Back.Objects.Bet;

/**
 *
 * @author aguare
 */
public class Sort {

    public boolean sortByGambler(ListDin list) {
        try {
            Node node = list.getLast();
            while (node != null) {
                Node second = node;
                while (second != null) {
                    if (second.getElement().getBettor_name()
                            .compareTo(node.getElement().getBettor_name()) > 0) {
                        Bet tmp = second.getElement();
                        second.setElement(node.getElement());
                        node.setElement(tmp);
                    }
                    second = second.getPrevious();
                }
                node = node.getPrevious();
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void sortByPoints(ListDin list) {
        try {
            Node node = list.getFirst();
            while (node != null) {
                Node second = node;
                while (second != null) {
                    if (((Bet) second.getElement()).getPoints() > node.getElement()
                            .getPoints()) {
                        Bet tmp = (Bet) second.getElement();
                        second.setElement(node.getElement());
                        node.setElement(tmp);
                    }
                    second = second.getNext();
                }
                node = node.getNext();
            }
        } catch (Exception e) {

        }

    }
}
