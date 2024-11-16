class Cashier {
    private final Monitor monitor;

    public Cashier(Monitor monitor) {
        this.monitor = monitor;
    }

    public void buy(String customerName, int itemNumber) throws InterruptedException {
        synchronized (this) {
            System.out.println(customerName + " is buying item " + itemNumber);
            Thread.sleep(500); // Імітація часу обслуговування
            System.out.println(customerName + " bought item " + itemNumber);
        }
    }

    public void serveCustomer(String customerName, int items) {
        monitor.enter(customerName);
        for (int i = 0; i < items; i++) {
            try {
                buy(customerName, i + 1);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        monitor.exit();
    }
}