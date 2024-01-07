public class Rec {
    public static int num = 0;
    public static void main(String[] args) {
        rec();
    }

    public static void rec() {
        int num2 = 0;
        if (num == 10) {
            return;
        }
        num2 += 1;
        num += 1;
        System.out.println(num);
        System.out.println("NUM 2: "+num2);
        rec();
    }
}
