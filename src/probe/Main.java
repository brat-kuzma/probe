package probe;

public class Main {

    public static void main(String[] args) {
        int summa = Integer.parseInt(args[0]); //��� ����� ����� ������� ���������� ��� ��������
        ChangeCalculate obj = new ChangeCalculate(summa);
        obj.getChange();
     //   System.out.print("Your money " + denga +" a =" + a);
    }
}

class ChangeCalculate { //����� ������ �����
    int a;
    int[] num = new int[]{10, 2, 1};
    ChangeCalculate(int summa) {
        a=summa;
    }
    public void getChange() {  // �����, � ������, ����������� �������, � ��������� ������, � ��� ����� �������, �� ����� ��� ���������
        while (a != 0) {
            for (int nominal : num) {
                if (getDenga(nominal)) {
                    break;
                }
            }
        }
    }

    public boolean getDenga(int nominal) {  //����� ����������� � �������� ��������� �������� �������, ����� �������� �� ����� ����� (�) ��� ��������
        if (this.a >= nominal) {
            this.a = a - nominal;
            System.out.println("Your money " + nominal + " a =" + this.a);
            return true;
        }
        return false;
    }
}
