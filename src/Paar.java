public class Paar<L,R>
{
    R right;
    L left;

    public Paar(R right, L left) {
        super();
        this.right = right;
        this.left = left;
    }

    public R getRight() {
        return right;
    }

    public void setRight(R right) {
        this.right = right;
    }

    public L getLeft() {
        return left;
    }

    public void setLeft(L left) {
        this.left = left;
    }

    @Override
    public String toString() {
        return "Paar{" +
                "right=" + right +
                ", left=" + left +
                '}';
    }
}
