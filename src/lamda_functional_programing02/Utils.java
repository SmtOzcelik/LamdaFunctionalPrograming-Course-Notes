package lamda_functional_programing02;

public class Utils {
    public static void ayniSatirdaBosluklaYazdir(Object str){

        System.out.print(str+" ");
    }

    public static boolean ciftElemanlariSec(int x){


        return x%2==0;
    }

    public static boolean tekElemanlariSec(int x){


        return x%2==1;
    }

    public static int karesiniAl(int x){

        return x=x*x;
    }
    public static int kupunuAl(int x){

        return x=x*x*x;
    }
    public static double yarisiniAl(double x){

        return x=x/2;
    }
    public static char sonkarakteriniVer(String str){

        return str.charAt(str.length()-1);
    }
    public static char ilkKarakteriniVer(String str){

        return str.charAt(0);
    }
}
