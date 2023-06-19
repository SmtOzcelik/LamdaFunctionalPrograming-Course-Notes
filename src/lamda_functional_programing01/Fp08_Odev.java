package lamda_functional_programing01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fp08_Odev {
    public static void main(String[] args) {
        //List elemanlari arasindan en kucuk degeri bulan bir method olusturun

        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(2,9,4,2,11,9,4,7,11));
        getMinEleman(list); //2
    }
    public static void getMinEleman(List<Integer>list){

        Integer min=list.stream().distinct().sorted().reduce(Integer.MAX_VALUE,(t,u)-> t<u ? t:u);
        System.out.println(min);


    }
}
