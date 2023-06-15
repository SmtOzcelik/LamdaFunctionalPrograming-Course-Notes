package lamda_functional_programing01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fp04 {
    public static void main(String[] args) {

        //4) Tek list elemanlarin küplerini tekrarsiz olarak ayni satirda bir bosluk birakarak
        //   yazdiran bir method olusturun

        ArrayList<Integer>list=new ArrayList<>(Arrays.asList(2,9,4,2,11,9,4,7,11));

        tekrarsizTekElemanlarinKupunuYazdir(list);//729 1331 343
    }
    public static void tekrarsizTekElemanlarinKupunuYazdir(List<Integer>list){

        list.stream().distinct().filter(t->t%2==1).map(t->t*t*t).forEach(t-> System.out.print(t+" "));
    }
}
