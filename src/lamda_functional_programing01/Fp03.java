package lamda_functional_programing01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fp03 {
    public static void main(String[] args) {
        //3)Ardisik tek list elemanlarin karelerini ayni satirda aralarinda bosluk birakarak
        //  yazdiran bir method yaziniz(Functional yap)

        ArrayList<Integer>list=new ArrayList<>(Arrays.asList(2,5,14,6,7,44,3));
        // list imizi bu sekilde olusturduk uzun uzun yazmak yerine

        tekElemanlarinKareleriniYazdirFunctional(list);//25 49 9

    }
    public static void tekElemanlarinKareleriniYazdirFunctional(List<Integer>list){

        list.stream().filter(t->t%2==1).map(t->t*t).forEach(t-> System.out.print(t+" "));
        //elemanlarin degerleri degisecekse map kullanilir
    }
}
