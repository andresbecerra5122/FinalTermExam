public class Number extends ArithmeticExp {

    private int value;

    public Number(int i) {
       value = i;
    }

    @Override
    public int Evaluate() {
        System.out.println(this);
        return getValue();
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    @Override
    public String toString(){
        return String.valueOf(value);
    }
}
