package Back.Objects;

import java.time.LocalDate;

/**
 *
 * @author aguare
 */
public class History {
    
    private Bet[] bets;
    private LocalDate date;
    private int [] horses_results;

    public History(Bet[] bets, LocalDate date, int[] horses_results) {
        this.bets = bets;
        this.date = date;
        this.horses_results = horses_results;
    }

    public Bet[] getBets() {
        return bets;
    }

    public void setBets(Bet[] bets) {
        this.bets = bets;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int[] getHorses_results() {
        return horses_results;
    }

    public void setHorses_results(int[] horses_results) {
        this.horses_results = horses_results;
    }
}
