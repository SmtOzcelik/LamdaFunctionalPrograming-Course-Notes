package lamda_functional_programing02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fp08 {
    public static void main(String[] args) {

        //List elemanlari arasindan en kucuk degeri bulan bir method olusturun

        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(8,9,131,10,9,10,2,8));
        getMinElemani(list);//2
    }
    public static void getMinElemani(List<Integer>list){

        Integer min=list.stream().distinct().reduce(Math::min).get();
        System.out.println(min);

    }
}
