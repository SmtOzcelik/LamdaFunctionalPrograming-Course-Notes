package lamda_functional_programing02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fp03 {
    public static void main(String[] args) {

        //3)Ardisik tek list elemanlarin karelerini ayni satirda aralarinda bosluk birakarak
        //  yazdiran bir method yaziniz

        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(8,9,131,10,9,10,2,8));
        tekElemanlarinKareleriniYazdir(list);//81 17161 81

    }

    public static void tekElemanlarinKareleriniYazdir(List<Integer>list){

        list.stream().filter(Utils::tekElemanlariSec).map(Utils::karesiniAl).forEach(Utils::ayniSatirdaBosluklaYazdir);

    }
}
