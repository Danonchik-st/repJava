public class Print {
    private Long threadId;

    public synchronized void print(String text) {

        long currentThreadId = Thread.currentThread().getId();

        for (; threadId != null && threadId == currentThreadId;) {
            try {
                wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        System.out.print(text + " ");
        threadId = currentThreadId;
        notifyAll();
    }
}