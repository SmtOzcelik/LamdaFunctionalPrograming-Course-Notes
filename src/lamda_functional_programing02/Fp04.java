package lamda_functional_programing02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fp04 {
    public static void main(String[] args) {

        //4) Tek list elemanlarin küplerini tekrarsiz olarak ayni satirda bir bosluk birakarak
        //   yazdiran bir method olusturun

        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(8,9,131,10,9,10,2,8));
        tekrarsizTekElemanlarinKupunuYazdir(list);//729 2248091
    }
    public static void tekrarsizTekElemanlarinKupunuYazdir(List<Integer> list){

                list.stream().distinct().filter(Utils::tekElemanlariSec).
                map(Utils::kupunuAl).forEach(Utils::ayniSatirdaBosluklaYazdir);
    }
}
