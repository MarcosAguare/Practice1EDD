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
            Node current = list.getFirst();
            while (current != null) {
                Node comparing = current;
                while (comparing != null) {
                    if (comparing.getElement().getBettor_name()
                            .compareTo(current.getElement().getBettor_name()) > 0) {
                        Bet tmp = comparing.getElement();
                        comparing.setElement(current.getElement());
                        current.setElement(tmp);
                    }
                    comparing = comparing.getNext();
                }
                current = current.getNext();
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void sortByPoints(ListDin list) {
        try {
            Node current = list.getFirst();
            while (current != null) {
                int stepByLoop = 1;
                int realStepByLoop = 2;
                Node comparing = current;
                while (comparing != null) {
                    stepByLoop++;
                    realStepByLoop++;
                    if (((Bet) comparing.getElement()).getPoints() > current.getElement()
                            .getPoints()) {
                        Bet tmp = (Bet) comparing.getElement();
                        comparing.setElement(current.getElement());
                        current.setElement(tmp);
                    }
                    comparing = comparing.getNext();
                    realStepByLoop++;
                }
                current = current.getNext();
            }
        } catch (Exception e) {

        }

    }
}
