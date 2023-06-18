package lamda_functional_programing01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fp07 {
    public static void main(String[] args) {

        //7) List elemanlari arasindan en buyuk degeri bulan bir method olusturun

        // 1.yol
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(2,9,4,2,11,9,4,7,11));

        getMaxEleman01(list);//11
    }

    public static void getMaxEleman01(List<Integer>list){

      Integer max = list.stream().distinct().reduce(Integer.MIN_VALUE,(t,u)-> t>u ? t:u );

        System.out.println(max);

    }
        // 2.yol
        public static void getMaxEleman02(List<Integer>list){

       Integer max=list.stream().distinct().sorted().reduce(Integer.MIN_VALUE,(t,u)->u);
            System.out.println(max);

        }
}
