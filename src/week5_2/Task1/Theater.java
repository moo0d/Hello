package week5_2.Task1;

public class Theater {

    private int seat;
    private int availableSeat;

    public Theater(int seat) {
        this.seat = seat;
        this.availableSeat = seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public void setAvailableSeat(int availableSeat) {
        this.availableSeat = availableSeat;
    }

    public int getSeat() {
        return seat;
    }

    public int getAvailableSeat() {
        return availableSeat;
    }
}
