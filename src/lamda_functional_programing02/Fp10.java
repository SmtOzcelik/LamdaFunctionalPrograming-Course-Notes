package lamda_functional_programing02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp10 {
    public static void main(String[] args) {
        //10) Ters siralama ile tekrarsiz ve 5 den buyuk elemanlarin
        //    yari degerlerini(elamanin ikiye bolum sonucu) bulan bir method list olusturun

        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(8,9,131,10,9,10,2,8));
        getTersSiralamaTekrarsizElemanlarinYarisi(list);//[65.5, 5.0, 4.5, 4.0]

    }
    public static void getTersSiralamaTekrarsizElemanlarinYarisi(List<Integer> list){

    List<Double> sonuc=list.stream().distinct().filter(t->t>5).map(Utils::yarisiniAl).
                sorted(Comparator.reverseOrder()). collect(Collectors.toList());
        System.out.println(sonuc);
    }
}
