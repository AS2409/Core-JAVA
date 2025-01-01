package Problems;

class TrafficSignal extends Thread {
    private Signal signal;

    TrafficSignal(Signal signalColor) {
        this.signal = signalColor;
    }

    public void run() {
        signal.sleepTime(10);
    }

}

public class UseSynchronizeKeyword {
    public static void main(String[] args) {
        Signal light = new Signal();
        TrafficSignal red = new TrafficSignal(light);
        TrafficSignal green = new TrafficSignal(light);
        TrafficSignal yellow = new TrafficSignal(light);
        red.start();
        yellow.start();
        green.start();
    }

}

class Signal {
    private int time = 0;

    public synchronized void sleepTime(int n) {
        for (int i = 0; i < n; i++) {
            time++;
        }
        System.out.println(time);
    }

}
