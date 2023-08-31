package week2_1.Task1;

public class Television {

    private boolean state;
    private int channel;
    public Television() {
        this.state = false;
        this.channel = 0;

    }

    public boolean isOn() {
        return state;
    }
    public boolean pressOnOff() {
        state = !state;
        return state;
    }

    public int setChannel (int a) {
        channel = a;
        if (channel == 11){
            channel = 1;
        }
        return channel;

    }
    public int getChannel() {
        return channel;
    }

}
