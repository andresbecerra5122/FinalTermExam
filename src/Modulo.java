public class Modulo  extends Binary{
    @Override
    public int Evaluate() {

        return getLeft().Evaluate() % getRight().Evaluate();
    }

    public Modulo(int i, ArithmeticExp left, ArithmeticExp right) {
        setValue(i);
        setLeft(left);
        setRight(right);
    }

    @Override
    public String toString(){
        return getLeft().toString() + "%" + getRight().toString();

    }
}
