import java.io.File;


public class Ejer_1_2 {

    public static void main (String[]args){

        File carpeta = new File ("prueb");

        if( carpeta.exists() && carpeta.isDirectory()){

            System.out.println(carpeta.getName());
            System.out.println(carpeta.length());
            System.out.println(carpeta.getAbsolutePath());
        }
        else {

            System.out.println("La carpeta no existe o no es una carpeta");
        }

    }

}
