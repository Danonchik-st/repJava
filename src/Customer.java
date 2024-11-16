class Customer implements Runnable {
    private String name;
    private int tovar;
    private Cashier cashier;

    public Customer(String name, int tovar, Cashier cashier) {
        this.name = name;
        this.tovar = tovar;
        this.cashier = cashier;
    }

    @Override
    public void run() {
        for (int i = 0; i < tovar; i++) {
            try {
                cashier.buy(name, i + 1);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
