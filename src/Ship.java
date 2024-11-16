public class Ship implements Runnable {
    private int boxes = 10;
    private final int shipId;
    private final Dock dock1;
    private final Dock dock2;

    public Ship(int id, Dock dock1, Dock dock2) {
        this.shipId = id;
        this.dock1 = dock1;
        this.dock2 = dock2;
    }

    public int getShipId() {
        return shipId;
    }

    public int getRemainingBoxes() {
        return boxes;
    }

    public void unloadOneBox() {
        boxes--;
    }

    @Override
    public void run() {
        while (boxes > 0) {
            if (boxes > 0) {
                dock1.unloadBox(this);
            }
            if (boxes > 0) {
                dock2.unloadBox(this);
            }
        }
    }
}

