public class Calculator {
    public static void main(String args[]) {

        System.out.println(Add(45,67));

        System.out.println(Sub(45,78));

        System.out.println(Multiply(23, 5));
    }
    //https://www.youtube.com/watch?v=hufGg2mf7eA


    public static double Add(int x, int y) {
        return (x * y);
    }

    public static double Sub(int x, int y){
        return (x-y);
    }

    public static double Multiply(int x, int y){

        return (x*y);
    }

}