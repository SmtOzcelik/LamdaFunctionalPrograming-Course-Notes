package lamda_functional_programing03;

import java.util.ArrayList;
import java.util.List;

public class Fp06 {
    public static void main(String[] args) {

        List<String> list=new ArrayList<>();
        list.add("Ali"); list.add("Ali"); list.add("Mark"); list.add("Amanda");
        list.add("Christopher"); list.add("Jackson"); list.add("Mariano");
        list.add("Alberto"); list.add("Tucker");  list.add("Benjamin");

        System.out.println(list);
        bestenBuyukleriSil(list);

    }
    //6-) Uzunluğu 5'ten büyük olan elemanları silen bir method oluşturun.

    public static void bestenBuyukleriSil(List<String> list){

        list.removeIf(t->t.length()>5);
        System.out.println(list);

    }
}
