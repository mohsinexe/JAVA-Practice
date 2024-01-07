import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = sc.nextInt();

        System.out.println(isArmstrong(n));
    }

    static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;

        while (n>0){
            int rem = n%10;
            n = n/10;
            sum = sum + rem*rem*rem;
        }
        if (sum == original){
            return true;
        }
        return false;

    }
}
