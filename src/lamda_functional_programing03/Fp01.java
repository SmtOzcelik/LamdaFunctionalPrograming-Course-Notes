package lamda_functional_programing03;

import lamda_functional_programing02.Utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fp01 {
    public static void main(String[] args) {
        List<String>list=new ArrayList<>();
        list.add("Ali"); list.add("Ali"); list.add("Mark"); list.add("Amanda");
        list.add("Christopher"); list.add("Jackson"); list.add("Mariano");
        list.add("Alberto"); list.add("Tucker");  list.add("Benjamin");
        System.out.println(list);

        buyukHarfleYazdir(list);
        System.out.println("");
        buyukHarfleYazdir2(list);
    }
  //  1- ) Tüm elemanları büyük harf ile yazdıran bir method oluşturun.
    //1.yol
        public static void buyukHarfleYazdir(List<String>list){

        list.stream().map(String::toUpperCase).forEach(Utils::ayniSatirdaBosluklaYazdir);

        }
    //2.yol
    public static void buyukHarfleYazdir2(List<String>list){
        list.replaceAll(String::toUpperCase);
        System.out.println(list);
    }
}
