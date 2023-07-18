package lamda_functional_programing03;

import java.util.ArrayList;
import java.util.List;

public class Fp09 {
    public static void main(String[] args) {

        List<String> list=new ArrayList<>();
        list.add("Ali"); list.add("Ali"); list.add("Mark"); list.add("Amanda");
        list.add("Christopher"); list.add("Jackson"); list.add("Mariano");
        list.add("Alberto"); list.add("Tucker");  list.add("Benjamin");

        System.out.println(list);
        System.out.println(uzunlugu12denAzMi(list));

    }
    //9- ) Tüm elemanların uzunluklarının 12'den az olup olmadığını kontrol eden
    //    bir method oluşturun.

    public static boolean uzunlugu12denAzMi(List<String>list){

        return list.stream().allMatch(t->t.length()<12);
    }
}
