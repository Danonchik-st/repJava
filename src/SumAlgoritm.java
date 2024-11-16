public class SumAlgoritm {
    private double[] array;
    private int k;
    private double ESum = 0;

    public SumAlgoritm(double[] array, int k) {
        this.array = array;
        this.k = k;
    }

    public double[] getArray() {
        return array;
    }

    public void setArray(double[] array) {
        this.array = array;
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
    public void SumAlg(){
        for (int i = 0; i < array.length; i++) {
            if(array[i]%1==0){
                ESum= ESum+array[i];

            }
        }
        System.out.println("Сума масиву додатніх елементів в алгоритмі : "+ESum);
    }
    }

