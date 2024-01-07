public class ReturnKeyWord {
    public static void main(String[] args) {
        final int num = funcOne();
        System.out.println(num);

        final int num2 = funcOne();
        System.out.println(num2*5);

        funcTwo();
    }

    public static int funcOne() {
        return 1;
    }

    public static void funcTwo() {
        System.out.println("Hello program is running");
    }
}
