import com.sun.jdi.Value;

public abstract class Binary extends ArithmeticExp{

    private ArithmeticExp left;
    private ArithmeticExp right;
    private int value ;
    public ArithmeticExp getLeft() {
        return left;
    }

    public void setLeft(ArithmeticExp left) {
        this.left = left;
    }

    public ArithmeticExp getRight() {
        return right;
    }

    public void setRight(ArithmeticExp right) {
        this.right = right;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
