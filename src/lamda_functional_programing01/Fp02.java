package lamda_functional_programing01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fp02 {
    public static void main(String[] args) {

        //2) Cift list elemanlerini ayni satirda aralarinda bosluk bırakarak yazdiran bir metohod olusturun(Structured)

        ArrayList<Integer>list=new ArrayList<>(Arrays.asList(8,9,131,10,9,10,2,8));
        ciftElemanlariYazdirStructurud(list); //8 10 10 2 8
        ciftElemalariYazdirFunctional(list);//8 10 10 2 8
    }
    public static void ciftElemanlariYazdirStructurud(List<Integer>list){//Structurud normal

        for (Integer w:list
             ) {
            if(w%2==0){
                System.out.print(w+" ");
            }
        }
    }

    //2) Cift list elemanlerini ayni satirda aralarinda bosluk bırakarak yazdiran bir metohod olusturun(Functional)
    public static void ciftElemalariYazdirFunctional(List<Integer>list){

        list.stream().filter(t ->t%2==0).forEach(t-> System.out.println(t +" "));
    }
}
