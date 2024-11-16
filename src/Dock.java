public class Dock {
    private final int dockId;

    public Dock(int id) {
        this.dockId = id;
    }

    public synchronized void unloadBox(Ship ship) {
        try {
            System.out.println("Ship " + ship.getShipId() + " is unloading a box at dock " + this.dockId);
            Thread.sleep(500);
            ship.unloadOneBox();
            System.out.println("Ship " + ship.getShipId() + " unloaded a box. Remaining boxes: " + ship.getRemainingBoxes());
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
