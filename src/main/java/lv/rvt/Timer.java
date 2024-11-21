package lv.rvt;

public class Timer {
    private int sec = 0;
    private int hsec = 0;

    public Timer(int sec, int hsec) {
        this.sec = sec;
        this.hsec = hsec;
    }

    public void advance() {
        this.hsec += 1;
        if (this.hsec >= 100) {
            this.hsec = 0;
            this.sec += 1;
        }
    }

    @Override
    public String toString() {
        return String.format("%d:%02d", this.sec, this.hsec);
    }
}
