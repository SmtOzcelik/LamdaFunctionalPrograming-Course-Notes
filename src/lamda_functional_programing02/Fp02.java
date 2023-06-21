package lamda_functional_programing02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fp02 {
    public static void main(String[] args) {
        //2) Cift list elemanlerini ayni satirda aralarinda bosluk bırakarak yazdiran bir metohod olusturun

        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(8,9,131,10,9,10,2,8));
        ciftElemanlariYazdir(list);//8 10 10 2 8
    }
    public static void ciftElemanlariYazdir(List<Integer>list){

        list.stream().filter(Utils::ciftElemanlariSec).forEach(Utils::ayniSatirdaBosluklaYazdir);

    }
}
