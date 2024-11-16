import java.math.BigInteger;

public class factorial implements  Runnable{
    private  int number;
    private BigInteger fSum=BigInteger.ZERO;

    public factorial(int number) {
        super();
        this.number = number;
    }

    public BigInteger getfSum() {
        return fSum;
    }


    public int getNumber() {
        return number;
    }
public  BigInteger factCalk(int n){
        BigInteger fact=BigInteger.ONE;
        for (int i=1;i<=n;i++){
            fact=fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
}
    @Override
    public void run() {
        Thread thr=Thread.currentThread();
        for (int i=1;i<=number;i++) {
            BigInteger fact=factCalk(i);

            System.out.println(thr.getName() +"  "+fact);
            fSum=fSum.add(fact);

        }
    }
}
