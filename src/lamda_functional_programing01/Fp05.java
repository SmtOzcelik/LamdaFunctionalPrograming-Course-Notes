package lamda_functional_programing01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fp05 {

    public static void main(String[] args) {

        //5) Tekrarsiz cift elemanlarin kareleri toplamini hesaplayan bir method olusturun

        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(2,9,4,2,11,9,4,7,11));

        tekrarsizCiftElemanlarinKareToplami(list); //20
    }
    public static void tekrarsizCiftElemanlarinKareToplami(List<Integer>list){

        Integer toplam=list.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(0,(t,u)->t+u);
        System.out.println(toplam);
    }
}
