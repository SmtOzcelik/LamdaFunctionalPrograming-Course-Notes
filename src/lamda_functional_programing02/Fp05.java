package lamda_functional_programing02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fp05 {
    public static void main(String[] args) {
    //5) Tekrarsiz cift elemanlarin kareleri toplamini hesaplayan bir method olusturun

        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(8,9,131,10,9,10,2,8));
        tekrarsizCiftelemanlarinKareleriToplami(list);//168
    }

    public static void tekrarsizCiftelemanlarinKareleriToplami(List<Integer>list){

       Integer toplam= list.stream().distinct().filter(Utils::ciftElemanlariSec).map(Utils::karesiniAl).reduce(0,Math::addExact);
        System.out.println(toplam);
    }
}
