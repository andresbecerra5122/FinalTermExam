public class Product extends Binary{

    public Product(int i, ArithmeticExp left, ArithmeticExp right) {
        setValue(i);
       setLeft(left);
       setRight(right);
    }

    @Override
    public int Evaluate() {
        System.out.println(this);
        return getLeft().Evaluate() * getRight().Evaluate();
    }

    @Override
    public String toString(){
        return getLeft().toString() + " * " + getRight().toString();

    }
}
