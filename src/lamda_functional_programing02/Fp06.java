package lamda_functional_programing02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fp06 {
    public static void main(String[] args) {

        //6) Tekrarsiz cift elemanlarinin küpünün carpimini hesaplayan method olusturun.

        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(8,9,131,10,9,10,2,8));

        tekrarsizCiftElemanlarinKuplerininCarpimi(list);//4096000

    }
    public static void tekrarsizCiftElemanlarinKuplerininCarpimi(List<Integer>list){

        Integer carpim=list.stream().distinct().filter(Utils::ciftElemanlariSec).map(Utils::kupunuAl).reduce(1,Math::multiplyExact);
        System.out.println(carpim);

    }
}
