import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PositiveFigures {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
PositiveFiguresMethods pfm = new PositiveFiguresMethods();
        pfm.figureAdd(list);

        System.out.println(list);
        for (int i = list.size() - 1; i > -1; i--) {
            System.out.println(list.get(i));
        }

        pfm.sumPrint(list);
        System.out.println(pfm.max(list));
        System.out.println(pfm.min(list));
    }
}
