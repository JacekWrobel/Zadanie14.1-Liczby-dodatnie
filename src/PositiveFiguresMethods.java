import java.util.List;
import java.util.Scanner;

public class PositiveFiguresMethods {


    public void sumPrint(List<Integer> list) {

        for (int i = 0; i < list.size() - 1; i++) {
            System.out.print(list.get(i) + " + ");
        }
        System.out.println(list.get(list.size() - 1) + " = " + sum(list));
    }

    private int sum(List<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }

    public int max(List<Integer> list) {
        int max = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) max = list.get(i);
        }
        return max;
    }

    public int min(List<Integer> list) {
        int min = sum(list);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < min) min = list.get(i);
        }
        return min;
    }

    public void figureAdd(List<Integer> list) {
        Scanner sc = new Scanner(System.in);
        int a;
        do {
            System.out.println("Podaj swoje liczby");
            a = (sc.nextInt());
            if (a >= 0) list.add(a);
        } while (!(a < 0));
    }
}
