package lamda_functional_programing02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fp01 {

    /*
    1- t -> "Logic" , (t,u) -> "Logic"
       Bu yapiya Lambda Expession
    2- Functional Programming kapsaminda Lambda Expession kullanilabilir ama onerilmez.
       Lambda Expession yerine Method Reference tercih edilir.
    3- Method Reference kullanimi "Class Name :: Method Name"

       Ayni zamanda kendi class larinizi da kullanabilirsiniz
       Ornegin bir Animal class imiz var ve bu class "eat()" methoduna sahip ==> "Animal :: eat"
     */



    public static void main(String[] args) {
        // 1) Ardisik list elementlerini ayni satirda aralarinda bosluk bırakarak
        //    yazdiran bir method olusturun(Functional ve method reference)

        ArrayList<Integer>list=new ArrayList<>(Arrays.asList(8,9,131,10,9,10,2,8));

        listElemanlariniYazdirFunctional(list);
    }
    public static void listElemanlariniYazdirFunctional(List<Integer>list){

        list.stream().forEach(Utils::ayniSatirdaBosluklaYazdir);
    }
}
