public class SumElement implements Runnable {
    private double[] array;
    private int k;
    private double ESum = 0;

    public SumElement(double[] array, int k) {
        super();
        this.array = array;
        this.k = k;
    }

    public double[] getArray() {
        return array;
    }

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }

    public double getESum() {
        return ESum;
    }

    public void setESum(int ESum) {
        this.ESum = ESum;
    }


public  void sumElement(){

        for (int i=0;i<array.length;i++){
            if(array[i]% 1 == 0)
                ESum+=array[i];
            System.out.println(array[i]);
        }
    System.out.println("Сума цілих алементів масиву в Потоці : " +ESum);

}
    @Override
    public void run() {
      sumElement();


    }
}
