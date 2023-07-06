package lamda_functional_programing03;

import lamda_functional_programing02.Utils;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Fp03 {
    public static void main(String[] args) {

    List<String> list=new ArrayList<>();
    list.add("Ali"); list.add("Ali"); list.add("Mark"); list.add("Amanda");
    list.add("Christopher"); list.add("Jackson"); list.add("Mariano");
    list.add("Alberto"); list.add("Tucker");  list.add("Benjamin");

    System.out.println(list);
    uzunlugaGoreTersYazdir(list);

}
// 3-) Elemanları uzunluklarına göre ters sıralayıp yazdıran bir method oluşturun.

    public static void uzunlugaGoreTersYazdir(List<String>list){
    list.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(Utils::ayniSatirdaBosluklaYazdir);
    }
}
