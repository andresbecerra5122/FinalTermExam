// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArithmeticExp term = new Sum(0,
                new Number(3),
                new Product( 0,
                        new Number( 2),
                        new Number( 5)));

        System.out.println(term.Evaluate());

    }
}

