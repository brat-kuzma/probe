package probe;

public class Main {

    public static void main(String[] args) {
        int i = 100;
        int j = 47;
        int a = i - j;
        while (a != 0) {
            if (a >= 10) {
                a = a - 10;
                System.out.println("Your money 10 $, a =" + a);
                continue;
            }
            if (a >= 5) {
                a = a - 5;
                System.out.println("Your money 5 $, a =" + a);
                continue;
            }
            if (a >= 2) {
                a = a - 2;
                System.out.println("Your money 2 $, a =" + a);
                continue;
            }
            if (a >= 1) {
                a = a - 1;
                System.out.println("Your money 1 $, a =" + a);
                continue;
            }
        }
        System.out.println("Davay DOSVIDANYA !!!");
    }
}
