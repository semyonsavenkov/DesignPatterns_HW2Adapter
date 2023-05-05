public class Main {

    public static void main(String[] args) {

        Ints customCalc = new IntsCalculator();
        System.out.println(customCalc.sum(10, 5));
        System.out.println(customCalc.mult(10, 5));
        System.out.println(customCalc.pow(10, 5));
    }

}
