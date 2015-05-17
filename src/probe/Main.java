package probe;

public class Main {

    public static  getChange(int a, int denga) {
        if (a >= denga) {
            a = a - denga;
            return  System.out.println("Your money " + denga +" a =" + a);

    }

    public static void main(String[] args) {
        int a = 100 - 47;
        //     53
        int[] num = new int[]{10, 2, 1};
        while (a != 0) {
            for (int denga : num)
           // for (int i = 0; i <= num.length; i++) {
                if (getChange(a, denga)) {
                    break;
                }
                /*
                if (a >= num[i]) {
                    a = a - num[i];
                    System.out.println("Your money " + num[i] +" a =" + a);
                    break;
                }
                */            }


        }
    }