package probe;

public class Main {

    public static void main(String[] args) {
        int summa = Integer.parseInt(args[0]); //уже забыл каким образом передается это значение
        ChangeCalculate obj = new ChangeCalculate(summa);
        obj.getChange();
     //   System.out.print("Your money " + denga +" a =" + a);
    }
}

class ChangeCalculate { //класс расчет сдачи
    int a;
    int[] num = new int[]{10, 2, 1};
    ChangeCalculate(int summa) {
        a=summa;
    }
    public void getChange() {  // метод, с циклом, прогоняющим массива, и вложенным циклом, с еще одним методом, не иначе как усложение
        while (a != 0) {
            for (int nominal : num) {
                if (getDenga(nominal)) {
                    break;
                }
            }
        }
    }

    public boolean getDenga(int nominal) {  //метод принимающий в качестве аргумента значения массива, затем вычитает из общей сдачи (а) это значение
        if (this.a >= nominal) {
            this.a = a - nominal;
            System.out.println("Your money " + nominal + " a =" + this.a);
            return true;
        }
        return false;
    }
}
