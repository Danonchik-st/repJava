class Monitor {
    private boolean isOccupied = false;

    public synchronized void enter(String customerName) {
        while (isOccupied) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        isOccupied = true;
        System.out.println(customerName + " starts being served.");
    }

    public synchronized void exit() {
        isOccupied = false;
        notifyAll();
        System.out.println("Next customer can be served.");
    }
}