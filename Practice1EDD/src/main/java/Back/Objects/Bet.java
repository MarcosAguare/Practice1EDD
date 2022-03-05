package Back.Objects;

import java.time.LocalDate;

/**
 *
 * @author aguare
 */
public class Bet {
    
    private int[] horses;
    private Double bet_amount;
    private LocalDate date;
    private int points;
    private String bettor_name;
    private boolean status;

    public Bet(int[] horses, Double bet_amount, LocalDate date, int points, String bettor_name, boolean status) {
        this.horses = horses;
        this.bet_amount = bet_amount;
        this.date = date;
        this.points = points;
        this.bettor_name = bettor_name;
        this.status = status;
    }

    public int[] getHorses() {
        return horses;
    }

    public void setHorses(int[] horses) {
        this.horses = horses;
    }

    public Double getBet_amount() {
        return bet_amount;
    }

    public void setBet_amount(Double bet_amount) {
        this.bet_amount = bet_amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getBettor_name() {
        return bettor_name;
    }

    public void setBettor_name(String bettor_name) {
        this.bettor_name = bettor_name;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
}
