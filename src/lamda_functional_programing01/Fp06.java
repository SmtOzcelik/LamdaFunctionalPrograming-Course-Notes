package lamda_functional_programing01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fp06 {
    public static void main(String[] args) {

        //6) Tekrarsiz cift elemanlarinin küpünün carpimini hesaplayan method olusturun.

        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(2,9,4,2,11,9,4,7,11));

        tekrarsizCiftElemanlarinKupununCarpiminiYazdir(list);//512
    }

    public static void tekrarsizCiftElemanlarinKupununCarpiminiYazdir(List<Integer>list){

        Integer carpim=list.stream().distinct().filter(t->t%2==0).map(t->t*t*t).reduce(1,(t,u)->t*u);
        System.out.println(carpim);
    }
}
