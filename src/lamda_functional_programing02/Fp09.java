package lamda_functional_programing02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fp09 {
    public static void main(String[] args) {

        //9) List elemanlari arasindan 7 den buyuk cift , en kucuk degeri bulan bir method olusturun

        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(8,9,131,10,9,10,2,8));
        yedidenBuyukCiftMin(list);//8
    }
    public static void yedidenBuyukCiftMin(List<Integer>list){

        Integer min = list.stream().distinct().filter(Utils::ciftElemanlariSec).filter(t->t>7).reduce(Math::min).get();
        System.out.println(min);
    }
}
