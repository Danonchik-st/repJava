import java.awt.*;

public class PrintTask  implements Runnable{
    private Print print;
    private String text;

    public PrintTask(Print print, String text) {
        super();
        this.print = print;
        this.text = text;
    }

    @Override
    public void run() {
        for(int i=0; i<6;i++){
            print.print(text);
        }

    }
}
