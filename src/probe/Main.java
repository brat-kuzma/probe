package probe;

public class Main {

    public static void main(String[] args) {
        int a = 100 - 47;
        //     53
        int[] num = new int[]{10, 2, 1};
        while (a != 0) {
            for (int i = 0; i <= num.length; i++) {
                if (a >= num[i]) {
                    a = a - num[i];
                    System.out.println("Your money " + num[i] +" a =" + a);
                    break;
                }
            }


        }
    }
}
