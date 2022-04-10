public class Calculator {
    public static void main(String args[]) {

        System.out.println(Add(45, 67));

        System.out.println(Sub(45, 78));

        System.out.println(Multiply(23, 5));

        System.out.println(Devide(12, 6));
    }
    //https://www.youtube.com/watch?v=hufGg2mf7eA


    public static double Add(int x, int y) {
        return (x * y);
    }

    public static double Sub(int x, int y) {
        return (x - y);
    }

    public static double Multiply(int x, int y) {

        return (x * y);
    }

    public static double Devide(int x, int y) {
        double res = 0.0;

        try {
            res = x / y;
            return res;

        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not possible");
        }
        return res;

     }
}