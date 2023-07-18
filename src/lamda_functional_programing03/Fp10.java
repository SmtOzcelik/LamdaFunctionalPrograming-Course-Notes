package lamda_functional_programing03;

import java.util.ArrayList;
import java.util.List;

public class Fp10 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Ali"); list.add("Ali"); list.add("Mark"); list.add("Amanda");
        list.add("Christopher"); list.add("Jackson"); list.add("Mariano");
        list.add("Alberto"); list.add("Tucker");  list.add("Benjamin");

        System.out.println(list);
        System.out.println(xIleBaslamiyorMu(list));

    }
    //10-) Hiçbir elemanın 'X' ile başlamadığını kontrol eden bir method oluşturun.

    public static boolean xIleBaslamiyorMu(List<String> list){
        return list.stream().noneMatch(t->t.startsWith("X") || t.startsWith("x"));
    }
}
