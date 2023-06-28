package lamda_functional_programing02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fp07 {
    public static void main(String[] args) {

        //7) List elemanlari arasindan en buyuk degeri bulan bir method olusturun

        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(8,9,131,10,9,10,2,8));
        getMaxEleman(list);//131

    }
    public static void getMaxEleman(List<Integer>list){

        Integer max=list.stream().distinct().reduce(Integer.MIN_VALUE,Math::max);
        System.out.println(max);
    }
}
