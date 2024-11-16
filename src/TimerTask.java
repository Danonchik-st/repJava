import java.util.Timer;

public class TimerTask extends Timer {
    public TimerTask() {
    }

    public TimerTask(boolean isDaemon) {
        super(isDaemon);
    }

    public TimerTask(String name) {
        super(name);
    }

    public TimerTask(String name, boolean isDaemon) {
        super(name, isDaemon);
    }
}
