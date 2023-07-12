package lamda_functional_programing03;

import java.util.ArrayList;
import java.util.List;

public class Fp08 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Ali"); list.add("Ali"); list.add("Mark"); list.add("Amanda");
        list.add("Christopher"); list.add("Jackson"); list.add("Mariano");
        list.add("Alberto"); list.add("Tucker");  list.add("Benjamin");

        System.out.println(list);
        uzunlugu8ile10ArasiVeOIleBiteniSil(list);


    }
    //Uzunluğu 8 ile 10 arası olan yada 'o' ile biten elemanları yazdıran bir method oluşturun.

    public static void uzunlugu8ile10ArasiVeOIleBiteniSil(List<String> list){

        list.removeIf(t->(t.length()>7 && t.length()<11) || t.endsWith("o") || t.endsWith("O"));
        System.out.println(list);
    }
}
