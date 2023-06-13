package lamda_functional_programing01;

import java.util.ArrayList;
import java.util.List;

public class Fp01 {
    /*
    1- Lamda (Functional Programming) Java 8 ile kullanilmaya baslamistir.
    2- Functional Programming de "Ne yapilacak" (What to do) uzerine yogunlasilir.
       Structured Programming "Nasil yapilacak" (How to do) uzerine yogunlasilir.
    3- Functional Programming Arrays ve Collections ile kullanilir.
    4- entrySet() metodu ile Map,Set e donusturulerek Functional Programming de kullanilabilir.
    */
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>();
        list.add(8);
        list.add(9);
        list.add(131);
        list.add(10);
        list.add(9);
        list.add(10);
        list.add(2);
        list.add(8);
        System.out.println(list);//[8, 9, 131, 10, 9, 10, 2, 8]
        listElemanlariniYazdirStructured(list);
        listElemanlariniYazdirFunctional(list);
    }
    //1) Ardisik list elementlerini ayni satirda aralarinda bosluk bırakarak yazdiran bir method olusturun(Structured)

    public static void listElemanlariniYazdirStructured(List<Integer> list){//Structurud normal

        for (Integer w:list
             ) {
            System.out.print(w+" ");
        }
    }
    //1) Ardisik list elementlerini ayni satirda aralarinda bosluk bırakarak yazdiran bir method olusturun(Functional)

    public static void listElemanlariniYazdirFunctional(List<Integer>list){//Functional Lamda ile

        list.stream().forEach(t-> System.out.print(t+" "));
        //stream() methodu collection dan elementleri akisa dahil etmek icin ve methodlara ulasmak icin kullanilir.

    }

}
