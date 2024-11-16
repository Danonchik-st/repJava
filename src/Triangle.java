public class Triangle {
    private  int a,b,c;

    public Triangle() {
        super();
    }

    public Triangle(int a, int b, int c) {
        super();
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
    public void Sq(Triangle triangle){
         double p=(triangle.a+triangle.b+triangle.c)/2;
        double s = Math.sqrt(p*(p-triangle.a)*(p-triangle.b)*(p-triangle.c));

        if (s>0){
            System.out.println("Площа трикутника"+triangle.toString()+ "дорівнює "+s);

        }
        else
            System.out.println("Такого трикутника не існує"+triangle.toString());
    }

    @Override
    public String toString() {
        return " із сторонами " +
                "a=" + a +
                ", b=" + b +
                ", c=" + c+
                " "
                ;
    }
}
