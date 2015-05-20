package probe;

public class Main {
    //int a; int denga;
    //public void setChange(int a);
    public static void getChange(int a) {
        int[] num = new int[]{10, 2, 1};
        while (a != 0) {
            for (int denga : num) {
                if (a >= denga) {
                    a = a - denga;
                    System.out.println("Your money " + denga + " a =" + a);
                    break;
                }
                continue;
            }
            //return a;
        }
    }
    public static void main(String[] args) {
        Main.getChange(55);
     //   System.out.print("Your money " + denga +" a =" + a);
    }
}
  //     int a = 100 - 47
  //     53
  //   int[] num = new int[]{100, 50, 10, 2, 1};
  //  Main raq = new Main();

           // for (int i = 0; i <= num.length; i++) {
          //      if (calc.getChange(55)) {
          //          break;
           //     }
                /*
                if (a >= num[i]) {
                    a = a - num[i];
                    System.out.println("Your money " + num[i] +" a =" + a);
                    break;
                }
                           }


        }
    } */