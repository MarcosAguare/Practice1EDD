package Back.Control;

/**
 *
 * @author aguare
 */
public class Timer extends Thread {

    private long startTime;
    private long endTime;
    private long totalTime;

    public Timer() {
        this.startTime = 0;
        this.endTime = 0;
        this.totalTime = 0;
    }

    public void startTimer() {
        this.startTime = System.currentTimeMillis();
    }

    public void stopTimer() {
        this.endTime = System.currentTimeMillis();
        this.totalTime = this.endTime - this.startTime;
    }

    public long getTotalTime() {
        return this.totalTime;
    }

    @Override
    public void run() {
        this.startTimer();
    }

}
