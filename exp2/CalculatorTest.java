public class CalculatorTest {

    public static void main(String[] args) {

        Calculator c1 = new Calculator();
        System.out.println("A: " + c1.a + ", B: " + c1.b);

        Calculator c2 = new Calculator(2, 4);
        System.out.println("A: " + c2.a + ", B: " + c2.b);

        c1.add(4, 8);
        c2.add(6, 7);

    }
}
