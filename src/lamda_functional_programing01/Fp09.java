package lamda_functional_programing01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Fp09 {public static void main(String[] args) {
    //9) List elemanlari arasindan 7 den buyuk cift , en kucuk degeri bulan bir method olusturun

    ArrayList<Integer> list=new ArrayList<>(Arrays.asList(2,9,12,2,11,9,4,7,18));
        getYedidenBuyukCiftMin1(list);//12
        getYedidenBuyukCiftMin2(list);//12
        getYedidenBuyukCiftMin3(list);//12
}
    // 1.yol
    public static void getYedidenBuyukCiftMin1(List<Integer>list){

    Integer min=list.stream().distinct().
            filter(t->t%2==0).filter(t-> t>7).
            reduce(Integer.MAX_VALUE,(t,u) -> t<u ? t:u);
        System.out.println(min);
    }

    // 2.yol
    public static void getYedidenBuyukCiftMin2(List<Integer>list){
    Integer min=list.stream().distinct().
            filter(t->t%2==0).filter(t->t>7).
            sorted(Comparator.reverseOrder()).
            reduce(Integer.MAX_VALUE,(t,u)->u);
        System.out.println(min);
    }
    // 3.yol
    public static void getYedidenBuyukCiftMin3(List<Integer>list){
    Integer min=list.stream().distinct().filter(t->t%2==0).filter(t->t>7).sorted().findFirst().get();
        System.out.println(min);
    }
}
