package Back.Control;

import Back.DataEstructure.ListDin;
import Back.DataEstructure.Node;
import Back.Objects.Bet;

/**
 *
 * @author aguare
 */
public class VerifyBets {

    private ListDin accepted = new ListDin();
    private ListDin rejected = new ListDin();
    private boolean isValid = false;

    public void analizeBets(ListDin list) {
        Node node = list.getFirst();
        while (node.getNext() != null) {
            Bet bet = node.getElement();
            if (bet.getBet_amount() > 0) {
                if (bet.getBettor_name().length() >= 1) {
                    int[] horses = bet.getHorses();
                    if (horses.length == 10 && existRepeated(horses)) {
                        accepted.addStart(bet);
                    } else {
                        rejected.addStart(bet);
                    }
                } else {
                    rejected.addStart(bet);
                }
            } else {
                rejected.addStart(bet);
            }
            node = node.getNext();
        }
    }

    private boolean existRepeated(int[] horses) {
        verifingRecurser(horses, 0, horses[horses.length - 1], 0);
        boolean result = isValid;
        isValid = true;
        return result;
    }

    private int verifingRecurser(int[] values, int pos, int toCompare, int index) {
        if (index >= values.length - 1) {
            return values[pos];
        } else {
            try {
                if (pos >= values.length - index - 1) {
                    index++;
                    pos = 0;
                    toCompare = values[values.length - index - 1];
                }
            } catch (Exception e) {
            }
            if (values[pos] == toCompare && index < values.length - 1) {
                this.isValid = false;
            }
            return verifingRecurser(values, pos + 1, toCompare, index);
        }
    }

    public ListDin getAccepted() {
        return accepted;
    }

    public ListDin getRejected() {
        return rejected;
    }
}
