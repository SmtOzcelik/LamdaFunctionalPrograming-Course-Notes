package lamda_functional_programing03;

import java.util.ArrayList;
import java.util.List;

public class Fp07 {
    public static void main(String[] args) {

        List<String> list=new ArrayList<>();
        list.add("Ali"); list.add("Ali"); list.add("Mark"); list.add("Amanda");
        list.add("Christopher"); list.add("Jackson"); list.add("Mariano");
        list.add("Alberto"); list.add("Tucker");  list.add("Benjamin");

        System.out.println(list);
        baslagiciAYadaSonuNOlaniSil01(list);

    }

    //7-) ‘A’, ‘a’ ile başlayan yada ‘N’, ‘n’ ile biten elemanları silen bir method oluşturun.

    public static void baslagiciAYadaSonuNOlaniSil01(List<String> list){

        list.removeIf(t->t.startsWith("A") || t.startsWith("a") || t.endsWith("N") || t.endsWith("n"));
        System.out.println(list);
    }
}
