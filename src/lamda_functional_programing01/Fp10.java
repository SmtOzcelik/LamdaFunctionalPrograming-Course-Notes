package lamda_functional_programing01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp10 {
    public static void main(String[] args) {

        //10) Ters siralama ile tekrarsiz ve 5 den buyuk elemanlarin
        //    yari degerlerini(elamanin ikiye bolum sonucu) bulan bir method olusturun

        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(2,9,12,2,11,9,4,7,18));
        getTersSiralamaTekrarsizElemanlarinYarisi(list); //[9.0, 6.0, 5.5, 4.5, 3.5]
    }

    public static void getTersSiralamaTekrarsizElemanlarinYarisi(List<Integer>list){

        List<Double>sonuc= list.stream().distinct().filter(t->t>5).map(t->t/2.0).
                sorted(Comparator.reverseOrder()).
                collect(Collectors.toList());
        System.out.println(sonuc);

    }
}
